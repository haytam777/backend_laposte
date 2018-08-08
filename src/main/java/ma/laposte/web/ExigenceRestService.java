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
import org.springframework.web.bind.annotation.RestController;

import ma.laposte.entities.Campagne;
import ma.laposte.entities.CasTest;
import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;
import ma.laposte.service.ICampagneService;
import ma.laposte.service.ICasTestService;
import ma.laposte.service.IExigenceService;
import ma.laposte.service.IProjetService;
import ma.laposte.web.complexRequests.ExigenceCreationRequest;

@RestController
@CrossOrigin("*")
public class ExigenceRestService {
	
	@Autowired
	private IExigenceService eService;
	
	@Autowired
	private IProjetService pService;
	
	@Autowired
	private ICampagneService cService;
	
	@Autowired
	private ICasTestService ctService;
	
	@RequestMapping(value="/exigences/{id}",method=RequestMethod.GET)
	public Exigence getExigence(@PathVariable int id){
		return eService.getExigenceById(id);
	}
	
	
	@RequestMapping(value="/exigences/{id}/campagnes", method=RequestMethod.GET)
	public Page<Campagne> listCampagneOfExigence(@PathVariable int id){
		return cService.listCampagnesOfExigence(id, new PageRequest(0,100));
		
	}
	
	@RequestMapping(value="exigences/{id}/castests", method=RequestMethod.GET)
	public Page<CasTest> getCasTest(@PathVariable int id){
		return ctService.listCasTestOfExigence(id, new PageRequest(0,100));
	}
	
	@RequestMapping(value="exigences/{id}/castests/", method=RequestMethod.POST)
	public CasTest addCastest(@RequestBody CasTest ct,@PathVariable int idExigence){
		return ctService.addCasTest(ct, eService.getExigenceById(idExigence));
	}
	
	/*@RequestMapping(value="exigences/{id}/castests/", method=RequestMethod.PUT)
	public CasTest addCastest(@RequestBody CasTest ct,@PathVariable int idExigence){
		return ctService.addCasTest(ct, eService.getExigenceById(idExigence));
	}*/


}
