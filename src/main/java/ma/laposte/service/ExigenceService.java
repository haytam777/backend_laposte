package ma.laposte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.laposte.dao.ExigenceRepository;
import ma.laposte.dao.ProjetRepository;
import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;

@Service
@Transactional
public class ExigenceService implements IExigenceService {

	@Autowired
	private ExigenceRepository exigenceRepo;

	@Override
	public Exigence getExigenceById(int id) {
		Optional<Exigence> ee = exigenceRepo.findById(id);
		if(ee.isPresent()) {
			Exigence e = ee.get();
			return e;
		}
		else 
			throw new RuntimeException("Projet non exsitant");
	}

	@Override
	public Page<Exigence> listExigenceOfProjet(int idProjet,int page, int size) {
		return exigenceRepo.listExigenceOfProjet(idProjet, new PageRequest(page,size));

	}

	@Override
	public Exigence addExigence(Exigence e, Projet p) {
		e.setProjet(p);
		return exigenceRepo.save(e);
	}
	
	

}
