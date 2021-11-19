package Sup;

public class Entier {

	public static void main(String[] args) {


		int cp=0,nb=3,div=3;

		System.out.println("2 , ");
		while(cp<1000000){
			while(div<=Math.pow(nb, 0.5) && nb%div!=0){
				div=div+2;
			}
			if (div>Math.pow(nb, 0.5)){
				System.out.println(nb+" , ");
				cp++;
			}
			div=3;
			nb=nb+2;
		}

	}

}
