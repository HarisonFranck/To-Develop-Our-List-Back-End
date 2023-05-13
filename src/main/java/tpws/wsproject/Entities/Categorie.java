package tpws.wsproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="categorie")
public class Categorie {

	
	@Id
	String idcategorie;
	
	@Column(name="nomcategorie")
	String nomcategorie;

	public String getIdcategorie() {
		return idcategorie;
	}

	public void setIdcategorie(String idcategorie) {
		this.idcategorie = idcategorie;
	}

	public String getNomcategorie() {
		return nomcategorie;
	}

	public void setNomcategorie(String nomcategorie) {
		this.nomcategorie = nomcategorie;
	}
	
	
}
