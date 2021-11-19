package Tableau;

import java.util.Random;

public class VecteurAléatoire {

	public static void main(String[] args) {
		
		Random r=new Random();
		int tab[]=new int[10];
		
		for (int x=0;x<tab.length;x++){
	
			tab[x]=r.nextInt(101);
			System.out.print(tab[x]+" , ");
		}

	}

}
