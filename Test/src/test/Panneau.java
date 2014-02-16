package test;


import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.GradientPaint;
import java.awt.Graphics2D;

	 
public class Panneau extends JPanel { 
	 public void paintComponent(Graphics g){
		 /*
	   //Vous verrez cette phrase chaque fois que la m�thode sera invoqu�e
	   System.out.println("Je suis ex�cut�e !"); 
	   int x1 = this.getWidth()/4;
	   int y1 = this.getHeight()/4;                      
	  
	   //g.fillOval(x1, y1, this.getWidth()/2, this.getHeight()/2); //Cr�er un rond (ou un ovale) plein
	   g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2); //Cr�er un rond vide.
	   //On peut faire aussi des fillRect ou drawRect pour des rectangles
	   
	   //g.fillOval(20, 20, 75, 75)=Rond espac� de 10pixels de la gauche, du haut, de hauteur 75, largeur 75
	   
	   //Dessine deux lignes
	   g.drawLine(0, 0, this.getWidth(), this.getHeight());
	   g.drawLine(0, this.getHeight(), this.getWidth(), 0);
	  
	   //D�finit deux ensembles de donn�es
	   int x[] = {20, 30, 50, 60, 60, 50, 30, 20};
	    int y[] = {30, 20, 20, 30, 50, 60, 60, 50};
	   
	    //Dessine le polyg�ne en prenant les coordonn�es x et y, il a 8 c�t�s.
	    g.drawPolygon(x, y, 8);
	   
	    //Ecris en partant de la position donn�es:
	    Font font = new Font("Courier", Font.BOLD, 20);	//Change le style et la taille
	    g.setFont(font);
	    g.setColor(Color.blue); //Change la couleur d'�criture
	    g.drawString("Tiens ! Des cr�pes!", 10, 20);
	    
	    //Charger une image
	    try {
	    	//Il faut indiquer le chemin d'acc�s � l'image entre parenth�ses:
	        Image img = ImageIO.read(new File("C:\\Users\\MR\\workspace\\Java\\Test\\DSC06492.jpg"));
	        g.drawImage(img, 0, 0,this.getWidth(),this.getHeight(), this);
	        //Pour une image de fond
	        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
	      } catch (IOException e) {
	        e.printStackTrace();
	      }       
	   
	   */
		 //Param�tres:d�but color1x,Dcolor1y,color1,color2x,color2y,color2,se r�p�te (true:false)
		 
		 GradientPaint gp, gp2, gp3, gp4, gp5, gp6; 
		    gp = new GradientPaint(0, 0, Color.RED, 20, 0, Color.magenta, true);
		    gp2 = new GradientPaint(20, 0, Color.magenta, 40, 0, Color.blue, true);
		    gp3 = new GradientPaint(40, 0, Color.blue, 60, 0, Color.green, true);
		    gp4 = new GradientPaint(60, 0, Color.green, 80, 0, Color.yellow, true);
		    gp5 = new GradientPaint(80, 0, Color.yellow, 100, 0, Color.orange, true);
		    gp6 = new GradientPaint(100, 0, Color.orange, 120, 0, Color.red, true);
		    
		    Graphics2D g2d = (Graphics2D)g;
		    g2d.setPaint(gp);
		    g2d.fillRect(0, 0, this.getWidth()/6, this.getHeight());               
		    g2d.setPaint(gp2);
		    g2d.fillRect(this.getWidth()/6, 0, this.getWidth()/6, this.getHeight());
		    g2d.setPaint(gp3);
		    g2d.fillRect(this.getWidth()*2/6, 0, this.getWidth()/6, this.getHeight());
		    g2d.setPaint(gp4);
		    g2d.fillRect(this.getWidth()*3/6, 0, this.getWidth()/6, this.getHeight());
		    g2d.setPaint(gp5);
		    g2d.fillRect(this.getWidth()*4/6, 0, this.getWidth()/6, this.getHeight());
		    g2d.setPaint(gp6);
		    g2d.fillRect(this.getWidth()*5/6, 0, this.getWidth()/6, this.getHeight());    
		 
		 
	    
	    
	    
	    
	    
	   
	 }               
}

