package Poo;

public class Rue {

	public static void main(String[] args) {
		
		Voiture toto,choupette;
		VoitureDecapotable frim;
		System.out.println(Voiture.getNb());
		toto=new Voiture();
		System.out.println(Voiture.getNb());
		choupette=new Voiture (120);
		System.out.println(Voiture.getNb());
		toto.affiche();
		choupette.affiche();
		frim=new VoitureDecapotable();
		frim.affiche();
		System.out.println(Voiture.getNb());

	}

}
