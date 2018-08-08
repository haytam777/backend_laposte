package ma.laposte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.laposte.dao.CampagneRepository;
import ma.laposte.entities.Campagne;
import ma.laposte.entities.Projet;

@Service
@Transactional
public class CampagneService implements ICampagneService {

	@Autowired
	private CampagneRepository cRepo;
	
	@Override
	public Campagne getCampagneById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Campagne addCampagne(Campagne c, Projet p) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Page<Campagne> ListCampagnesOfProject(int idProject, Pageable page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Campagne> listCampagnesOfExigence(int idExigence, Pageable page) {
		return cRepo.listCampagnesOfExigence(idExigence,page);
	}

}
