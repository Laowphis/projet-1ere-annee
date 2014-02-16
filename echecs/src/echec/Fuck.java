package echec;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;

import javax.swing.*;

public class Fuck extends JFrame 
{
	private Image image ;
	private String nom = "image/chess.gif/";
	public static void main(String[] args) {
		/*ImageIcon icone = new ImageIcon("images/pic0.gif");
		JLabel image = new JLabel(icone);*/
		image = Toolkit.getDefaultToolkit().getImage(nom);
		MediaTracker track = new MediaTracker(this);
		track.addImage(image, 0);
	}

}
