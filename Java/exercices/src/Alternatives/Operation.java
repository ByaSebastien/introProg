package Alternatives;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		
		
		int choix;
		double nb1;
		double nb2;
		
		System.out.println("1:addition \n2:soustraction \n3:multiplication \n4:division");
		choix=(new Scanner(System.in)).nextInt();
		
		if (!(choix!=1 || choix!=2 || choix !=3 || choix!=4)){
			System.out.println("erreur");
		}
		else {
			System.out.println("entrez deux nombres");
			nb1=(new Scanner(System.in)).nextDouble();
			nb2=(new Scanner(System.in)).nextDouble();
			switch (choix)
			{
			case 1:
				System.out.println(nb1+" + "+nb2+" = "+(nb1+nb2));
			break;
			case 2:
				System.out.println(nb1+" - "+nb2+" = "+(nb1-nb2));
			break;
			case 3:
				System.out.println(nb1+" x "+nb2+" = "+(nb1*nb2));
			break;
			case 4:
				if (nb2==0){
					System.out.println("impossible de diviser par 0");
				}
				else {
					System.out.println(nb1+" / "+nb2+" = "+(nb1/nb2));
				}
			break;
			}
		}
	}

}
