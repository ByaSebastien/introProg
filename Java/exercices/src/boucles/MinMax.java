package boucles;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		
		
		int nb=0;
		int nbBas=0;
		int nbHaut=0;
		int nbTemp=0;
		int cpBas=0;
		int cpHaut=0;
		
		System.out.println("entrez un nombre \n0:pour terminer");
		nb=(new Scanner(System.in)).nextInt();
		nbHaut=nb;
		nbBas=nb;
		
		while (nb!=0){
			if (nb<=nbBas){
				if (nb==nbBas){
					cpBas++;
				}
				else{
					nbBas=nb;
					cpBas=1;
				}
			}
			if (nb>=nbHaut){
				if (nbHaut==nb){
					cpHaut++;
				}
				else{
					nbHaut=nb;
					cpHaut=1;
				}
			}
			System.out.println("entrez un autre nombre\n0:pour terminer");
			nb=(new Scanner(System.in)).nextInt();
		}	
		System.out.println("votre nombre le plus bas est "+nbBas+" et vous l'avez rentré "+cpBas+" fois");
		System.out.println("votre nombre le plus haut est "+nbHaut+" et vous l'avez rentré "+cpHaut+" fois");

	}

}
