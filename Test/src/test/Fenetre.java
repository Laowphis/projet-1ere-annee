package test;
import javax.swing.JFrame;
import java.awt.Color; 
import javax.swing.JPanel;
	 
public class Fenetre extends JFrame {
	 public Fenetre(){	//Créer une fenêtre
	    this.setTitle("Ma première fenêtre Java"); //Donne un nom à la fenêtre
	    this.setSize(400, 500);  // Change la taille
	    this.setLocationRelativeTo(null);//Change la position dans l'écran (x vers droite y vers bas)
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Quitte en fermant la fenêtre           
	    this.setContentPane(new Panneau()); //Construit le panneau (cf classe Panneau)
	    this.setVisible(true);	//Fais qu'elle soit visible
	 /*
	 JPanel pan = new JPanel(); //Créer un panel qui contient des composants (ex: boutons)
	 pan.setBackground(Color.BLUE); 
	 this.setContentPane(pan); 
	 this.setVisible(true);
	 */
	 
	 
	 
	 } 
	 
}

