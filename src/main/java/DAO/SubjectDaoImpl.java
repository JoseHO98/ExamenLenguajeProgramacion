package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import model.subject;

public class SubjectDaoImpl implements SubjectDAO{
	
	EntityManagerFactory factory;
	EntityManager em;
	
	public SubjectDaoImpl() {
		factory = Persistence.createEntityManagerFactory("CL1");
		em = factory.createEntityManager();
	}

	@Override
	public void create(subject subject) {
		em.getTransaction().begin();
		em.persist(subject);
		em.getTransaction().commit();	
	}

	@Override
	public void update(subject subject) {
		try {
			em.getTransaction().begin();
			em.merge(subject);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	@Override
	public void delete(Integer id) {
		subject subject = find(id);
		em.getTransaction().begin();
		em.remove(subject);
		em.getTransaction().commit();	
	}

	@Override
	public List<subject> findAll() {
		Query query = em.createNamedQuery("subject.findAll");
		List<subject> lista = query.getResultList();
		return lista;
	}

	@Override
	public subject find(Integer id) {
		return em.find(subject.class, id);
	}

}
