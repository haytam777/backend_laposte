package ma.laposte.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;
import ma.laposte.service.IExigenceService;
import ma.laposte.service.IProjetService;

@RestController
@CrossOrigin("*")
public class ProjetRestService {
	
	@Autowired
	private IProjetService pService;
	
	@Autowired
	private IExigenceService eService;
	
	@RequestMapping(value="/projets",method=RequestMethod.GET)
	public List<Projet> getProjets(){
		return pService.getAllProjets();
	}
	
	@RequestMapping(value="/projets/{id}",method=RequestMethod.GET)
	public Projet getProjet(@PathVariable int id){
		return pService.getProjetById(id);
	}
	
	@RequestMapping(value="/chercherProjets",method=RequestMethod.GET)
	public Page <Projet> chercher(
			@RequestParam(name="mc", defaultValue="") String mc,
			@RequestParam(name="page", defaultValue="0") int page,
			@RequestParam(name="size",defaultValue="5")int size){
		return pService.chercherProjets("%"+mc+"%",new PageRequest(page,size));
	}
	
	@RequestMapping(value="/projets",method=RequestMethod.POST)
	public Projet addProjet(@RequestBody Projet p){
		return pService.addProjet(p);
	}
	
	@RequestMapping(value="/projets/{id}",method=RequestMethod.DELETE)
	public boolean deleteProjet(@PathVariable int id){
		pService.deleteProjet(id);
		return true;
	}
	
	/*TODO*/
	@RequestMapping(value="/projets/{id}",method=RequestMethod.PUT)
	public boolean deleteProjet(@PathVariable int id, @RequestBody Projet p){
		return true;
	}
	
	@RequestMapping(value="/projets/{id}/exigences", method=RequestMethod.GET)
	public Page<Exigence> listExigence(@PathVariable int id){
		return eService.listExigenceOfProjet(id, 0, 100);
	}
	
	@RequestMapping(value="/projets/{id}/exigences",method=RequestMethod.POST)
	public Exigence addExigence(@RequestBody Exigence e, @PathVariable int id) {
		return eService.addExigence(e,pService.getProjetById(id));
	}
}
