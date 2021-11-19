package Schtroumph;

public class Schtroumpherie {

	public static void main(String[] args) {
		
		Schtroumph villageois=new Schtroumph("villageois");
		GrandSchtroumph chef=new GrandSchtroumph("Chef");
		Schtroumphette femme=new Schtroumphette("Schtroumphette");
		SchtroumphNoir noir=new SchtroumphNoir("Blacko");
		SchtroumphPeureux peureux=new SchtroumphPeureux("Peureux");
		
		System.out.println(villageois.getNom());
		villageois.dessine();
		villageois.parle();
		
		System.out.println();
		System.out.println(chef.getNom());
		chef.dessine();
		chef.parle();
		chef.chef();
		
		System.out.println();
		System.out.println(femme.getNom());
		femme.dessine();
		femme.parle();
		femme.shopping();
		
		System.out.println();
		System.out.println(noir.getNom());
		noir.dessine();
		noir.parle();
		noir.mord();
		
		System.out.println();
		System.out.println(peureux.getNom());
		peureux.dessine();
		peureux.parle();
		peureux.peur();
		
		System.out.println();
		System.out.println(Schtroumph.getNb()+" Schtroumph");

	}

}
