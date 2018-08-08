package ma.laposte;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.laposte.dao.ProjetRepository;
import ma.laposte.entities.Projet;
import ma.laposte.service.IProjetService;
import ma.laposte.service.ProjetService;

@SpringBootApplication
public class LaposteApplication implements CommandLineRunner {
	
	@Autowired
	private IProjetService projetService;

	public static void main(String[] args) {
		SpringApplication.run(LaposteApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Projet p = projetService.addProjet("projet1", "desc", new Date(), new Date());
	}
}
