package studentapp.mysql;

import studentapp.dto.Student;
import studentapp.exception.DaoException;
import studentapp.dto.Subject;
import studentapp.dao.GenericDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;


public class SubjectDao extends AbstractGenericDao<Subject> {

    public SubjectDao(Connection connection) throws DaoException {
        super(connection);
    }


    @Override
    public void update(Subject subject) throws DaoException {

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.UPDATE_SUBJECT);

            statement.setString(1, subject.getName());
            statement.setInt(2, subject.getId());

            int count = statement.executeUpdate();
            if (count != 1) {
                throw new DaoException("update more then 1 record: " + count);
            }
        } catch (SQLException e) {
            throw new DaoException("update failed! ", e);
        }
    }

    @Override
    public void add(Subject subject) throws DaoException {

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.ADD_SUBJECT);

            statement.setString(1, subject.getName());

            int count = statement.executeUpdate();
            if (count != 1) {
                throw new DaoException("add more then 1 record: " + count);
            }
        } catch (SQLException e) {
            throw new DaoException("add failed! ", e);
        }
    }

    @Override
    public void delete(Subject subject) throws DaoException {

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.DELETE_SUBJECT);

            statement.setInt(1, subject.getId());

            int count = statement.executeUpdate();
            if (count != 1) {
                throw new DaoException("delete more then 1 record: " + count);
            }
        } catch (SQLException e) {
            throw new DaoException("delete failed! ", e);
        }
    }

    @Override
    public List<Subject> getAll() throws DaoException {

        LinkedList<Subject> result = new LinkedList<>();

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.GET_ALL_SUBJECT);

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Subject subject = new Subject();
                    subject.setId(rs.getInt("id"));
                    subject.setName(rs.getString("name"));
                    result.add(subject);
                }
            }
        } catch (SQLException e) {
            throw new DaoException("get all failed! ", e);
        }
        return result;
    }

    @Override
    public Subject getById(Integer id) throws DaoException {

        Subject subject = null;

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.GET_SUBJECT_BY_ID);
            statement.setInt(1, id);

            try (ResultSet rs = statement.executeQuery()) {

                while (rs.next()) {
                    subject = new Subject();
                    subject.setId(rs.getInt("id"));
                    subject.setName(rs.getString("name"));
                }
            }
        } catch (SQLException e) {
            throw new DaoException("get by id failed! ", e);
        }
        return subject;
    }

    public List<Subject> getAllSubjectOfStudent(Student student) throws DaoException {

        LinkedList<Subject> result = new LinkedList<>();

        try {
            PreparedStatement statement = getPreparedStatement(GenericDao.GET_ALL_SUBJECT_OF_STUDENT);
            statement.setInt(1, student.getId());

            try (ResultSet rs = statement.executeQuery()) {
                while (rs.next()) {
                    Subject subject = new Subject();
                    subject.setId(rs.getInt("id"));
                    subject.setName(rs.getString("name"));
                    result.add(subject);
                }
            }
        } catch (SQLException e) {
            throw new DaoException("get all subject of student failed! ", e);
        }
        return result;
    }
}