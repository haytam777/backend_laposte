package ma.laposte.entities;

import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Projet {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String intitule;
	private String description;
	private Date dateDebut;
	private Date dateFin;
	
	@JsonIgnore @OneToMany(mappedBy="projet")
	private Collection<Exigence> exigences;
	
	@JsonIgnore @OneToMany(mappedBy="projet")
	private Collection<Campagne> campagnes;
	
	public Projet() {
		super();
	}

	public Projet(String intitule, String description, Date dateDebut, Date dateFin) {
		super();
		this.intitule = intitule;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}
	
	public Projet(String intitule, String description, Date dateDebut, Date dateFin, Collection<Exigence> exigences,
			Collection<Campagne> campagnes) {
		super();
		this.intitule = intitule;
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.exigences = exigences;
		this.campagnes = campagnes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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

	public Collection<Campagne> getCampagnes() {
		return campagnes;
	}

	public void setCampagnes(Collection<Campagne> campagnes) {
		this.campagnes = campagnes;
	}

	
	/*public Collection<Exigence> getExigences() {
		return exigences;
	}

	public void setExigences(Collection<Exigence> exigences) {
		this.exigences = exigences;
	}*/
	
	
	
	
	
	
	
	
	 
}
