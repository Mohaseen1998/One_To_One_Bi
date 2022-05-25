package One_To_One_Bi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetGst {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mohaseen");
		EntityManager em = emf.createEntityManager();
		GST g = em.find(GST.class, 1);
		System.out.println(g.getGstno());
		System.out.println(g.getState());
		System.out.println(g.getCountry());

		System.out.println("---------------");

		System.out.println(g.getCom().getName());
		System.out.println(g.getCom().getPhone());
		System.out.println(g.getCom().getWeb());
	}
}
