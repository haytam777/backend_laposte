package ma.laposte.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("concepteur")
public class Concepteur extends Profil {

	public Concepteur() {
		super();
	}

	public Concepteur(String nom, String prenom) {
		super(nom, prenom);
	}

}
