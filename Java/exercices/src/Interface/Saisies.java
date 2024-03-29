package Interface;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.util.Random;

import javax.swing.*;

public class Saisies extends JFrame {

	private static JPanel panelFond,panelNord,panelSud;
	private static JLabel lNb1,lNb2,lPlus,lEgal;
	private static JTextField tfReponse;
	private static JButton bCorrection,bInit,bQuit;

	public static void main(String[] args) {
	
		Saisies fen=new Saisies();
		fen.setSize(500,300);
		fen.setLocation(200,300);
		fen.setTitle("Des additions ! :-)");
		panelFond=new JPanel();
		panelNord=new JPanel();
		panelSud=new JPanel();
		lNb1=new JLabel("0");
		lNb2=new JLabel("0");
		lPlus=new JLabel("+");
		lEgal=new JLabel("=");
		tfReponse=new JTextField();
		bCorrection=new JButton("Correction");
		bInit=new JButton("Recommencer");
		bQuit=new JButton("Quitter");

		panelNord.add(lNb1);
		panelNord.add(lPlus);
		panelNord.add(lNb2);
		panelNord.add(lEgal);
		panelNord.add(tfReponse);

		panelSud.add(bCorrection);
		panelSud.add(bInit);
		panelSud.add(bQuit);

		panelFond.setLayout(new java.awt.BorderLayout());
		panelNord.setLayout(new java.awt.GridLayout(1,5));
		panelSud.setLayout(new java.awt.GridLayout(1,3));

		panelFond.add(panelNord,BorderLayout.NORTH);
		panelFond.add(panelSud,BorderLayout.SOUTH);

		fen.add(panelFond);
		
		init();
		
		fen.setVisible(true);
		
		bCorrection.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clicCorrection(evt);
			}            
		});

		bInit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clicInit(evt);
			}           
		});

		bQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clicQuit(evt);
			}       
		});
	}


	private static void clicQuit(ActionEvent evt) {
		System.exit(0);
	}

	private static void clicInit(ActionEvent evt) {
		init();
	}
	private static void init(){
		int nb1,nb2;
		Random r=new Random();
		
		nb1=r.nextInt(50);
		nb2=r.nextInt(50);
		lNb1.setText(""+nb1);
		lNb2.setText(""+nb2);
		tfReponse.setText("");
	}

	private static void clicCorrection(ActionEvent evt) {
		int nb1,nb2,reponse,correct;
		
		nb1=Integer.parseInt(lNb1.getText());
		nb2=Integer.parseInt(lNb2.getText());
		reponse=Integer.parseInt(tfReponse.getText());
		correct=nb1+nb2;
		if(correct==reponse){
			JOptionPane.showMessageDialog(null, "Bravo c'est la bonne reponse","Correction",JOptionPane.INFORMATION_MESSAGE);
		}
		else{
			JOptionPane.showMessageDialog(null, "Rat� la bonne r�ponse �tait: "+correct,"Correction",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}