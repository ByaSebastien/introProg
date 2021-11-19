package Alternatives;

import java.util.Scanner;

public class Equation {

	public static void main(String[] args) {
		double a=0,b=0,x=0;
		
		System.out.println("entrez deux nombre");
		a=(new Scanner(System.in)).nextDouble();
		b=(new Scanner(System.in)).nextDouble();
		
		if ((a==0)&&(b==0)){
			System.out.println("toute valeur possible");
		}
		else {
			if ((a==0)&&(b!=0)){
				System.out.println("impossible");
			}
			else {
				x=((-b)/a);
				System.out.println(+a+".x+"+b+ "=0" + "\n" + "x" + " = "+((-b)/a) );
						
			}
		}
	}

}
