package Schtroumph;

public class SchtroumphPeureux extends Schtroumph {
	
	public SchtroumphPeureux(){
		
	}
	public SchtroumphPeureux(String nom){
		this.setNom(nom);
		//Schtroumph.setNb(Schtroumph.getNb()+1);
	}
	
	public void peur(){
		System.out.println("je suis peureux");
	}

}
