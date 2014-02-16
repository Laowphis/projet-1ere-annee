package echec;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Fenetre extends JFrame
{
	private JButton bouton = new JButton("Menu");
	private JPanel pan = new JPanel();
	public Fenetre()
	{
		this.setTitle("echecs"); //defini titre de la fenetre
		this.setSize(400, 200);  //defini taille de la fenetre
		this.setLocationRelativeTo(null);  //position fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ferme fenetre lorsque clique sur croix rouge
		this.setVisible(true);  //rend visible la fenetre
		//ajout bouton
		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);
	}

public static void main(String[] args)
{
	Fenetre fen = new Fenetre();
	
}
}