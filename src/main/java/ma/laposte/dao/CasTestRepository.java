package ma.laposte.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.laposte.entities.CasTest;

public interface CasTestRepository extends JpaRepository<CasTest,Integer> {
	
	
	@Query("select c from CasTest c where c.exigence.id=:x")
	public Page<CasTest> listCasTestOfExigence(@Param("x") int idExigence, Pageable page);
	
	
	

}
