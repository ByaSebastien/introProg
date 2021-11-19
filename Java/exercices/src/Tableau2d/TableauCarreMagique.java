package Tableau2d;

import java.util.Random;

public class TableauCarreMagique {
	public static void FillTab(int tab[][]){
		Random r= new Random() ; 
		int nb=0;
		for (int i=0;i<tab.length-1;i++){
			for (int j=0;j<tab[0].length-1;j++){
				nb=r.nextInt(100);
				tab[i][j]=5;
			}
		}
	}
	public static void ShowTab (int tab[][]){
		for (int i=0;i<tab.length-1;i++){
			System.out.println();
			for (int j=0;j<tab[0].length-1;j++){
				System.out.print(tab[i][j]+"\t");
			}
		}
	}

	public static void main(String[] args) {


		int tab[][]=new int[4][4];
		int sommeRef=0,somme=0,somme2=0,j=0;
		boolean lev=true;

		FillTab(tab);
		ShowTab(tab);

		System.out.println();
		ShowTab(tab);
		for (int i=0;i<tab.length-1&&lev;i++){
			for (j=0;j<tab[0].length-1&&lev;j++){
				if(i==0){
					sommeRef=sommeRef+tab[i][j];
				}
				tab[i][2]=tab[i][2]+tab[i][j];
				tab[2][j]=tab[2][j]+tab[i][j];
			}
			if (tab[i][2]!=sommeRef){
				lev=false;
			}
		}
		if (tab[2][0]!=sommeRef||tab[2][1]!=sommeRef||tab[2][2]!=sommeRef){
			lev=false;
		}
		j=0;
		for (int i=0;i<tab.length&&lev;i++){
			somme=somme+tab[i][j];
			somme2=somme2+tab[tab.length-i-1][j];
			j++;
		}
		if (sommeRef!=somme||sommeRef!=somme2){
			lev=false;
		}
		if (lev){
			System.out.println("c'est un carr� magique");
		}
		else{
			System.out.println("ce n'est pas un carr� magique");
		}
	}
}