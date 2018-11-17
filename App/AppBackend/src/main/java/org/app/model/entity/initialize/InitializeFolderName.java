package org.app.model.entity.initialize;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.app.model.dao.PmailFolder01DAO;
import org.app.model.entity.PmailFolder01;

@Singleton
@Startup
public class InitializeFolderName {

	@EJB
	PmailFolder01DAO pmailFolder01DAO;

	@PostConstruct
	void init() {
		if (pmailFolder01DAO.findAll().size() == 0) {

			PmailFolder01 entity = new PmailFolder01();

			entity.setPfolderName("Inbox");
			pmailFolder01DAO.create(entity);

			entity.setPfolderName("Sent");
			pmailFolder01DAO.create(entity);
			
			entity.setPfolderName("Draft");
			pmailFolder01DAO.create(entity);
			
			entity.setPfolderName("Template");
			pmailFolder01DAO.create(entity);
			
			entity.setPfolderName("Trash");
			pmailFolder01DAO.create(entity);
			
			entity.setPfolderName("Archive");
			pmailFolder01DAO.create(entity);

		}
	}
}