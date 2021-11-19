package boucles;

import java.util.Scanner;

public class Choix {

	public static void main(String[] args) {


		int choix1=0;
		int choix2=0;
		int choix3=1;
		String st="";
		String st2="";

		while (choix3==1){
			while (choix1!=1 && choix1!=2 && choix1!=3){
				System.out.println("1:Mademoiselle \n2:Madame \n3:Monsieur");
				choix1=(new Scanner(System.in)).nextInt();
			}
			while (choix2!=1 && choix2!=2 && choix2!=3){
				System.out.println("1:Matin \n2:Après-midi \n3:Soirée");
				choix2=(new Scanner(System.in)).nextInt();
			}
			switch (choix1)
			{
			case 1: 
				st="mademoiselle";
				break;
			case 2:
				st="Madame";
				break;
			case 3:
				st="Monsieur";
				break;
			}
			switch (choix2)
			{
			case 1:
				st2="Bonjour";
				break;
			case 2:
				st2="Bon après-midi";
				break;
			case 3:
				st2="Bonsoir";
				break;			
			}
			choix1=0;
			choix2=0;
			System.out.println(st2+" "+st);
			System.out.println("\n\n\nVoulez vous recommencer?\n1:oui\n2:non");
			choix3=(new Scanner(System.in)).nextInt();
			while (choix3!=1 && choix3!=2){
				System.out.println("1:oui \n2:non");
				choix3=(new Scanner(System.in)).nextInt();
			}
			
		}
	}
}
