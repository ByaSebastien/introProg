package Tableau;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {


		int tab[]=new int[10];
		int temp=0;

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
		for (int x=0;x<tab.length/2;x++){
			temp = tab[x];
			tab[x]=tab[tab.length-1-x];
			tab[tab.length-1-x]=temp;
		}
		for (int x=0;x<tab.length;x++){
			System.out.print(tab[x]+" , ");

		}

	}
}
