package studentapp.controller;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import studentapp.configuration.StudentAppConfig;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class StudentServletSessionListener implements HttpSessionListener {

    HttpSession httpSession;

    @Override
    public void sessionCreated(HttpSessionEvent sessionEvent) {

        try {
//            AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
//            context.register(StudentAppConfig.class);
//            context.refresh();

//            httpSession = sessionEvent.getSession();
//
//            httpSession.setAttribute("StudentDao", context.getBean(StudentDao.class, "studentDao"));
//            httpSession.setAttribute("SubjectDao", context.getBean(SubjectDao.class, "subjectDao"));
//            httpSession.setAttribute("MarkDao", context.getBean(MarkDao.class, "markDao"));
//
//            httpSession.setAttribute("Student", context.getBean(Student.class, "student"));
//            httpSession.setAttribute("Subject", context.getBean(Subject.class, "subject"));
//            httpSession.setAttribute("Mark", context.getBean(Mark.class, "mark"));

//            в сервлете достать из сессии

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent sessionEvent) {

//        StudentDao studentDao = (StudentDao) httpSession.getAttribute("StudentDao");
//        SubjectDao subjectDao = (SubjectDao) httpSession.getAttribute("SubjectDao");
//        MarkDao markDao = (MarkDao) httpSession.getAttribute("MarkDao");
//        try {
//            if (studentDao != null) {
//                studentDao.close();
//            }
//            if (subjectDao != null) {
//                subjectDao.close();
//            }
//            if (markDao != null) {
//                markDao.close();
//            }
//        } catch (DaoException e) {
//            e.printStackTrace();
//        }
    }
}
