
package tp.borne;

import java.util.ArrayList;


public class Maintenance {
    public int id;
    public String lib;
    Station lesStations;
    Visite lesVisites;
    Technicien TechRetenu;
    ArrayList<Technicien> lesTechniciens = new ArrayList();
    
    //Constructeur avec pour Argument les Objets crée en Test
    public Maintenance(Station lesStations, Visite lesVisites, ArrayList<Technicien> lesTechniciens){
        this.lesStations = lesStations;
        this.lesVisites = lesVisites;
        this.lesTechniciens=lesTechniciens;
    }
    
    public void reviser(){
        lesStations.getVisisteAFaire();
    }
    public void affecterVisite(){
        //Temps Maximal d'heure possible dans la journée en Minute
        int tempsOccup = 420;
        //Comparaison des temps de Travail des Techs, celui étant le plus disponible sera envoyé
        for(Technicien LesTechs : lesTechniciens){
            tempsOccup=LesTechs.getTempsOccupe();
            if(LesTechs.getTempsOccupe()<tempsOccup){
                tempsOccup=LesTechs.getTempsOccupe();
               TechRetenu=LesTechs; 
            }
        }
        //Affecte la visite au Technicien le moins occupé
        TechRetenu.affecterVisite(lesVisites);
        lesVisites.ChangerEtat();
       
    }
    
}


