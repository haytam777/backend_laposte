package ma.laposte.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Exigence {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String description;
	
	@JsonIgnore @OneToMany(mappedBy="exigence")
	private Collection<CasTest> casTests;
	
	@ManyToOne @JoinColumn(name="ID_PROJET")
	private Projet projet;
	
	@ManyToOne @JoinColumn(name="ID_TYPE")
	private Type type;
	
	@ManyToOne @JoinColumn(name="ID_CRIT")
	private Criticite criticite;
	
	public Exigence() {
		super();
	}
	
	public Exigence(String nom, String description, Type type, Criticite criticite) {
		super();
		this.nom = nom;
		this.description = description;
		this.type = type;
		this.criticite = criticite;
	}
	
	public Exigence(String nom, String description, Projet projet) {
		super();
		this.nom = nom;
		this.description = description;
		this.projet = projet;
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

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Criticite getCriticite() {
		return criticite;
	}

	public void setCriticite(Criticite criticite) {
		this.criticite = criticite;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Collection<CasTest> getCasTests() {
		return casTests;
	}

	public void setCasTests(Collection<CasTest> casTests) {
		this.casTests = casTests;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	
	
	
	
}
