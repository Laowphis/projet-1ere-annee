package echec;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.BorderLayout;

public class Menu extends JFrame {

	
	private JButton playerVsIa = new JButton("1 Joueur");
	private JButton player2 = new JButton("2 Joueur");
	private JButton option = new JButton("Option");
	private JButton exit = new JButton("Exit");
	private JPanel pan = new JPanel();
	
	public Menu()
	{
		this.setTitle("echecs"); //defini titre de la fenetre
		this.setSize(800, 800);  //defini taille de la fenetre
		this.setLocationRelativeTo(null);  //position fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ferme fenetre lorsque clique sur croix rouge
		this.setVisible(true);  //rend visible la fenetre
		
		this.getContentPane().add(playerVsIa, BorderLayout.NORTH);
		this.getContentPane().add(player2, BorderLayout.CENTER);
		this.getContentPane().add(option,BorderLayout.CENTER);
		this.getContentPane().add(exit, BorderLayout.SOUTH);
		
		
		/*
		pan.add(playerVsIa, BorderLayout.NORTH); 
		pan.add(player2);
		pan.add(option);
		pan.add(exit, BorderLayout.SOUTH);
	*/
		//this.setContentPane(pan);
		this.setVisible(true);
	}
	public static void main(String[] args) 
	{
		Menu menu = new Menu();
	}

}
