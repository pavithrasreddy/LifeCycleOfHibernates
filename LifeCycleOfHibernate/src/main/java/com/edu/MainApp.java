package com.edu;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class MainApp {

	public static void main(String[] args) {
		MyLaptop lob=new MyLaptop();
		lob.setLid(14);
		lob.setLname("acer");
		lob.setLprice(45500);
		MyLaptop lob1=new MyLaptop();

		lob1.setLid(12);
		lob1.setLname("lg");
		lob1.setLprice(30440);
		Configuration con=new Configuration().configure().addAnnotatedClass(MyLaptop.class);
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf=con.buildSessionFactory(reg);
		Session ses=sf.openSession();
		Transaction tx=ses.beginTransaction();
		//ses.save(lob);
		//ses.save(lob1);
		//tx.commit();
		
/*		//persistant stage is save record in database//permanent storage in database
		//java object converts to row in database
		ses.save(lob);
		ses.save(lob1);
		lob.setLprice(45000);
		tx.commit();
	*/
	/*	//detach state
		ses.save(lob);
		ses.save(lob1);
		tx.commit();
		ses.evict(lob);
		lob.setLprice(55000);
*/
	//remove state
		ses.save(lob);
		ses.save(lob1);
		ses.delete(lob1);
		ses.delete(lob);
		tx.commit();
	
		
	}

}
