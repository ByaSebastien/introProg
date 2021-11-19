package boucles;

public class Boucles {

	public static void main(String[] args) {

		int cpt=0;

		//boucle tant que (évaluer avant)
		while (cpt<=10){
			System.out.println("c'est la famille");
			//cpt=cpt+1;
			cpt++;
		}
		System.out.println(cpt);

		//boucle faire... tant que (évaluer après)
		do{System.out.println(cpt);
		cpt--;

		}while (cpt>=0);
	}


}
