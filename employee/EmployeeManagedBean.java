/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author OTT
 */
@Named(value = "employeeManagedBean")
@Dependent
public class EmployeeManagedBean {
    
    Session session = null;

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }
    SessionFactory sessionFactory = null;
    private List employees = new ArrayList<>();
    /**
     * Creates a new instance of EmployeeManagedBean
     */
    public EmployeeManagedBean() {
        this.sessionFactory = HibernateUtil.getSessionFactory();        
    }
    
    public void start() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
//        this.session = HibernateUtil.getSessionFactory().getCurrentSesseion();
    }    
}
