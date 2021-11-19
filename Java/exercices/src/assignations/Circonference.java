package assignations;

import java.util.Scanner;

public class Circonference {

	public static void main(String[] args) {
		double rayon=0;
	
		
		System.out.println("entrez le rayon");
		rayon=(new Scanner(System.in)).nextDouble();
		System.out.println("la circonférence d'un cercle de rayon "+rayon+" = "+((2*Math.PI)*rayon));
		System.out.println("l'aire d'un cercle de rayon "+rayon+" = "+(Math.PI*(Math.pow(rayon, 2))));

	}

}
