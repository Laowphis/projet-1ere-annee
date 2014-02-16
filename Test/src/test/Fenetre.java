package test;
import javax.swing.JFrame;
import java.awt.Color; 
import javax.swing.JPanel;
	 
public class Fenetre extends JFrame {
	 public Fenetre(){	//Cr�er une fen�tre
	    this.setTitle("Ma premi�re fen�tre Java"); //Donne un nom � la fen�tre
	    this.setSize(400, 500);  // Change la taille
	    this.setLocationRelativeTo(null);//Change la position dans l'�cran (x vers droite y vers bas)
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Quitte en fermant la fen�tre           
	    this.setContentPane(new Panneau()); //Construit le panneau (cf classe Panneau)
	    this.setVisible(true);	//Fais qu'elle soit visible
	 /*
	 JPanel pan = new JPanel(); //Cr�er un panel qui contient des composants (ex: boutons)
	 pan.setBackground(Color.BLUE); 
	 this.setContentPane(pan); 
	 this.setVisible(true);
	 */
	 
	 
	 
	 } 
	 
}

