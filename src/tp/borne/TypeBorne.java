package tp.borne;
import java.util.*;

public class TypeBorne {
  private String codeTypeBorne;
  private int duréeRevision;
  private int nbJoursEntreRevisions;
  private int nbUnitésEntreRevisions;
  
  
  public TypeBorne(){
  Scanner lc = new Scanner(System.in);
  System.out.println("Inserez la durée de la Révision");
  duréeRevision = lc.nextInt();
  System.out.println("Inserez le nombre de jours entre Révisions");
  nbJoursEntreRevisions = lc.nextInt();
  System.out.println("Inserez le nombre d'unité");
  nbUnitésEntreRevisions = lc.nextInt();
  }
  
  
  public int getDuréeRevision() {
      return (duréeRevision);
  }
  public int getNbJoursEntreRévision(){
      return (nbJoursEntreRevisions);
  }
  public int getNbUnitésEntreRévisions(){
      return nbUnitésEntreRevisions;
  }
}
