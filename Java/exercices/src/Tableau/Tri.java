package Tableau;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {


		int tab[]=new int[10];
		int temp=0;
		boolean lev=false;

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
		while (!lev){
			lev=true;
			for (int x=0;x<tab.length-1&&lev;x++){
				if (tab[x]>tab[x+1]){
					temp=tab[x];
					tab[x]=tab[x+1];
					tab[x+1]=temp;
					lev=false;
				}
			}
		}
		System.out.println("");
		for (int x=0;x<tab.length;x++){
			System.out.print(tab[x]+" , ");
		}

	}
}

