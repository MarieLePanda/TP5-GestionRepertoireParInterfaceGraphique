import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Fenetre extends JFrame implements ActionListener {

	public JTextField nom, prenom, adresse, telephone;
	public JButton b_ajout, b_affprec, b_affsuiv, b_quit, b_supprimer, b_modifier, b_clear;
	public Repertoire g;
	public int num_cour = -1;
	
	public Fenetre(String unTitre, Repertoire unRepertoire) {
		
		super(unTitre);
		g = unRepertoire;
		
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(5,1));
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		JLabel jl1 = new JLabel("NOM");
		JLabel jl2 = new JLabel("PRENOM");
		JLabel jl3 = new JLabel("Adresse");
		JLabel jl4 = new JLabel("Téléphone");
		
		nom = new JTextField(20);
		prenom = new JTextField(20);
		adresse = new JTextField(40);
		telephone = new JTextField(10);
		
		b_ajout = new JButton("AJOUT");
		b_affprec = new JButton("<< Affiche");
		b_affsuiv = new JButton("Affiche >>");
		b_quit = new JButton("QUITTER");
		b_supprimer = new JButton("SUPPRIMER");
		b_modifier = new JButton("MODIFIER");
		b_clear = new JButton("CLEAR");
		
		b_ajout.addActionListener(this);
		b_affprec.addActionListener(this);
		b_affsuiv.addActionListener(this);
		b_quit.addActionListener(this);
		b_supprimer.addActionListener(this);
		b_modifier.addActionListener(this);
		b_clear.addActionListener(this);
		
		p1.add(jl1);
		p1.add(nom);
		p2.add(jl2);
		p2.add(prenom);
		p3.add(jl3);
		p3.add(adresse);
		p4.add(jl4);
		p4.add(telephone);
		p5.add(b_ajout);
		p5.add(b_modifier);
		p5.add(b_supprimer);
		p5.add(b_affprec);
		p5.add(b_affsuiv);
		p5.add(b_clear);
		p5.add(b_quit);
		
		c.add(p1);
		c.add(p2);
		c.add(p3);
		c.add(p4);
		c.add(p5);
		
		pack();		// Calcul la taille de la fenêtre automatiquement, se met après la création des éléments !!!
		
	}
	
	
	
	public void ajoute_pers() {
		
		g.ajoute_personne(nom.getText(), prenom.getText(), adresse.getText(), telephone.getText());
		System.out.println(nom.getText()+ " " +prenom.getText()+ " a été ajouté au répertoire.");
		nom.setText(null); prenom.setText(null); adresse.setText(null); telephone.setText(null);
	}
	
	public void modifier() {
		
		g.recherche_personne(num_cour).setNom(nom.getText());
		g.recherche_personne(num_cour).setPrenom(prenom.getText());
		g.recherche_personne(num_cour).setAdresse(adresse.getText());
		g.recherche_personne(num_cour).setTelephone(telephone.getText());
	}
	
	public void supprimer() {
		
		g.supprimer_personne(g.recherche_personne(num_cour));
		nom.setText(null); prenom.setText(null); adresse.setText(null); telephone.setText(null);
		num_cour = -1;
	}
	
	public void clear() {
		
		nom.setText(null); prenom.setText(null); adresse.setText(null); telephone.setText(null);
		num_cour = -1;
	}
	
	
	
	public void affiche_prec() {
			
		if(num_cour > 0) {	
			num_cour --;
			nom.setText(g.recherche_personne(num_cour).getNom());
			prenom.setText(g.recherche_personne(num_cour).getPrenom());
			adresse.setText(g.recherche_personne(num_cour).getAdresse());
			telephone.setText(g.recherche_personne(num_cour).getTelephone());
		}
		else {
			System.out.println("DEBUT DU REPERTOIRE");
		}
	}
	
	public void affiche_suiv() {
		
		if(num_cour < g.nombre_de_personne()-1) {
			num_cour ++;
			nom.setText(g.recherche_personne(num_cour).getNom());
			prenom.setText(g.recherche_personne(num_cour).getPrenom());
			adresse.setText(g.recherche_personne(num_cour).getAdresse());
			telephone.setText(g.recherche_personne(num_cour).getTelephone());
		}
		else {
			System.out.println("FIN DU REPERTOIRE");
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		//System.out.println("Qui a appuyé sur "+arg0.getActionCommand());

		if (arg0.getActionCommand() == "AJOUT") {
			ajoute_pers();
		}
		if (arg0.getActionCommand() == "<< Affiche") {
			affiche_prec();
		}
		if (arg0.getActionCommand() == "Affiche >>") {
			affiche_suiv();
		}
		if (arg0.getActionCommand() == "QUITTER") {
			System.exit(0);
		}
		if (arg0.getActionCommand() == "MODIFIER") {
			modifier();
		}
		if (arg0.getActionCommand() == "SUPPRIMER") {
			supprimer();
		}
		if (arg0.getActionCommand() == "CLEAR") {
			clear();
		}
		
		
	}

						
}
