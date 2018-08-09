package ma.laposte.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.laposte.dao.PasDeTestRepository;
import ma.laposte.entities.CasTest;
import ma.laposte.entities.PasDeTest;

@Service
@Transactional
public class PasDeTestService implements IPasDeTestService {

	@Autowired
	private PasDeTestRepository pdtRepo;
	
	@Override
	public PasDeTest addPasDeTest(PasDeTest p, CasTest c) {
		p.setCasTest(c);
		return pdtRepo.save(p);
	}

}
