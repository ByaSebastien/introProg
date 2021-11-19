package Tableau;

public class UtilVecteur {
	public static void init(int[] t, int nb){
		int i;
		for(i=0;i<t.length;i++){
			t[i]=nb;
		}
	}
	public static void affiche(double[] t){
		int i;
		for(i=0;i<t.length;i++){
			System.out.print(t[i]+"\t");
		}
		System.out.println();

	}
	public static void affiche(char[] t){
		int i;
		for(i=0;i<t.length;i++){
			System.out.print(t[i]+"\t");
		}
		System.out.println();

	}
	public static void affiche(int[] t){
		int i;
		for(i=0;i<t.length;i++){
			System.out.print(t[i]+"\t");
		}
		System.out.println();

	}
	public static void affiche(String[] t){
		int i;
		for(i=0;i<t.length;i++){
			System.out.print(t[i]+"\t");
		}
		System.out.println();

	}
	public static void affiche (int t[], String joli){
		int i;
		for(i=0;i<t.length;i++){
			System.out.print(t[i] +  joli);
		}
		System.out.println();

	}
	public static int nbCases(int[] tab){
		return tab.length;
	}
}