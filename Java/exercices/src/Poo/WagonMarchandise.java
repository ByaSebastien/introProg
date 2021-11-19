package Poo;

public class WagonMarchandise extends Wagon {
	private boolean couvert=false;
	private boolean citerne=false;
	private int tare;
	
	
	public void setCouvert(boolean couvert) {
		this.couvert = couvert;
	}	
	public void setCiterne(boolean citerne) {
		this.citerne = citerne;
	}
	public void setTare(int tare) {
		if (tare<=0){
			tare=200;
		}
		this.tare = tare;
	}
	public boolean isCouvert() {
		return couvert;
	}
	public boolean isCiterne() {
		return citerne;
	}
	public int getTare() {
		return tare;
	}
	public void affiche(){
		System.out.println("Mon super wagon de marchandise");
		if (couvert){
			System.out.println("couvert");
		}
		else{
			System.out.println("pas couvert");
		}
		if (citerne){
			System.out.println("citerne");
		}
		else{
			System.out.println("pas de citerne");
		}
		if(isBiDirection()){
			System.out.println("bidirectionnel");
		}
		else{
			System.out.println("pas bidirectionnel");
		}
		System.out.println("de "+tare+" kg");
	}
}
