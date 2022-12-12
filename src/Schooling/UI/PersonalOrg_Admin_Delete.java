/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.PersonalOrganization;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navinsharma
 */
public class PersonalOrg_Admin_Delete extends javax.swing.JPanel {

    /**
     * Creates new form PersonalOrg_Admin_Delete
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSet, resultSet1;
    String emailid;
    PersonalOrganization po = new PersonalOrganization();
    public PersonalOrg_Admin_Delete(JPanel controlArea, JPanel workArea) 
    {
        try 
        {
            initComponents();
            this.controlArea = controlArea;
            this.workArea = workArea;
            ViewTable();
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(PersonalOrg_Admin_Read.class.getName()).log(Level.SEVERE, null, ex);
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

        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        jTextFieldEmailID = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jLabelZoomLink = new javax.swing.JLabel();
        jTextFieldCourse = new javax.swing.JTextField();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldZoomLink = new javax.swing.JTextField();
        jLabelCategory = new javax.swing.JLabel();
        jLabelCourse = new javax.swing.JLabel();
        jButtonView = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();
        jLabelLastName = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButtonDelete = new javax.swing.JButton();
        jLabelSeats = new javax.swing.JLabel();
        jTextFieldSeats = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(211, 237, 211));

        jTextFieldLastName.setToolTipText("");
        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });

        jLabelEmailID.setText("Email id:");

        jLabelFirstName.setText("First name:");

        jLabelZoomLink.setText("Zoom link:");

        jLabelCategory.setText("Category:");

        jLabelCourse.setText("Course:");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelLastName.setText("Last name:");

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "First name", "Last name", "Email ID", "Category", "Course", "Zoom link", "Seats"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteActionPerformed(evt);
            }
        });

        jLabelSeats.setText("Seats:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Personal org .png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(211, 237, 211));
        jLabel2.setFont(new java.awt.Font(".AppleSystemUIFont", 1, 18)); // NOI18N
        jLabel2.setText("                                                            Personal Organisation : Delete");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 1056, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonView, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelCategory)
                                            .addComponent(jLabelCourse)
                                            .addComponent(jLabelZoomLink)
                                            .addComponent(jLabelSeats))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldZoomLink, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelFirstName)
                                            .addComponent(jLabelLastName)
                                            .addComponent(jLabelEmailID))
                                        .addGap(57, 57, 57)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(43, 43, 43)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelTitle)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jButtonView)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelFirstName)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelLastName)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCategory)
                            .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCourse)
                            .addComponent(jTextFieldCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelZoomLink)
                            .addComponent(jTextFieldZoomLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSeats)
                            .addComponent(jTextFieldSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEmailID)
                            .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(190, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
        }
        else
        {
            DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
            emailid = table_model.getValueAt(selectedRowIndex, 2).toString();
            jTextFieldFirstName.setText(table_model.getValueAt(selectedRowIndex, 0).toString());
            jTextFieldLastName.setText(table_model.getValueAt(selectedRowIndex, 1).toString());
            jTextFieldEmailID.setText(emailid);
            jTextFieldCategory.setText(table_model.getValueAt(selectedRowIndex, 3).toString());
            jTextFieldCourse.setText(table_model.getValueAt(selectedRowIndex, 4).toString());
            jTextFieldZoomLink.setText(table_model.getValueAt(selectedRowIndex, 5).toString());
            jTextFieldSeats.setText(table_model.getValueAt(selectedRowIndex, 6).toString());
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        // TODO add your handling code here:
        try 
        {
            PersonalOrganization po = new PersonalOrganization(emailid);
            po.deletePO(emailid);
        } 
        catch (SQLException ex) 
        {
//            Logger.getLogger(PersonalOrg_Admin_Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCourse;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelSeats;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelZoomLink;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCourse;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldSeats;
    private javax.swing.JTextField jTextFieldZoomLink;
    // End of variables declaration//GEN-END:variables

    private void ViewTable() throws SQLException
    {
        PersonalOrganization po = new PersonalOrganization();
        resultSet = po.getallPO();
        DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
        table_model.setRowCount(0);
        
        try 
        {
            while (resultSet.next()) 
            {
                Object[] row = new Object[7];
                row[0] = resultSet.getString(2);
                row[1] = resultSet.getString(3);
                row[2] = resultSet.getString(4);
                row[3] = resultSet.getString(5);
                row[4] = resultSet.getString(6);
                row[5] = resultSet.getString(7);
                row[6] = resultSet.getInt(8);
                table_model.addRow(row);
            }
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }
}
