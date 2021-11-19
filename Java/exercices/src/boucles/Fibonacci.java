package boucles;

public class Fibonacci {

	public static void main(String[] args) {
		
		
		int nb1=0;
		int nb2=1;
		int cp=0;
		
		
		while (cp<20){
			System.out.print(nb1+","+nb2+",");
			nb1=nb1+nb2;
			nb2=nb1+nb2;
			cp++;
		}

	}

}
