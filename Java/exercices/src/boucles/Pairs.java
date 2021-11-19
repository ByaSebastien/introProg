package boucles;

public class Pairs {

	public static void main(String[] args) {

		int cp=0;
		int nb=1;

		while (cp<20){
			if (nb%2==0){
				System.out.println(nb);
				cp++;
			}nb++;
		}
	}
}
