package org.app.model.dao;

import java.util.List;
import org.app.model.entity.PmailFolder01;

public interface PmailFolder01DAO {

	public PmailFolder01 create(PmailFolder01 pmailFolder01);

	public PmailFolder01 update(PmailFolder01 pmailFolder01);

	public void remove(Integer id);

	public PmailFolder01 findByID(Integer id);

	public PmailFolder01 findByFoldername(String name);

	public List<PmailFolder01> findAll();

}