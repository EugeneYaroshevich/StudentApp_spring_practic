package studentapp.configuration;

import org.springframework.context.annotation.ComponentScan;
import studentapp.dao.DaoFactory;
import studentapp.dto.Mark;
import studentapp.dto.Student;
import studentapp.dto.Subject;
import studentapp.exception.DaoException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import studentapp.mysql.DaoFactoryMySql;
import studentapp.mysql.MarkDao;
import studentapp.mysql.StudentDao;
import studentapp.mysql.SubjectDao;

@Configuration
@ComponentScan("studentapp")
public class StudentAppConfig {

    @Bean
    public DaoFactoryMySql daoFactoryMySql() throws DaoException {
        return DaoFactory.getDAOFactory();
    }

    @Bean
    public StudentDao studentDao() throws DaoException {
        return daoFactoryMySql().getStudentDao();
    }

    @Bean
    public SubjectDao subjectDao() throws DaoException {
        return daoFactoryMySql().getSubjectDao();
    }

    @Bean
    public MarkDao markDao() throws DaoException {
        return daoFactoryMySql().getMarkDao();
    }

    @Bean
    public Student student(){
        return new Student();
    }

    @Bean
    public Subject subject(){
        return new Subject();
    }

    @Bean
    public Mark mark(){
        return new Mark();
    }
}
