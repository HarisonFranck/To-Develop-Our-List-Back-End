package tpws.wsproject.Entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tache")
public class Tache {


	@Id
	private String idtache;
	
	@Column(name="nomtache")
	private String nomtache;
	
	@Column(name="nompriorite")
	private String nompriorite;
	
	@Column(name="decalage")
	private int decalage;
	
	@Column(name="nomcategorie")
	private String nomcategorie;
	
	@Column(name="duree")
	private double duree;
	
	@Column(name="repetition")
	private String repetition;
	
	@Column(name="isdone")
	private boolean isdone;
	
	@Column(name="date")
	private LocalDateTime date;

	public String getIdTache() {
		return idtache;
	}

	public void setIdTache(String idTache) {
		this.idtache = idTache;
	}

	public String getNomTache() {
		return nomtache;
	}

	public void setNomTache(String nomTache) {
		this.nomtache = nomTache;
	}

	public String getPriorite() {
		return nompriorite;
	}

	public void setPriorite(String idPriorite) {
		this.nompriorite = idPriorite;
	}

	public int getDecalage() {
		return decalage;
	}

	public void setDecalage(int iRappel) {
		this.decalage = iRappel;
	}

	public String getCategorie() {
		return nomcategorie;
	}

	public void setCategorie(String idCategorie) {
		this.nomcategorie = idCategorie;
	}

	public double getDuree() {
		return duree;
	}

	public void setDuree(double duree) {
		this.duree = duree;
	}

	public String getRepetition() {
		return repetition;
	}

	public void setRepetition(String repetition) {
		this.repetition = repetition;
	}

	public boolean isDone() {
		return isdone;
	}

	public void setDone(boolean isDone) {
		this.isdone = isDone;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	
	
	
	
}
	
	
	
	
