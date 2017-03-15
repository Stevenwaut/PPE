package Forme;
public class FaireDesFormesGeometrique {
    public static void main(String[] args) {
        ListeFormes Liste= new ListeFormes();
        
        
        Rectange Rec = new Rectange(); 
        Triangle Tri = new Triangle(); 
        Cercle Cer = new Cercle(); 
        Rec.Afficher();
        Tri.Afficher();
        Cer.Afficher();
        
        Rec.Deplacer(10, 20);
        Cer.Deplacer(10, 20);
        
        Rec.calculer();
        Liste.AjouterUneForme(Cer);
        Liste.AjouterUneForme(Rec);
        Liste.AjouterUneForme(Tri);
        Liste.afficherLesFormes();
        
        
        
    }
   
}
