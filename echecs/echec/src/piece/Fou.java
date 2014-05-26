package piece;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;

public class Fou extends Piece{

	@Override
	public Icon getIcon() {
		// TODO Auto-generated method stub
		 if(ColorsWhite){
				try {
				      img = ImageIO.read(new File("FB.jpg"));
				    } catch (IOException e) {
				      e.printStackTrace();
				    }
				 }else{
				 try {
				      img = ImageIO.read(new File("FN.jpg"));
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
