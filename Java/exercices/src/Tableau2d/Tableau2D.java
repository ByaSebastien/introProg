package Tableau2d;

import java.util.Random;

public class Tableau2D {
	public static void FillTab(int tab[][]){
		Random r= new Random() ; 
		int nb=0;

		for (int i=0;i<tab.length;i++){
			for (int j=0;j<tab[0].length;j++){
				nb=r.nextInt(11)+10;
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

		int [][]tab=new int[4][5];
		
		FillTab(tab);
		ShowTab(tab);
	}
}
