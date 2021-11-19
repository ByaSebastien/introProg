package Poo;

public class VoitureDecapotable extends Voiture {
	private boolean CapoteOuverte=false;
	private String couleur="gris";

	public void setCouleur(String coul) {
		if (coul.equalsIgnoreCase("")){
			coul="rouge";
		}
		couleur = coul;
	}
	public String getCouleur() {
		return couleur;
	}

	public void setCapoteOuverte(boolean capoteOuverte) {
		CapoteOuverte = capoteOuverte;
	}
	public boolean isCapoteOuverte() {
		return CapoteOuverte;
	}
	public void ouvre(){
		setCapoteOuverte(true);
	}
	public void ferme(){
		setCapoteOuverte(false);
	}
	public void affiche(){
		System.out.println("ma jolie voiture décapotable");
		System.out.println("de "+getNbchevaux()+" chevaux");
		System.out.println("avec sa capote "+couleur);
	}
}
