/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deocades.erpilua;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Rajah Joevil
 */
public class MakeReservation extends javax.swing.JFrame {

    /**
     * Creates new form MakeReservation
     */
    public MakeReservation() {
        initComponents();
        NameIn.setBackground(new java.awt.Color(0, 0, 0, 1));
        NumIn.setBackground(new java.awt.Color(0, 0, 0, 1));
        DateIn.setBackground(new java.awt.Color(0, 0, 0, 1));
        AdultIn.setBackground(new java.awt.Color(0, 0, 0, 1));
        ChildIn.setBackground(new java.awt.Color(0, 0, 0, 1));
        Confirm.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        CName = new javax.swing.JLabel();
        Children = new javax.swing.JLabel();
        CNum = new javax.swing.JLabel();
        Adults = new javax.swing.JLabel();
        NameIn = new javax.swing.JTextField();
        DateIn = new javax.swing.JTextField();
        ChildIn = new javax.swing.JTextField();
        NumIn = new javax.swing.JTextField();
        AdultIn = new javax.swing.JTextField();
        Confirm = new javax.swing.JButton();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Title.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Make Reservation");
        jPanel1.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        Date.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("Date (mm/dd/yyyy):");
        jPanel1.add(Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 230, -1));

        CName.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        CName.setForeground(new java.awt.Color(255, 255, 255));
        CName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CName.setText("Customer Name:");
        jPanel1.add(CName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, -1));

        Children.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        Children.setForeground(new java.awt.Color(255, 255, 255));
        Children.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Children.setText("Children:");
        jPanel1.add(Children, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 230, -1));

        CNum.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        CNum.setForeground(new java.awt.Color(255, 255, 255));
        CNum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CNum.setText("Contact Number:");
        jPanel1.add(CNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, -1));

        Adults.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        Adults.setForeground(new java.awt.Color(255, 255, 255));
        Adults.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Adults.setText("Adults:");
        jPanel1.add(Adults, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 230, -1));

        NameIn.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        NameIn.setForeground(new java.awt.Color(255, 255, 255));
        NameIn.setBorder(null);
        NameIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameInActionPerformed(evt);
            }
        });
        jPanel1.add(NameIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 460, 30));

        DateIn.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        DateIn.setForeground(new java.awt.Color(255, 255, 255));
        DateIn.setBorder(null);
        jPanel1.add(DateIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 460, 30));

        ChildIn.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        ChildIn.setForeground(new java.awt.Color(255, 255, 255));
        ChildIn.setBorder(null);
        ChildIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChildInActionPerformed(evt);
            }
        });
        jPanel1.add(ChildIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 460, 30));

        NumIn.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        NumIn.setForeground(new java.awt.Color(255, 255, 255));
        NumIn.setBorder(null);
        jPanel1.add(NumIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 460, 30));

        AdultIn.setFont(new java.awt.Font("Poor Richard", 0, 24)); // NOI18N
        AdultIn.setForeground(new java.awt.Color(255, 255, 255));
        AdultIn.setBorder(null);
        AdultIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdultInActionPerformed(evt);
            }
        });
        jPanel1.add(AdultIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 460, 30));

        Confirm.setFont(new java.awt.Font("Poor Richard", 0, 36)); // NOI18N
        Confirm.setForeground(new java.awt.Color(255, 255, 255));
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });
        jPanel1.add(Confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 200, 60));

        BackGround.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deocades/erpilua/MReserve.jpeg"))); // NOI18N
        jPanel1.add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 390));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ChildInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChildInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChildInActionPerformed

    private void NameInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameInActionPerformed

    private void AdultInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdultInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdultInActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        // TODO add your handling code here:int confirm
        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure the information is correct?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (confirm == 0) {
            String Name = NameIn.getText(), Number = NumIn.getText(), Date = DateIn.getText(), 
                    Adults = AdultIn.getText(),Children = ChildIn.getText();
            int Child = Integer.parseInt(Children), BiggerChild = Integer.parseInt(Adults), CProfit, AProfit, TotalProfit = 0;
            CProfit = Child * 300; AProfit = BiggerChild * 500;
            TotalProfit = TotalProfit + CProfit + AProfit;
            
            try {
                FileWriter FW = new FileWriter("LogBook.txt",true);
                FileWriter FWL = new FileWriter("LogList.txt",true);
                PrintWriter PW = new PrintWriter(FW);
                PrintWriter PWL = new PrintWriter(FWL);

                PWL.println(Name + "      " + Number + "     " + Date + "     " + Adults + "                  " + Children);
                PW.println("Name: " + Name);
                PW.println("Number: " + Number);
                PW.println("Date: " + Date);
                PW.println("Number of Adults: " + Adults);
                PW.println("Number of Children: " + Children);
                PW.println();
                
                PWL.close();
                PW.close();
            } catch (IOException e) {
                System.out.print("Error");
            }
            Main BackWin = new Main();
            ExecutiveReport send = new ExecutiveReport();
            send.hidden.setText(String.valueOf(TotalProfit));
            BackWin.Hide.setText(String.valueOf(TotalProfit));
            BackWin.show();
            dispose();
        }
    }//GEN-LAST:event_ConfirmActionPerformed

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
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MakeReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MakeReservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AdultIn;
    private javax.swing.JLabel Adults;
    private javax.swing.JLabel BackGround;
    private javax.swing.JLabel CName;
    private javax.swing.JLabel CNum;
    private javax.swing.JTextField ChildIn;
    private javax.swing.JLabel Children;
    private javax.swing.JButton Confirm;
    private javax.swing.JLabel Date;
    private javax.swing.JTextField DateIn;
    private javax.swing.JTextField NameIn;
    private javax.swing.JTextField NumIn;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
