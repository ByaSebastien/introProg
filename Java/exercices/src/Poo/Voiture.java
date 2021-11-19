package Poo;

public class Voiture {
	private int nbChevaux=90;
	private static int nb=0;
	
	public Voiture(){
		nb++;
	}
	public Voiture (int nbC){
		nbChevaux=nbC;
		nb++;
	}
	public static void setNb(int nb) {
		Voiture.nb = nb;
	}
	public static int getNb() {
		return nb;
	}
	public void setNbChevaux(int nb){
		if(nb<50){
			nb=50;
		}
		nbChevaux=nb;
	}
	public int getNbchevaux(){
		return nbChevaux;
	}
	public void affiche(){
		System.out.println("ma jolie voiture :-)");
		System.out.println("avec "+nbChevaux+" chevaux");
	}
	public void affiche(int nb){ // surcharge : overloading (deux fonction du même nom avec paramètre différents)
		for(int i=0;i<=nb;i++){
			System.out.println("je tourne "+i+" fois");
			System.out.println("jusque "+(i*1.5)+" km/h");
			System.out.println("-----------------------------------");
		}
	}
	public void demarre(){
		System.out.println("je peux rouler très vite");
		System.out.println("jusque "+(nbChevaux*1.5)+" km/h");
	}
}
