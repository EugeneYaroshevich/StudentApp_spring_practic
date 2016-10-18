package studentapp.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import studentapp.configuration.StudentAppConfig;
import studentapp.dto.Student;
import studentapp.exception.DaoException;
import studentapp.mysql.StudentDao;
import studentapp.mysql.SubjectDao;

public class Main {

    public static void main(String[] args) {

//        try {
//
//            AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//            context.register(StudentAppConfig.class);
//            context.refresh();
//
//            StudentDao studentDao = context.getBean(StudentDao.class, "studentDao");
//            SubjectDao subjectDao = context.getBean(SubjectDao.class, "subjectDao");
//            Student student = context.getBean(Student.class, "student");
//            student.setId(5);
//
//            studentDao.readAllStudent();
//
//            System.out.println(subjectDao.getAllSubjectOfStudent(student));
//
//        } catch (DaoException e) {
//            e.printStackTrace();
//        }
//
//
//        try {
//
//            ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"config.xml"});
//
//            SubjectDao subjectDao = ctx.getBean(SubjectDao.class, "subjectDao");
//            Student student = ctx.getBean(Student.class, "student");
//            student.setId(5);
//
//            System.out.println(subjectDao.getAllSubjectOfStudent(student));
//
//        } catch (DaoException e) {
//            e.printStackTrace();
//        }


//        try(DaoFactoryMySql daoFactory = DaoFactory.getDAOFactory();
//            StudentDao studentDao = daoFactory.getStudentDao();
//            SubjectDao subjectDao = daoFactory.getSubjectDao();
//            MarkDao    markDao    = daoFactory.getMarkDao()){
//
//            studentDao.readAllStudent();
//
////            Student student = new Student();
////            student.setName("Nikita");
////            student.setSurname("Nikitin");
////
////            studentDao.create(student);
////
////            student.setId(11);
////            student.setName("Michael");
////            studentDao.update(student);
////
////            studentDao.delete(student);
//
////            studentDao.readAllStudent();
////            studentDao.getAll();
////            studentDao.getById(3);
//            //////////////////////////////////////////////////////////////////////
//
//
////            Subject subject = new Subject();
////            subject.setName("Swimming");
////
////            subjectDao.create(subject);
////
////            subject.setId(4);
////            subject.setName("Sport");
////            subjectDao.update(subject);
////
////            subjectDao.delete(subject);
////
////            List<Subject> subjects = subjectDao.getAllSubject();
////            for (Iterator iterator = subjects.iterator(); iterator.hasNext();) {
////                System.out.println(iterator.next());
////            }
//
////            subjectDao.getAll();
////            subjectDao.getById(2);
////            Student student = studentDao.getById(5);
////            System.out.println(subjectDao.getAllSubjectOfStudent(student));
//            //////////////////////////////////////////////////////////////////////
//
//
////            Mark mark = new Mark();
////            mark.setMark(5);
////            mark.setSubjectId(3);
////            mark.setStudentId(student.getId());
////
////            markDao.create(mark);
////
////            mark.setId(30);
////            mark.setMark(10);
////            markDao.update(mark);
////
////            markDao.delete(mark);
////
////            markDao.getAll();
////            markDao.getById(5);
////            Student student = studentDao.getById(10);
////            System.out.println(markDao.getAllMarkOfStudent(student));
//        } catch (DaoException e) {
//            e.printStackTrace();
//        }
    }
}