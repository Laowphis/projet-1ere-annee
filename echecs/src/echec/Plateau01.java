package echec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Plateau01 extends JFrame{
	/*
	private String[] title= {"A", "B", "C", "D", "E", "F", "G", "H"};
	private String[] number= {"1", "2", "3", "4", "5", "6", "7", "8"};
	private JTable echequier;
	private JScrollPane scroll;
	*/
	public Plateau01(){
		this.setTitle("plateau");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanneauPlateau());
		
		/*
		echequier = new JTable(number, title);
		scroll= new JScrollPane(echequier); 
		*/
	    //On crée un BoxLayout pour ranger les boutons
		 JPanel b1 = new JPanel();
		 	
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		   	//b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		 
		 	b1.setLayout(new FlowLayout());
		 	/*
		 	b1.add(new CaseBlanche("T")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new JButton("Cav")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("Fou")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new JButton("Roi")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("Reine")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new JButton("Fou")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("Cav")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new JButton("T")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		 	 */
		 	b1.add(new CaseBlanche("1")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		 	b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));

		    
		    JPanel b2 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		    b2.setLayout(new FlowLayout());
		    b2.add(new CaseBlanche("2")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    
		    JPanel b3 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		    b3.setLayout(new FlowLayout());
		    b3.add(new CaseBlanche("3")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    
		    JPanel b4 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		    b4.setLayout(new FlowLayout());
		    /*
		    b4.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    */
		    b4.add(new CaseBlanche("4")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    
		    
		    JPanel b5 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b5.setLayout(new BoxLayout(b5, BoxLayout.LINE_AXIS));
		    b5.setLayout(new FlowLayout());
		    /*
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    */
		    b5.add(new CaseBlanche("5")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));

		    
		    JPanel b6 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b6.setLayout(new BoxLayout(b6, BoxLayout.LINE_AXIS));
		    b6.setLayout(new FlowLayout());
		    /*
		    b6.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    */
		    b6.add(new CaseBlanche("6")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    
		    
		    JPanel b7 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b7.setLayout(new BoxLayout(b7, BoxLayout.LINE_AXIS));
		    b7.setLayout(new FlowLayout());
		    /*
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new Bouton("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
			*/
		    b7.add(new CaseBlanche("7")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));

		    
		    JPanel b8 = new JPanel();
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b8.setLayout(new BoxLayout(b8, BoxLayout.LINE_AXIS));
		    b8.setLayout(new FlowLayout());
		    /*
		    b8.add(new JButton("T")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("Cav")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new JButton("F")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("Roi")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new JButton("Reine")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("F")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new JButton("Cav")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("T")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    */
		    b8.add(new CaseBlanche("8")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    b8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/10));
		    
		    JPanel b10 = new JPanel();
		    b10.setLayout(new FlowLayout());
		 	
		 	b10.add(new CaseBlanche("A")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("B")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("C")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("D")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("E")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("F")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("G")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		    b10.add(new CaseBlanche("H")).setPreferredSize(new Dimension(getWidth()/10, getHeight()/25));
		   
		    
		    /*
		    JPanel b11 = new JPanel();
		    b11.setLayout(new BoxLayout(b11, BoxLayout.PAGE_AXIS));
		    
		    b11.add(new CaseBlanche("1")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("2")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("3")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("4")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("5")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("6")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("7")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    b11.add(new CaseBlanche("8")).setPreferredSize(new Dimension(getWidth()/25, getHeight()/10));
		    */
		    JPanel b9 = new JPanel();
		        //On positionne maintenant ces trois lignes en colonne
		      b9.setLayout(new BoxLayout(b9, BoxLayout.PAGE_AXIS));
		      b9.add(b10);
		     // b9.add(b11);
		      b9.add(b1);
		      b9.add(b2);
		      b9.add(b3);
		      b9.add(b4);
		      b9.add(b5);
		      b9.add(b6);
		      b9.add(b7);
		      b9.add(b8);
		    this.getContentPane().add(b9);
		   // this.getContentPane().add(scroll);
		
		    b9.setOpaque(true);
		    this.setVisible(true);
		    
	  }
	
	public static void main(String[] args) 
	{
		
		Plateau01 main = new Plateau01();
		
	}
	
}

