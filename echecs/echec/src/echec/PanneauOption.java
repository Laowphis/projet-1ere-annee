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

public class PanneauOption extends JPanel{

	public void paintComponent(Graphics g) {
	    try {
	    	BufferedImage img = ImageIO.read(new File("ChessSet.jpg"));
	    	g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      //texte
	    	Font font = new Font("Title", Font.BOLD, 20);
	    	g.setFont(font);
	    	g.setColor(Color.white);  
	    	g.drawString("Option", 330,20);
	      
	    	Font font0 = new Font("option", Font.ITALIC, 20);
	    	g.setFont(font0);
	    	g.setColor(Color.white);
	    	g.drawString("volume",200, 150);
	    	
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
