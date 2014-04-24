package echec;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauCredits extends JPanel {

	//private JPanel pan = new JPanel();
	//private JButton menu = new JButton("Menu");
	//private JLabel label = new JLabel();
	public void paintComponent(Graphics g) {
	    try {
	    	BufferedImage img = ImageIO.read(new File("ChessSet.jpg"));
	      //Pour une image de fond
	    	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      //texte
	    	Font font = new Font("Title", Font.BOLD, 20);
	    	g.setFont(font);
	    	g.setColor(Color.white);  
	    	g.drawString("Jeux d'Echecs", 330,20);
	      
	    	Font font0 = new Font("Menbre", Font.ITALIC, 20);
	    	g.setFont(font0);
	    	g.setColor(Color.white);
	    	g.drawString("chef de projet: Mickael Soler",200, 150);
	    	g.drawString("membre du groupe: Jonathan Fernandes", 200, 200);
	    	g.drawString("membre du groupe: Estelle Moncolin", 200, 250);
	    	g.drawString("membre du groupe: Nabil Lahlali ", 200, 300);
	    	g.drawString("membre du groupe: EL Mahdi Baini", 200, 350);
	    	//label.setHorizontalAlignment(JLabel.CENTER);
	    
	    	/*
	    	JPanel men = new JPanel();
			men.setOpaque(false);
			men.add(menu);
			pan.add(men, BorderLayout.SOUTH);
			this.setContentPane(pan);
	    	*/
	    	
	    } catch (IOException e) {
	    	e.printStackTrace();
		}                
	}           
	
}
