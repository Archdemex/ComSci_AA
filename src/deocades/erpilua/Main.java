/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deocades.erpilua;

/**
 *
 * @author Rajah Joevil
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        Title = new javax.swing.JLabel();
        MakeReserv = new javax.swing.JButton();
        ViewReserv = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        CancelReserv = new javax.swing.JButton();
        GenerateReport = new javax.swing.JButton();
        CrabBoi = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Hermit's Home");
        getContentPane().add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        MakeReserv.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        MakeReserv.setText("Make a Reservation");
        MakeReserv.setToolTipText("");
        MakeReserv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(MakeReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 330, 50));

        ViewReserv.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        ViewReserv.setText("View Reservation");
        ViewReserv.setToolTipText("");
        ViewReserv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        ViewReserv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewReservActionPerformed(evt);
            }
        });
        getContentPane().add(ViewReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 330, 50));

        Exit.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        Exit.setText("Exit");
        Exit.setToolTipText("");
        Exit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 80, 20));

        CancelReserv.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        CancelReserv.setText("Cancel a Reservation");
        CancelReserv.setToolTipText("");
        CancelReserv.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        getContentPane().add(CancelReserv, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 330, 50));

        GenerateReport.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        GenerateReport.setText("Generate Report");
        GenerateReport.setToolTipText("");
        GenerateReport.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        GenerateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateReportActionPerformed(evt);
            }
        });
        getContentPane().add(GenerateReport, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, 330, 50));

        CrabBoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deocades/erpilua/Crab.png"))); // NOI18N
        getContentPane().add(CrabBoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 330, 150, 90));

        Background.setFont(new java.awt.Font("Poor Richard", 0, 12)); // NOI18N
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deocades/erpilua/MainBG.jpg"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewReservActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewReservActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ViewReservActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExitActionPerformed

    private void GenerateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GenerateReportActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton CancelReserv;
    private javax.swing.JLabel CrabBoi;
    private javax.swing.JButton Exit;
    private javax.swing.JButton GenerateReport;
    private javax.swing.JButton MakeReserv;
    private javax.swing.JLabel Title;
    private javax.swing.JButton ViewReserv;
    // End of variables declaration//GEN-END:variables
}
