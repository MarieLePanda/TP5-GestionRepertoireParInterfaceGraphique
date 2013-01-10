import java.util.ArrayList;

public class Repertoire {

	private ArrayList <Personne> liste;
	
	
	public Repertoire() {
		
		liste = new ArrayList <Personne>();
	}
	
	public void ajouterPersonne(Personne unePersonne) {
		
		liste.add(unePersonne); 
	}
	
	public void supprimerPersonne(Personne unePersonne) {
		
		liste.remove(unePersonne);
	}
	
	public void affiche() {
		
		String description = toString();
		
		
	}
	
	public String toString(){
		
		String description = "";
		
		for(Personne personne : liste) {
			description += personne.toString();
		}
		
		return description;

	}

	public Personne rechercher (String unNom) {
		
		Personne resultat = null;
		
		for(Personne personne : liste) {
			if (unNom == personne.getNom()) {
				resultat = personne;
			}
		}
		return resultat;
	}
	
	public Personne rechercher (String unNom, String unPrenom) {
		
		Personne resultat = null;
		
		for(Personne personne : liste) {
			if (unNom == personne.getNom() && unPrenom == personne.getPrenom()) {
				resultat = personne;
			}
		}
		return resultat;
	}
	
	public Personne recherche_personne (int position) {
		
		return liste.get(position);
	}
	
	public void ajoute_personne (String unNom, String unPrenom, String uneAdresse, String unTelephone) {
		
		liste.add(new Personne(unNom, unPrenom, uneAdresse, unTelephone));
	}
	
	public int nombre_de_personne () {
		
		return liste.size();
	}

	public void add(Personne personne) {
		// TODO Auto-generated method stub
		
	}
	
	public void supprimer_personne(Personne unePersonne) {
		
		liste.remove(unePersonne);
	}
}
