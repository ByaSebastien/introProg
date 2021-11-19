package Alternatives;

import java.util.Scanner;

public class CompareDix {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("entrez deux nombres");
		
		a=(new Scanner(System.in)).nextInt ();
		b=(new Scanner(System.in)).nextInt ();
		
		if (a>=10 && b>=10){
			System.out.println("la somme des deux nombre: "+a+" + "+b+" = "+ (a+b));
		}
		if (a<10 && b<10){
			System.out.println("la produit: "+a+" * "+b+" = "+ (a*b));
		}
		else {
			if (b>a){
				c=a;
				a=b;
				b=c;
			}
			System.out.println("la différence entre "+a+" et "+b+" est de "+ (a-b));
		}
	}

}
