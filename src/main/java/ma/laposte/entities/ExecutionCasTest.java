package ma.laposte.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExecutionCasTest {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne @JoinColumn(name="ID_EXECUTION")
	private CasTestCampagne casTestCampagne;
	
	@ManyToOne @JoinColumn(name="ID_TESTEUR")
	private Testeur testeur;
	
	private String resultat;
	private String etat;
	private Date dateExecution;
	
	
	public ExecutionCasTest() {
		super();
	}

	public ExecutionCasTest(
			CasTestCampagne casTestCampagne, Testeur testeur,
			String resultat, String etat, Date dateExecution) {
		super();
		this.casTestCampagne = casTestCampagne;
		this.testeur = testeur;
		this.resultat = resultat;
		this.etat = etat;
		this.dateExecution = dateExecution;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CasTestCampagne getCasTestCampagne() {
		return casTestCampagne;
	}

	public void setCasTestCampagne(CasTestCampagne casTestCampagne) {
		this.casTestCampagne = casTestCampagne;
	}

	public Testeur getTesteur() {
		return testeur;
	}

	public void setTesteur(Testeur testeur) {
		this.testeur = testeur;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public Date getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}
	
	
	
	
	
	
}
