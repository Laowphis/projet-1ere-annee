package echec;

import java.awt.Color;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.JButton;

public abstract class Piece  extends JButton{
	
	public Image img;
	public Boolean ColorsWhite;
	
	public abstract Icon getIcon();
	public abstract Color getBackground();
	public abstract void move();
	
	
}
