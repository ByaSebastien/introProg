package découverte;

import java.util.Scanner;

public class TypesDeDonnées {

	public static void main(String[] args) {
		// 8types primaires en java
		
		// 1:nombres entiers
		byte nb1;//-128 à 127 (1 octet)
		short nb2;//-32768 à 32767 (2 octet)
		int nb3;//+- 2 millards (4 octet)
		long nb4;//9.10 exposant 18 (8 octet)
		//jamais de décimal y compris pour les calculs! division entières
		
		
		// 2: nombre à virgule flottante
		float nb5;//6 à 7 décimales significatives (4octet) 38chiffres
		double nb6;// 15 décimales signifitatives (8octet) 308chiffres
		nb6=8.323; // la virgule est un point
		
		//3: caractère
		char lettre; //1 et 1 seul caractère (2 octet)
		lettre='l'; //des '   ' et toujours qq chose dedans
		
		//4: booléen
		boolean ok;
		ok=true; // ou false
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		//variable de type classe(infinitée)
		
		//String : chaine de caratères
		String chaine = "la li lu lei lo"; 
		System.out.println(chaine);
		chaine=chaine.toUpperCase();
		System.out.println(chaine);
		
		//saisir
		System.out.println("entrez une chaine ");
		chaine=(new Scanner(System.in)).nextLine();
		System.out.println("entrey un entier ");
		nb3=(new Scanner(System.in)).nextInt();
		System.out.println("entrez un nombre a virgule ");
		nb6=(new Scanner(System.in)).nextDouble ();
		
		System.out.println("entrez un caractère ");
		lettre=(new Scanner(System.in)).nextLine().toLowerCase().charAt(0);
		
		System.out.println(chaine+"\n"+nb3+"\n"+nb6+"\n"+lettre);
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		//conversion et transtypage(casting)
		
		//nb3 est entier nb6 est double
		nb3=(int)nb6+2; //cast to int
		System.out.println(nb3);
		System.out.println(nb3/78.0);// conversion auto en le type le plus grand
		
				
				
				
				

	}

}