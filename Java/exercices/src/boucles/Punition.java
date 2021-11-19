package boucles;

public class Punition {

	public static void main(String[] args) {


		int nb=1;
		int cp=1;

		while (nb<=20){
			while(cp<=10){
				System.out.println(nb+" x "+cp+" = "+(nb*cp));
				cp++;
			}
			cp=1;
			nb++;
		}
	}

}
