package Forme;
import java.util.*;
public class ListeFormes {
    
    private ArrayList<Forme>listeformes;
    
    public ListeFormes(){
        listeformes=new ArrayList<Forme>();
        
    }
    public void afficherLesFormes(){
        if(listeformes.isEmpty()){
            System.out.println("Il n'y à pas de forme dans la liste");
        }
        else{
            for(Forme uneForme: listeformes){
                uneForme.Afficher();
            }
        }
    }
    protected void AjouterUneForme(Forme UneForme){
        listeformes.add(UneForme);
    }
    public void CalculeForme(){
        
    }
}
