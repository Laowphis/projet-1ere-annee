package echec;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.io.File;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.image.BufferedImage; 


public class Plateau00  extends JFrame {
 
	/*File noir_img = new File("image/noir.jpg");
	File blanc_img = new File("image/blanc.jpg");
	BufferedImage noir;
	BufferedImage blanc;
	noir = ImageIO.read(noir_img);
	blanc = ImageIO.read(blanc_img);*/
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
		
	public Plateau00()
	{
		
		this.setTitle("plateau");
		this.setSize(800,800);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(new PanneauPlateau());
		echequier = new JTable(plateau, title);
		scroll= new JScrollPane(echequier); 
		
		this.getContentPane().add(scroll);
		this.setVisible(true);
		
	}
	 
	public static void main(String[] args) 
	{
		
		Plateau00 main = new Plateau00();
		
	}

}
