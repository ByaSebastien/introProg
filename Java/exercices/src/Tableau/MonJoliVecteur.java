

package Tableau;

public class MonJoliVecteur {

	public static void main(String[] args) {
		int vecteur[]=new int[100];
		String toto[]={"pomme","poire","orange"};
		UtilVecteur.init(vecteur, 23);
		UtilVecteur.affiche(vecteur, " * ");
		for(int i=0; i<UtilVecteur.nbCases(vecteur);i++){
			vecteur[i]=i*2;
		}
		UtilVecteur.affiche(vecteur);
		UtilVecteur.affiche(toto);
	}

}


