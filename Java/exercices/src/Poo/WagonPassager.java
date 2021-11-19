package Poo;

public class WagonPassager extends Wagon {
	private boolean doubleEtage=false;
	private int nbPlaces=98;

	public void setDoubleEtage(boolean doubleEtage) {
		this.doubleEtage = doubleEtage;
	}
	public void setNbPlaces(int nbPlaces) {
		if(nbPlaces<=0){
			this.nbPlaces=nbPlaces;
		}
		this.nbPlaces = nbPlaces;
	}
	public boolean isDoubleEtage() {
		return doubleEtage;
	}
	public int getNbPlaces() {
		return nbPlaces;
	}	
	public void affiche(){
		System.out.println("Wagon passager");
		if(isBiDirection()){
			System.out.println("bidirectionnel");
		}
		else{
			System.out.println("pas bidirectionnel");
		}
		System.out.println("de "+nbPlaces+" places assises");
		System.out.println(doubleEtage?"double étage" : "pas d'étage");
	}
}