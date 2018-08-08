package ma.laposte.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.laposte.entities.Profil;

public interface ProfilRepository extends JpaRepository<Profil,Integer> {
	
}
