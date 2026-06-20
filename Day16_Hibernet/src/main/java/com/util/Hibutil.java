package com.util;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibutil {

    private static SessionFactory sf;

    static {
        try {
            sf = new Configuration()
                    .configure("hibernate.cfg.xml")
                    .buildSessionFactory();
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory() {
        return sf;
    }
}