package découverte;

public class Opérateurs {

	public static void main(String[] args) {
		
		int nb1=1,nb2=10,nb3=3;
		String c1="toto",c2="dédé";
		
		
		//opérateur mathematique
		
		nb3=nb1+nb2;//somme
		nb3=nb1-nb2;//différence
		nb3=nb1*nb2;//produit
		nb3=nb1/nb2;//quotient----division entière
		nb3=nb1%nb2;//modulo
		nb3=(int) Math.pow(nb1, nb2);//nb1 exposant nb2
		nb3=(int) Math.pow(nb1, 0.5);//racine carré de nb1
		
		System.out.println(Math.PI);
		
		///////////////////////////////////////////////////////////
		
		//assignation
		nb3=456; //logique <-
		nb3+=50; // nb3<-nb3+50
		nb3-=50; // nb3<-nb3-50
		nb3*=50; // nb3<-nb3*50
		nb3/=50; // nb3<-nb3/50
		
		nb3++; //nb3<-nb3+1
		nb3--; //nb3<-nb3-1
		
		//opérateur comparaison
		
		System.out.println(nb1<=6);  // <,<=,>,>=
		System.out.println(nb1==5);  // égal
		System.out.println(nb1!=60); //différent
		
		//opérateur logique
		
		//et
		System.out.println(nb1>4 && nb1<10);    // &&=et évaluation courte
		System.out.println(nb1>4 || nb1<10);    // ||=ou évaluation courte
		System.out.println(!(nb1>4 && nb1<10)); // !=not
		System.out.println(nb1>4 ^ nb1<10);     // xor = ou exclusif
		
		//chaine
		c1=c1+" "+c2; // concatenation
		System.out.println(c1);
		// fonction booléenne de comparaison
		c1="toto";
		System.out.println(c1.equals("toto"));
		c1="Toto";
		System.out.println(c1.equalsIgnoreCase("toto"));
		
		
		
		

	}

}
