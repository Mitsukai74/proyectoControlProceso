
package Vista;

import Model.Conexion;
import Princ.Form_principal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class Ini extends javax.swing.JFrame {
    Form_principal cargar=new Form_principal();
    Conexion cn=new Conexion();
    /**
     * Creates new form Ini
     */
    public Ini() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargar.consultar_nombre(CboxOperarios);
        cargar.consultar_op(cBox_ordenes);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle1 = new javax.swing.JLabel();
        jLabelSubtitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        CboxOperarios = new javax.swing.JComboBox<>();
        cBox_ordenes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldarticulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCiclo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCav = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxTurno = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldProd = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        jButtonGraficar = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle1.setFont(new java.awt.Font("Verdana", 1, 28)); // NOI18N
        jLabelTitle1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle1.setText("Control de proceso ECSI planta4");
        getContentPane().add(jLabelTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 540, 30));

        jLabelSubtitulo.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabelSubtitulo.setForeground(new java.awt.Color(255, 255, 0));
        jLabelSubtitulo.setText("Ingrese la fecha y escoja su nombre");
        getContentPane().add(jLabelSubtitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 90, 90, 20));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Articulo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 80, 20));

        getContentPane().add(CboxOperarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 320, 30));

        cBox_ordenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBox_ordenesActionPerformed(evt);
            }
        });
        getContentPane().add(cBox_ordenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 30));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fecha");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 20));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cavidades");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 110, 20));
        getContentPane().add(jTextFieldarticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 330, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Orden");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 80, 20));
        getContentPane().add(jTextFieldCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 90, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Producción");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 130, 20));
        getContentPane().add(jTextFieldCav, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 90, 30));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ciclo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 80, 20));

        jComboBoxTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        getContentPane().add(jComboBoxTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 300, 100, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Turno");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 80, 20));
        getContentPane().add(jTextFieldProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 100, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 130, 40));

        jButtonLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 130, 40));

        jButtonGraficar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonGraficar.setText("Graficar");
        jButtonGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGraficarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonGraficar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, 130, 40));
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBox_ordenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBox_ordenesActionPerformed
        String orden=cBox_ordenes.getSelectedItem().toString();
        try {
             PreparedStatement consulta = cn.devuelveConex().prepareStatement("SELECT * FROM ordenes where op = ? ");
             consulta.setString(1, orden);
             ResultSet resultado = consulta.executeQuery();
                  if (resultado.next()){
                      jTextFieldarticulo.setText(resultado.getString("producto"));                      
                  }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.toString());
        }
    }//GEN-LAST:event_cBox_ordenesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SimpleDateFormat formatofecha=new SimpleDateFormat("yyyy-MM-dd");
        String pasofecha = (formatofecha.format(jDateChooser1.getDate()));
        try {
            PreparedStatement pps=cn.devuelveConex().prepareStatement("INSERT INTO control(fecha,nombre,orden,producto,turno,ciclo,cavidades,produccion)"+
                    "VALUES(?,?,?,?,?,?,?,?)");
            pps.setString(1, pasofecha);
            pps.setString(2,CboxOperarios.getSelectedItem().toString());
            pps.setInt(3,cBox_ordenes.getSelectedIndex());
            pps.setString(4,jTextFieldarticulo.getText());
            pps.setInt(5, jComboBoxTurno.getItemCount());
            pps.setDouble(6,Double.parseDouble(jTextFieldCiclo.getText()));
            pps.setDouble(7,Double.parseDouble(jTextFieldCav.getText()));
            pps.setInt(8, Integer.parseInt(jTextFieldProd.getText()));
            
            
            int m=pps.executeUpdate();
            if (m==1){
                JOptionPane.showMessageDialog(null, "Registro enviado");
                
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Algo paso");
            }
            
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGraficarActionPerformed
        MostrarGrafica open=new MostrarGrafica();
        open.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonGraficarActionPerformed
    public void limpiar()
    {
                jDateChooser1.setDate(null);
                CboxOperarios.setSelectedIndex(0);
                jTextFieldCiclo.setText(null);
                jTextFieldCav.setText(null);
                jTextFieldProd.setText(null);
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
            java.util.logging.Logger.getLogger(Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ini.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ini().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CboxOperarios;
    private javax.swing.JComboBox<String> cBox_ordenes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGraficar;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JComboBox<String> jComboBoxTurno;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelSubtitulo;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JTextField jTextFieldCav;
    private javax.swing.JTextField jTextFieldCiclo;
    private javax.swing.JTextField jTextFieldProd;
    private javax.swing.JTextField jTextFieldarticulo;
    // End of variables declaration//GEN-END:variables
}
