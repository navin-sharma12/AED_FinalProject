/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.CollegeDept;

import Schooling.Model.FieldOfInterest;
import Schooling.Model.University;
import Student.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author pikku
 */
public class CollegeDeptAddJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollegeDeptAddJPanel
     */
    Student student;
    University un;
    FieldOfInterest foi;

    public CollegeDeptAddJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.student = new Student();
        this.un = new University();
        this.foi = new FieldOfInterest();
        showTable();
        showUniversityTable();
        populateFieldOfInterest();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblUniversity = new javax.swing.JTable();
        btnAssign = new java.awt.Button();
        lblCourse = new java.awt.Label();
        ComboBoxFOI = new javax.swing.JComboBox<>();
        lblFOI1 = new java.awt.Label();
        ComboBoxCourse = new javax.swing.JComboBox<>();
        lblUniversity = new java.awt.Label();
        ComboBoxUniversity = new javax.swing.JComboBox<>();
        btnSave = new java.awt.Button();

        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Gender", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblStudent);

        tblUniversity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "University", "Course", "Seats"
            }
        ));
        jScrollPane2.setViewportView(tblUniversity);

        btnAssign.setLabel("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblCourse.setText("Course");

        ComboBoxFOI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblFOI1.setText("Field");

        ComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblUniversity.setText("University");

        ComboBoxUniversity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSave.setLabel("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                        .addComponent(jScrollPane2)))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFOI1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboBoxUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxFOI, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxFOI, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFOI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxUniversity, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAssignActionPerformed

    private void showTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblStudent.getModel();
            model.setRowCount(0);

            ResultSet resultset = student.getStudent();

            while (resultset.next()) {
                Object[] row = new Object[5];

                row[0] = resultset.getInt(1);
                row[1] = resultset.getString(2);
                row[2] = resultset.getString(3);
                row[3] = resultset.getString(6);
                row[4] = resultset.getString(11);

                model.addRow(row);
            }

        } catch (SQLException ex) {

        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxCourse;
    private javax.swing.JComboBox<String> ComboBoxFOI;
    private javax.swing.JComboBox<String> ComboBoxUniversity;
    private java.awt.Button btnAssign;
    private java.awt.Button btnSave;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label lblCourse;
    private java.awt.Label lblFOI1;
    private java.awt.Label lblUniversity;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTable tblUniversity;
    // End of variables declaration//GEN-END:variables

    private void showUniversityTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) tblUniversity.getModel();
            model.setRowCount(0);
            ResultSet resultset = un.getAllUniversityStudent();
            while (resultset.next()) {
                Object[] row = new Object[3];

                row[0] = resultset.getString(4);
                row[1] = resultset.getString(2);
                row[2] = resultset.getInt(5);

                model.addRow(row);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    private void populateFieldOfInterest() {
        try {
            ResultSet rs = foi.getallFieldOfInterest();
            ComboBoxFOI.removeAllItems();
            while (rs.next()) {
                ComboBoxFOI.addItem(rs.getString(2));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

    }
}
