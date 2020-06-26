package Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HbnUtils {
    private static SessionFactory sessionFactory ;//此时sessionFactory是空值，需要调用才会有值

    public static Session getSession(){
        return getSessionFactory().getCurrentSession();

//        //获取创建一个新的session，建议用getCurrentSession（获取当前线程的sessio对象）
//        Session session=sessionFactory.getCurrentSession();//是单例模式，需要与当前线程绑定
//        return  session;

    }
    //单例模式设置
    public static SessionFactory getSessionFactory() {

        if (sessionFactory == null || sessionFactory.isClosed()){
            sessionFactory = new Configuration().configure().buildSessionFactory();
        }
        return sessionFactory;
    }
}
