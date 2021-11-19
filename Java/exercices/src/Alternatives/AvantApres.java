package Alternatives;

import java.util.Scanner;

public class AvantApres {

	public static void main(String[] args) {
		
		int jourav;
		int jour;
		int moisav;
		int mois;
		int annee;
		
		System.out.println("entrez jour");
		jour=(new Scanner(System.in)).nextInt();
		System.out.println("entrez mois");
		mois=(new Scanner(System.in)).nextInt();
		System.out.println("entrez année");
		annee=(new Scanner(System.in)).nextInt();
		
		if ((jour>31)||(jour>30 && (mois==4 || mois==6 || mois==9 || mois==11)) || (jour>29 && mois==2)|| (!(annee%4==0 && !(annee%100==0)^(annee%400==0))&&jour>28 && mois==2)||(jour<0 || mois<0)||mois>12){
			System.out.println("date invalide)");
		}
		else {
			
		}
		
	}

}
