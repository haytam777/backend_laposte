package ma.laposte.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ma.laposte.entities.PasDeTest;
import ma.laposte.service.ICasTestService;
import ma.laposte.service.IPasDeTestService;

@RestController
@CrossOrigin("*")
public class PasTestRest {

	@Autowired
	private IPasDeTestService pdtService;
	
	@Autowired
	private ICasTestService ctService;
	
	@RequestMapping(value="/castests/{id}/pastests",method=RequestMethod.POST)
	public PasDeTest addPasTest(@PathVariable int id, @RequestBody PasDeTest pdt) {
		return pdtService.addPasDeTest(pdt, ctService.getCasTestById(id));
	}
}
