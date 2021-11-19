package Schtroumph;

public class SchtroumphNoir extends Schtroumph {
	
	public SchtroumphNoir(){
		
	}
	public SchtroumphNoir(String nom){
		this.setNom(nom);
		//Schtroumph.setNb(Schtroumph.getNb()+1);
	}
	
	public void parle(){
		System.out.println("Je Gnyak le Gnyak");
	}
	public void dessine(){
		System.out.println("Je suis tout noir et les gens ne m'aime pas");
	}
	public void mord(){
		System.out.println("Je mord les autre Schtroumph pour les rendre malade");
	}
	

}
