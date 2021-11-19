package boucles;

import java.util.Scanner;

public class Chiffre {

	public static void main(String[] args) {
		
		int nb=4;
		
		while (nb!=0 && nb!=1 && nb!=2&& nb!=3){
			System.out.println("entrez 1,2,3 ou 0");
			nb=(new Scanner(System.in)).nextInt();
			
		}
		System.out.println("au revoir");

	}

}
