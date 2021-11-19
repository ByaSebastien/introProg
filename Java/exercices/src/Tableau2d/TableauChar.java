package Tableau2d;

import java.util.Scanner;

public class TableauChar {
	public static void FillTab(char tab[][]){
		char a='a';
		for (int i=0;i<tab.length;i++){
			for (int j=0;j<tab[0].length;j++){
				tab[i][j]=a;
				a++;
			}
		}
	}
	public static void ShowTab (char tab[][]){
		for (int i=0;i<tab.length;i++){
			System.out.println();
			for (int j=0;j<tab[0].length;j++){
				System.out.print(tab[i][j]+"\t");
			}
		}
	}

	public static void main(String[] args) {


		char tab[][]= new char[5][4];
		char car='b';

		FillTab(tab);
		ShowTab(tab);
		System.out.println("\nentrez une lettre");
		car=(new Scanner(System.in)).nextLine().charAt(0);


		for (int i=0;i<tab.length;i++){
			for (int j=0;j<tab[0].length;j++){
				tab[0][j]=car;
				tab[i][1]=car;
				tab[i][3]=car;
			}
		}
		ShowTab(tab);
	}
}
