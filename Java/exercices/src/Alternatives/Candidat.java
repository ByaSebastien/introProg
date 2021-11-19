package Alternatives;

import java.util.Scanner;

public class Candidat {

	public static void main(String[] args) {

		String nom="aaa";
		int age=0;

		System.out.println("entrez votre prenom");
		nom=(new Scanner(System.in)).nextLine();
		System.out.println("entrez votre âge");
		age=(new Scanner(System.in)).nextInt();

		if (nom.equalsIgnoreCase("isabelle")){
			System.out.println("pas sélectionnée");
		}
		else {
			if (age<20 || age>50){
				System.out.println("Vous n'êtes pas concerné");
			}
			else{
				if ((age>=20 && age<=30)&&(age!=25)&&(age!=26)){
					System.out.println("formation A");
				}
				else{
					if ((age>=31)&&(age<=50)&& !((age>=40)&&(age<=47))){
						System.out.println("formation B");
					}
					else{
						System.out.println("formation C");
					}
				}
					
			}
		}
	}
}
