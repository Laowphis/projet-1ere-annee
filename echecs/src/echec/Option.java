package echec;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;


public class Option extends JFrame{

	private JButton menu = new JButton("Menu");
	private JPanel pan = new JPanel();
	
	public Option(){
		
		this.setTitle("echecs"); 
		this.setSize(800, 800);  
		this.setLocationRelativeTo(null);  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		
		
		menu.addActionListener(new BoutonMenu());
		
		this.setContentPane(new PanneauOption());
		this.setVisible(true);
	}
	
	class BoutonMenu implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			pan.setVisible(false);
			
		}
	}
	
	public static void main(String[] args) {
		Option option = new Option();

	}

}
