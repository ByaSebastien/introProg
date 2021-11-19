package Sup;

public class Permu {

	public static void main(String[] args) {

		int temp=0;
		int x=0;
		int a=10;

		int tab[][]=new int[a][a];

		for(int i=0;i<=(a-1);i++){
			System.out.println("");
			for(int j=0;j<=(a-1);j++){
				tab[i][j]=x;
				System.out.print(tab[i][j]+" , ");
				x++;
			}
		}
		System.out.println("");
		System.out.println("");
		x=0;
		for (x=0;x<=((a-1)-x);x++){
		for (int y=0;y<=((a/2)-1);y++){
			temp=tab[x][y];
			tab[x][y]=tab[(a-1)-y][x];
			tab[(a-1)-y][x]=tab[(a-1)-x][(a-1)-y];
			tab[(a-1)-x][(a-1)-y]=tab[y][(a-1)-x];
			tab[y][(a-1)-x]=temp;
			}
		}
		for(int i=0;i<=(a-1);i++){
			System.out.println("");
			for(int j=0;j<=(a-1);j++){
				System.out.print(tab[i][j]+" , ");
			}
		}
		
	}
}
