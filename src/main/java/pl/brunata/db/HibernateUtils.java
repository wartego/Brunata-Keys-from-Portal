package pl.brunata.db;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.brunata.entity.DevicesKey;

public class HibernateUtils {
    private static final Logger log = LoggerFactory.getLogger(HibernateUtils.class);
    private static SessionFactory sessionFactory;
    public static Session openSession(){
        return getSessionFactory().openSession();
    }
    public static SessionFactory getSessionFactory(){
        if(sessionFactory == null){
            createSessionFactory();
        }
        return sessionFactory;
    }

    private static void createSessionFactory() {
        Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(DevicesKey.class);
        final ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties())
                .build();
        try{
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e){
            log.error("Creating SessionFactory failed! Exception: \n" );
            e.printStackTrace();
            StandardServiceRegistryBuilder.destroy(serviceRegistry);
        }

    }
}
