package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private  final String url="jdbc:mysql://localhost:3306/inicio_control";
         private final String usuario="root";
        private  final String clave="";
        private Connection conex = null;        
    
    public Connection devuelveConex() throws SQLException{          
        
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                conex=DriverManager.getConnection(url,usuario,clave);
                 if (conex != null)
                {
                    System.out.println("Conexión ok");
                }
                else
                {System.out.println("Conexión fallida");}
                
            } catch (SQLException  ex) {
                System.out.println(ex);
                          
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }     
            
            return conex;    
    }
    
}
