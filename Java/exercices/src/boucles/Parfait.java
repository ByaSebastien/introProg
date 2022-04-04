package boucles;

public class Parfait {

	public static void main(String[] args) {
		
		
		int div=2,nb=6,somme=1;

		while (nb<4000){
			while (div<=Math.pow(nb, 0.5) && somme<nb) {
				if (nb%div==0) {
					if (div!=Math.pow(nb, 0.5)) {
						somme=somme+div+(nb/div);
					}
					else {
						somme=somme+div;
					}
				}
				div++;
			}
			if (somme==nb) {
				System.out.println(nb+",");
			}
			nb++;
			somme=1;
			div=2;
		}

	}

}
