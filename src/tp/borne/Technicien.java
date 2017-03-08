
package tp.borne;
import java.util.*;
public class Technicien {
    private int matricule;
    private String nom;
    private String prenom;
    private ArrayList<Visite> lesVisites;
    
    public Technicien(){
     Scanner lc = new Scanner(System.in);
     System.out.println("Inserez le matricule du Technicien");
     matricule = lc.nextInt();
     System.out.println("Inserez le Nom du Technicien");
     nom = lc.nextLine();
     System.out.println("Inserez le Prenom du Technicien");
     prenom = lc.nextLine();
}
    
    public int getTempsOccupe(){
        int compt=0;
        for(Visite UneVisite : lesVisites){
            compt+=UneVisite.getDuréeTotale();
        }
        return compt;
    }
    public void affecterVisite(Visite uneVisite){
        lesVisites.add(uneVisite);
    }
    
    public ArrayList<Visite> getLesVisites(){
        return lesVisites;
     }
}

