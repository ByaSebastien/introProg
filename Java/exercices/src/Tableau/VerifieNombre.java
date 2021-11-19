package Tableau;

import java.util.Scanner;

public class VerifieNombre {

	public static void main(String[] args) {



		int nb=0;
		int x=0;
		int tab[]=new int[10];
		boolean lev=false;

		for (x=0;x<tab.length;x++){
			tab[x]=0;
		}

		for (x=0;x<tab.length;x++){
			System.out.println("entrez un nombre");
			tab[x]=(new Scanner(System.in)).nextInt();	
		}

		while (!lev){
			System.out.println("trouvez un nombre du tableau");
			nb=(new Scanner(System.in)).nextInt();
			for (x=0;x<tab.length&&!lev;x++){
				if (tab[x]==nb){
					lev=true;

				}
			}
		}
		if (lev){
			System.out.println(nb+" se trouve a la case "+x);
		}
	}
}
