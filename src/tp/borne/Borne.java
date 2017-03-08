package tp.borne;

import java.util.*;

public class Borne {
   
   private DateBorne dateDernièreRévision;
   private int indiceUnitéCompteur;
   private TypeBorne leType;
   private boolean flag;
   private int idBorne;
   private int a;
   private int m;
   private int j;
   
   
   public Borne(){
   //Creation du type de la Borne
   TypeBorne leType = new TypeBorne();    
       
   //Creation de la borne
   Scanner lc = new Scanner(System.in);
   System.out.println("Inserez le numéro de la Borne");
   idBorne = lc.nextInt();   
   
   
   //Gestion de la date de revision de la borne
   System.out.println("Inserez la date de dernière revision de la Borne");
   System.out.println("Quel est l'année?");
   a = lc.nextInt();
   System.out.println("Quel est le mois?");
   m = lc.nextInt();
   System.out.println("Quel est le jour?");
   j = lc.nextInt();
   DateBorne dateDernièreRévision = new DateBorne(a,m,j);
   System.out.println("Inserez l'indice d'unité du compteur de la Borne");
   indiceUnitéCompteur = lc.nextInt();
   }
   public int getDuréeRévision(){
       return leType.getDuréeRevision();
   }
   
   //Verification de la date de revision
   public boolean estAReviser(){
       
      flag=false;
       if (dateDernièreRévision.difference(DateBorne.aujourdhui())>=leType.getNbJoursEntreRévision()){
            System.out.println("La borne est à revisée : le nombre de jours entre chaque révisions depuis la dérnière s'est écoulé. ");
            flag=true;
        } 
       else if (leType.getNbUnitésEntreRévisions()>indiceUnitéCompteur){
            System.out.println("La borne est à revisée : le nombre d'unité de charge délivrée par la borne à atteind le seuil.");
            flag=true;
        } 
        else {
            System.out.println("La borne n'est pas à révisé.");
            flag=false;
        }
       return flag;
   }
   
}
