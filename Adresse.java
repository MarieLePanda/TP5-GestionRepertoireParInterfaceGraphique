
public class Adresse {

	private String rue, rue2, codePostal, ville;
	
	public Adresse (String uneRue, String uneRue2, String unCodePostal, String uneVille) {
		
		rue = uneRue;
		rue2 = uneRue2;
		codePostal = unCodePostal;
		ville = uneVille;
	}
	
	public void affiche() {
		
		String description = toString();
		System.out.println(description);
	}
	
	public String toString() {
		
		String description = ("Rue: " +rue+ "\nRue2: " +rue2+ "\nCode Postal: " +codePostal+ "\nVille: " +ville);	
		return description;
	}
}
