package org.app.model.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PmailFolder
 *
 */
@Entity
@SuppressWarnings("all")
@NamedQueries({ 
	@NamedQuery(name = PmailFolder01.QUERY_FIND_ALL, query = "SELECT c FROM PmailFolder01 c"),
	@NamedQuery(name = PmailFolder01.QUERY_FIND_BY_FOLDERNAME, query = "SELECT c FROM PmailFolder01 c WHERE c.pfolderName =  :pfolderName")
})
public class PmailFolder01 extends Superclass implements Serializable {

	private static final long serialVersionUID = 1L;

	public static final String QUERY_FIND_ALL = "PmailFolder01.FindAll";
	public static final String QUERY_FIND_BY_FOLDERNAME = "PmailFolder01.FindByFolderName";

	@Column(unique = true)
	private String pfolderName;

	public String getPfolderName() {
		return pfolderName;
	}

	public void setPfolderName(String pfolderName) {
		this.pfolderName = pfolderName;
	}
}
