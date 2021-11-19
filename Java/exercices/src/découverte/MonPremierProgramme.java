package découverte; //dossier découverte

public class MonPremierProgramme { //class=programme
	//convention java: nom d'une classe ainsi que les mots dans ce nom doivent commencer par une majuscule

	public static void main(String[] args) {
		// ici on écrit le code java
		//on déclare des variable
		//var: nb:n <-10
		int nb=10;//déclaration d'une variable numérique entière
		
		
		// afficher "bonjour, j'aime java+retour a la ligne"
		System.out.println("bonjour,j'aime java");
		//afficher "il fait beau+retour a la ligne"
		System.out.println("il fait beau");

		// afficher "bonjour, j'aime java(erreur forma)"
		System.out.print("bonjour,j'aime java");
		//afficher "il fait beau(erreur forma)"
		System.out.print("il fait beau");
		
		//afficher "nb=", nb (\n=retour a la ligne)(+=, donc concatèner)
		System.out.println("\nnb=" +nb);
		
		//syso avec ctrl+space pour générer system.out.print
		System.out.println("***");
		
		

	
	
	}

}
