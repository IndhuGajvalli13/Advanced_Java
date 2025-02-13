package hibernateproject01.demo;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Mainclass1 {
	public static void main(String[] args) {
		EntityManagerFactory e=Persistence.createEntityManagerFactory("mapping");
		EntityManager m=e.createEntityManager();
		EntityTransaction t =m.getTransaction();
		  Bank b1=new Bank();
				  b1.setAccNumber();
		           
		
		
    
    }

}
