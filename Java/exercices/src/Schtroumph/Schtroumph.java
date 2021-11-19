package Schtroumph;

public class Schtroumph {
	private String nom="Shtroumph";
	private static int nb=0;

	public static int getNb() {
		return nb;
	}
	public static void setNb(int nb) {
		Schtroumph.nb = nb;
	}
	public Schtroumph(){
		setNb(getNb() + 1);
	}
	public Schtroumph(String nom){
		this.nom=nom;
		setNb(getNb() + 1);
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void parle(){
		System.out.println("Je Shtroumph le Shtroumph");
	}
	public void dessine(){
		System.out.println("Je suis bleu et habillé en blanc");
	}
}
