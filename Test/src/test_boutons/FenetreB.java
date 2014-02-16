package test_boutons;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.BorderLayout; // Pour les bordures Nord, Sud, Est, Ouest et Nord
import java.awt.GridLayout;  //Pour le tableau de boutons
import javax.swing.BoxLayout; //Pour ranger les boutons
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreB extends JFrame {
	protected JPanel pan = new JPanel();
	//Par défaut, JPanel fait la mise en page et place le bouton au milieu de l'image
	//Possibilité 1 : instanciation avec le libellé
	//private JButton bouton = new JButton("Push me");


	 public FenetreB(){
	 this.setTitle("Echec");
	 this.setSize(500, 500);
	 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 this.setLocationRelativeTo(null);
	 /*
	 //Ajout du bouton à notre content pane
	 pan.add(bouton);
	 this.setContentPane(pan);
	 this.setVisible(true);
	 */
	 /*
	//On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(new GridLayout(3, 2));
	 
	 	this.setLayout(new GridLayout(8,8));
	 	
	    //On ajoute le bouton au content pane de la JFrame
	    this.getContentPane().add(new JButton("Tour"));
	    this.getContentPane().add(new JButton("Cavalier"));
	    this.getContentPane().add(new JButton("Fou"));
	    this.getContentPane().add(new JButton("R"));
	    this.getContentPane().add(new JButton("D"));
	    this.getContentPane().add(new JButton("Fou"));
	    this.getContentPane().add(new JButton("Cavalier"));
	    this.getContentPane().add(new JButton("Tour"));
	 */
	 
	 //On crée un BoxLayout pour ranger les boutons
	 JPanel b1 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    b1.add(new JButton("Tour"));
	    b1.add(new JButton("Cavalier"));
	    b1.add(new JButton("Fou"));
	    b1.add(new JButton("Roi"));
	    b1.add(new JButton("Reine"));
	    b1.add(new JButton("Fou"));
	    b1.add(new JButton("Cavalier"));
	    b1.add(new JButton("Tour"));

	    
	    JPanel b2 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    JPanel b3 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    JPanel b4 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    JPanel b5 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    JPanel b6 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
	    
	    JPanel b7 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));

	    JPanel b8 = new JPanel();
	    //On définit le layout en lui indiquant qu'il travaillera en ligne
	    b8.setLayout(new BoxLayout(b8, BoxLayout.LINE_AXIS));
	    b8.add(new JButton("Tour"));
	    b8.add(new JButton("Cavalier"));
	    b8.add(new JButton("Fou"));
	    b8.add(new JButton("Roi"));
	    b8.add(new JButton("Reine"));
	    b8.add(new JButton("Fou"));
	    b8.add(new JButton("Cavalier"));
	    b8.add(new JButton("Tour"));
	    
	    
	    JPanel b9 = new JPanel();
	        //On positionne maintenant ces trois lignes en colonne
	      b9.setLayout(new BoxLayout(b9, BoxLayout.PAGE_AXIS));
	      b9.add(b1);
	      b9.add(b2);
	      b9.add(b3);
	      b9.add(b4);
	      b9.add(b5);
	      b9.add(b6);
	      b9.add(b7);
	      b9.add(b8);
	      
	      
	      
	 
	 
	 
	    this.getContentPane().add(b9);
	    this.setVisible(true);
	 }       
	 
	 
	 
	 
	 
	 
	 
	 
}
	
	
	

