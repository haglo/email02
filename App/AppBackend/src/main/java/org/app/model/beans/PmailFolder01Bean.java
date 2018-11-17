package org.app.model.beans;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.app.model.dao.PmailFolder01DAO;
import org.app.model.entity.PmailFolder01;

@Stateless
@Remote(PmailFolder01DAO.class)
public class PmailFolder01Bean implements PmailFolder01DAO {

	@PersistenceContext
	private EntityManager em;

	@Override
	public PmailFolder01 create(PmailFolder01 pmailFolder01) {
		em.persist(pmailFolder01);
		em.flush();
		return pmailFolder01;
	}

	@Override
	public PmailFolder01 update(PmailFolder01 pmail) {
		pmail = em.merge(pmail);
		em.flush();
		return pmail;
	}

	@Override
	public void remove(Integer id) {
		PmailFolder01 toBeDeleted = findByID(id);
		em.remove(toBeDeleted);
		em.flush();
	}

	@Override
	public PmailFolder01 findByID(Integer id) {
		return em.find(PmailFolder01.class, id);
	}

	@Override
	public PmailFolder01 findByFoldername(String name) {
		return em.createNamedQuery(PmailFolder01.QUERY_FIND_BY_FOLDERNAME, PmailFolder01.class)
				.setParameter("pfolderName", name).getSingleResult();
	}

	@Override
	public List<PmailFolder01> findAll() {
		return em.createNamedQuery(PmailFolder01.QUERY_FIND_ALL, PmailFolder01.class).getResultList();
	}

}
