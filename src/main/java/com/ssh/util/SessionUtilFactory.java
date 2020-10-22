package com.ssh.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SessionUtilFactory {
    private SessionFactory sessionFactory;
    public Session getCurrentSession() {
        return this.sessionFactory.openSession();
    }
}
