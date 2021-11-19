package Tableau;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {

		int[][] tab = new int[9][5];
		int nb=1;
		int next=0;
		int cp=0;
		Random r= new Random() ; 
		boolean lev=false;

		for(int x=0;x<9;x++) {
			System.out.println("");
			for  (int y=0;y<5;y++) {
				tab[x][y]=nb;
				System.out.print(nb+" , ");
				nb++;
			}
		}
		System.out.println("");
		for (nb=0;cp<5;cp++) {
			nb=0;
			lev=false;
			while (nb==0){
				nb=r.nextInt(46);
			}
			for(int x=0;x<9;x++) {
				for  (int y=0;y<5;y++) {
					if (nb==tab[x][y]) {
						System.out.println(nb);
						tab[x][y]=0;
						lev=true;
						System.out.println("0 pour continuer");
						next=(new Scanner(System.in)).nextInt();
					}
				}
			}
			if (!lev) {
				cp--;
			}
		}
		for(int x=0;x<9;x++) {
			System.out.println("");
			for  (int y=0;y<5;y++) {
				if (tab[x][y]==0) {
					System.out.print(" x , ");
				}
				else {
					System.out.print(tab[x][y]+" , ");
				}
			}
		}
	}
}