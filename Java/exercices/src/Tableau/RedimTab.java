package Tableau;

import java.util.Scanner;

public class RedimTab {

	public static void main(String[] args) {

		int a=1;
		int tab[]=new int[10];
		boolean lev=true;
		int i=0;
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
		for (int y=tab.length-1;y>=0;y--){
			for (int x=y;x>=0;x--){
				if (tab[x]==0){
					i=x;
					lev=true;
				}
			}
			if (lev&&(tab[y]!=tab[i])){
				temp=tab[y];
				tab[y]=tab[i];
				tab[i]=temp;
			}
			lev=false;
		}
		for (int x=0;x<tab.length;x++){
			if (tab[x]!=0){
				a++;
			}
		}
		System.out.println("");
		int tab1[]=new int[a];
		
		for (int x=0;x<tab1.length-1;x++){
			tab1[x]=tab[x];
			System.out.print(tab1[x]+" , ");


		}

	}
}



