package echec;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import javax.swing.table.DefaultTableModel;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.imageio.ImageIO.*;

import java.awt.Image;
import java.awt.image.BufferedImage; 

import javax.imageio.IIOException;

public class Plateautest  extends JFrame {
 
	File noir_img = new File("noir.jpg");
	File blanc_img = new File("blanc.jpg");
	BufferedImage noir;
	BufferedImage blanc;
	private Object[][] plateau= {
		{noir, blanc, noir, blanc, noir, blanc, noir, blanc},
		{blanc, noir, blanc, noir, blanc, noir, blanc, noir},
		{noir, blanc, noir, blanc, noir, blanc, noir, blanc},
		{blanc, noir, blanc, noir, blanc, noir, blanc, noir},
		{noir, blanc, noir, blanc, noir, blanc, noir, blanc},
		{blanc, noir, blanc, noir, blanc, noir, blanc, noir},
		{noir, blanc, noir, blanc, noir, blanc, noir, blanc},
		{blanc, noir, blanc, noir, blanc, noir, blanc, noir},
	};	
	private String[] title= {"A", "B", "C", "D", "E", "F", "G", "H"};
	private JTable echequier;
	private JScrollPane scroll;
		
	public Plateautest() throws IOException
	{
		this.noir = ImageIO.read(noir_img);
		this.blanc = ImageIO.read(blanc_img);
		this.setTitle("plateau");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanneauPlateau());
		
		
		DefaultTableModel echec = new DefaultTableModel(plateau, title);
		JTable echequier = new JTable(echec);
		//echequier.setOpaque(false);
		
		
		JScrollPane scroll= new JScrollPane(echequier);
		//scroll.setOpaque(false);
		
		
		//JTable.setDefaultRenderer();
		
		
		this.getContentPane().add(scroll);
		
		
		
		this.setVisible(true);
		
	}
	 
	public static void main(String[] args) 
	{
		try {
			Plateautest main = new Plateautest();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}