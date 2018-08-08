package ma.laposte.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class CasTestCampagne {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne @JoinColumn(name="ID_CASTEST")
	private CasTest casTest;
	
	@ManyToOne @JoinColumn(name="ID_CAMPAGNE")
	private Campagne campagne;
	
	@OneToMany(mappedBy="casTestCampagne")
	private Collection <ExecutionCasTest> executions;
	
	public CasTestCampagne() {
		super();
	}
	
	public CasTestCampagne(CasTest casTest, Campagne campagne) {
		super();
		this.casTest = casTest;
		this.campagne = campagne;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CasTest getCasTest() {
		return casTest;
	}

	public void setCasTest(CasTest casTest) {
		this.casTest = casTest;
	}

	public Campagne getCampagne() {
		return campagne;
	}

	public void setCampagne(Campagne campagne) {
		this.campagne = campagne;
	}
	
	
	

}
