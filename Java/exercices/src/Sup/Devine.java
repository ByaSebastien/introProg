package Sup;

import java.util.Random;
import java.util.Scanner;

public class Devine {

	public static void main(String[] args) {


		Random r=new Random();
		int cp=0;
		int nb;
		int nb1=101;
		nb=r.nextInt(101); //nb entre 0 et 100
		boolean lev=true;

		while (nb1!=-1 && lev){
			while (nb1<(-1) || nb1>100){
				System.out.println("entrez un nb (-1) pour terminer");
				nb1=(new Scanner(System.in)).nextInt();
			}
			cp++;
			if (nb==nb1){
				if (cp==1){
					System.out.println("va jouer au lotte mon petit!");
					lev=!lev;
				}
				else{
					System.out.println("bravo en "+cp+" coup!");
					lev=!lev;
				}
			}
			else{
				if (nb1<nb){
					System.out.println("non c'est plus");
				}
				else{
					System.out.println("non c'est moins");
				}
			}
			nb1=101;
		}
	}
}
