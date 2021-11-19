package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CompteurClic extends JFrame {
	
	private static JPanel lePanel;
	private static JButton bOk,bInit,bQuit;
	private static JLabel leLabel;
	private static int cpt=0;

	public static void main(String[] args) {
		
		CompteurClic fen=new CompteurClic();
		fen.setSize(600,200);
		fen.setLocation(400,400);
		
		bOk=new JButton("Clique ici");
		bInit=new JButton("Réinitialiser");
		bQuit=new JButton("Quitter");
		leLabel= new JLabel("\t"+cpt);
		leLabel.setForeground(Color.WHITE);
		lePanel= new JPanel();
		lePanel.setBackground(new Color(16,24,125));
		lePanel.add(leLabel);
		lePanel.add(bOk);
		lePanel.add(bInit);
		lePanel.add(bQuit);
		
		bOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clicOk(evt);
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
		
		fen.add(lePanel);
//		fen.pack();
		fen.setVisible(true);
		
	}

	protected static void clicQuit(ActionEvent evt) {		
		System.exit(0); // ferme application		
	}

	protected static void clicInit(ActionEvent evt) {
		cpt=0;
		leLabel.setText("\t"+cpt);
	}

	protected static void clicOk(ActionEvent evt) {
		cpt++;
		leLabel.setText("\t"+cpt);
	}
}