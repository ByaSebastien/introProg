package découverte;

import java.util.Scanner;

public class ComparaisonDeDeuxNombres {

	public static void main(String[] args) {
		
		int nb1,nb2;
		
		System.out.println("entrez deux nombre entier");
		nb1=(new Scanner(System.in)).nextInt ();
		nb2=(new Scanner(System.in)).nextInt ();
		
		if (nb1==nb2){
			System.out.println(nb1 + " = " + nb2);
		}
		else {
			if (nb1<nb2){
				System.out.println(nb1 + " < " + nb2);
			}
			else {
				System.out.println(nb1 + ">" + nb2 );
			}
		}
			
		
        
	}

}
