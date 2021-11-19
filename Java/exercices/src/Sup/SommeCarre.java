package Sup;

public class SommeCarre {

	public static void main(String[] args) {
		
		int nb=1000;
		
		for (nb=1000;nb<=9999;nb++){
				if((Math.pow((nb/100), 2))+(Math.pow((nb%100),2))==nb){
					System.out.println(nb);
				}
	}
}
}