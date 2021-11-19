package assignations;

import java.util.Scanner;

public class NewPackageCalcul {

	public static void main(String[] args) {
		int nb1,nb2;
		System.out.println("entrez deux valeurs entière");
		nb1=(new Scanner(System.in)).nextInt ();
		nb2=(new Scanner(System.in)).nextInt ();
		System.out.println( nb1 + " + " + nb2 + " = " + (nb1+nb2) );
		System.out.println( nb1 + " - " + nb2 + " = " + (nb1-nb2) );
		System.out.println( nb1 + " x " + nb2 + " = " + (nb1*nb2) );

	}

}
