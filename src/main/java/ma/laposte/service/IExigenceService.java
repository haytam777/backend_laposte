package ma.laposte.service;

import org.springframework.data.domain.Page;

import ma.laposte.entities.Campagne;
import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;

public interface IExigenceService {
	
	public Exigence getExigenceById(int id);
	public Page<Exigence> listExigenceOfProjet(int idProjet,int page, int size);
	public Exigence addExigence(Exigence e, Projet p);
}
