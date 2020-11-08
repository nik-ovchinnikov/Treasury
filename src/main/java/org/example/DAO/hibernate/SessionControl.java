package org.example.DAO.hibernate;

import org.example.DAO.Base.GetPath;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionControl implements ISessionControl {
    public static Session session;

    @Override
    public Session startSession() {
        if (session == null) {
            SessionFactory factory;
                factory = new Configuration().configure("hibernate.cfg_win.xml").buildSessionFactory();


            Session session = factory.openSession();
            session.beginTransaction();
            return session;
        }
        return session;
    }

    @Override
    public void closeSession(Session session) {
        session.getTransaction().commit();
        session.close();
    }
}
