package Poo;

public class Garage {

	public static void main(String[] args) {
		Voiture toto=new Voiture();
		VoitureDecapotable we=new VoitureDecapotable();
		//toto.nbChevaux=-125; // plus d'accès car private
		toto.setNbChevaux(-125);
		toto.affiche();
		toto.demarre();
		toto.affiche(5);
		we.setNbChevaux(200);
		we.affiche();
		we.demarre();
	}
}