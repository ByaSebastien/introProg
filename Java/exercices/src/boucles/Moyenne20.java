package boucles;

import java.util.Scanner;

public class Moyenne20 {

	public static void main(String[] args) {
		
		int nb=0;
		int cp=0;
		int cp2=0;
		int somme=0;
		
		while (cp<20){
			System.out.println("entrez un nombre");
			nb=(new Scanner(System.in)).nextInt();
			if (nb>=10 && nb<=20){
				somme=somme+nb;
				cp2++;
			}
			cp++;
		}
		if(cp2==0){
			System.out.println("vous n'avez rentré aucun nombre valide");
		}
		else{
			System.out.println(somme/(double)cp2);
		}
		

	}

}
