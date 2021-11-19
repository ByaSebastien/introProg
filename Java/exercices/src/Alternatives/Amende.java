package Alternatives;

import java.util.Scanner;

public class Amende {

	public static void main(String[] args) {
		
		
		int limit;
		int vitesse;
		int diff;
		
		System.out.println("quelle est la limitation?");
		limit=(new Scanner(System.in)).nextInt();
		System.out.println("quelle est votre vitesse?");
		vitesse=(new Scanner(System.in)).nextInt();
		
		if (vitesse>limit){
			diff=vitesse-limit;
			if(diff>0 && diff<=20){
				System.out.println("Amende de 50€");
			}
			if (diff>20 && diff <=30){
				System.out.println("Amende de 100€");
			}
			if (diff>30 && diff<=50){
				System.out.println("Amende de 200€");
			}
			if (diff >50){
				System.out.println("retrait de permis");
			}
		}

	}

}
