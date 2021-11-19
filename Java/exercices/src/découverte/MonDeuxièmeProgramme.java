package découverte;

public class MonDeuxièmeProgramme {

	public static void main(String[] args) {
		int maJolieVariable;
		maJolieVariable=456;
		int a=5,b=85,c=74,d=123;
		int solution;
		
		//addition
		solution=a+b; // espace pas obligatoir
		System.out.println(a+ "+" + b + "=" + solution);
		
		//division
		solution=d/c; // entier divisé par un entier donne un entier
		System.out.println(d + ":" + c + "=" + solution);
		
		//modulo
		solution=d%c; // module= reste de la division entière + retour a la ligne sup
		System.out.println("\n" + d + " modulo " + c + "=" + solution);
		
		
		
	}

}
