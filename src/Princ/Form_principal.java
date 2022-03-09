
package Princ;

import Model.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Form_principal {
    Conexion con=new Conexion();
    
    public static void main(String[] args) throws SQLException{
       
    }
    public void consultar_nombre(JComboBox CboxOperarios){
        //Creamos objeto tipo Connection    
        java.sql.Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;

//Creamos la Consulta SQL
        String SSQL = "SELECT * FROM personal ORDER BY nombre ASC";
//Establecemos bloque try-catch-finally
        try {

            //Establecemos conexión con la BD 
            conectar = con.devuelveConex();
            //Preparamos la consulta SQL
            pst = conectar.prepareStatement(SSQL);
            //Ejecutamos la consulta
            result = pst.executeQuery();

            //LLenamos nuestro ComboBox
            CboxOperarios.addItem("Seleccione una opción");

            while (result.next()) {

                CboxOperarios.addItem(result.getString("nombre"));
            }

        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);

        } finally {

            if (conectar != null) {

                try {
                    conectar.close();
                    result.close();                   
                    conectar = null;
                    result = null;
                    System.out.println("conexion cerrada");

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);
                }
            }
        }
    }
    
    public void consultar_op(JComboBox cBox_ordenes){
        java.sql.Connection conectar = null;
        PreparedStatement pst = null;
        ResultSet result = null;
        
         String SSQL = "SELECT * FROM ordenes ORDER BY op ASC";
        try {
            conectar = con.devuelveConex();
            pst = conectar.prepareStatement(SSQL);
            result = pst.executeQuery();
            cBox_ordenes.addItem("Seleccione una opción");
            while (result.next()) {

                cBox_ordenes.addItem(result.getString("op"));
            }            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        finally {
            if (conectar != null) {
                try {
                    conectar.close();
                    result.close();
                    conectar = null;
                    result = null;
                    System.out.println("conexion cerrada");

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, ex);

                }
            }
        }       
    }
    
}
