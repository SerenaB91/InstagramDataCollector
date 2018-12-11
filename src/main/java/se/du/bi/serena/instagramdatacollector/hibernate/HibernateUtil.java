/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.du.bi.serena.instagramdatacollector.hibernate;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import se.du.bi.serena.instagramdatacollector.dto.City;
import se.du.bi.serena.instagramdatacollector.dto.Comment;
import se.du.bi.serena.instagramdatacollector.dto.Country;
import se.du.bi.serena.instagramdatacollector.dto.Instagram;
import se.du.bi.serena.instagramdatacollector.dto.Location;


/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author Serena
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;
    
    static {
        try {
            // Create the SessionFactory from standard (hibernate.cfg.xml) 
            // config file.
            sessionFactory = new AnnotationConfiguration().configure()
                    .addAnnotatedClass(Country.class)
                    .addAnnotatedClass(City.class)
                    .addAnnotatedClass(Location.class)
                    .addAnnotatedClass(Instagram.class)
                    .addAnnotatedClass(Comment.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
