package piece;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;

public class Roi extends Piece{

	@Override
	public Icon getIcon() {
		// TODO Auto-generated method stub
		 if(ColorsWhite){
				try {
				      img = ImageIO.read(new File("RB.jpg"));
				    } catch (IOException e) {
				      e.printStackTrace();
				    }
				 }else{
				 try {
				      img = ImageIO.read(new File("RN.jpg"));
				    } catch (IOException e) {
				      e.printStackTrace();
				    }
				 }
				return null;
	}

	@Override
	public Color getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	
	
}
