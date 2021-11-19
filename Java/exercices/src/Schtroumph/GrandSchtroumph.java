package Schtroumph;

public class GrandSchtroumph extends Schtroumph {
	
	public GrandSchtroumph(){
	}
	public GrandSchtroumph(String nom){
		this.setNom(nom);
		//Schtroumph.setNb(Schtroumph.getNb()+1);
	}
	public void dessine(){
		System.out.println("Je suis bleu et habillé en rouge");
	}
	public void chef(){
		System.out.println("je suis le chef");
	}

}
