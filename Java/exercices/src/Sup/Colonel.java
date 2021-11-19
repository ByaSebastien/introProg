package Sup;

public class Colonel {

	public static void main(String[] args) {

		int age=0;
		int an=0;

		for (an=1867;an>1800;an--){
			if ((an%100/10)+((an%1000)/100)+(an/1000)+(an%10)==age){
				System.out.println(an+"/"+age);
			}
			age++;
		}
	}
}