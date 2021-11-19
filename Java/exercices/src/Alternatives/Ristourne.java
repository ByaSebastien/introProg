package Alternatives;

import java.util.Scanner;

public class Ristourne {

	public static void main(String[] args) {
		
		double montant;
		int enfant;
		int ristourne=90;
		
		
		System.out.println("quel est le montant de vos achats?");
		montant=(new Scanner(System.in)).nextDouble();
		System.out.println("combien d'enfants avez vous?");
		enfant=(new Scanner(System.in)).nextInt();
		
		if (montant>100){
			System.out.println("vous avez une ristourne de 10%");
		}
		else{
			if (montant>50 && enfant>=3){
				System.out.println("vous avez une ristourne de 10%");
			}
			else {
				System.out.println("vous avez une ristourne de 5%");
				ristourne=95;
			}
		}
		System.out.println("vous devez payer "+((montant/100)*ristourne));		

	}
}
