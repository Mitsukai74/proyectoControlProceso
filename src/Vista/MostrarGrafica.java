
package Vista;

import Model.Conexion;
import Reportes.ConectarGrafica;
import java.awt.BorderLayout;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JRViewer;

public class MostrarGrafica extends javax.swing.JFrame {
    Conexion cn=new Conexion();
    PreparedStatement pst;
    //Connection cn;
    public MostrarGrafica() {
        initComponents();
        consultarProducto();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanelCont_grafico = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxProducto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Gráfico de producción");

        jPanelCont_grafico.setBackground(new java.awt.Color(204, 255, 255));
        jPanelCont_grafico.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanelCont_graficoLayout = new javax.swing.GroupLayout(jPanelCont_grafico);
        jPanelCont_grafico.setLayout(jPanelCont_graficoLayout);
        jPanelCont_graficoLayout.setHorizontalGroup(
            jPanelCont_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 636, Short.MAX_VALUE)
        );
        jPanelCont_graficoLayout.setVerticalGroup(
            jPanelCont_graficoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Escoja el producto");

        jComboBoxProducto.setBackground(new java.awt.Color(255, 255, 51));
        jComboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxProductoActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Graficar");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanelCont_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(249, 249, 249)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelCont_grafico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxProductoActionPerformed
        

    }//GEN-LAST:event_jComboBoxProductoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String producto;
        producto=jComboBoxProducto.getSelectedItem().toString();
        cargar_Graf();
             
              
    }//GEN-LAST:event_jButton1ActionPerformed
    public void cargar_Graf()
    {
        HashMap a= new HashMap();
        a.put("producto", jComboBoxProducto.getSelectedItem().toString());
        
        jPanelCont_grafico.removeAll();
        jPanelCont_grafico.repaint();
        jPanelCont_grafico.revalidate();
        
        try {
            JasperDesign jasDiseno=JRXmlLoader.load("C:\\Users\\LENOVO\\Desktop\\ExcerJava\\ControlProcesoV2\\src\\Reportes\\Graficos.jasper");
            JasperReport jasReporte=JasperCompileManager.compileReport(jasDiseno);
            JasperPrint jasPrint=JasperFillManager.fillReport(jasReporte,a, cn.devuelveConex());
            JRViewer ver=new JRViewer(jasPrint);
            
            jPanelCont_grafico.setLayout(new BorderLayout());
            jPanelCont_grafico.add(ver);
        } catch (JRException ex) {
            Logger.getLogger(MostrarGrafica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MostrarGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    public void consultarProducto()
    {
        try {
            PreparedStatement consulta = cn.devuelveConex().prepareStatement("SELECT * FROM control ORDER BY producto ASC");            
            jComboBoxProducto.addItem("Seleccione una opción");
            ResultSet resultado = consulta.executeQuery();
            
            while (resultado.next()) {

                jComboBoxProducto.addItem(resultado.getString("producto"));
            } 
            cn.devuelveConex().close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MostrarGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MostrarGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MostrarGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MostrarGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBoxProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanelCont_grafico;
    // End of variables declaration//GEN-END:variables
}
