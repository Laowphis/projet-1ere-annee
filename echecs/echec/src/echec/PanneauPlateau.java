package echec;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class PanneauPlateau extends JPanel{

	public void paintComponent(Graphics g) {
	    try {
	    	BufferedImage img = ImageIO.read(new File("ChessSet.jpg"));
	    	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	    } catch (IOException e) {
	    	e.printStackTrace();
		}
	}   
}
