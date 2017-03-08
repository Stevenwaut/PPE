
package tp.borne;

import java.util.ArrayList;


public class Test {
       public static void main (String[] args){
           ArrayList <Borne> lesBornesAVisiter = new ArrayList();
           
            //Creation des Techs et incrémentation dans une ArrayList
            Technicien Tech1 = new Technicien();
            Technicien Tech2 = new Technicien();
            ArrayList<Technicien> lesTechniciens = new ArrayList();
           
            //Test Creation Type Borne
            TypeBorne leType = new TypeBorne();  
            leType.getDuréeRevision();
            leType.getNbJoursEntreRévision();
            leType.getNbUnitésEntreRévisions();
           
            //Test Creation Borne
            Borne MaBorne = new Borne();
            MaBorne.getDuréeRévision();
            //Incrémentation de l'arrayList lesBornesAVisiter
            if(MaBorne.estAReviser()==true){
               lesBornesAVisiter.add(MaBorne);
            }
           
            // Test Creation Station (Pas nécesessaire de tester les Methodes Get/Set)
            Station maStation = new Station(1, "test");
            maStation.getVisisteAFaire();
            
            // Teste Creation Visite & Maintenance
            Visite maVisite = new Visite(lesBornesAVisiter ,maStation);
            // Teste Creation Maintenance
            Maintenance uneMaintenance = new Maintenance(maStation, maVisite,lesTechniciens);
            uneMaintenance.affecterVisite();
       }
}
