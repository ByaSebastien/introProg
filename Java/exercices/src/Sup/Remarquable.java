package Sup;

public class Remarquable {

	public static void main(String[] args) {

		int nb=0;
		int cp=0;


		while (nb<1000){

			if (Math.pow(nb, 2)>=100){
				if (Math.pow(nb+1, 2)== Math.pow(nb, 2)+111){
					System.out.println(nb+" , "+(nb+1)+" , ");
				}
			}
			else{

				if (Math.pow(nb, 2)>=10){
					if (Math.pow(nb+1, 2)==Math.pow(nb, 2)+11){
						System.out.println(nb+" , "+(nb+1)+" , ");
					}
					else{
						if(Math.pow(nb+1, 2)==Math.pow(nb, 2)+1) {
							System.out.println(nb+" , "+(nb+1)+" , ");
						}
					}
				}
			}
			nb++;
		}
	}
}