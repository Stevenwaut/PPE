package Forme;
import java.util.Scanner;


public class Triangle extends Forme {
    Scanner lc = new Scanner (System.in);    
    protected int x1, x2, x3, y1, y2, y3, couleur;
    public Triangle(){
       super();
       largeur=super.largeur;
       longueur=super.longueur;
       couleur=super.couleur;
       x=super.x;
       y=super.y;
       
       System.out.println("Saisir les coordonée X du 1er sommet.");
		x = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 1er sommet.");
		y = lc.nextInt();
       System.out.println("Saisir les coordonée X du 2eme sommet.");
		x1 = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 2eme sommet.");
		y1 = lc.nextInt();
       System.out.println("Saisir les coordonée X du 3eme sommet.");
		x2 = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 3eme sommet.");
		y2 = lc.nextInt();
       System.out.println("Saisir la couleur de la forme.");
		couleur = lc.nextInt();
       
}
    protected String Afficher(){
        super.Afficher();
		return("La forme se trouve en XY = " + x +","+ y + " XY2 = " + x1 + " " + y1 + " XY3 = " + x2 + " " + x3 + " et est de Couleur = " + couleur);
	}
    protected void Deplacer(int x, int y, int x1, int y1, int x2, int y2){
               
       System.out.println("Saisir les coordonée X du 1er sommet.");
		x = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 1er sommet.");
		y = lc.nextInt();
       System.out.println("Saisir les coordonée X du 2eme sommet.");
		x1 = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 2eme sommet.");
		y1 = lc.nextInt();
       System.out.println("Saisir les coordonée X du 3eme sommet.");
		x2 = lc.nextInt();
       System.out.println("Saisir les coordonée Y du 3eme sommet.");
		y2 = lc.nextInt();
    }
}
