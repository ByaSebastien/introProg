package d�couverte;

import java.util.Scanner;

public class TypesDeDonn�es {

	public static void main(String[] args) {
		// 8types primaires en java
		
		// 1:nombres entiers
		byte nb1;//-128 � 127 (1 octet)
		short nb2;//-32768 � 32767 (2 octet)
		int nb3;//+- 2 millards (4 octet)
		long nb4;//9.10 exposant 18 (8 octet)
		//jamais de d�cimal y compris pour les calculs! division enti�res
		
		
		// 2: nombre � virgule flottante
		float nb5;//6 � 7 d�cimales significatives (4octet) 38chiffres
		double nb6;// 15 d�cimales signifitatives (8octet) 308chiffres
		nb6=8.323; // la virgule est un point
		
		//3: caract�re
		char lettre; //1 et 1 seul caract�re (2 octet)
		lettre='l'; //des '   ' et toujours qq chose dedans
		
		//4: bool�en
		boolean ok;
		ok=true; // ou false
		
		////////////////////////////////////////////////////////////////////////////////////////////////
		
		//variable de type classe(infinit�e)
		
		//String : chaine de carat�res
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
		
		System.out.println("entrez un caract�re ");
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