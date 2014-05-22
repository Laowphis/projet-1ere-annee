package echec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class Plateau02 extends JFrame{
	
	public Plateau02(){
		this.setTitle("plateau");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanneauPlateau());

	    
	    //On crée un BoxLayout pour ranger les boutons
		 JPanel b1 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		   	//b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		 
		 	b1.setLayout(new FlowLayout());
		 	
		 	b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));

		    
		    JPanel b2 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		    b2.setLayout(new FlowLayout());
		    
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    JPanel b3 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		    b3.setLayout(new FlowLayout());
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    JPanel b4 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		    b4.setLayout(new FlowLayout());
		   
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    
		    JPanel b5 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b5.setLayout(new BoxLayout(b5, BoxLayout.LINE_AXIS));
		    b5.setLayout(new FlowLayout());
		   
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));

		    
		    JPanel b6 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b6.setLayout(new BoxLayout(b6, BoxLayout.LINE_AXIS));
		    b6.setLayout(new FlowLayout());
		    
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    
		    JPanel b7 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b7.setLayout(new BoxLayout(b7, BoxLayout.LINE_AXIS));
		    b7.setLayout(new FlowLayout());
		    
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));

		    
		    JPanel b8 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b8.setLayout(new BoxLayout(b8, BoxLayout.LINE_AXIS));
		    b8.setLayout(new FlowLayout());
		   
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    
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
	
	public static void main(String[] args) 
	{
		
		Plateau02 main = new Plateau02();
		
	}
}
