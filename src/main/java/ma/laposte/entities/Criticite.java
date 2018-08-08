package ma.laposte.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Criticite {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom;
	
	@OneToMany(mappedBy="criticite")
	private Collection<Exigence> exigences;
	
	public Criticite() {
		super();
	}

	public Criticite(String nom, Collection<Exigence> exigences) {
		super();
		this.nom = nom;
		this.exigences = exigences;
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

	public Collection<Exigence> getExigences() {
		return exigences;
	}

	public void setExigences(Collection<Exigence> exigences) {
		this.exigences = exigences;
	}
	
	
	
	
	

}
