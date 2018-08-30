package com.sony.HibeRelaton;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	EmpLaptop lap=new EmpLaptop();
    	lap.setLid(101);
    	lap.setLname("sony");
    	
    	Employee emp=new Employee();
    	emp.setEid(10);
    	emp.setEname("Mukesh");
    	emp.setDept("Bussiness");
    	emp.getLaptop().add(lap);
    	
    	lap.getEmployee().add(emp);
    	
        Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(EmpLaptop.class);
        ServiceRegistry registry=new ServiceRegistryBuilder().applySettings(cfg.getProperties()).buildServiceRegistry();
        SessionFactory sf=cfg.buildSessionFactory(registry);
        Session session=sf.openSession();
        
        session.beginTransaction();
        session.save(lap);
        session.save(emp);
        
        session.getTransaction().commit();
        
    }
}
