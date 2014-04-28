package fr.cinepantin.metier;
import javax.persistence.*;

@Entity
public class Client {

	private String nom;
	private String prenom;
	private String email;
	private String motDePasse;
	private Adresse adresse;
	
	
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", email=" + email
				+ "]";
	}
	@Id
	public void setNom(String nom) {
		this.nom = nom;
	}
	@Id
	public String getPrenom() {
		return prenom;
	}
	@Id
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	@Id
	public String getEmail() {
		return email;
	}
	@Id
	public void setEmail(String email) {
		this.email = email;
	}
	@Id
	public String getMotDePasse() {
		return motDePasse;
	}
	@Id
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	@Id
	public Adresse getAdresse() {
		return adresse;
	}
	@Id
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Client(String nom, String prenom, String email, String motDePasse,
			Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.adresse = adresse;
	}
	public Client (){
		
	}
	
}
