package Interface;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Moyenne extends JFrame {
	
	private static JLabel lNb1,lNb2,lNb3;
	private static JTextField tfNb1,tfNb2,tfNb3;
	private static JButton bMoyenne,bQuit;
	private static JPanel panelFond,panelNord,panelSud;

	public static void main(String[] args) {
		
		Moyenne fen=new Moyenne();
		fen.setSize(250,130);
		fen.setLocation(400,400);
		fen.setTitle("Moyenne");
		
		lNb1=new JLabel("Nombre 1");
		lNb1.setForeground(Color.WHITE);
		lNb2=new JLabel("Nombre 2");
		lNb2.setForeground(Color.RED);
		lNb3=new JLabel("Nombre 3");
		lNb3.setForeground(Color.YELLOW);
		
		tfNb1=new JTextField();
		tfNb2=new JTextField();
		tfNb3=new JTextField();
		
		bMoyenne=new JButton("Moyenne");
		bQuit=new JButton("Quitter");
		
		panelFond=new JPanel();
		panelNord=new JPanel();
		panelSud=new JPanel();
		
		panelNord.add(lNb1);
		panelNord.add(tfNb1);
		panelNord.add(lNb2);
		panelNord.add(tfNb2);
		panelNord.add(lNb3);
		panelNord.add(tfNb3);
		panelNord.setBackground(new Color(15,35,125));
		
		panelSud.add(bMoyenne);
		panelSud.add(bQuit);
		panelSud.setBackground(new Color(15,35,125));
		
		panelFond.setLayout(new java.awt.BorderLayout());
		panelNord.setLayout(new java.awt.GridLayout(3,2));
		panelSud.setLayout(new java.awt.GridLayout(1,2));
		
		panelFond.add(panelNord,BorderLayout.NORTH);
		panelFond.add(panelSud,BorderLayout.SOUTH);
		panelFond.setBackground(new Color(15,35,125));
		
		fen.add(panelFond);
//		fen.pack();
		
		fen.setVisible(true);
		
		bQuit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clicQuit(evt);
			}       
		});
		
		bMoyenne.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				clicMoyenne(evt);
			}       
		});
		

	}

	protected static void clicMoyenne(ActionEvent evt) {
		int moyenne;
			
		moyenne=(Integer.parseInt(tfNb1.getText())+Integer.parseInt(tfNb2.getText())+Integer.parseInt(tfNb3.getText()))/3;
		JOptionPane.showMessageDialog(null, "La moyenne est de: "+moyenne,"Moyenne",JOptionPane.INFORMATION_MESSAGE);
	}

	protected static void clicQuit(ActionEvent evt) {
		System.exit(0);
	}
}
