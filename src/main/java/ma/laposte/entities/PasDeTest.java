package ma.laposte.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PasDeTest {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nom;
	private String instruction;
	private int ordre;
	
	@ManyToOne @JoinColumn(name="ID_CASTEST")
	private CasTest casTest;

	public PasDeTest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PasDeTest(String nom, String instruction, int ordre, CasTest casTest) {
		super();
		this.nom = nom;
		this.instruction = instruction;
		this.ordre = ordre;
		this.casTest = casTest;
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

	public String getInstruction() {
		return instruction;
	}

	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}

	public CasTest getCasTest() {
		return casTest;
	}

	public void setCasTest(CasTest casTest) {
		this.casTest = casTest;
	}
	
	
	
	
	
	

}
