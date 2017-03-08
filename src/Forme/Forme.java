package Forme;
import java.util.*;
public class Forme {
    protected int x, y, couleur, largeur, longueur;
    
    Scanner lc = new Scanner (System.in);
   protected void Forme(){
       System.out.println("Saisir les coordonée X de la forme.");
		x = lc.nextInt();
       System.out.println("Saisir les coordonée Y de la forme.");
		y = lc.nextInt();
       System.out.println("Saisir la couleur de la forme.");
		couleur = lc.nextInt();
       System.out.println("Saisir la largeur de la forme.");
		largeur = lc.nextInt();
       System.out.println("Saisir la longueur de la forme.");
		longueur = lc.nextInt();
    }
    protected void Forme(int X, int Y, int Couleur, int Largeur, int Longueur){
        this.x=X;
        this.y=Y;
        this.couleur=Couleur;
        this.largeur=Largeur;
        this.longueur=Longueur;
    }
    protected String verifier(int x,int y, int couleur){
	if (x == this.x &  y == this.y){
            System.out.println("La forme se situe bien aux coordonées saisie.");
        } 
        else {
            System.out.println("La forme ne se situe pas aux coordonées saisie. Les coordonées actuelles sont X = " + x + ", Y = " + y + " et est de Couleur = " + couleur);
        }
        if (couleur == this.couleur){
                    System.out.println("La forme est bien de la couleur que celle saisie.");
        } 
        else {
            System.out.println("La forme n'est pas de la couleur que celle saisie. La couleur actuelle est " + couleur);
        }
        return("Vous avez verifier la forme");
}
    protected String deplacer(){
		System.out.println("Vous aller deplacer la forme.");
                System.out.println("Saisir les coordonée X de la forme .");
		x = lc.nextInt();
                System.out.println("Saisir les coordonée Y de la forme .");
		y = lc.nextInt();
                return ("Vous avez deplacer la forme en X = " + x + ", Y = " + y);
	}
    protected String colorier(){
		System.out.println("Saisir la couleur de votre forme (1 à 10");
                couleur = lc.nextInt();
                return ("Vous avez choisis la couleur " + couleur);
    }
    protected String Afficher(){
		return ("La forme se trouve en X = " + x + ", Y = " + y + " et est de Couleur = " + couleur);
	}
}
