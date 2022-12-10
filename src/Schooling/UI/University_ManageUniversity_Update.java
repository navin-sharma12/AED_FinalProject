/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import Schooling.Model.Courses;
import Schooling.Model.University;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author navinsharma
 */
public class University_ManageUniversity_Update extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_ManageUniversity_Update
     */
    JPanel controlArea;
    JPanel workArea;
    ResultSet resultSetuni, resultSetcourse;
    String university_name, seats1, course_name;
    public University_ManageUniversity_Update(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        jTextFieldCategory.setEditable(false);
        jTextFieldCourseName.setEditable(false);
        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    private boolean isInteger(String a){
        try{
            Integer.parseInt(a);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldUniversityName = new javax.swing.JTextField();
        jLabelSeatsInCourse = new javax.swing.JLabel();
        jTextFieldCourseName = new javax.swing.JTextField();
        jTextFieldSeatInCourse = new javax.swing.JTextField();
        jTextFieldCategory = new javax.swing.JTextField();
        jButtonView = new javax.swing.JButton();
        jButtonFetch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabelCoursename = new javax.swing.JLabel();
        jLabelTitle = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jLabelUniversityName = new javax.swing.JLabel();
        jButtonUpdate = new javax.swing.JButton();

        jLabelSeatsInCourse.setText("Seats in course:");

        jTextFieldSeatInCourse.setToolTipText("");

        jButtonView.setText("View");
        jButtonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonViewActionPerformed(evt);
            }
        });

        jButtonFetch.setText("Fetch");
        jButtonFetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFetchActionPerformed(evt);
            }
        });

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "University name", "Category", "Course name", "Seats in course"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabelCoursename.setText("Course name:");

        jLabelTitle.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Update University");
        jLabelTitle.setToolTipText("");

        jLabelCategory.setText("Category:");

        jLabelUniversityName.setText("University name:");

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelCoursename)
                            .addComponent(jLabelCategory)
                            .addComponent(jLabelUniversityName)
                            .addComponent(jLabelSeatsInCourse))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                            .addComponent(jTextFieldCategory)
                            .addComponent(jTextFieldCourseName)
                            .addComponent(jTextFieldUniversityName)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68)
                        .addComponent(jButtonFetch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitle)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonFetch)
                    .addComponent(jButtonView)
                    .addComponent(jButtonUpdate))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUniversityName)
                    .addComponent(jTextFieldUniversityName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategory)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCoursename)
                    .addComponent(jTextFieldCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSeatsInCourse)
                    .addComponent(jTextFieldSeatInCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable.getSelectedRow();
        if (selectedRowIndex<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;
        }
        else
        {
            DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
            university_name = table_model.getValueAt(selectedRowIndex, 0).toString();
            seats1 = table_model.getValueAt(selectedRowIndex, 3).toString();
            course_name = table_model.getValueAt(selectedRowIndex, 2).toString();
            
            jTextFieldUniversityName.setText(university_name);
            jTextFieldCategory.setText(table_model.getValueAt(selectedRowIndex, 1).toString());
            jTextFieldCourseName.setText(course_name);
            jTextFieldSeatInCourse.setText(seats1);
        }
    }//GEN-LAST:event_jButtonViewActionPerformed

    private void jButtonFetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFetchActionPerformed
        // TODO add your handling code here:
        University uni = new University();
        resultSetuni = uni.getallUniversity();
        try
        {
            ViewTable();
        }
        catch (SQLException ex)
        {
            //            Logger.getLogger(University_ManageUniversity_Read.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonFetchActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int university_id, seats, course_id;
        String updated_university, seats1;
        
        updated_university = jTextFieldUniversityName.getText();
        if(updated_university.isEmpty())
        {
            JOptionPane.showMessageDialog(this, "University name cannot be null.");
        }
        else
        {
            seats1 = jTextFieldSeatInCourse.getText();
            if(seats1.isEmpty())
            {
                JOptionPane.showMessageDialog(this, "Seats cannot be null.");
            }
            else
            {
                boolean checker = isInteger(seats1);
                if (!checker) 
                {
                    JOptionPane.showMessageDialog(this, "Number of seats should be integer.");
                } 
                else 
                {
                    seats = Integer.parseInt(seats1);
                    University uni = new University();
                    resultSetuni = uni.getallUniversity();
                    try 
                    { 
                        while (resultSetuni.next())
                        {
                            String old_university = resultSetuni.getString(2);
                            if (old_university.equals(university_name)) 
                            {
                                university_id = resultSetuni.getInt(1);
                                
                                Courses course = new Courses();
                                resultSetcourse = course.getCourses();
                                while(resultSetcourse.next())
                                {
                                    String old_course_name = resultSetcourse.getString(3);
                                    course_id = resultSetcourse.getInt(1);
                                    
                                    if(old_course_name.equals(course_name))
                                    {
                                        University uni1 = new University(updated_university, university_id);
                                        uni1.updateUniversity(updated_university, university_id);
                                        
                                        University uni2 = new University(course_id, university_id, seats);
                                        uni2.updateSeats(course_id, university_id, seats);
                                    }
                                }
                            }
                        }
                    } 
                    catch (SQLException ex) 
                    {
//                        java.util.logging.Logger.getLogger(University_ManageUniversity_Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFetch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JButton jButtonView;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JLabel jLabelCoursename;
    private javax.swing.JLabel jLabelSeatsInCourse;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelUniversityName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldCourseName;
    private javax.swing.JTextField jTextFieldSeatInCourse;
    private javax.swing.JTextField jTextFieldUniversityName;
    // End of variables declaration//GEN-END:variables

    private void ViewTable() throws SQLException
    {
        DefaultTableModel table_model = (DefaultTableModel) jTable.getModel();
        table_model.setRowCount(0);
        
        try 
        {
            while (resultSetuni.next()) 
            {
                Object[] row = new Object[4];
                row[0] = resultSetuni.getString(2);
                row[1] = resultSetuni.getString(3);
                row[2] = resultSetuni.getString(4);
                row[3] = resultSetuni.getString(5);
                table_model.addRow(row);
            }
        } 
        catch (IllegalArgumentException e) 
        {
            throw new IllegalArgumentException(e.getMessage() + "Record not found");
        }
    }
}
