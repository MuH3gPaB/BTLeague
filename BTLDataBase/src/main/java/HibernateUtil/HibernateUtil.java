package HibernateUtil;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static Session session;
    private static SessionFactory sessionFactory;

    public static void init(){
        if(sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        }
    }

    public static Session openSession(){
        if(sessionFactory != null &&
                session == null) {
            session = sessionFactory.openSession();
            return session;
        }
        return null;
    }

    public static void closeSession(){
        if(session != null) session.close();
    }

    public static Session getSession(){
        init();
//        if(session == null){
//            session = sessionFactory.openSession();
//            return session;
//        }
        return session;
    }

}
