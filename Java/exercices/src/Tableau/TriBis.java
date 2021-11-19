package Tableau;

import java.util.Scanner;

public class TriBis {

	public static void main(String[] args) {



		int tab[]=new int[10];
		int temp=0;
		boolean lev=true;
		int i=0;

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
		for (int y=0;y<tab.length;y++){
			temp=tab[y];
			for (int x=y;x<tab.length;x++){
				if (tab[x]<temp){
					i=x;
					lev=true;
				}
			}
			if (lev){
				temp=tab[y];
				tab[y]=tab[i];
				tab[i]=temp;
			}
			lev=false;
		}
		System.out.println("");
		for (int x=0;x<tab.length;x++){
			System.out.print(tab[x]+" , ");
		}
	}


}