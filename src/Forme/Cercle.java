package Forme;
import java.util.Scanner;





public class Cercle extends Forme{
    Scanner lc = new Scanner (System.in);    
    protected int r;
    public Cercle(){
       super();
       couleur=super.couleur;
       x=super.x;
       y=super.y;
     System.out.println("Saisir le Rayon du Cercle.");
		r = lc.nextInt();
      System.out.println("Cercle Crée.");    
    }
    private Cercle(int x, int y, int r, int c){
        super();
        this.x=x;
        this.y=y;
        this.r=r;
        //this.c=c;
        System.out.println("Cercle Crée.");
    }
    private String Deplacer(){
                System.out.println("Saisir les coordonée X du cercle.");
		x = lc.nextInt();
       System.out.println("Saisir les coordonée Y du cercle.");
		y = lc.nextInt();
                return ("Vous avez deplacer le cercle en X = " + x + ", Y = " + y);
                
    }
    protected void Deplacer(int x, int y){
            this.x=this.x+x;
            this.y=this.y+y;
    }
}
