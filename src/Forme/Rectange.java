package Forme;
import java.util.*;
public class Rectange extends Forme {
    Scanner lc = new Scanner (System.in);
    
    public Rectange(){
        super();
       largeur= super.largeur;
       longueur=super.longueur;
       couleur=super.couleur;
       x=super.x;
       y=super.y;
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
    
    private void verifier(){
      if (super.x == this.x &  super.y == this.y){
            System.out.println("La forme se situe bien aux coordonées saisie.");
        } 
        else {
            System.out.println("La forme ne se situe pas aux coordonées saisie. Les coordonées actuelles sont X = " + x + ", Y = " + y + " et est de Couleur = " + couleur);
        }
        if (super.couleur == this.couleur){
                    System.out.println("La forme est bien de la couleur que celle saisie.");
        } 
        else {
            System.out.println("La forme n'est pas de la couleur que celle saisie. La couleur actuelle est " + couleur);
                }
        if (super.largeur == this.largeur &  super.longueur == this.largeur){
            System.out.println("La forme est bien de la taille saisie.");
        } 
        else {
            System.out.println("La forme n'est pas de la taille saisie");
        }
    }
     protected void calculer(){
         int perimetre;
         int surface;
            perimetre=longueur*largeur;
            perimetre=perimetre/2;
            System.out.println("La forme est de perimetre " + perimetre + " Centimétre");
            surface=longueur*largeur;
            System.out.println("La forme est de " + surface + "Centimétre carré");
        }

     protected String Afficher(){
         super.Afficher();
		return ("La forme se trouve en X = " + x + ", Y = " + y + " et est de Couleur = " + couleur + "Sa largeur est de " + largeur + " et sa longueur est de " + longueur);
	}
     protected void Deplacer(int x, int y){
            this.x=this.x+x;
            this.y=this.y+y;
     }
}
