package Alternatives;

import java.util.Scanner;

public class PlusGrand {

	public static void main(String[] args) {
		double a=0,b=0;

		System.out.println("entrez deux nombres");

		a=(new Scanner(System.in)).nextDouble() ;
		b=(new Scanner(System.in)).nextDouble();

		if (a==b){
			System.out.println(a+" = "+b);
		}
		else { 
			if(a<b){
				System.out.println(a+" < "+b);
			}
			else { 
				System.out.println(a+" > "+b);
			}
		}
	}

}

