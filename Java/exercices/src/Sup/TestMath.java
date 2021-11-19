package Sup;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class TestMath {
	public static int debug(int dif){
		try {
		    dif=(new Scanner(System.in)).nextInt();
		}
		catch (InputMismatchException e) {
		    System.out.println("entrez un choix valide");
		    //System.out.println(e.getMessage());
		    dif=-1;
		}
		return dif;
	}
	public static void debug(int tab[][],int pos){
		try {
		    tab[pos][3]=(new Scanner(System.in)).nextInt();
		}
		catch (InputMismatchException e) {
		    System.out.println("j'attends un nombre !");
		    tab[pos][3]=-1;
		}
	}
	public static char tout(int tab[][],char tab1[],int pos,char op,int dif){
		Random r= new Random() ; 
		int nb;
		nb=r.nextInt(4)+1;
		switch(nb)
		{
		case 1:
			tab1[pos]=addition(tab, pos, op, dif);
			break;
		case 2:
			tab1[pos]=soustraction(tab, pos, op, dif);
			break;
		case 3:
			tab1[pos]=multiplication(tab, pos, op, dif);
			break;
		case 4:
			tab1[pos]=division(tab, pos, op, dif);
			break;
		}
		return op;
	}
	public static int correction(int tab[][],char op,int cp){
		for (int pos=0;pos<tab.length;pos++){
			if (tab[pos][2]!=tab[pos][3]){
				if (tab[pos][3]==-1){
					System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][2]);
				}
				else{
					System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][2]+" et pas "+tab[pos][3]);
				}
			}
			else{
				cp++;
				System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][2]+" correct");
			}
		}
		return cp;
	}
	public static int menu(int tab[][],char choix1,int pos){
		if (pos>=1){
			if (pos<=tab.length-2){
				System.out.println("s: suivant\np: précédent\nc: correction");
				while (choix1!='s' && choix1!='p' && choix1!='c'){
					choix1=(new Scanner(System.in)).nextLine().charAt(0);
				}
			}
			else{
				System.out.println("p: précédent\nc: correction");
				while (choix1!='p' && choix1!='c'){
					choix1=(new Scanner(System.in)).nextLine().charAt(0);
				}
			}
		}
		else{
			System.out.println("s: suivant\nc: correction");
			while (choix1!='s' && choix1!='c'){
				choix1=(new Scanner(System.in)).nextLine().charAt(0);
			}
		}
		switch (choix1)
		{
		case 'p':
			if (pos>=1){
				pos=pos-2;
			}
			break;
		case 'c':
			pos=tab.length;
			break;
		}
		return pos;
	}
	public static boolean evaluation(int cp ,boolean reussi){
		if(cp>=5){
			reussi=true;
			System.out.println("Bravo tu as bien répondu à "+cp+"/10 questions");
		}
		else{
			System.out.println("tu as "+cp+"/10 Courage, essaye encore une fois!");
		}
		System.out.println();
		return reussi;
	}
	public static char division(int tab[][],int pos,char op,int dif){
		Random r= new Random() ; 
		int nb=0;

		do{
			tab[pos][1]=r.nextInt(dif)+1;
			nb=r.nextInt(dif)+1;
			tab[pos][0]=tab[pos][1]*nb;
		}while (tab[pos][0]>dif);
		tab[pos][2]=tab[pos][0]/tab[pos][1];
		op='/';
		return op;
	}
	public static char multiplication(int tab[][],int pos,char op,int dif){
		Random r= new Random() ; 

		tab[pos][0]=r.nextInt(dif);
		if (dif==100||dif==1000){
			tab[pos][1]=r.nextInt(21);
		}
		else{
			tab[pos][1]=r.nextInt(dif);
		}
		tab[pos][2]=tab[pos][0]*tab[pos][1];
		op='x';
		return op;
	}
	public static char soustraction(int tab[][],int pos,char op,int dif){
		Random r= new Random() ; 

		tab[pos][0]=r.nextInt(dif);
		do{
			tab[pos][1]=r.nextInt(dif);
		}while(tab[pos][1]>tab[pos][0]);
		tab[pos][2]=tab[pos][0]-tab[pos][1];
		op='-';
		return op;
	}
	public static int diff(int dif){
		switch (dif)
		{
		case 1:
			dif=10;
			break;
		case 2:
			dif=100;
			break;
		case 3:
			dif=1000;
			break;
		}
		return dif;
	}
	public static char addition(int tab[][],int pos,char op,int dif){
		Random r= new Random() ; 

		tab[pos][0]=r.nextInt(dif);
		tab[pos][1]=r.nextInt(dif);
		tab[pos][2]=tab[pos][0]+tab[pos][1];
		op='+';
		return op;
	}
	public static void main(String[] args) {

		int dif=0,choix=1,cp=0,pos=0,difff=1;
		char op='+',choix1='a';
		int tab[][]=new int [10][4];
		char tab1[]=new char [10];
		boolean reussi=false;

		while (difff!=0 && choix!=0){
			System.out.println("Choix de difficultée\n1: Nombres inférieur à 10\n2: Nombres inférieur à 100\n3: Nombres inférieur à 1000\n0: Sortir");
			do{
				difff=debug(difff);
			}while (difff!=0 && difff!=1 && difff!=2 && difff!=3);
			if (difff!=0){
				System.out.println("1: Addition\n2: Soustraction\n3: Multiplication\n4: Division\n5: Un peu de tout\n0: Sortir");
				do{
					choix=debug(choix);
				}while(!(choix>=0 && choix<=5));
				reussi=false;
				while(!reussi){
					for (int i=0;i<tab.length;i++){
						tab[i][3]=-1;
					}
					dif=diff(difff);
					switch (choix)
					{
					case 1:
						for (pos=0;pos<tab.length;pos++){
							op=addition(tab, pos, op, dif);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][3]==-1){
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = ?");
							}
							else{
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][3]);
							}
							tab[pos][3]=-1;
							while(tab[pos][3]==-1){
							debug(tab, pos);
							}
							pos=menu(tab, choix1, pos);
						}
						cp=correction(tab, op, cp);
						System.out.println();
						reussi=evaluation(cp, reussi);
						if (!reussi){
							if(difff>1){
								difff--;
							}
						}
						break;
					case 2:
						for (pos=0;pos<tab.length;pos++){
							op=soustraction(tab, pos, op, dif);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][3]==-1){
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = ?");
							}
							else{
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][3]);
							}
							tab[pos][3]=-1;
							while(tab[pos][3]==-1){
							debug(tab, pos);
							}
							pos=menu(tab, choix1, pos);
						}
						cp=correction(tab, op, cp);
						System.out.println();
						reussi=evaluation(cp, reussi);
						if (!reussi){
							if(difff>1){
								difff--;
							}
						}
						break;
					case 3:
						for (pos=0;pos<tab.length;pos++){
							op=multiplication(tab, pos, op, dif);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][3]==-1){
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = ?");
							}
							else{
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][3]);
							}
							tab[pos][3]=-1;
							while(tab[pos][3]==-1){
							debug(tab, pos);
							}
							pos=menu(tab, choix1, pos);
						}
						cp=correction(tab, op, cp);
						System.out.println();
						reussi=evaluation(cp, reussi);
						if (!reussi){
							if(difff>1){
								difff--;
							}
						}
						break;
					case 4:
						for (pos=0;pos<tab.length;pos++){
							op=division(tab, pos, op, dif);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][3]==-1){
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = ?");
							}
							else{
								System.out.println(""+tab[pos][0]+ op +tab[pos][1]+" = "+tab[pos][3]);
							}
							tab[pos][3]=-1;
							while(tab[pos][3]==-1){
							debug(tab, pos);
							}
							pos=menu(tab, choix1, pos);
						}
						cp=correction(tab, op, cp);
						System.out.println();
						reussi=evaluation(cp, reussi);
						if (!reussi){
							if(difff>1){
								difff--;
							}
						}
						break;
					case 5:
						for (pos=0;pos<tab.length;pos++){
							tout(tab, tab1, pos, op, dif);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][3]==-1){
								System.out.println(""+tab[pos][0]+tab1[pos]+tab[pos][1]+" = ?");
							}
							else{
								System.out.println(""+tab[pos][0]+tab1[pos]+tab[pos][1]+" = "+tab[pos][3]);
							}
							tab[pos][3]=-1;
							while(tab[pos][3]==-1){
							debug(tab, pos);
							}
							pos=menu(tab, choix1, pos);
						}
						for (pos=0;pos<tab.length;pos++){
							if (tab[pos][2]!=tab[pos][3]){
								System.out.println(""+tab[pos][0]+" "+tab1[pos]+" "+tab[pos][1]+" = "+tab[pos][2]+" et pas "+tab[pos][3]);
							}
							else{
								cp++;
								System.out.println(""+tab[pos][0]+" "+tab1[pos]+" "+tab[pos][1]+" = "+tab[pos][2]+" correct");
							}
						}
						System.out.println();
						reussi=evaluation(cp, reussi);
						if (!reussi){
							if(difff>1){
								difff--;
							}
						}
					}
					cp=0;
				}
			}
		}
	}
}