package piece;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;

public class Cavalier extends Piece{

	public Cavalier(){
		
	}

	//ColorsWhite = True for Plateau02.b1 && Plateau02.b2;
	
	@Override
	public Icon getIcon() {
		// TODO Auto-generated method stub
		 if(ColorsWhite){
		try {
		      img = ImageIO.read(new File("CB.jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		 }else{
		 try {
		      img = ImageIO.read(new File("CN.jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		 }
		return null;
	}

	@Override
	public Color getBackground() {
		
		
	//	setBackground(img);
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
}
