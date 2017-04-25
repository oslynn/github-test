/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

/**
 *
 * @author OTT
 */
@ManagedBean
@RequestScoped
public class EmployeeHelper implements Serializable { 
    Session session = null;
    SessionFactory sessionFactory = null;
    private List employees = new ArrayList<>();

    public List getEmployees() {
        return employees;
    }

    public void setEmployees(List employees) {
        this.employees = employees;
    }
    
    public EmployeeHelper() {
    }
    
    public void start() {
        this.sessionFactory = HibernateUtil.getSessionFactory();
//        this.session = HibernateUtil.getSessionFactory().getCurrentSesseion();
    }
    
}
