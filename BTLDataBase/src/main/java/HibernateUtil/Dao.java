package HibernateUtil;

import org.hibernate.Session;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Dao {

    public static <T> T getById(Class<T> classT, Serializable index){
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        T result = (T)thisSession.get(classT, index);
        thisSession.getTransaction().commit();
        return result;
    }

    public static <T> ArrayList<T> getAll(Class<T> classT){
        ArrayList result;
        String query = "from " + classT.toString().substring(6);
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        result = (ArrayList) thisSession.createQuery(query).list();
        thisSession.getTransaction().commit();
        return result;
    }

    public static <T> Serializable save(T obj){
        Serializable id;
        Session thisSession = HibernateUtil.getSession();
        if(getAll(obj.getClass()).contains(obj)) return null;
        else{
            thisSession.beginTransaction();
            id = thisSession.save(obj);
        }
        thisSession.getTransaction().commit();
        return id;
    }



    public static <T> void delete(T obj){
        Session thisSession = HibernateUtil.getSession();
        thisSession.beginTransaction();
        thisSession.delete(obj);
        thisSession.getTransaction().commit();
    }
}
