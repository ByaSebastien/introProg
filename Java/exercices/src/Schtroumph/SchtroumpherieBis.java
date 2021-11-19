package Schtroumph;

public class SchtroumpherieBis {

	public static void main(String[] args) {
		
		Schtroumph[]village=new Schtroumph[20];
		
		village[0]=new GrandSchtroumph("chef");
		village[1]=new Schtroumphette("Schtroumphette");
		village[2]=new SchtroumphPeureux("Peureux");
		village[3]=new SchtroumphNoir("Noir");
		for(int i=4;i<village.length;i++){
			village[i]=new Schtroumph("villageois");
		}
		for(int i=0;i<village.length;i++){
			System.out.println("je suis "+village[i].getNom());
			village[i].dessine();
			village[i].parle();
			if (village[i] instanceof GrandSchtroumph){
				((GrandSchtroumph)village[i]).chef();
			}
			if (village[i] instanceof Schtroumphette){
				((Schtroumphette)village[i]).shopping();
			}
			if (village[i] instanceof SchtroumphPeureux){
				((SchtroumphPeureux)village[i]).peur();
			}
			if (village[i] instanceof SchtroumphNoir){
				((SchtroumphNoir)village[i]).mord();
			}
			System.out.println();
		}

	}

}
