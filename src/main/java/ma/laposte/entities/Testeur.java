package ma.laposte.entities;

import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("testeur")
public class Testeur extends Profil {
	
	@OneToMany(mappedBy="testeur")
	private Collection<ExecutionCasTest> executions;

	public Testeur() {
		super();
		
	}

	public Testeur(String nom, String prenom) {
		super(nom, prenom);
	}

	public Testeur(String nom, String prenom, Collection<ExecutionCasTest> executions) {
		super(nom,prenom);
		this.executions = executions;
	}
	
	

	
	

}
