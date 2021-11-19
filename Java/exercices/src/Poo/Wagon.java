package Poo;

public class Wagon {
	private int nbEssieux;
	private boolean biDirection=false;

	public void setNbEssieux(int nbEssieux) {
		if (nbEssieux<=0){
			nbEssieux=6;
		}
		this.nbEssieux = nbEssieux;
	}
	public void setBiDirection(boolean biDirection) {
		this.biDirection = biDirection;
	}
	public int getNbEssieux() {
		return nbEssieux;
	}

	public boolean isBiDirection() {
		return biDirection;
	}
	public void affiche(){
		System.out.println("wagon");
	}
}
