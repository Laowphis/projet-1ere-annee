

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;	

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.io.File;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.image.BufferedImage; 

public class Interface_Graphique extends JFrame{

	private JButton playerVsIa = new JButton("1 Joueur");
	private JButton player2 = new JButton("2 Joueur");
	private JButton option = new JButton("Option");
	private JButton exit = new JButton("Exit");
	private JPanel pan = new JPanel();
	
	private Object[][] plateau= {
			{"noir", "blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc"},
			{"blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc", "noir"},
			{"noir", "blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc"},
			{"blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc", "noir"},
			{"noir", "blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc"},
			{"blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc", "noir"},
			{"noir", "blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc"},
			{"blanc", "noir", "blanc", "noir", "blanc", "noir", "blanc", "noir"},
		};	
	private String[] title= {"A", "B", "C", "D", "E", "F", "G", "H"};
	private JTable echequier;
	private JScrollPane scroll;
	
	public Fenetre()
	{
		this.setTitle("echecs"); //defini titre de la fenetre
		this.setSize(800, 800);  //defini taille de la fenetre
		this.setLocationRelativeTo(null);  //position fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ferme fenetre lorsque clique sur croix rouge
		this.setVisible(true);  //rend visible la fenetre
		
	}
	
	public  menu(){
		
	}
		

	
	
	public static void main(String[] args) {
		

	}

}
