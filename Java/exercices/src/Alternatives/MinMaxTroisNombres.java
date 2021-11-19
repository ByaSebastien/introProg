package Alternatives;

import java.util.Scanner;

public class MinMaxTroisNombres {

	public static void main(String[] args) {
		 int nb1;
		 int nb2;
		 int nb3;
		 int nb4;
		 
		 System.out.println("entrez trois nombre");
		 nb1=(new Scanner(System.in)).nextInt();
		 nb2=(new Scanner(System.in)).nextInt();
		 nb3=(new Scanner(System.in)).nextInt();
		 
		 if (nb2<nb1){
			 nb4=nb1;
			 nb1=nb2;
			 nb2=nb4;
		 }
		 if (nb3<nb1){
			 nb4=nb1;
			 nb1=nb3;
			 nb3=nb4;
		 }
		 if (nb3<nb2){
			 nb4=nb2;
			 nb2=nb3;
			 nb3=nb4;
		 }
		 
		 System.out.println("le plus petit est "+nb1+"\nle plus grand est "+nb3);
		 		 
	}

}
