package PooExercices;

import java.io.ObjectInputStream.GetField;

public class TestCercle {

	public static void main(String[] args) {
		Cercle a=new Cercle(4,5,2);
		Point b=new Point(3,2);
		a.affiche();
		a=new Cercle(b, 5);

	}

}
