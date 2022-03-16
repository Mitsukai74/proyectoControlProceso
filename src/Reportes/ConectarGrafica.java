
package Reportes;

import Model.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class ConectarGrafica {
    Conexion cn = new Conexion();
    
    
     public void llamarReporte() throws SQLException{
         try {
             Connection conectar = cn.devuelveConex();
             JasperReport reporte = (JasperReport)JRLoader.loadObject("Graficos.jasper");
             JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null,conectar);
             JasperViewer.viewReport(jasperPrint);
             conectar.close();
             
         } catch (JRException ex) {
             Logger.getLogger(ConectarGrafica.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
    
}
