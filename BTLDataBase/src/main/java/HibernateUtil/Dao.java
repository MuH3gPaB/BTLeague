package HibernateUtil;

import org.hibernate.Session;

public class Dao {

    public static <T> T getById(Class<T> classT, int index){
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        T result = (T)thisSession.get(classT, index);
        thisSession.getTransaction().commit();
        return result;
    }

    public static <T> void save(T obj){
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        thisSession.save(obj);
        thisSession.getTransaction().commit();
    }

    public static <T> void delete(T obj){
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        thisSession.delete(obj);
        thisSession.getTransaction().commit();
    }
}
