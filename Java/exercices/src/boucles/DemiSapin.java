package boucles;

import java.util.Scanner;

public class DemiSapin {

	public static void main(String[] args) {


		int cp=0;
		int nb=0;
		String etoile="*";

		System.out.println("entrez un nb");
		nb=(new Scanner(System.in)).nextInt();

		while (cp<nb) {
			System.out.println(etoile);
			etoile=("*"+etoile);
			cp++;
		}
	}
}
