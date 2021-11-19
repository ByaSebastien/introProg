package PooExercices;

import java.awt.Point;

public class Cercle extends Point {
	
	private float r=0;
	private Point c;
	private int x=0;
	private int y=0;
	
	
	public Cercle(int x,int y,float r){
		this.c=new Point(x,y);
		this.r=r;
		this.x=x;
		this.y=y;
	}
	public Cercle (PooExercices.Point b,float r){
		getX();
		getY();
		this.r=r;
	}
	public void affiche(){
		System.out.println("cercle avec pourcentre le point de coordonnée "+x+","+y+" et de rayon "+r);
	}
	
}
