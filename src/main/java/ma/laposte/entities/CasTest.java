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
public class CasTest {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String description;
	
	@ManyToOne @JoinColumn(name="ID_EXIGENCE")
	private Exigence exigence;
	
	@JsonIgnore @OneToMany(mappedBy="casTest")
	private Collection<CasTestCampagne> casTestsCamp;
	
	public CasTest() {
		super();
	}
	
	public CasTest(String nom, String description, Exigence exigence) {
		super();
		this.nom = nom;
		this.description = description;
		this.exigence = exigence;
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

	public Exigence getExigence() {
		return exigence;
	}

	public void setExigence(Exigence exigence) {
		this.exigence = exigence;
	}

	
	
	
}
