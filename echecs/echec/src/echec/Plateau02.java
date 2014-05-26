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
		 JPanel A1 = new JPanel();
		 JPanel B1 = new JPanel();
		 JPanel C1 = new JPanel();
		 JPanel D1 = new JPanel();
		 JPanel E1 = new JPanel();
		 JPanel F1 = new JPanel();
		 JPanel G1 = new JPanel();
		 JPanel H1 = new JPanel();
		
		 	b1.setLayout(new FlowLayout());
		 	
		 	A1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G1.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H1.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    	    
		    b1.add(A1);
		    b1.add(B1);
		    b1.add(C1);
		    b1.add(D1);
		    b1.add(E1);
		    b1.add(F1);
		    b1.add(G1);
		    b1.add(H1);
		    
		    
		    JPanel b2 = new JPanel();
		    
			 JPanel A2 = new JPanel();
			 JPanel B2 = new JPanel();
			 JPanel C2 = new JPanel();
			 JPanel D2 = new JPanel();
			 JPanel E2 = new JPanel();
			 JPanel F2 = new JPanel();
			 JPanel G2 = new JPanel();
			 JPanel H2 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b2.setLayout(new BoxLayout(b2, BoxLayout.LINE_AXIS));
		    b2.setLayout(new FlowLayout());
		    
		    A2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G2.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H2.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b2.add(A2);
		    b2.add(B2);
		    b2.add(C2);
		    b2.add(D2);
		    b2.add(E2);
		    b2.add(F2);
		    b2.add(G2);
		    b2.add(H2);
		    
		    
		    
		    JPanel b3 = new JPanel();
		    
		     JPanel A3 = new JPanel();
			 JPanel B3 = new JPanel();
			 JPanel C3 = new JPanel();
			 JPanel D3 = new JPanel();
			 JPanel E3 = new JPanel();
			 JPanel F3 = new JPanel();
			 JPanel G3 = new JPanel();
			 JPanel H3 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b3.setLayout(new BoxLayout(b3, BoxLayout.LINE_AXIS));
		    b3.setLayout(new FlowLayout());
		    
		    A3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G3.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H3.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b3.add(A3);
		    b3.add(B3);
		    b3.add(C3);
		    b3.add(D3);
		    b3.add(E3);
		    b3.add(F3);
		    b3.add(G3);
		    b3.add(H3);
		    
		    
		    
		    JPanel b4 = new JPanel();
		    
		    JPanel A4 = new JPanel();
			 JPanel B4 = new JPanel();
			 JPanel C4 = new JPanel();
			 JPanel D4 = new JPanel();
			 JPanel E4 = new JPanel();
			 JPanel F4 = new JPanel();
			 JPanel G4 = new JPanel();
			 JPanel H4 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b4.setLayout(new BoxLayout(b4, BoxLayout.LINE_AXIS));
		    b4.setLayout(new FlowLayout());
		   
		    A4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G4.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H4.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b4.add(A4);
		    b4.add(B4);
		    b4.add(C4);
		    b4.add(D4);
		    b4.add(E4);
		    b4.add(F4);
		    b4.add(G4);
		    b4.add(H4);
		    
		    
		    
		    JPanel b5 = new JPanel();
		    
		    JPanel A5 = new JPanel();
			 JPanel B5 = new JPanel();
			 JPanel C5 = new JPanel();
			 JPanel D5 = new JPanel();
			 JPanel E5 = new JPanel();
			 JPanel F5 = new JPanel();
			 JPanel G5 = new JPanel();
			 JPanel H5 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b5.setLayout(new BoxLayout(b5, BoxLayout.LINE_AXIS));
		    b5.setLayout(new FlowLayout());
		   
		    A5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G5.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H5.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));

		    b5.add(A5);
		    b5.add(B5);
		    b5.add(C5);
		    b5.add(D5);
		    b5.add(E5);
		    b5.add(F5);
		    b5.add(G5);
		    b5.add(H5);
		    
		    
		    
		    JPanel b6 = new JPanel();
		    
		     JPanel A6 = new JPanel();
			 JPanel B6 = new JPanel();
			 JPanel C6 = new JPanel();
			 JPanel D6 = new JPanel();
			 JPanel E6 = new JPanel();
			 JPanel F6 = new JPanel();
			 JPanel G6 = new JPanel();
			 JPanel H6 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b6.setLayout(new BoxLayout(b6, BoxLayout.LINE_AXIS));
		    b6.setLayout(new FlowLayout());
		    
		    A6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G6.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H6.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b6.add(A6);
		    b6.add(B6);
		    b6.add(C6);
		    b6.add(D6);
		    b6.add(E6);
		    b6.add(F6);
		    b6.add(G6);
		    b6.add(H6);
		    
		    
		    
		    JPanel b7 = new JPanel();
		    
		     JPanel A7 = new JPanel();
			 JPanel B7 = new JPanel();
			 JPanel C7 = new JPanel();
			 JPanel D7 = new JPanel();
			 JPanel E7 = new JPanel();
			 JPanel F7 = new JPanel();
			 JPanel G7 = new JPanel();
			 JPanel H7 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b7.setLayout(new BoxLayout(b7, BoxLayout.LINE_AXIS));
		    b7.setLayout(new FlowLayout());
		    
		    A7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G7.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H7.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b7.add(A7);
		    b7.add(B7);
		    b7.add(C7);
		    b7.add(D7);
		    b7.add(E7);
		    b7.add(F7);
		    b7.add(G7);
		    b7.add(H7);
		    
		    
		    
		    JPanel b8 = new JPanel();
		    
		     JPanel A8 = new JPanel();
			 JPanel B8 = new JPanel();
			 JPanel C8 = new JPanel();
			 JPanel D8 = new JPanel();
			 JPanel E8 = new JPanel();
			 JPanel F8 = new JPanel();
			 JPanel G8 = new JPanel();
			 JPanel H8 = new JPanel();
		    
		    //On définit le layout en lui indiquant qu'il travaillera en ligne
		    //b8.setLayout(new BoxLayout(b8, BoxLayout.LINE_AXIS));
		    b8.setLayout(new FlowLayout());
		   
		    A8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    B8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    C8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    D8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    E8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    F8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    G8.add(new CaseNoire("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    H8.add(new CaseBlanche("")).setPreferredSize(new Dimension(getWidth()/15, getHeight()/15));
		    
		    b8.add(A8);
		    b8.add(B8);
		    b8.add(C8);
		    b8.add(D8);
		    b8.add(E8);
		    b8.add(F8);
		    b8.add(G8);
		    b8.add(H8);
		    
		    
		    
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
