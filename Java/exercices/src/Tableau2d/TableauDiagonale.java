package Tableau2d;

import java.util.Scanner;

public class TableauDiagonale {
	public static void FillTab(int tab[][],int nb){
		for (int i=0;i<tab.length;i++){
			for (int j=0;j<tab[0].length;j++){
				tab[i][j]=nb;
			}
		}
	}
	public static void ShowTab (int tab[][]){
		for (int i=0;i<tab.length;i++){
			System.out.println();
			for (int j=0;j<tab[0].length;j++){
				System.out.print(tab[i][j]+"\t");
			}
		}
	}
	

	public static void main(String[] args) {
		
		
		int nb=1;
		int tab[][];
		int j=0;
		
		System.out.println("entrez la taille du carr�");
		nb=(new Scanner(System.in)).nextInt();
		tab=new int [nb][nb];
		FillTab(tab,nb);
		ShowTab(tab);
		System.out.println();
		System.out.println();
		for (int i=0;i<tab.length;i++){
			tab[i][j]=0;
			tab[tab.length-1-i][j]=0;
			j++;
		}
		ShowTab(tab);

	}

}
