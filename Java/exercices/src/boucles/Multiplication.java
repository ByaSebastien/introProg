package boucles;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		
		int nb=0;
		int cp=1;
		
		System.out.println("saisir un nombre");
		nb=(new Scanner(System.in)).nextInt();
		
		while (cp<=10){
			System.out.println(cp+" x "+nb+" = "+(cp*nb));
			cp++;
			
		}

	}

}
