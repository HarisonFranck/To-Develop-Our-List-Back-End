package tpws.wsproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userstache")
public class UserTache {

	@Id
	String idusertache;
	
	@Column(name="iduser")
	String iduser;
	
	@Column(name="idtache")
	String idtache;

	public String getIdusertache() {
		return idusertache;
	}

	public void setIdusertache(String idusertache) {
		this.idusertache = idusertache;
	}

	public String getIduser() {
		return iduser;
	}

	public void setIduser(String iduser) {
		this.iduser = iduser;
	}

	public String getIdtache() {
		return idtache;
	}

	public void setIdtache(String idtache) {
		this.idtache = idtache;
	}
	
	
	
}
