package ma.laposte.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import ma.laposte.entities.CasTest;
import ma.laposte.entities.Exigence;

public interface ICasTestService {
	
	public CasTest getCasTestById(int id);
	public Page<CasTest> listCasTestOfExigence(int idExigence,Pageable page);
	public CasTest addCasTest(CasTest ct, Exigence e);

}
