package studentapp.dao;


import studentapp.exception.DaoException;
import studentapp.mysql.DaoFactoryMySql;
import studentapp.mysql.MarkDao;
import studentapp.mysql.StudentDao;
import studentapp.mysql.SubjectDao;

public abstract class DaoFactory implements AutoCloseable {

    public static <T extends DaoFactory> T getDAOFactory() throws DaoException {
        return (T) new DaoFactoryMySql();
    }


    public abstract StudentDao getStudentDao() throws DaoException;

    public abstract SubjectDao getSubjectDao() throws DaoException;

    public abstract MarkDao getMarkDao() throws DaoException;
}
