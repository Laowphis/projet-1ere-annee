package echec;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panneau00 extends JPanel {

	public void paintComponent(Graphics g) {
	    try {
	    	
	    	BufferedImage img = ImageIO.read(new File("ChessSet.jpg"));
	      //Pour une image de fond
	    	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      //texte
	      
	      Font font = new Font("Title", Font.BOLD, 20);
	      g.setFont(font);
	      g.setColor(Color.white);  
	      g.drawString("Jeux d'Echecs", 330,350);
	    } catch (IOException e) {
	    	e.printStackTrace();
		}                
	}           
	
}
