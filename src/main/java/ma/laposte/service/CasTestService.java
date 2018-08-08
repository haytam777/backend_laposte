package ma.laposte.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ma.laposte.dao.CasTestRepository;
import ma.laposte.entities.CasTest;
import ma.laposte.entities.Exigence;
import ma.laposte.entities.Projet;

@Service
@Transactional
public class CasTestService implements ICasTestService {

	@Autowired
	private CasTestRepository ctRepo;
	
	@Override
	public CasTest getCasTestById(int id) {
		Optional<CasTest> cc = ctRepo.findById(id);
		if(cc.isPresent()) {
			CasTest ct = cc.get();
			return ct;
		}
		else 
			throw new RuntimeException("Cas Test inexsitant");
	}

	@Override
	public Page<CasTest> listCasTestOfExigence(int idExigence,Pageable page) {
		return ctRepo.listCasTestOfExigence(idExigence,page);
	}

	@Override
	public CasTest addCasTest(CasTest ct, Exigence e) {
		ct.setExigence(e);
		return ctRepo.save(ct);
	}

}
