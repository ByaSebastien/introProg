package boucles;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {

		int nb1=0;
		int nb2=0;
		int div=0;
		int cp=0;

		System.out.println("entrez nombre");
		nb1=(new Scanner(System.in)).nextInt();
		System.out.println("entre nombre2");
		nb2=(new Scanner(System.in)).nextInt();
		div=nb2;

		if (nb2==0){
			System.out.println("impossible");
		}
		else{
			while (nb2<=nb1){

				nb2+=div;
				cp++;
			}
			System.out.println(cp);
		}


	}

}
