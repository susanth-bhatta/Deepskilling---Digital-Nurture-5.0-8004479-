package com.cognizant.hibernate;

import com.cognizant.hibernate.model.Employee;
import com.cognizant.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {

    public static void main(String[] args) {

        Session session =
                HibernateUtil.getSessionFactory().openSession();

        Transaction tx =
                session.beginTransaction();

        Employee emp =
                new Employee("Rahul","Sharma",50000);

        session.save(emp);

        tx.commit();

        session.close();

    }
}