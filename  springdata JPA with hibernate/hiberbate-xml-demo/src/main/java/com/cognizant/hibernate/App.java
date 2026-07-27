package com.cognizant.hibernate;

import com.cognizant.hibernate.model.Country;
import com.cognizant.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        Country country =
                new Country("JP","Japan");

        session.save(country);

        System.out.println("Country inserted successfully!");

        tx.commit();

        session.close();

    }

}