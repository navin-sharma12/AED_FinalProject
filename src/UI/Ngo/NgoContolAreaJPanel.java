/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ngo;

import UI.student.StudentControlJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author pikku
 */
public class NgoContolAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NgoContolAreaJPanel
     */
    JPanel controlArea;
    JPanel workArea;

    public NgoContolAreaJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonManageDepartments = new javax.swing.JButton();
        btnStudents = new javax.swing.JButton();

        jButtonManageDepartments.setText("Manage Departments");
        jButtonManageDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageDepartmentsActionPerformed(evt);
            }
        });

        btnStudents.setText("Manage Students");
        btnStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonManageDepartments, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonManageDepartments)
                .addGap(27, 27, 27)
                .addComponent(btnStudents)
                .addContainerGap(326, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageDepartmentsActionPerformed
        // TODO add your handling code here:
        ManageDepartmentControlJPanel mdcp = new ManageDepartmentControlJPanel(controlArea, workArea);
        controlArea.add("ManageDepartmentControlJPanel", mdcp);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        
    }//GEN-LAST:event_jButtonManageDepartmentsActionPerformed

    private void btnStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentsActionPerformed
        // TODO add your handling code here:
        StudentControlJPanel scjp = new StudentControlJPanel(controlArea, workArea);
        controlArea.add("StudentControlJPanel", scjp);
        CardLayout layout1 = (CardLayout) controlArea.getLayout();
        layout1.next(controlArea);
    }//GEN-LAST:event_btnStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStudents;
    private javax.swing.JButton jButtonManageDepartments;
    // End of variables declaration//GEN-END:variables
}
