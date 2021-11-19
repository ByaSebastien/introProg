package PooExercices;

public class Point {
	
	private int x=0;
	private int y=0;
	private static int nb=0;
	private int id=0;
	private boolean same=false;
	
	public Point(){
		id=++nb;
	}
	public Point(int x,int y){
		id=nb++;
		this.x=x;
	}
	public Point(int id){
		if(id<=nb){
			this.id=nb++;
		}
		else{
			if(id>nb){
				nb=id;
				this.id=nb++;
			}
		}
	}
	public void permute(Point b){
		int temp=0;	
		temp=x;
		x=b.x;
		b.x=temp;
		temp=y;
		y=b.y;
		b.y=temp;
	}
	public void symetrique(){
		int temp=0;
		
		temp=x;
		x=y;
		y=temp;
	}
	public boolean coincide (Point b){
		if (this.x==b.x && this.y==b.y){ 
			same=true;
		}
		else{
			same=false;
		}
		return same;
	}
	public void initialise(int abs,int ord){
		x=abs;
		y=ord;
	}
	public void deplace(int dx,int dy){
		x+=dx;
		y+=dy;
	}
	public void affiche(){
		System.out.println("point de coordonnées "+x+","+y);
	}
	public void id(){
		System.out.println("point "+id);
	}

}
