package découverte;

import java.util.Scanner;

public class Saisie {

	public static void main(String[] args) {
		int nb1,nb2,nb3;
		System.out.println("bonjour,entrez une valeur entière svp");
		
		//saisir nb1
		nb1=(new Scanner(System.in)).nextInt (); //saisir un entier
		
		System.out.println("bonjour,entrez une autre valeur entière svp");
		
		//saisir nb2
		nb2=(new Scanner(System.in)).nextInt (); 
		
		//saisir nb3
		System.out.println(nb1 + "+" + nb2 + "= ???");
		nb3=(new Scanner(System.in)).nextInt ();
		
		//si nb3=nb1+nb2
		//    alors afficher "bravo"
		//    sinon afficher "raté"
		if (nb3==nb1+nb2){
			//alors
			System.out.println("bravo");
		}
		//else=sinon
		else{
			//sinon
			System.out.println("raté");
		}
		

	}

}
