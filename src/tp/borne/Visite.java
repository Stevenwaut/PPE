
package tp.borne;
 import java.util.*;

public class Visite {
   private int duréeTotale;
   private Station LaStation;
   private Borne Laborne;
   private char Etat;
   
    public Visite(ArrayList <Borne> lesBornesAVisiter, Station UneStation){
        LaStation=UneStation;
        Etat='p';
        duréeTotale=0;
        
        for(Borne UneBorne : lesBornesAVisiter){
            duréeTotale+=UneBorne.getDuréeRévision();
        }
    }
        public int getDuréeTotale(){
            return this.getDuréeTotale();
        }
        public char getEtat(){
            return this.Etat;
        }
        public void ChangerEtat(){
            if(Etat=='A'){
                Etat='R';
            }
            if(Etat=='P'){
                Etat='A';
            }
        }
            
        
    }
