package com.ozlem.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ozlem.onetoone.HibernateUtil;

public class Main {
	
	
	public static void main(String [] args)
	{
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session s=sf.openSession();
	s.beginTransaction();
	
	Department department = new Department();
	department.setDepartmentname("Sales");
    s.save(department);
    
    Employee1 emp1=new Employee1("John","Clark","142");
    Employee1 emp2=new Employee1("Ella","Lewis","101");
    
    emp1.setDepartment(department);
    emp1.setDepartment(department);
    
    s.save(emp1);
    s.save(emp2);
    
    s.getTransaction().commit();
    s.close();


	}
}
