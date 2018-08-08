package ma.laposte.web.complexRequests;

import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;

public class ExigenceCreationRequest {
	
	private Exigence e;
	private Projet p;
	
	public ExigenceCreationRequest(Exigence e, Projet p) {
		super();
		this.e = e;
		this.p = p;
	}
	public Exigence getE() {
		return e;
	}
	public void setE(Exigence e) {
		this.e = e;
	}
	public Projet getP() {
		return p;
	}
	public void setP(Projet p) {
		this.p = p;
	}
	
	

}
