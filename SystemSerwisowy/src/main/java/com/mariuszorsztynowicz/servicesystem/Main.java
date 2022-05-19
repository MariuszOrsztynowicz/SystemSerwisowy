package com.mariuszorsztynowicz.servicesystem;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        System.out.println("Service System");

        SessionFactory sessionFactory = new Configuration()
                .addPackage("com.mariuszorsztynowicz.servicesystem")
                .buildSessionFactory();


        Session session = sessionFactory.openSession();





    }
}
