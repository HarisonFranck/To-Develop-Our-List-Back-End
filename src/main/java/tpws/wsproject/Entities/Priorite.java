package tpws.wsproject.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="priorite")
public class Priorite {

	@Id
	String idpriorite;
	
	@Column(name="nompriorite")
	String nompriorite;
	
	@Column(name="priovaleur")
	int priovaleur;

	public String getIdpriorite() {
		return idpriorite;
	}

	public void setIdpriorite(String idpriorite) {
		this.idpriorite = idpriorite;
	}

	public String getNompriorite() {
		return nompriorite;
	}

	public void setNompriorite(String nompriorite) {
		this.nompriorite = nompriorite;
	}

	public int getPriovaleur() {
		return priovaleur;
	}

	public void setPriovaleur(int priovaleur) {
		this.priovaleur = priovaleur;
	}
	
	
	
}
