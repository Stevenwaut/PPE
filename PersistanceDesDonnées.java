package persistance.des.données;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PersistanceDesDonnées {
    
    private String nomUser;
    private String MDP;
    private String serveurBD;
    private String driverSGBD;
    private String url;
    
     public PersistanceDesDonnées() throws SQLException {
        this.nomUser = "root";
        this.MDP = "";
        this.serveurBD = "127.0.0.1";
        this.driverSGBD = "JBDC";
        url = "jdbc:mysql://localhost/xelfi";
        
         System.out.println("Connexion En Cour ..."); 
        java.sql.Connection conn = DriverManager.getConnection(this.url, this.nomUser, this.MDP);
        Statement stat = conn.createStatement();
         System.out.println("Connexion effective !");
         
        String Insert = ("INSERT INTO categorie VALUES('abc')");
         System.out.println(Insert);
	stat.executeUpdate(Insert);
        System.out.println("Insert Reussis !");
         
    }
     
     

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public void setMDP(String MDP) {
        this.MDP = MDP;
    }

    public void setServeurBD(String serveurBD) {
        this.serveurBD = serveurBD;
    }

    public void setDriverSGBD(String driverSGBD) {
        this.driverSGBD = driverSGBD;
    }

    public String getNomUser() {
        return nomUser;
    }

    public String getMDP() {
        return MDP;
    }

    public String getServeurBD() {
        return serveurBD;
    }

    public String getDriverSGBD() {
        return driverSGBD;
    }
    
}
