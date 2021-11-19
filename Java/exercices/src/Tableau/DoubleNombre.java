package Tableau;

import java.util.Scanner;

public class DoubleNombre {

	public static void main(String[] args) {


		int tab[]=new int[10];

		for (int x=0;x<tab.length;x++){
			tab[x]=0;
		}

		for (int x=0;x<tab.length;x++){
			System.out.println("entrez un nombre");
			tab[x]=(new Scanner(System.in)).nextInt();	
		}
		for (int x=0;x<tab.length;x++){
			System.out.print(tab[x]+" , ");
		}
		System.out.println("");
		for (int x=0;x<tab.length;x++){
			tab[x]=2*tab[x];
		}
		for (int x=0;x<tab.length;x++){
			System.out.print(tab[x]+" , ");
		}





	}

}
