package d�couverte;

import java.util.Scanner;

public class SiAlorsSinon {

	public static void main(String[] args) {
		int nb;
		String prenom;
		
		System.out.println("entrez votre pr�nom");
		prenom=(new Scanner(System.in)).nextLine ();
		System.out.println("entrez le nombre d'enfant");
		nb=(new Scanner(System.in)).nextInt ();
		
		if (nb<0){
			System.out.println("bizarre");
		}
		else{
			if (prenom.equalsIgnoreCase("isabelle")){
				System.out.println("fuyons!!!");
			}
			if (nb>3 && nb<10){
				System.out.println("il faut un minibuss");
			}
			else {
				if (nb>=10){
					System.out.println("vous �tes fou");
				}
			}
			if ( prenom.equalsIgnoreCase ("isabelle") || prenom.equalsIgnoreCase("val�rie")){
				System.out.println("ne vous retournez pas");
			}
		}

	}

}
