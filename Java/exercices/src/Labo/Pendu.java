package Labo;

import java.util.Random;
import java.util.Scanner;

public class Pendu {

	public static void iniPendu(char tab[][]){
		int i=0;
		int j=0;

		for(i=0;i<tab.length;i++){
			for(j=0;j<tab[0].length;j++){
				tab[i][j]=' ';
				System.out.print(tab[i][j]);
			}
		}
		j=1;
		for(i=0;i<tab.length;i++){
			tab[i][j]='|';	
		}
		i=0;
		for(j=1;j<20;j++){
			tab[i][j]='_';
		}
		tab[1][2]='/';
	}
	public static char[] iniMot(String mots[]){
		char arr[];
		Random r=new Random();
		int nb;

		nb=r.nextInt(mots.length);
		arr=mots[nb].toCharArray();

		return arr;
	}
	public static void iniMot2(char arr[],char mot[]){
		for(int i=0;i<arr.length;i++){
			mot[i]='_';
			System.out.print(" "+mot[i]);
		}
	}
	public static void affichependu(char tab[][],char mot[]){
		for(int i=0;i<tab.length;i++){
			System.out.println();
			for(int j=0;j<tab[0].length;j++){
				System.out.print(tab[i][j]);
			}
		}
		for (int i=0;i<mot.length;i++){
			System.out.print(" "+mot[i]);
		}
	}
	public static boolean essai(char arr[],char mot[],boolean lev){
		char lettre=' ';

		lev=false;
		System.out.println("\nentrez une lettre");
		lettre=(new Scanner(System.in)).nextLine().charAt(0);
		for (int i=0;i<arr.length;i++){
			if (lettre==arr[i]){
				mot[i]=arr[i];
				lev=true;
			}
		}
		return lev;
	}


	public static void main(String[] args) {
		char tab[][]=new char[6][22];
		char arr[];
		char mot[];
		String mots[]={"pomme","poire","orange","cerise","framboise"};
		boolean lev=false;
		boolean reussi=false;
		int cp=0;
		int cp2=0;
		int nb=1;



		while(nb==1){
			nb=2;
			cp=0;
			iniPendu(tab);//initialise la potence
			arr=iniMot(mots);//initialise le mot a découvrir
			mot=new char[arr.length];
			iniMot2(arr, mot);//initialise l affichage du mot
			affichependu(tab, mot);//affiche le jeu
			reussi=false;//pour savoir si il a reussi
			for(int i=0;cp<7 && !reussi;i++){
				lev=essai(arr, mot, lev);//le levier sert a savoir s il a trouver une lettre ou non
				if(!lev){
					cp++;
				}
				if(cp==1){
					tab[1][20]='|';
				}
				if(cp==2){
					tab[2][20]='O';
				}
				if(cp==3){
					tab[3][20]='|';
				}
				if(cp==4){
					tab[3][19]='/';
				}
				if(cp==5){
					tab[3][21]='\\';
				}
				if(cp==6){
					tab[4][19]='/';
				}
				if(cp==7){
					tab[4][21]='\\';
				}
				affichependu(tab, mot);
				for (int x=0;x<arr.length;x++){
					if(arr[x]==mot[x]){
						cp2++;
					}
				}
				if (cp2==arr.length){
					reussi=true;
				}
				cp2=0;
			}
			if(reussi){
				System.out.println("\nGG");
			}
			else{
				System.out.println("\nRaté");
			}
			System.out.println("appuiyer sur 1 pour continuer ou 0 pour arrêter");
			while(nb!=0&&nb!=1){
				nb=(new Scanner(System.in)).nextInt();
			}
		}
	}
}
