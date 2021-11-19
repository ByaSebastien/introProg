package boucles;

import java.util.Scanner;

public class Sapin {

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
		while(cp2<nb-1){
			space=" "+space;
			cp2++;
		}
		System.out.println(space+"| |");
	}
}