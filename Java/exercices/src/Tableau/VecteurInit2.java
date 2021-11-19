package Tableau;

public class VecteurInit2 {

	public static void main(String[] args) {
		
		
		int tab[]=new int[20];
		
		for (int x=1;x<tab.length;x++){
			tab[x-1]=2*x;
			System.out.print(tab[x-1]+" , ");
			if (x%5==0){
				System.out.println("");
			}
		}

	}

}
