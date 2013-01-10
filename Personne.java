
public class Personne {
	
	private String nom, prenom, telephone;
	private String adresse;
	
	public Personne (String unNom, String unPrenom, String uneAdresse, String unTelephone) {
		
		nom = unNom;
		prenom = unPrenom;
		adresse = uneAdresse;
		telephone = unTelephone;
	}
	
	public void affiche() {
		
		String description = toString();
		System.out.println(description);
	}
	
	public String toString() {
		
		String description = ("\nnom: " +nom+ "\nPrénom: " +prenom+ "\n" +adresse+ "\nTéléphone: " +telephone+ "\n_________________________________________________________\n");	
		return description;
	}
	
	public String getNom() {
		
		return nom;
	}
	
	public String getPrenom() {
		
		return prenom;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
}
