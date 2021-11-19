package Tableau2d;

public class Rotation {

	public static void main(String[] args) {


		int a=10;
		int x=0;
		int cp=0;
		int temp=0;
		int[][] tab = new int[a][a];

		for (int i=0;i<=a-1;i++) {
			System.out.println("");
			for (int j=0;j<=a-1;j++) {
				tab[i][j]=x;
				System.out.print(tab[i][j]+" , ");
				x++;
			}
		}

		x=0;
		System.out.println("");
		System.out.println("");
		System.out.println("");

		for (x=0;x<=(a-1)-x;x++) {
			for (int y=0;y<=(a/2)-1;y++) {
				temp=tab[x][y];
				tab[x][y]=tab[(a-1)-y][x];
				tab[(a-1)-y][x]=tab[(a-1)-x][(a-1)-y];
				tab[(a-1)-x][(a-1)-y]=tab[y][(a-1)-x];
				tab[y][(a-1)-x]=temp;
				if( x==0 && y==0){cp++;}
			}
		}
		for (int i=0;i<=a-1;i++) {
			System.out.println("");
			for (int j=0;j<=a-1;j++) {
				System.out.print(tab[i][j]+" , ");
			}
		}
		System.out.println(cp);


	}
}

