package assignations;

import java.util.Scanner;

public class bool {

	public static void main(String[] args) {
		int a=0;
		System.out.println("entrez un nombre");
		a=(new Scanner(System.in)).nextInt(); 
		System.out.println(a>=5 && a<=10);
		System.out.println((a>=5 && a<=99)&& a!=10);
		System.out.println(a<6 || a>85);
		System.out.println((a>=1 && a <=18) || (a>=65 && a <=90));
		System.out.println(((a%4==0)&& !(a%100==0))^ (a%400==0));
		
	

	}

}
