package echec;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Credits extends JFrame {

	private JPanel pan = new JPanel();
	private JButton menu = new JButton("Menu");
	public Credits(){
		
		this.setTitle("echecs"); //defini titre de la fenetre
		this.setSize(800, 800);  //defini taille de la fenetre
		this.setLocationRelativeTo(null);  //position fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ferme fenetre lorsque clique sur croix rouge
		
		
		menu.addActionListener(new BoutonMenu());
	
		
		JPanel men = new JPanel();
		men.setOpaque(false);
		men.add(menu);
		pan.add(men, BorderLayout.SOUTH);
		
		this.setContentPane(pan);
		
		this.setContentPane(new PanneauCredits());
		
		
		/*
		pan.add(menu, BorderLayout.SOUTH);
		this.setContentPane(pan);
		this.setOpaque(false);
		*/
		
		
		
		this.setVisible(true);
	}
	
	class BoutonMenu implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			pan.setVisible(false);
			
		}
	}
	
	public static void main(String[] args){
		Credits credits = new Credits();
	}
}
