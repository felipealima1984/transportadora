package transportadora;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Controller {
	EntityManagerFactory emf;
	EntityManager em;
	
	public Controller() {
		emf = Persistence.createEntityManagerFactory("transportadoras");
		em = emf.createEntityManager();
	}
	
	public void salvar(Transportadoras _transportadoras) {
		em.getTransaction().begin();
		em.merge(_transportadoras);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Transportadoras _transportadoras) {
		em.getTransaction().begin();
		Query q = em.createNativeQuery("delete transportadoras from transportadoras where email = " + _transportadoras.getEmail());
		q.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Transportadoras> listar(){
		em.getTransaction().begin();
		Query consulta = em.createQuery("SELECT transportadoras FROM transportadoras ");
		List<Transportadoras> lista = consulta.getResultList();
		em.getTransaction().commit();
		emf.close();
		return lista;
		
	}
}
