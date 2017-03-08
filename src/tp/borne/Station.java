package tp.borne;

import java.util.*;
import java.util.ArrayList;


public class Station {
    Scanner lc = new Scanner(System.in);
    private int idStation;
    private String libelleEmplacement;
        ArrayList<Borne> lesBornes = new ArrayList<Borne>();
    
    
    public Station(int id, String lib){
        this.idStation = id;
        this.libelleEmplacement=lib;
    }
    
    public int getId(){
        return idStation;
    }
   public String getLibelleEmplacement(){
        return libelleEmplacement;
    }
   public String setLibelleEmplacement(String lib){
       System.out.println("Modifiez les libellé de l'emplacement");
       libelleEmplacement=lc.nextLine();
       return libelleEmplacement;
   }
   
   public Visite getVisisteAFaire(){
       ArrayList<Borne> lesBornesAVisiter;
       Visite LaVisite;
       lesBornesAVisiter = new ArrayList <Borne>();
       for(Borne MaBorne : lesBornes){
       if(MaBorne.estAReviser()==true){
           lesBornesAVisiter.add(MaBorne); }
       else{
           System.out.println("Borne pas à revisé");
         }
       }
       return LaVisite;
   }
   }
   
