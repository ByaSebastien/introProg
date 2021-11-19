package boucles;

import java.util.Scanner;

public class Interval {

	public static void main(String[] args) {
		
		
		int nb1=0;
		int nb2=0;
		int nb3=0;
		int somme=0;
		
		while (nb1<=0){
			System.out.println("entrez un nombre supérieur à 0");
			nb1=(new Scanner(System.in)).nextInt();
		}
		while (nb2<=0){
			System.out.println("entrez un nombre supérieur à 0");
			nb2=(new Scanner(System.in)).nextInt();
		}
		if (nb1>nb2){
			nb3=nb1;
			nb1=nb2;
			nb2=nb3;
		}
		while (nb1<=nb2){
			somme=somme+nb1;
			nb1++;
		}
		System.out.println(somme);
		

	}

}
