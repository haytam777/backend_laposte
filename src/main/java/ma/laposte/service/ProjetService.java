package ma.laposte.service;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.laposte.dao.ProjetRepository;
import ma.laposte.entities.Campagne;
import ma.laposte.entities.Projet;

@Service
@Transactional
public class ProjetService implements IProjetService {
	
	@Autowired
	private ProjetRepository projetRepo;

	@Override
	public Projet getProjetById(int id) {
		Optional<Projet> pp = projetRepo.findById(id);
		if(pp.isPresent()) {
			Projet p = pp.get();
			return p;
		}
		else 
			throw new RuntimeException("Projet non exsitant");
	}

	@Override
	public Projet addProjet(String intitule, String description, Date dateDebut, Date dateFin) {
		Projet p = projetRepo.save(new Projet(intitule,description,dateDebut,dateFin));
		return p;
	}

	@Override
	public Projet addProjetWC(String intitule, String description, Date dateDebut, Date dateFin,
			Collection<Campagne> Campagnes) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Projet addProjet(Projet p) {
		return projetRepo.save(p);
	}
	
	@Override
	public void deleteProjet(int id) {
		projetRepo.deleteById(id);
	}


	@Override
	public Page<Projet> getAllProjets(int page, int size) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public List<Projet> getAllProjets(){
		return projetRepo.findAll();
	}

	@Override
	public Page<Projet> chercherProjets(String mc, Pageable page) {
		return projetRepo.chercher(mc, page);
	}

}
