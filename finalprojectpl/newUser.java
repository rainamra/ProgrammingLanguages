/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpl;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author rainamra
 */
public class newUser extends javax.swing.JFrame implements otherMethods {
    //To connect the project with the database
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String  databaseURL = "jdbc:mysql://localhost:3306/user_details?"
            + "zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC ";
    Statement stat = null;
    
    /**
     * Creates new form newUser
     */
    public newUser() {
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

        jPanel1 = new javax.swing.JPanel();
        phoneNumberLabel = new javax.swing.JLabel();
        firstnameTF = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        registUserButton = new javax.swing.JButton();
        newUserLabel = new javax.swing.JLabel();
        lastnameTF = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();
        lastnameLabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        passLabel = new javax.swing.JLabel();
        passPF = new javax.swing.JPasswordField();
        usernameTF = new javax.swing.JTextField();
        backButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(173, 211, 225));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 130, 69)));

        phoneNumberLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        phoneNumberLabel.setText("Phone nuber:");

        firstnameTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N
        firstnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTFActionPerformed(evt);
            }
        });

        usernameLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        usernameLabel.setText("Username:");

        registUserButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        registUserButton.setText("Register");
        registUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registUserButtonActionPerformed(evt);
            }
        });

        newUserLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        newUserLabel.setText("New User Register");

        lastnameTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N

        emailLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        emailLabel.setText("Email Id:");

        firstnameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        firstnameLabel.setText("Firstname:");

        resetButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        lastnameLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lastnameLabel.setText("Lastname:");

        emailTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });

        phoneTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N
        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });

        passLabel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        passLabel.setText("Password:");

        passPF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N

        usernameTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        backButton.setLabel("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(278, Short.MAX_VALUE)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(newUserLabel)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lastnameLabel)
                                .addComponent(firstnameLabel)
                                .addComponent(emailLabel)
                                .addComponent(firstnameTF)
                                .addComponent(lastnameTF)
                                .addComponent(emailTF)
                                .addComponent(registUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passLabel)
                                    .addComponent(phoneNumberLabel)
                                    .addComponent(usernameLabel)
                                    .addComponent(phoneTF)
                                    .addComponent(passPF)
                                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(newUserLabel)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(firstnameLabel)
                        .addComponent(phoneNumberLabel))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lastnameLabel)
                                .addComponent(usernameLabel)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(firstnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lastnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(6, 6, 6)
                            .addComponent(emailLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(3, 3, 3)
                            .addComponent(passLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(passPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(registUserButton)
                        .addComponent(resetButton))
                    .addContainerGap(28, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Overriding codes
    @Override
    public void infoMessage(String message, String tittle)
    {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void clearFieldValue() {
        firstnameTF.setText(null);
        lastnameTF.setText(null);
        passPF.setText(null);
        phoneTF.setText(null);
        usernameTF.setText(null);
        emailTF.setText(null);
    }
    
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearFieldValue();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
    }//GEN-LAST:event_phoneTFActionPerformed

    private void registUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registUserButtonActionPerformed
        
        String firstname = firstnameTF.getText();
        String lastname = lastnameTF.getText();
        String email = emailTF.getText();
        String username = usernameTF.getText();
        String password = passPF.getText();
        String phoneNumber = phoneTF.getText();
        
        //Check if the user has registered
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(databaseURL, "root", "rain2904");
            stat = con.createStatement();
            String selectQuery = "SELECT count(*) from user where "
                    + "username='"+username+"' and password='"+password+"'";
            System.out.println(selectQuery);
            rs = stat.executeQuery(selectQuery);
            System.out.println(rs.next());
            if(rs.next()==true)
            {
                infoMessage("User already registered", "Alert!");

            }
            //This code will insert new user information into the database
            else
            {
                String insertQuery = "INSERT into user values('"+username+"',"
                    + "'"+email+"', '"+password+"', '"+firstname+"', '"+lastname+"', "
                    + "'"+phoneNumber+"')";
                stat.executeUpdate(insertQuery);
                infoMessage("Successefully register a new user", "Congratulations!");
                clearFieldValue();
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        } 
    }//GEN-LAST:event_registUserButtonActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
    }//GEN-LAST:event_emailTFActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        AdminFirstPage switchForm = new AdminFirstPage();
        switchForm.setLocationRelativeTo(null);
        switchForm.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void firstnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTFActionPerformed
        
    }//GEN-LAST:event_firstnameTFActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
    }//GEN-LAST:event_usernameTFActionPerformed

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
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameTF;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTF;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passPF;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JButton registUserButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

}
