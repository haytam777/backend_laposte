package ma.laposte.service;

import ma.laposte.entities.Profil;

public interface IProfilService {
	
	public Profil getProfilById(int idProfil);
	public Profil addProfil(String nom, String prenom);
}
