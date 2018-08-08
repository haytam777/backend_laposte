package ma.laposte.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Campagne {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String description;
	
	@ManyToOne @JoinColumn(name="ID_PROJET")
	private Projet projet;
	
	@JsonIgnore @OneToMany(mappedBy="campagne")
	private Collection<CasTestCampagne> casTests;
	
	private Date dateDebut;
	private Date dateFin;
	
	public Campagne() {
		super();
	}

	public Campagne(String nom, String description, Projet projet) {
		super();
		this.nom = nom;
		this.description = description;
		this.projet = projet;
	}
	
	public Campagne(String nom, String description, Projet projet, Collection<CasTestCampagne> casTests) {
		super();
		this.nom = nom;
		this.description = description;
		this.projet = projet;
		this.casTests = casTests;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Collection<CasTestCampagne> getCasTests() {
		return casTests;
	}

	public void setCasTests(Collection<CasTestCampagne> casTests) {
		this.casTests = casTests;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	
	
	
	
	
	
	
	

}
