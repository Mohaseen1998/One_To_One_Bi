package One_To_One_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompany {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Company c = new Company();
	c.setName("star ");
	c.setPhone(6846984);
	c.setWeb("schb.com");
	
	GST g = new GST();
	g.setState("kar");
	g.setGstno("hgyf78");
	g.setCountry("india");
	
	g.setCom(c);
	
	et.begin();
	em.persist(c);
	em.persist(g);
	et.commit();
}
}
