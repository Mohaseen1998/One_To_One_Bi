package One_To_One_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetPan {
public static void main(String[] args) {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
	EntityManager em = emf.createEntityManager();
	Pan pan = em.find(Pan.class, 1);
	System.out.println(pan.getAddress());
	System.out.println(pan.getPanno());
	
	Person p = pan.getP();
	System.out.println(p.getName());
	System.out.println(p.getEmail());
	
	System.out.println("----------------------");
	
	Person person = em.find(Person.class, 1);
	System.out.println(person.getName());
	System.out.println(person.getEmail());
	
	Pan pa = person.getPan();
	System.out.println(pa.getAddress());
	System.out.println(pa.getPanno());
	
}
}
