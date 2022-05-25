package One_To_One_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Person person = new Person();
	person.setName("hema");
	person.setEmail("hema@gmail.com");
	
	Pan pan = new Pan();
	pan.setAddress("banglore");
	pan.setPanno("EGEG656");
	
//	person.setPan(pan);
	pan.setP(person);
	
	et.begin();
	em.persist(person);
	em.persist(pan);
	et.commit();
}
}
