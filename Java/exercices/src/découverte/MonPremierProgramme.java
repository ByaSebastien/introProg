package d�couverte; //dossier d�couverte

public class MonPremierProgramme { //class=programme
	//convention java: nom d'une classe ainsi que les mots dans ce nom doivent commencer par une majuscule

	public static void main(String[] args) {
		// ici on �crit le code java
		//on d�clare des variable
		//var: nb:n <-10
		int nb=10;//d�claration d'une variable num�rique enti�re
		
		
		// afficher "bonjour, j'aime java+retour a la ligne"
		System.out.println("bonjour,j'aime java");
		//afficher "il fait beau+retour a la ligne"
		System.out.println("il fait beau");

		// afficher "bonjour, j'aime java(erreur forma)"
		System.out.print("bonjour,j'aime java");
		//afficher "il fait beau(erreur forma)"
		System.out.print("il fait beau");
		
		//afficher "nb=", nb (\n=retour a la ligne)(+=, donc concat�ner)
		System.out.println("\nnb=" +nb);
		
		//syso avec ctrl+space pour g�n�rer system.out.print
		System.out.println("***");
		
		

	
	
	}

}
