/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ngo;

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

        jButtonManageDepartments.setText("Manage Departments");
        jButtonManageDepartments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageDepartmentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jButtonManageDepartments, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonManageDepartments)
                .addContainerGap(376, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageDepartmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageDepartmentsActionPerformed
        // TODO add your handling code here:
        ManageDepartmentControlJPanel mdcp = new ManageDepartmentControlJPanel(controlArea, workArea);
        controlArea.add("ManageDepartmentControlJPanel", mdcp);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        
    }//GEN-LAST:event_jButtonManageDepartmentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonManageDepartments;
    // End of variables declaration//GEN-END:variables
}