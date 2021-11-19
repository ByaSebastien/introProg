package découverte;

import java.util.Scanner;

public class SiAlorsSinon {

	public static void main(String[] args) {
		int nb;
		String prenom;
		
		System.out.println("entrez votre prénom");
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
					System.out.println("vous êtes fou");
				}
			}
			if ( prenom.equalsIgnoreCase ("isabelle") || prenom.equalsIgnoreCase("valérie")){
				System.out.println("ne vous retournez pas");
			}
		}

	}

}
