package ma.laposte.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import ma.laposte.entities.Exigence;

public interface ExigenceRepository extends JpaRepository<Exigence,Integer> {
	
	@Query("select e from Exigence e where e.projet.id=:x")
	public Page<Exigence> listExigenceOfProjet(@Param("x")int id,Pageable pageable);
}
