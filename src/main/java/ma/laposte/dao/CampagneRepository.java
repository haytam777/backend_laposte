package ma.laposte.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ma.laposte.entities.Campagne;

public interface CampagneRepository extends JpaRepository<Campagne,Integer> {
	
	@Query("select c from Campagne c where c.projet.id=:x")
	public Page<Campagne> listCampagnesOfProject(int idProject, Pageable page);
	
	@Query(
			"select distinct c from Campagne c, CasTest ct, CasTestCampagne ctc where "
			+ "ctc.campagne.id = c.id and ctc.casTest.id = ct.id and ct.exigence.id = :x")

	public Page<Campagne> listCampagnesOfExigence(@Param("x") int idExigence, Pageable page);


}
