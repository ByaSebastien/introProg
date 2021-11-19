package boucles;

import java.util.Scanner;

public class Losange {

	public static void main(String[] args) {
		
		
		int cp=0;
		int cp2=1;
		int nb=0;
		int nb2=0;
		String etoile="*";
		String space="";

		System.out.println("entrez un nb");
		nb=(new Scanner(System.in)).nextInt();
		nb2=nb;
		
		while (cp<nb) {
			while (cp2<nb2) {
				space=" "+space;
				cp2++;
			}
			System.out.println(space+etoile);
			etoile=etoile+"*"+"*";
			cp++;
			cp2=1;
			space="";
			nb2=nb-cp;
		}
		cp=1;
		nb2=nb-1;
		cp2=1;
		etoile="*";
		while (cp<nb) {
			while (cp2<nb2) {
				etoile=etoile+"*"+"*";
				cp2++;
			}
			space=space+" ";
			System.out.println(space+etoile);
			cp++;
			cp2=1;
			nb2=nb-cp;
			etoile="*";
		}
	}
}