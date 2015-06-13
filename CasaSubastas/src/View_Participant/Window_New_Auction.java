/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Participant;

import conexion.conectate;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Daniel
 */
public class Window_New_Auction extends javax.swing.JFrame {

    conectate con = new conectate();
    CallableStatement cst;
    ResultSet r;
    Statement setencia;
    
    public Window_New_Auction() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        TextField_NombreSubasta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextField_DescripcionSubasta = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TextField_MontoSubasta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TextField_IDUsuario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TextField_NombreArticulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TextField_FotoItem = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TextField_CategoriaArticulo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TextField_SubArticulo = new javax.swing.JTextField();
        btn_Aceptar_Subasta = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre de la Subasta:");

        jLabel2.setText("Descripcion de la Subasta:");

        jLabel3.setText("Monto:");

        jLabel4.setText("ID usuario:");

        jLabel5.setText("Nombre del Articulo:");

        jLabel6.setText("Foto del item:");

        jLabel7.setText("Categoria:");

        jLabel8.setText("Subcategoria:");

        btn_Aceptar_Subasta.setText("Aceptar");
        btn_Aceptar_Subasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Aceptar_SubastaActionPerformed(evt);
            }
        });

        btn_Limpiar.setText("Limpiar");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Regresar.setText("Regresar");
        btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(32, 32, 32)
                        .addComponent(TextField_NombreSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btn_Aceptar_Subasta)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Limpiar)
                            .addComponent(TextField_DescripcionSubasta)
                            .addComponent(TextField_MontoSubasta)
                            .addComponent(TextField_IDUsuario)
                            .addComponent(TextField_NombreArticulo)
                            .addComponent(TextField_FotoItem)
                            .addComponent(TextField_CategoriaArticulo)
                            .addComponent(TextField_SubArticulo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Regresar)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_NombreSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextField_DescripcionSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TextField_MontoSubasta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TextField_IDUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextField_NombreArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TextField_FotoItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(TextField_CategoriaArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TextField_SubArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Aceptar_Subasta)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_Regresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Aceptar_SubastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Aceptar_SubastaActionPerformed
        // TODO add your handling code here:
        if (this.TextField_NombreSubasta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL NOMBRE DE LA SUBASTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_NombreSubasta.requestFocus();
        } else if (this.TextField_DescripcionSubasta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR LA DESCRIPCION DE LA SUBASTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_DescripcionSubasta.requestFocus();
        } else if (this.TextField_MontoSubasta.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL MONTO DE LA SUBASTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_MontoSubasta.requestFocus(); 
        } else if (this.TextField_IDUsuario.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL ID DEL USUARIO QUE DESEA INICIAR LA SUBASTA", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_IDUsuario.requestFocus();
        } else if (this.TextField_NombreArticulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL NOMBRE DEL ARTICULO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_NombreArticulo.requestFocus();
        /*} else if (this.TextField_FotoItem.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR EL URL DE LA FOTO DEL ARTICULO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_FotoItem.requestFocus();*/
        } else if (this.TextField_SubArticulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR LA SUBCATEGORIA DEL ARTICULO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_SubArticulo.requestFocus();
        } else if (this.TextField_CategoriaArticulo.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "FALTA ESCRIBIR LA CATEGORIA DEL ARTICULO", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            this.TextField_CategoriaArticulo.requestFocus(); 
        } else {
            try {
                int k = JOptionPane.showConfirmDialog(null, "DESEA GUARDAR LOS DATOS DEL USUARIO?", "PREGUNTA", JOptionPane.YES_NO_OPTION);
                if (k == JOptionPane.YES_OPTION) {
                    try (
                        PreparedStatement pstm = con.Conectar().prepareStatement("{call participante_subastarItem (?,?,?,?,?,?,?,?)}")) {
                        pstm.setString(1, TextField_NombreSubasta.getText());
                        pstm.setString(2, TextField_DescripcionSubasta.getText());
                        pstm.setString(3, TextField_MontoSubasta.getText());
                        pstm.setString(4, TextField_IDUsuario.getText());
                        pstm.setString(5, TextField_NombreArticulo.getText());
                        Object image = (this.TextField_FotoItem.getText().equals("") ? null : this.TextField_FotoItem.getText());
                        pstm.setObject(6, image);
                        pstm.setString(7, TextField_SubArticulo.getText());
                        pstm.setString(8, TextField_CategoriaArticulo.getText());
                        //convertirlo a binarios
                        ResultSet r = pstm.executeQuery();
                        //pstm.executeUpdate();
                        System.out.println();
                        String respuesta = "";
                        while (r.next()) {
                            respuesta = r.getString(1).toString();
                        }
                        JOptionPane.showMessageDialog(null, respuesta, "CONFIRMACION", JOptionPane.WARNING_MESSAGE);

                    }
                    }
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR AL RESGISTRAR", "ERROR", JOptionPane.WARNING_MESSAGE);
                     System.out.println("Error Message: " + e.getSQLState());
                     System.out.println("SQLStateCode: "  + e.getMessage());
                     System.out.println("ErrorCode: "     + e.getErrorCode());
                }
            }
            
    }//GEN-LAST:event_btn_Aceptar_SubastaActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        // TODO add your handling code here:
        TextField_CategoriaArticulo.setText(null);
        TextField_DescripcionSubasta.setText(null);
        TextField_FotoItem.setText(null);
        TextField_IDUsuario.setText(null);
        TextField_MontoSubasta.setText(null);
        TextField_NombreArticulo.setText(null);
        TextField_NombreSubasta.setText(null);
        TextField_SubArticulo.setText(null);
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegresarActionPerformed
        // TODO add your handling code here:
        Window_Participant Ventana_Participante = new Window_Participant();
        this.dispose();
        Ventana_Participante.setVisible(true);
    }//GEN-LAST:event_btn_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(Window_New_Auction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_New_Auction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_New_Auction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_New_Auction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_New_Auction().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextField_CategoriaArticulo;
    private javax.swing.JTextField TextField_DescripcionSubasta;
    private javax.swing.JTextField TextField_FotoItem;
    private javax.swing.JTextField TextField_IDUsuario;
    private javax.swing.JTextField TextField_MontoSubasta;
    private javax.swing.JTextField TextField_NombreArticulo;
    private javax.swing.JTextField TextField_NombreSubasta;
    private javax.swing.JTextField TextField_SubArticulo;
    private javax.swing.JButton btn_Aceptar_Subasta;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
