/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import java.awt.Dimension;
import javax.swing.JPanel;

/**
 *
 * @author richapatel
 */
public class Funding_Login extends javax.swing.JPanel {

    /**
     * Creates new form FundingLoginJPanel
     */
    public Funding_Login(JPanel controlArea, JPanel workArea) {
        initComponents();
         setPreferredSize(new Dimension(769, 515)); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jButtonLogin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setLayout(null);

        jLabelTitle.setBackground(new java.awt.Color(204, 204, 255));
        jLabelTitle.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 24)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Funding : Login");
        add(jLabelTitle);
        jLabelTitle.setBounds(183, 30, 540, 60);

        jLabelUsername.setBackground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelUsername.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsername.setText("Username:");
        add(jLabelUsername);
        jLabelUsername.setBounds(260, 130, 120, 20);

        jLabelPassword.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Password:");
        add(jLabelPassword);
        jLabelPassword.setBounds(260, 170, 120, 20);
        add(jTextFieldUsername);
        jTextFieldUsername.setBounds(380, 130, 216, 23);
        add(jPasswordFieldPassword);
        jPasswordFieldPassword.setBounds(380, 170, 216, 23);

        jButtonLogin.setFont(new java.awt.Font(".AppleSystemUIFont", 3, 14)); // NOI18N
        jButtonLogin.setForeground(new java.awt.Color(102, 102, 102));
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        add(jButtonLogin);
        jButtonLogin.setBounds(392, 250, 80, 23);

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Department:");
        add(jLabel1);
        jLabel1.setBounds(260, 210, 120, 20);

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Local Investor", "Government Organization" }));
        add(jComboBoxDepartment);
        jComboBoxDepartment.setBounds(380, 210, 216, 23);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/richapatel/Desktop/inv 2.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(2, -3, 760, 510);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables
}
