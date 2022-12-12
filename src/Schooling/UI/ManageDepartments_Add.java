 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Users.Users;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author navinsharma
 */
public class ManageDepartments_Add extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_Add_Person
     */
    JPanel controlArea;
    JPanel workArea;
    Users user;
    public ManageDepartments_Add(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        this.user = new Users();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabelTitle = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        jTextFieldEmailID = new javax.swing.JTextField();
        jLabelDepartment = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(180, 203, 226));
        setLayout(null);

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Manage Departments : Add");
        add(jLabelTitle);
        jLabelTitle.setBounds(60, 30, 712, 124);

        jLabelName.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelName.setText("First name:");
        add(jLabelName);
        jLabelName.setBounds(332, 174, 75, 15);

        jTextFieldName.setToolTipText("");
        add(jTextFieldName);
        jTextFieldName.setBounds(451, 170, 207, 23);

        jLabelLastName.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelLastName.setText("Last name:");
        add(jLabelLastName);
        jLabelLastName.setBounds(332, 215, 73, 15);
        add(jTextFieldLastName);
        jTextFieldLastName.setBounds(451, 211, 207, 23);

        jLabelEmailID.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelEmailID.setText("Email ID:");
        add(jLabelEmailID);
        jLabelEmailID.setBounds(336, 256, 58, 15);
        add(jTextFieldEmailID);
        jTextFieldEmailID.setBounds(451, 252, 207, 23);

        jLabelDepartment.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 12)); // NOI18N
        jLabelDepartment.setText("Department:");
        add(jLabelDepartment);
        jLabelDepartment.setBounds(325, 297, 82, 15);

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jobs Department", "Personal Org. Department", "Universities Department" }));
        add(jComboBoxDepartment);
        jComboBoxDepartment.setBounds(451, 293, 207, 23);

        jButtonAdd.setText("Submit");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd);
        jButtonAdd.setBounds(325, 334, 72, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MD 1.png"))); // NOI18N
        add(jLabel1);
        jLabel1.setBounds(100, 170, 174, 158);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String first_name, last_name, emailId, department, username, password;
        int department_id;
        
        first_name = jTextFieldName.getText();
        if(first_name.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "First name cannot be null.");
        }
        else
        {
            last_name = jTextFieldLastName.getText();
            if (last_name.isEmpty()) 
            {
                JOptionPane.showMessageDialog(this, "Last name cannot be null.");
            } 
            else 
            {
                emailId = jTextFieldEmailID.getText();
                if (emailId.isEmpty())
                {
                    JOptionPane.showMessageDialog(this, "Email id cannot be null.");
                }
                else if(!getEmail(emailId))
                {
                    JOptionPane.showMessageDialog(this, "Invalid email id.");
                }
                else
                {
                    department = jComboBoxDepartment.getSelectedItem().toString();
                    if (department.isEmpty()) 
                    {
                        JOptionPane.showMessageDialog(this, "Department cannot be null.");
                    } 
                    else 
                    {
                        username = emailId;
                        password = last_name + "." + first_name;
                        department_id = 2;
                        
                        try 
                        {
                            Users us = new Users(department_id, first_name, last_name, emailId, department, username, password);
                            user.addUser(us);
                        } 
                        catch (SQLException ex) 
                        {
                            if(ex.getMessage().contains("Duplicate entry"))
                            {
                                JOptionPane.showMessageDialog(this, "User already exists");
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public boolean getEmail(String email)
    {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
