package ma.laposte.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ma.laposte.entities.Campagne;
import ma.laposte.entities.Projet;

public interface IProjetService {
	
	public Projet getProjetById(int id);
	public Projet addProjet(String intitule, String description, Date dateDebut, Date dateFin);
	public Projet addProjetWC(String intitule, String description, Date dateDebut, Date dateFin,Collection<Campagne> Campagnes);
	public Page<Projet> getAllProjets(int page, int size);
	public List<Projet> getAllProjets();
	public Projet addProjet(Projet p);
	public void deleteProjet(int id);
	public Page<Projet> chercherProjets(String mc, Pageable page);

}
