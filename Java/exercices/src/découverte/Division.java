package découverte;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		int nb1,nb2,nb3;
		
		System.out.println("entrez un nombre entier");
		nb1=(new Scanner(System.in)).nextInt ();
		System.out.println("entrez un autre nombre entier");
		nb2=(new Scanner(System.in)).nextInt ();
		if (nb2==0) {
			System.out.println("erreur, impossible de diviser par 0");
		}
		else{
			System.out.println("a ton avis" + nb1 + ":" + nb2 +"= ??? ");
			nb3=(new Scanner(System.in)).nextInt ();
			if (nb3==(nb1/nb2)) {
				System.out.println("bravo");
			}
			else{
				System.out.println("raté, la bonne réponse etait" + (nb1/nb2));
			}
				
			
		}
		

	}

}
