/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cuc.convertidor;

/**
 *
 * @author Acer
 */
public class Convertidor extends javax.swing.JFrame {

    /**
     * Creates new form Convertidor
     */
    public Convertidor() {
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

        txtRbc = new javax.swing.JTextField();
        txtRab = new javax.swing.JTextField();
        txtRac = new javax.swing.JTextField();
        txtRc = new javax.swing.JTextField();
        txtRa = new javax.swing.JTextField();
        txtRb = new javax.swing.JTextField();
        txtRbc1 = new javax.swing.JTextField();
        btnConvertirDeltaEstrella = new javax.swing.JButton();
        btnConvertirEstrellaDelta = new javax.swing.JButton();
        lblEstrella = new javax.swing.JLabel();
        lblDelta = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblDeltaAEstrella = new javax.swing.JLabel();
        lblEstrellaADelta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Convertidor Delta Estrella");
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(null);

        txtRbc.setDropMode(javax.swing.DropMode.INSERT);
        txtRbc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRbcActionPerformed(evt);
            }
        });
        getContentPane().add(txtRbc);
        txtRbc.setBounds(170, 180, 70, 45);

        txtRab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRabActionPerformed(evt);
            }
        });
        getContentPane().add(txtRab);
        txtRab.setBounds(110, 250, 70, 45);
        getContentPane().add(txtRac);
        txtRac.setBounds(60, 180, 70, 45);
        getContentPane().add(txtRc);
        txtRc.setBounds(430, 155, 70, 40);
        getContentPane().add(txtRa);
        txtRa.setBounds(370, 260, 70, 40);
        getContentPane().add(txtRb);
        txtRb.setBounds(490, 260, 70, 40);

        txtRbc1.setDropMode(javax.swing.DropMode.INSERT);
        txtRbc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRbc1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtRbc1);
        txtRbc1.setBounds(170, 180, 70, 45);

        btnConvertirDeltaEstrella.setText("Convertir");
        btnConvertirDeltaEstrella.setToolTipText("");
        getContentPane().add(btnConvertirDeltaEstrella);
        btnConvertirDeltaEstrella.setBounds(150, 400, 100, 23);

        btnConvertirEstrellaDelta.setText("Convertir");
        getContentPane().add(btnConvertirEstrellaDelta);
        btnConvertirEstrellaDelta.setBounds(330, 400, 100, 23);

        lblEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/convertidor/imagenes/imgEstrella.png"))); // NOI18N
        getContentPane().add(lblEstrella);
        lblEstrella.setBounds(350, 80, 226, 260);

        lblDelta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cuc/convertidor/imagenes/imgDelta.png"))); // NOI18N
        lblDelta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblDelta.setFocusable(false);
        getContentPane().add(lblDelta);
        lblDelta.setBounds(30, 80, 247, 246);
        lblDelta.getAccessibleContext().setAccessibleParent(txtRbc);

        jLabel1.setText("Rellena los espacios en blanco para declarar las resistencias ya sea de Delta o de Estrella.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 40, 440, 14);

        lblDeltaAEstrella.setText("Delta a Estrella");
        getContentPane().add(lblDeltaAEstrella);
        lblDeltaAEstrella.setBounds(160, 380, 80, 14);

        lblEstrellaADelta.setText("Estrella a Delta");
        getContentPane().add(lblEstrellaADelta);
        lblEstrellaADelta.setBounds(340, 380, 80, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRbcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRbcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRbcActionPerformed

    private void txtRabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRabActionPerformed

    private void txtRbc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRbc1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRbc1ActionPerformed

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
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConvertirDeltaEstrella;
    private javax.swing.JButton btnConvertirEstrellaDelta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblDeltaAEstrella;
    private javax.swing.JLabel lblEstrella;
    private javax.swing.JLabel lblEstrellaADelta;
    private javax.swing.JTextField txtRa;
    private javax.swing.JTextField txtRab;
    private javax.swing.JTextField txtRac;
    private javax.swing.JTextField txtRb;
    private javax.swing.JTextField txtRbc;
    private javax.swing.JTextField txtRbc1;
    private javax.swing.JTextField txtRc;
    // End of variables declaration//GEN-END:variables
}
