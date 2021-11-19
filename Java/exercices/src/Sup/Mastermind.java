package Sup;

import java.util.Random;
import java.util.Scanner;

public class Mastermind {
	public static void ShowTab (char tab[]){
		for (int i=0;i<tab.length;i++){
			System.out.print(tab[i]+" , ");
		}
	}

	public static void Saisie(char tab2[]){
		for(int i=0;i<tab2.length;i++){
			tab2[i]='0';
		}
		System.out.println("entrez une s�rie de quatres couleur\nR:Rouge,J:Jaune,B:Bleu,O:Orange,V:Vert,C:Blanc,T:Violet,S:Rose");
		for (int i=0;i<tab2.length;i++){
			while (tab2[i]!='R'&&tab2[i]!='J'&&tab2[i]!='B'&&tab2[i]!='O'&&tab2[i]!='V'&&tab2[i]!='C'&&tab2[i]!='T'&&tab2[i]!='S'){
				tab2[i]=(new Scanner(System.in)).nextLine().charAt(0);
				if (tab2[i]!='R'&&tab2[i]!='J'&&tab2[i]!='B'&&tab2[i]!='O'&&tab2[i]!='V'&&tab2[i]!='C'&&tab2[i]!='T'&&tab2[i]!='S'){
					System.out.println("couleur incorrect");
				}
			}
		}
	}

	public static boolean Verrification(char tab1[],char tab2[]){
		boolean lev=false;
		int cpBon=0;
		int cpBad=0;
		char tab3[]=new char[tab1.length];
		char tab4[]=new char[tab1.length];

		for (int i=0;i<tab3.length;i++){
			tab3[i]=tab1[i];
			tab4[i]=tab2[i];
		}
		for (int i=0;i<tab1.length;i++){
			if (tab4[i]==tab3[i]){
				cpBon++;
				tab3[i]='x';
				tab4[i]='x';
			}
		}
		for (int i=0;i<tab1.length;i++){
			for(int j=0;j<tab1.length;j++){
				if (tab4[i]==tab3[j]&&(tab4[i]!='x')){
					cpBad++;
					tab3[j]='x';
					tab4[i]='x';				
				}
			}
		}
		if (cpBon==4){
			System.out.println("Bravo tu as gagn�!");
			lev=true;
		}
		else{
			System.out.println(cpBon+" bien plac�\n"+cpBad+" correct mais mal plac�");
		}
		return lev;
	}

	public static void Difficile(char tab[],char tab1[]){
		Random r= new Random() ;
		int nb=0;

		for(int i=0;i<tab1.length;i++){
			nb=r.nextInt(8);
			tab1[i]=tab[nb];
		}
		//ShowTab(tab1);
	}

	public static void Facile(char tab[],char tab1[]){
		Random r= new Random() ;
		int nb=0;
		boolean lev=false;

		for(int i=0;i<tab1.length;i++){
			nb=r.nextInt(8);
			lev=false;
			for(int j=0;j<i&&!lev;j++){
				if (tab1[j]==tab[nb]){
					lev=true;
				}
			}
			if (lev){
				i--;
			}
			else{
				tab1[i]=tab[nb];
			}
		}
		//ShowTab(tab1);
	}

	public static void main(String[] args) {
		char tab2[]=new char[4];
		char tab1[]=new char[4];
		char tab[]={'R','J','B','O','V','C','T','S'};
		char couleur='a';
		int cpBon=0;
		int cpBad=0;
		int choix=3;
		boolean lev=false;

		while (choix!=0){
			while (choix!=0&&choix!=1&&choix!=2){
				System.out.println("Bienvenue sur mastermind\nChoisissez une difficult�e\n1:Facile\n2:Difficile\n0:quittez");
				choix=(new Scanner(System.in)).nextInt();
			}
			switch (choix)
			{
			case 1:
				Facile(tab, tab1);
				for (int i=2;i>0&&!lev;i--){
					Saisie(tab2);
					lev=Verrification(tab1, tab2);
					if (!lev){
						if (i>1){
							System.out.println("encore "+(i-1)+" coup");
						}
					}
				}
				if (!lev){
					System.out.print("la solution etait: ");
					ShowTab(tab1);
					System.out.println();
				}

				break;
			case 2:
				Difficile(tab, tab1);
				for (int i=12;i>0&&!lev;i--){
					Saisie(tab2);
					lev=Verrification(tab1, tab2);
					if (!lev){
						if (i>1){
							System.out.println("encore "+(i-1)+" coup");
						}
					}
				}
				if (!lev){
					System.out.print("la solution etait: ");
					ShowTab(tab1);
					System.out.println();
					
				}

				break;
			case 0:
				System.out.println("Au revoir");
			}
			if(choix==1||choix==2){
				choix=3;
			}
		}
	}
}
