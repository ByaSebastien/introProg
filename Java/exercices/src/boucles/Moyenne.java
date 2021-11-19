package boucles;

import java.util.Scanner;

public class Moyenne {

	public static void main(String[] args) {


		int nb=0;
		int somme=0;
		int cp=0;


		System.out.println("entrez un nombre \n0:pour terminer");
		nb=(new Scanner(System.in)).nextInt();

		while (nb!=0){

			somme=somme+nb;	
			cp++;
			System.out.println("entrez un autre nombre\n0:pour terminer");
			nb=(new Scanner(System.in)).nextInt();
		}	
		if (cp==0){
			System.out.println("au revoir");
		}
		else{
			System.out.println("la moyenne est de "+(somme/(double)cp));
		}
	}

}




