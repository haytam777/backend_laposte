package ma.laposte.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.laposte.entities.Campagne;
import ma.laposte.entities.Projet;

public interface ICampagneService {
	
	public Campagne getCampagneById(int id);
	public Campagne addCampagne(Campagne c, Projet p );
	public Page<Campagne> ListCampagnesOfProject(int idProject, Pageable page);
	public Page<Campagne> listCampagnesOfExigence(int idExigence, Pageable page);


}
