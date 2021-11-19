package découverte;

public class MesJoliesFonctions {
    
    
    public static void affiche_debut(){
        // procédure affiche_debut
        // void pour dire qu'elle ne renvoie rien
        // () je ne lui passe rien
        System.out.println("Bonjour, voci le programme qui va t'afficher");
        System.out.println("une somme, un joli tableau");
        System.out.println("que je vais réinitialiser à 0");
        System.out.println("et puis que je réafficherai");
        
    }

    public static void main(String[] args) {
        int nb1=5, nb2=6, som;
        int[] tab ={12,56,78,45,12,32,65,98,741};
        int[] tab2={1,2,3,4,5,6,7,8,9};
        int i;
        
        affiche_debut();
        
        System.out.println("voici la somme de mes variables");
        som=nb1+nb2;
        System.out.println(som);
        
        affiche(tab);
        
        for(i=0;i<tab.length;i++){
            tab[i]=0;
        }
        affiche(tab);
        affiche(tab2);
        afficheJoli(tab2," * ");
        afficheJoli(tab2,"---");
        
        System.out.println(sommeInt(nb1,nb2));
        i=sommeInt(nb1,nb2);
        nb1=sommeInt(nb1,nb2);
        if(sommeInt(nb1, nb2)==54){
            System.out.println("pppp");
        }    
        
        
        
    }
    public static void affiche(int[] t){
        int i;
        for(i=0;i<t.length;i++){
            System.out.print(t[i]+"\t");
        }
        System.out.println();
        
    }
    public static void afficheJoli (int t[], String joli){
        int i;
        for(i=0;i<t.length;i++){
            System.out.print(t[i] +  joli);
        }
        System.out.println();
        
    }
    public static int sommeInt(int a, int b){  // fonction qui renvoie un int
        int somme;
        somme=a+b;
        return somme;
    }

}