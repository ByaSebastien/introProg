package Schtroumph;

public class Schtroumphette extends Schtroumph {
	
	public Schtroumphette(){
		
	}
	public Schtroumphette(String nom){
		this.setNom(nom);
		//Schtroumph.setNb(Schtroumph.getNb()+1);
	}
	
	public void dessine(){
		System.out.println("J'ai de long cheveux blond en plus d être bleu");
	}
	public void shopping(){
		System.out.println("J'aime faire du shopping");
	}
	
}
