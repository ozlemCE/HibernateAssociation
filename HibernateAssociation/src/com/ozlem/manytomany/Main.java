package com.ozlem.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ozlem.onetoone.HibernateUtil;

public class Main {
	
	public static void main(String[] args)
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		
		Meeting meeting1 = new Meeting("Quaterly Sales meeting");
        Meeting meeting2 = new Meeting("Weekly Status meeting");
		
        Employee2 emp1=new Employee2("Sergey","Brin");
        Employee2 emp2=new Employee2("Larry","Page");
        
        emp1.getMeetings().add(meeting1);
        emp1.getMeetings().add(meeting2);
        emp2.getMeetings().add(meeting1);
        
        s.save(emp1);
        s.save(emp2);
        
        s.getTransaction().commit();
        s.close();
;	}

}
