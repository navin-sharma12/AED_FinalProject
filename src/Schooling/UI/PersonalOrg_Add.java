/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.Courses;
import Schooling.Model.FieldOfInterest;
import Schooling.Model.PersonalOrganization;
import UI.ControlAreaJPanel;
import java.awt.CardLayout;
import java.sql.ResultSet;
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
 * @author navinsharma
 */
public class PersonalOrg_Add extends javax.swing.JPanel {

    /**
     * Creates new form PersonalOrg_Add
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSet, resultSet1, resultSet2, resultSet3, resultSet4;
    FieldOfInterest foi = new FieldOfInterest();
    public PersonalOrg_Add(JPanel controlArea, JPanel workArea) 
    {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        jComboBoxCategory.removeAllItems();
        jComboBoxCourse.removeAllItems();
        
        resultSet2 = foi.getallFieldOfInterest();
        try 
        {
            while(resultSet2.next())
            {
                jComboBoxCategory.addItem(resultSet2.getString(2));
            }
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(PersonalOrg_Admin_Add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private boolean isInteger(String a)
    {
        try{
            Integer.parseInt(a);
            return true;
        }
        catch(Exception e){
            return false;
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

        jComboBoxCategory = new javax.swing.JComboBox<>();
        jLabelCategory = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldZoomLink = new javax.swing.JTextField();
        jLabelTitle = new javax.swing.JLabel();
        jLabelZoomLink = new javax.swing.JLabel();
        jTextFieldEmailID = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jComboBoxCourse = new javax.swing.JComboBox<>();
        jLabelCourse = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextFieldSeats = new javax.swing.JTextField();
        jLabelSeats = new javax.swing.JLabel();
        jButtonCourse = new javax.swing.JButton();
        jButtonRegister = new javax.swing.JButton();

        jComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryActionPerformed(evt);
            }
        });

        jLabelCategory.setText("Category:");

        jLabelFirstName.setText("First name:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Register");

        jLabelZoomLink.setText("Zoom link:");

        jLabelEmailID.setText("Email id:");

        jTextFieldLastName.setToolTipText("");

        jLabelLastName.setText("Last name:");

        jLabelCourse.setText("Course:");

        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        jLabelSeats.setText("Seats:");

        jButtonCourse.setText("Course");
        jButtonCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCourseActionPerformed(evt);
            }
        });

        jButtonRegister.setText("Register");
        jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelFirstName)
                            .addComponent(jLabelCategory)
                            .addComponent(jLabelCourse)
                            .addComponent(jLabelLastName)
                            .addComponent(jLabelEmailID)
                            .addComponent(jLabelZoomLink)
                            .addComponent(jLabelSeats))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(77, 77, 77)
                                .addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxCourse, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldZoomLink, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLastName)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmailID)
                    .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCourse)
                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelZoomLink)
                    .addComponent(jTextFieldZoomLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeats)
                    .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRegister)
                    .addComponent(jButtonCourse))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoryActionPerformed

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        ControlAreaJPanel cajp = new ControlAreaJPanel(controlArea, workArea);
        controlArea.add("ControlAreaJPanel",cajp);
        CardLayout layout2 = (CardLayout)controlArea.getLayout();
        layout2.next(controlArea);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void jButtonCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCourseActionPerformed
        // TODO add your handling code here:
        try
        {
            String category_name;
            int category_id;
            category_name = jComboBoxCategory.getSelectedItem().toString();
            resultSet3 = foi.getallFieldOfInterest();
            while(resultSet3.next())
            {
                if(category_name.equals(resultSet3.getString(2)))
                {
                    category_id = resultSet3.getInt(1);
                    Courses cou = new Courses(category_id);
                    resultSet4 = cou.getCourseByCategory(category_id);
                    while(resultSet4.next())
                    {
                        jComboBoxCourse.addItem(resultSet4.getString(3));
                    }
                }
            }
        }
        catch (SQLException ex)
        {
            //            Logger.getLogger(PersonalOrg_Admin_Add.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCourseActionPerformed

    private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterActionPerformed
        // TODO add your handling code here:
        String first_name, last_name, emailid, category, course, zoom_link, username, password, seats1;
        int category_id, course_id, seats;
        first_name = jTextFieldFirstName.getText();
        if(first_name.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "First name is mandatory");
        }
        else
        {
            last_name = jTextFieldLastName.getText();
            if(last_name.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Last name is mandatory");
            }
            else
            {
                emailid = jTextFieldEmailID.getText();
                if(emailid.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Email id is mandatory");
                }
                else if(!getEmail(emailid))
                {
                    JOptionPane.showMessageDialog(this, "Invalid email id.");
                }
                else
                {
                    category = jComboBoxCategory.getSelectedItem().toString();
                    course = jComboBoxCourse.getSelectedItem().toString();
                    zoom_link = jTextFieldZoomLink.getText();
                    if(zoom_link.isEmpty())
                    {
                        JOptionPane.showMessageDialog(this, "Zoom link is mandatory");
                    }
                    else
                    {
                        seats1 = jTextFieldSeats.getText();
                        if (seats1.isEmpty())
                        {

                        }
                        else
                        {
                            boolean checker1 = isInteger(seats1);
                            if (!checker1)
                            {
                                JOptionPane.showMessageDialog(this, "seats should be integer");
                            }
                            else
                            {
                                seats = Integer.parseInt(seats1);
                                try
                                {
                                    username = emailid;
                                    password = last_name + "." + first_name;

                                    resultSet = foi.getallFieldOfInterest();
                                    while (resultSet.next())
                                    {
                                        if (resultSet.getString(2).equals(category))
                                        {
                                            category_id = resultSet.getInt(1);

                                            Courses cou = new Courses(category_id);
                                            resultSet1 = cou.getCourseByCategory(category_id);
                                            while (resultSet1.next())
                                            {
                                                if (resultSet1.getString(3).equals(course))
                                                {
                                                    course_id = resultSet1.getInt(1);

                                                    PersonalOrganization po = new PersonalOrganization(first_name, last_name, emailid, category_id, course_id, zoom_link, seats, username, password);
                                                    po.addFreeLancer(first_name, last_name, emailid, category_id, course_id, zoom_link, seats, username, password);

                                                    sentEmail(emailid, first_name, password);

                                                    PersonalOrg_login_JPanel polp = new PersonalOrg_login_JPanel(controlArea, workArea);
                                                    workArea.add("PersonalOrg_login_JPanel",polp);
                                                    CardLayout layout = (CardLayout)workArea.getLayout();
                                                    layout.next(workArea);
                                                }
                                            }
                                        }
                                    }
                                }
                                catch (SQLException ex)
                                {
                                    if (ex.getMessage().contains("Duplicate entry"))
                                    {
                                        JOptionPane.showMessageDialog(this, "User already exists");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonRegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonCourse;
    private javax.swing.JButton jButtonRegister;
    private javax.swing.JComboBox<String> jComboBoxCategory;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelSeats;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelZoomLink;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldSeats;
    private javax.swing.JTextField jTextFieldZoomLink;
    // End of variables declaration//GEN-END:variables

    public boolean getEmail(String email)
    {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    private void sentEmail(String email, String first_name, String password) {
        try {
            Properties properties = new Properties();
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.ssl.host", "smtp.gmail.com");
            properties.put("mail.smtp.host", "smtp.gmail.com");
            properties.put("mail.smtp.port", 587);
            Session session = Session.getDefaultInstance(properties,
                    new Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication("helpinghomeless.aed@gmail.com", "gygsgpsczxfzjvjj");

                }
            });
            String content = "Welcome " + first_name + ".\r\n Your usersname: " + email + "\r\n password: " + password + "\r\n for the portal.";
            System.out.println(session);
            Message message = new MimeMessage(session);
            message.setSubject("Welcome to" + first_name + "");
            message.setContent(content, "text/plain");
            message.setFrom(new InternetAddress("helpinghomeless.aed@gmail.com"));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSentDate(new Date());

            Transport.send(message);
            JOptionPane.showMessageDialog(this, "Email Sent");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}
