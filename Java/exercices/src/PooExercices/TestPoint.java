package PooExercices;

public class TestPoint {

	public static void main(String[] args) {

		Point a=new Point();
		Point b=new Point(3);
		Point c=new Point(2);
		a.initialise(3,5);
		b.initialise(6, 8);
		a.id();
		a.affiche();
		b.id();
		b.affiche();
		a.id();
		a.deplace(2,0);
		a.affiche();
		c.id();
		if(a.coincide(b))
			System.out.println("ok");
		else
			System.out.println("pas ok");
		a.permute(b);
		a.affiche();
		b.affiche();
		a.symetrique();
		a.id();
		a.affiche();
		
	}

}
