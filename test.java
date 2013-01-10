import javax.swing.JFrame;


public class test {

	public static void main(String[] args) {

		Personne personne1, personne2, personne3, personne4;
		Adresse adresse1, adresse2, adresse3;
		Repertoire repertoire1;
		
		//adresse1 = new Adresse("15 rue haute","","91850","Bouray sur Juine");
		personne1 = new Personne("Guidé", "Loulou", "15 rue haute 91850 Bouray sur Juine", "01 25 69 84 32");
		//adresse2 = new Adresse("4 rue aux chats","6 rue aux chats","91710","Montlhéry");
		personne2 = new Personne("Miné", "Louloute", "4 rue aux chats  91710 Montlhéry", "01 28 12 36 78");
		personne3 = new Personne("Guidé", "Brandon", "15 rue haute 91850 Bouray sur Juine", "01 25 69 84 32");
		personne4 = new Personne("Guidé", "Eric", "15 rue haute 91850 Bouray sur Juine", "01 25 69 84 32");

		repertoire1 = new Repertoire();
		repertoire1.ajouterPersonne(personne1);
		repertoire1.ajouterPersonne(personne2);
		repertoire1.ajouterPersonne(personne3);	
		repertoire1.ajouterPersonne(personne4);

		/*System.out.print(repertoire1.toString());*/
		/*repertoire1.affiche();*/
		//System.out.print(repertoire1.rechercher("Guidé"));
		//System.out.print(repertoire1.rechercher("Guidé", "Kevin"));
		
		/*adresse1.affiche();
		System.out.println("_________________________________________________________\n");

		System.out.println(adresse1.toString());
		System.out.println("_________________________________________________________\n");
		
		personne1.affiche();
		System.out.println("_________________________________________________________\n");
		
		System.out.println(personne1.toString());
		System.out.println("_________________________________________________________\n");*/
		
		
		
		
		//System.out.println(repertoire1.recherche_personne(0));			// utilisation de recherche_personne
		
		//System.out.println(repertoire1.nombre_de_personne());
		
		
		JFrame f1 = new Fenetre("REPERTOIRE",repertoire1);
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
