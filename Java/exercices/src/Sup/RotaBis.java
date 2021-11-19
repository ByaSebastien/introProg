package Sup;

public class RotaBis {

	public static void main(String[] args) {


		int a=10;
		int x=0;
		int cp=0;
		int temp=0;
		int[][] tab = new int[a][a];
		int[][] tab1 = new int[a][a];

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

		for (x=0;x<=(a-1);x++) {
			for (int y=0;y<=a-1;y++) {
				tab1[y][a-x-1]=tab[x][y];
			}
		}
		for (int i=0;i<=a-1;i++) {
			System.out.println("");
			for (int j=0;j<=a-1;j++) {
				System.out.print(tab1[i][j]+" , ");
			}
		}
		System.out.println(cp);


	}
}

