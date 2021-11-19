package Poo;

public class Hangar {

	public static void main(String[] args) {
		
		Wagon[] train=new Wagon[20];
		
		for(int i=0;i<10;i++){
			train[i]=new WagonPassager();
		}
		for(int i=0;i<20;i++){
			train[i]=new WagonMarchandise();
		}
		for(int i=0;i<train.length;i++){
			train[i].affiche();
			System.out.println("--------------------------------------");
		}
	}
}
