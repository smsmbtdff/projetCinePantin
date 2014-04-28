package fr.cinepantin.metier;

public class Adresse {

	private int numRue;
	private String rue;
	private String ville;
	private String pays;
	private int codePostal;
	
	
	
	@Override
	public String toString() {
		return "Adresse [numRue=" + numRue + ", rue=" + rue + ", ville="
				+ ville + ", pays=" + pays + ", codePostal=" + codePostal + "]";
	}
	
	public int getNumRue() {
		return numRue;
	}


	public void setNumRue(int numRue) {
		this.numRue = numRue;
	}


	public String getRue() {
		return rue;
	}


	public void setRue(String rue) {
		this.rue = rue;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}


	public int getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
}
