/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View_Participant;

/**
 *
 * @author Daniel
 */
public class Window_Participant extends javax.swing.JFrame {

    /**
     * Creates new form Window_Participant
     */
    public Window_Participant() {
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

        jButton1 = new javax.swing.JButton();
        btn_Iniciar_Subasta = new javax.swing.JButton();
        btn_Reiniciar_Subasta = new javax.swing.JButton();
        btn_Ofertar_Item = new javax.swing.JButton();
        btn_Listar_Subastas_Participante = new javax.swing.JButton();
        btn_Listar_Historial_Ofertas_Subasta_Participante = new javax.swing.JButton();
        btn_Historial_Subastas_Usuario_Participante = new javax.swing.JButton();
        btn_Historial_Ofertas_Ganadoras_Usuario_Participante = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_Iniciar_Subasta.setText("Iniciar Subasta");
        btn_Iniciar_Subasta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Iniciar_SubastaActionPerformed(evt);
            }
        });

        btn_Reiniciar_Subasta.setText("Reiniciar Subasta");

        btn_Ofertar_Item.setText("Ofertar por un item");
        btn_Ofertar_Item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ofertar_ItemActionPerformed(evt);
            }
        });

        btn_Listar_Subastas_Participante.setText("Listar Subastas");
        btn_Listar_Subastas_Participante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Listar_Subastas_ParticipanteActionPerformed(evt);
            }
        });

        btn_Listar_Historial_Ofertas_Subasta_Participante.setText("Historial Ofertas por Subasta");

        btn_Historial_Subastas_Usuario_Participante.setText("Historial Subastas por Usuario");

        btn_Historial_Ofertas_Ganadoras_Usuario_Participante.setText("Historial Ofertas Ganadoras de un Usuario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_Ofertar_Item, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Iniciar_Subasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Reiniciar_Subasta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Listar_Subastas_Participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Listar_Historial_Ofertas_Subasta_Participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Historial_Subastas_Usuario_Participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Historial_Ofertas_Ganadoras_Usuario_Participante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Iniciar_Subasta)
                .addGap(18, 18, 18)
                .addComponent(btn_Reiniciar_Subasta)
                .addGap(18, 18, 18)
                .addComponent(btn_Ofertar_Item)
                .addGap(18, 18, 18)
                .addComponent(btn_Listar_Subastas_Participante)
                .addGap(18, 18, 18)
                .addComponent(btn_Listar_Historial_Ofertas_Subasta_Participante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Historial_Subastas_Usuario_Participante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_Historial_Ofertas_Ganadoras_Usuario_Participante)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_Ofertar_ItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ofertar_ItemActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Window_Offer_Item Ventana_Ofertar_Item = new Window_Offer_Item();
        Ventana_Ofertar_Item.setVisible(true);
    }//GEN-LAST:event_btn_Ofertar_ItemActionPerformed

    private void btn_Iniciar_SubastaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Iniciar_SubastaActionPerformed
        // TODO add your handling code here:
        Window_New_Auction Ventana_Nueva_Subasta = new Window_New_Auction();
        this.dispose();
        Ventana_Nueva_Subasta.setVisible(true);
    }//GEN-LAST:event_btn_Iniciar_SubastaActionPerformed

    private void btn_Listar_Subastas_ParticipanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Listar_Subastas_ParticipanteActionPerformed
        // TODO add your handling code here:
        Window_Show_Auctions Venatana_Lista_Subastas = new Window_Show_Auctions();
        this.dispose();
        Venatana_Lista_Subastas.setVisible(true);
    }//GEN-LAST:event_btn_Listar_Subastas_ParticipanteActionPerformed

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
            java.util.logging.Logger.getLogger(Window_Participant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Window_Participant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Window_Participant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Window_Participant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Window_Participant().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Historial_Ofertas_Ganadoras_Usuario_Participante;
    private javax.swing.JButton btn_Historial_Subastas_Usuario_Participante;
    private javax.swing.JButton btn_Iniciar_Subasta;
    private javax.swing.JButton btn_Listar_Historial_Ofertas_Subasta_Participante;
    private javax.swing.JButton btn_Listar_Subastas_Participante;
    private javax.swing.JButton btn_Ofertar_Item;
    private javax.swing.JButton btn_Reiniciar_Subasta;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
