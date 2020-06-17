/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author rainamra
 */
public class salesInvoice extends javax.swing.JFrame {
    //To connect the project with the database
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String  databaseURL = "jdbc:mysql://localhost:3306/user_details?"
            + "zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC ";
    Statement stat = null;
    /**
     * Creates new form salesInvoice
     */
    public salesInvoice() {
        initComponents();
        DisplayTable();
    }
    
   //Display data in the JTable
   private void DisplayTable()
   {
       try 
       {
           Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(databaseURL, "root", "rain2904");
            String sql = "select * from invoice";
            pstmt = con.prepareStatement(sql);
            rs = pstmt.executeQuery();
            invoiceTable.setModel(DbUtils.resultSetToTableModel(rs));
            
       }
       
        catch(Exception e)
        {
            System.out.println(e);
        } 
            
   }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelsaleInvoice = new javax.swing.JPanel();
        invoiceLabel = new javax.swing.JLabel();
        backButton = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        invoiceTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelsaleInvoice.setBackground(new java.awt.Color(173, 211, 225));
        jPanelsaleInvoice.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 130, 69)));

        invoiceLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        invoiceLabel.setText("Sales Invoice");

        backButton.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        backButton.setLabel("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        invoiceTable.setFont(new java.awt.Font("Lucida Grande", 0, 13)); // NOI18N
        invoiceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order ID", "Name", "Address", "Phone Number", "Item", "Total"
            }
        ));
        jScrollPane3.setViewportView(invoiceTable);

        javax.swing.GroupLayout jPanelsaleInvoiceLayout = new javax.swing.GroupLayout(jPanelsaleInvoice);
        jPanelsaleInvoice.setLayout(jPanelsaleInvoiceLayout);
        jPanelsaleInvoiceLayout.setHorizontalGroup(
            jPanelsaleInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelsaleInvoiceLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(invoiceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanelsaleInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelsaleInvoiceLayout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanelsaleInvoiceLayout.setVerticalGroup(
            jPanelsaleInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelsaleInvoiceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelsaleInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invoiceLabel))
                .addContainerGap(381, Short.MAX_VALUE))
            .addGroup(jPanelsaleInvoiceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanelsaleInvoiceLayout.createSequentialGroup()
                    .addGap(41, 41, 41)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelsaleInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelsaleInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        //Back to the admin page
        dispose();
        AdminFirstPage switchForm = new AdminFirstPage();
        switchForm.setLocationRelativeTo(null);
        switchForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

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
            java.util.logging.Logger.getLogger(salesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(salesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(salesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(salesInvoice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new salesInvoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backButton;
    private javax.swing.JLabel invoiceLabel;
    private javax.swing.JTable invoiceTable;
    private javax.swing.JPanel jPanelsaleInvoice;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}