package boucles;

import java.util.Scanner;

public class PpcmEtPgcd {

	public static void main(String[] args) {



		int nb1=0;
		int nb2=0;
		int nb3=0;
		int div=1;
		int choix=0;
		boolean lev=false;




		System.out.println("entrez deux nombres");
		nb1=(new Scanner(System.in)).nextInt();
		nb2=(new Scanner(System.in)).nextInt();
		if (nb2<nb1) {
			nb3=nb1;
			nb1=nb2;
			nb2=nb3;
		}
		while (choix!=1 && choix!=2) {
			System.out.println("1:PGCD\n2:PPCM");
			choix=(new Scanner(System.in)).nextInt();
			switch (choix) {
			case 1: 
				for (div=nb1;div>1 && !(lev);div--){
					if (nb1%div==0 && nb2%div==0) {
						lev=true;
						System.out.println(div);
					}
				}
				if (div==1) {
					System.out.println("pas de pgcd autre que 1");
				}
				break;
			case 2:
				for (div=nb2;(div%nb1!=0);div=div+nb2){
				}
				System.out.println(div);
				break;
			}
		}
	}
}