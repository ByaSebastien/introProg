package Alternatives;

import java.util.Scanner;

public class DecomposeArgent {

	public static void main(String[] args) {
		int montant;
		int nb;
		
		System.out.println("entrez montant");
		montant=(new Scanner(System.in)).nextInt();
		
		if (montant>=500){
			nb=(montant-(montant%500))/500;
			montant=montant%500;
			if (nb>1){
				System.out.println(nb+" billets de 500");
			}
			else{
				System.out.println(nb+" billet de 500");
			}
		
		}
		if (montant>=200){
			nb=(montant-(montant%200))/200;
			montant=montant%200;
			if (nb>1){
				System.out.println(nb+" billets de 200");
			}
			else{
				System.out.println(nb+" billet de 200");
			}
		
		}
		if (montant>=100){
			nb=(montant-(montant%100))/100;
			montant=montant%100;
			if (nb>1){
				System.out.println(nb+" billets de 100");
			}
			else{
				System.out.println(nb+" billet de 100");
			}
		
		}
		if (montant>=50){
			nb=(montant-(montant%50))/50;
			montant=montant%50;
			if (nb>1){
				System.out.println(nb+" billets de 50");
			}
			else{
				System.out.println(nb+" billet de 50");
			}
		
		}
		if (montant>=20){
			nb=(montant-(montant%20))/20;
			montant=montant%20;
			if (nb>1){
				System.out.println(nb+" billets de 20");
			}
			else{
				System.out.println(nb+" billet de 20");
			}
		
		}
		if (montant>=10){
			nb=(montant-(montant%10))/10;
			montant=montant%10;
			if (nb>1){
				System.out.println(nb+" billets de 10");
			}
			else{
				System.out.println(nb+" billet de 10");
			}
		
		}
		if (montant>=5){
			nb=(montant-(montant%5))/5;
			montant=montant%5;
			if (nb>1){
				System.out.println(nb+" billets de 5");
			}
			else{
				System.out.println(nb+" billet de 5");
			}
		
		}
		if (montant>=2){
			nb=(montant-(montant%2))/2;
			montant=montant%2;
			if (nb>1){
				System.out.println(nb+" pièces de 2");
			}
			else{
				System.out.println(nb+" pièce de 2");
			}
		
		}
		if (montant>=1){
			nb=(montant-(montant%1))/1;
			montant=montant%1;
			if (nb>1){
				System.out.println(nb+" pièces de 1");
			}
			else{
				System.out.println(nb+" pièce de 1");
			}
		
		}
		
		
	}

}
