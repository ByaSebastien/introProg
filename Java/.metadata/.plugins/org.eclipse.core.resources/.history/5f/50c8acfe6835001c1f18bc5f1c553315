package Interface;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LesVisiteurs extends JFrame {
	
	private static JPanel lePanelFond;
	private static JButton bOK;
	private boolean allumer=true;

	public static void main(String[] args) {
		
		LesVisiteurs maFen=new LesVisiteurs();
		maFen.setSize(500, 300);
		maFen.setLocation(400, 400);
		maFen.setTitle("Les visiteurs - le retour !!!!");
//		maFen.setBackground(Color.PINK);
		maFen.add(lePanelFond);
		maFen.setVisible(true);
	
	}
	public LesVisiteurs(){
		
		lePanelFond=new JPanel();
		bOK=new JButton("éteindre");
		bOK.setBackground(Color.BLACK);
		bOK.setForeground(Color.WHITE);
		bOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	cliqueBouton(evt);
            }      
        });
//		lePanelFond.setBackground(Color.PINK);
		lePanelFond.setBackground(new Color(59,38,150));
		lePanelFond.add(bOK);
	}
	private void cliqueBouton(ActionEvent evt) {
		
		if(allumer){
			bOK.setText("Nuit");
			lePanelFond.setBackground(Color.BLACK);
		}
		else{
			bOK.setText("Jour");
			lePanelFond.setBackground(Color.YELLOW);
		}
		allumer=!allumer;
		
	}
}