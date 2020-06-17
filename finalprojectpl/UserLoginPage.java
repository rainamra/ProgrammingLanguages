/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalprojectpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author rainamra
 */
public class UserLoginPage extends javax.swing.JFrame implements otherMethods {
    //To connect the project with the database
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    String  databaseURL = "jdbc:mysql://localhost:3306/user_details?"
            + "zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC ";
    Statement stat = null;
    /**
     * Creates new form UserLoginPage
     */
    public UserLoginPage() {
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

        jPanelUserLogin = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        userLoginLabel = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        userPassPF = new javax.swing.JPasswordField();
        backButton = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUserLogin.setBackground(new java.awt.Color(173, 211, 225));
        jPanelUserLogin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(238, 130, 69)));

        loginButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        loginButton.setText("Login");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        userLoginLabel.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        userLoginLabel.setText("User Login");

        usernameLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        usernameLabel.setText("Username:");

        passLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        passLabel.setText("Password:");

        usernameTF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        userPassPF.setFont(new java.awt.Font("Telugu MN", 0, 12)); // NOI18N

        backButton.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        backButton.setLabel("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelUserLoginLayout = new javax.swing.GroupLayout(jPanelUserLogin);
        jPanelUserLogin.setLayout(jPanelUserLoginLayout);
        jPanelUserLoginLayout.setHorizontalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel)
                    .addComponent(usernameLabel)
                    .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(userPassPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                        .addComponent(userLoginLabel)
                        .addGap(127, 127, 127)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelUserLoginLayout.setVerticalGroup(
            jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUserLoginLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userLoginLabel)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userPassPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelUserLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(resetButton))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelUserLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Overriding Codes
    @Override
    public void infoMessage(String message, String tittle)
    {
        JOptionPane.showMessageDialog(null, message, tittle, JOptionPane.INFORMATION_MESSAGE);
    }
    
    @Override
    public void clearFieldValue() {
        usernameTF.setText(null);
        userPassPF.setText(null);
    }
    
    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
    }//GEN-LAST:event_usernameTFActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        
        String username = usernameTF.getText();
        String password = userPassPF.getText();
        
        //Check is the user registered
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(databaseURL, "root", "rain2904");
            String selectQuery = "select * from user where username= '"+username+"' "
                    + "and password= '"+password+"'";
            stat = con.createStatement();
            rs = stat.executeQuery(selectQuery);
            if(rs.next())
            {
                dispose();
                UserFirstPage uop = new UserFirstPage();
                uop.setLocationRelativeTo(null);
                uop.setVisible(true);
            }
            else
            {
                infoMessage("User not registered, please try again.", "Go Back!");              
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }    
    }//GEN-LAST:event_loginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        dispose();
        WelcomePage backToWelcomeP = new WelcomePage();
        backToWelcomeP.setLocationRelativeTo(null);
        backToWelcomeP.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        clearFieldValue();
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button backButton;
    private javax.swing.JPanel jPanelUserLogin;
    private javax.swing.JButton loginButton;
    private javax.swing.JLabel passLabel;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel userLoginLabel;
    private javax.swing.JPasswordField userPassPF;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables

}