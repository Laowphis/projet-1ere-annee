package echec;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BoxLayout;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {

	
	private JButton playerVsIa = new JButton("1 Joueur");
	private JButton player2 = new JButton("2 Joueur");
	private JButton option = new JButton("Option");
	private JButton credits = new JButton("Crédits");
	private JButton exit = new JButton("Exit");
	private JPanel pan = new JPanel();
	
	public Menu()
	{
		
		this.setTitle("echecs"); //defini titre de la fenetre
		this.setSize(800, 800);  //defini taille de la fenetre
		this.setLocationRelativeTo(null);  //position fenetre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // ferme fenetre lorsque clique sur croix rouge
		this.setContentPane(new Panneau00());
		
		
		
		
		/*
		 * merde
		playerVsIa.setBounds(0,500, 100,100);
		pan.add(playerVsIa); 
		pan.setSize(800, 800);
		//playerVsIa.setPreferredSize(new Dimension(100, 40));
		//pan.add(player2);
		//pan.add(option);
		//pan.add(exit);
		add(pan);
		*/
		
		/*
		 * fonctionne PAS
		pan.setLayout(null);
		pan.add(playerVsIa);
		add(pan);
		pan.setLocation(0,200);
		*/
		
		
		JPanel l1 = new JPanel();
		l1.setLayout(new BoxLayout(l1, BoxLayout.LINE_AXIS));
		l1.setOpaque(false);
		l1.add(playerVsIa);
		playerVsIa.addActionListener(new BoutonJeux());
		
		JPanel l2 = new JPanel();
		l2.setLayout(new BoxLayout(l2, BoxLayout.LINE_AXIS));
		l2.setOpaque(false);
		l2.add(player2);
		player2.addActionListener(new BoutonJeux());
		
		JPanel l3 = new JPanel();
		l3.setLayout(new BoxLayout(l3, BoxLayout.LINE_AXIS));
		l3.setOpaque(false);
		l3.add(option);
		option.addActionListener(new BoutonOption());
		
		JPanel l4 = new JPanel();
		l4.setLayout(new BoxLayout(l4, BoxLayout.LINE_AXIS));
		l4.setOpaque(false);
		l4.add(exit);
		exit.addActionListener(new BoutonExit());
		
		JPanel l6 = new JPanel();
		l6.setLayout(new BoxLayout(l6, BoxLayout.LINE_AXIS));
		l6.setOpaque(false);
		l6.add(credits);
		credits.addActionListener(new BoutonCredits());
		
		JPanel l5 = new JPanel();
		l5.setLayout(new BoxLayout(l5, BoxLayout.PAGE_AXIS));
		l5.setOpaque(false);
		l5.add(l1);
		l5.add(l2);
		l5.add(l3);
		l5.add(l6);
		l5.add(l4);
		
		
		this.getContentPane().add(l5);
		
		
		
		
		/*
		this.setLayout(new GridLayout(8, 8));
		
		this.getContentPane().add(playerVsIa);
		this.getContentPane().add(player2);
		this.getContentPane().add(option);
		this.getContentPane().add(exit);
		*/
		
		
		/*
		this.getContentPane().add(playerVsIa, BorderLayout.NORTH);
		this.getContentPane().add(player2, BorderLayout.CENTER);
		this.getContentPane().add(option,BorderLayout.CENTER);
		this.getContentPane().add(exit, BorderLayout.SOUTH);
		*/
		
		/*
		pan.add(playerVsIa, BorderLayout.NORTH); 
		pan.add(player2);
		pan.add(option);
		pan.add(exit, BorderLayout.SOUTH);
		this.setContentPane(pan);
		*/
		
		this.setVisible(true);
	}
	
	class BoutonCredits implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			pan.setVisible(false);
			Credits credits = new Credits();
			repaint();
		}
	}
	class BoutonExit implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			System.exit(0);
		}
	}
	class BoutonJeux implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			pan.setOpaque(true);
			Plateau01 jeux = new Plateau01();
			repaint();
		}
	}
	class BoutonOption implements ActionListener{
		public void actionPerformed(ActionEvent arg0){
			Option option = new Option();
		}
	}
	
	public static void main(String[] args) 
	{
		Menu menu = new Menu();
	}

}
