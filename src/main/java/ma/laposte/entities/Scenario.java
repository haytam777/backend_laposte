package ma.laposte.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Scenario {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private String description;
	@OneToMany(mappedBy="scenario")
	private Collection<CasTest> casTests;
	@ManyToOne
	@JoinColumn(name="ID_CAMPAGNE")
	private Campagne campagne;
	
	public Scenario() {
		super();
	}
	
	public Scenario(Collection<CasTest> casTests) {
		super();
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

	public Collection<CasTest> getCasTests() {
		return casTests;
	}

	public void setCasTests(Collection<CasTest> casTests) {
		this.casTests = casTests;
	}

	public Campagne getCampagne() {
		return campagne;
	}

	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}
	
	
	
	
	
}
