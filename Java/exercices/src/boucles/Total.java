package boucles;

import java.util.Scanner;

public class Total {

	public static void main(String[] args) {
		
		
		int nb = 1;
		int somme=0;
		int cp=0;
		
		while (nb!=0){
			System.out.println("entrez un nombre");
			nb=(new Scanner(System.in)).nextInt();
			somme=somme+nb;
		}
		System.out.println("la somme est de "+somme);
		

	}

}
