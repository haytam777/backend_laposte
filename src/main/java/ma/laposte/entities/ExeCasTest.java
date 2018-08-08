package ma.laposte.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ExeCasTest implements Serializable {
	
	@Id
	private int id;
	
	@ManyToOne()
	@JoinColumn(name="ID_TESTEUR")
	private Testeur testeur;
	
	@ManyToOne()
	@JoinColumn(name="ID_CASTEST")
	private CasTest casTest;
	private Date dateExecution;
	private String resultat;
	
	public ExeCasTest() {
		super();
	}
	
	public ExeCasTest(Testeur testeur, CasTest casTest, Date dateExecution, String resultat) {
		super();
		this.testeur = testeur;
		this.casTest = casTest;
		this.dateExecution = dateExecution;
		this.resultat = resultat;
	}

	public Testeur getTesteur() {
		return testeur;
	}

	public void setTesteur(Testeur testeur) {
		this.testeur = testeur;
	}

	public CasTest getCasTest() {
		return casTest;
	}

	public void setCasTest(CasTest casTest) {
		this.casTest = casTest;
	}

	public Date getDateExecution() {
		return dateExecution;
	}

	public void setDateExecution(Date dateExecution) {
		this.dateExecution = dateExecution;
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}
	
	
	
}
