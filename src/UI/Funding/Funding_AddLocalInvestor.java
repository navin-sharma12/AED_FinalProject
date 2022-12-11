/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import Investor.Investor;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author richapatel
 */
public class Funding_AddLocalInvestor extends javax.swing.JPanel {

    /**
     * Creates new form Funding_AddLocalInvestor
     */
    public Funding_AddLocalInvestor(JPanel controlArea, JPanel workArea) {
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

        txtLastname = new javax.swing.JTextField();
        lblFunds = new java.awt.Label();
        lblContact = new java.awt.Label();
        lblEmail = new java.awt.Label();
        txtEmail = new javax.swing.JTextField();
        lblFirstname = new java.awt.Label();
        txtFunds = new javax.swing.JTextField();
        txtFirstname = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        lblLastname = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setLayout(null);

        txtLastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastnameActionPerformed(evt);
            }
        });
        add(txtLastname);
        txtLastname.setBounds(540, 130, 210, 20);

        lblFunds.setText("Funds");
        add(lblFunds);
        lblFunds.setBounds(430, 210, 110, 20);

        lblContact.setText("Contact No");
        add(lblContact);
        lblContact.setBounds(430, 260, 110, 20);

        lblEmail.setText("Email");
        add(lblEmail);
        lblEmail.setBounds(430, 170, 110, 20);

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        add(txtEmail);
        txtEmail.setBounds(540, 170, 210, 20);

        lblFirstname.setText("Firstname");
        add(lblFirstname);
        lblFirstname.setBounds(430, 90, 110, 20);

        txtFunds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFundsActionPerformed(evt);
            }
        });
        add(txtFunds);
        txtFunds.setBounds(540, 210, 210, 20);

        txtFirstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstnameActionPerformed(evt);
            }
        });
        add(txtFirstname);
        txtFirstname.setBounds(540, 90, 210, 20);

        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });
        add(txtContact);
        txtContact.setBounds(540, 260, 210, 20);

        lblLastname.setText("Lastname");
        add(lblLastname);
        lblLastname.setBounds(430, 130, 110, 20);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(540, 300, 100, 23);

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel1.setText("                                                           Local-Investor : Add");
        add(jLabel1);
        jLabel1.setBounds(10, 20, 750, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/richapatel/Desktop/local invst 1 add.jpeg")); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2);
        jLabel2.setBounds(0, 70, 410, 380);

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/richapatel/Desktop/main logo .jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        add(jLabel3);
        jLabel3.setBounds(560, 340, 210, 120);
    }// </editor-fold>//GEN-END:initComponents

    private void txtLastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastnameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFundsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFundsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFundsActionPerformed

    private void txtFirstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstnameActionPerformed

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (txtFirstname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "First name cannot be null.");
        } else if (txtLastname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last name cannot be null.");
        } else if (!getEmail(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Email address");
        } else if (!getContact(txtContact.getText())) {
            JOptionPane.showMessageDialog(this, "Invalid Contact No");
        } else if (txtFunds.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Funds cannot be null.");
        } else if (Pattern.matches("[a-zA-Z]+", txtFunds.getText())) {
            JOptionPane.showMessageDialog(this, "Age should be in digits.");
        } else{
            String firstname = txtFirstname.getText();
            String lastname = txtLastname.getText();
            String email = txtEmail.getText();
            long contact_no = Long.parseLong(txtContact.getText());
            int funds = Integer.parseInt(txtFunds.getText());
            String username = lastname.toLowerCase() + "." + firstname.toLowerCase();
            String password = lastname.toLowerCase() + "." + firstname.toLowerCase();
            try{
                Investor in = new Investor(firstname, lastname, email, password, username, 1, funds, contact_no);
                in.addLocalInvestors(in);
                JOptionPane.showMessageDialog(this, "Investor added");
//                sentEmail(email,username,password);
                txtFirstname.setText("");
                txtLastname.setText("");
                txtEmail.setText("");
                txtContact.setText("");
                txtFunds.setText("");
                
            }
            catch(SQLException e)
            {
               JOptionPane.showMessageDialog(this, e.getMessage());
            }
            
                   
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public boolean getContact(String no) {
        String regex = "^(\\+\\d{1,2}\\s)?\\(?\\d{3}\\)?[\\s.-]?\\d{3}[\\s.-]?\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(no);
        return matcher.matches();
    }

    public boolean getEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
     private void sentEmail(String email,String username, String password) {
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.ssl.host", "smtp.gmail.com");
          
            properties.put("mail.smtp.port", 587);
            Session session = Session.getDefaultInstance(properties,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("helpinghomeless.aed@gmail.com", "gygsgpsczxfzjvjj");

                }
            });
//            String content = "Welcome to" + university + ".\r\n Your email" + email + "and password" + password + "/r/n for the portal";
            System.out.println(session);
            Message message = new MimeMessage(session);
            message.setSubject("Welcome to");
            message.setContent("hi", "text/plain");
            message.setFrom(new InternetAddress("helpinghomeless.aed@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSentDate(new Date());

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email Sent");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label lblContact;
    private java.awt.Label lblEmail;
    private java.awt.Label lblFirstname;
    private java.awt.Label lblFunds;
    private java.awt.Label lblLastname;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstname;
    private javax.swing.JTextField txtFunds;
    private javax.swing.JTextField txtLastname;
    // End of variables declaration//GEN-END:variables
}
