/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author navinsharma
 */
public class JobPortal_Student_View extends javax.swing.JPanel {

    /**
     * Creates new form JobPortal_Student_View
     */
    JPanel controlArea;
    JPanel workArea;
    int student_id;
    public JobPortal_Student_View(JPanel controlArea, JPanel workArea, int student_id) 
    {
        initComponents();
        this.controlArea = controlArea;
        this.workArea = workArea;
        this.student_id = student_id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonApply = new javax.swing.JButton();
        jButtonRead = new javax.swing.JButton();

        jButtonApply.setText("Apply");
        jButtonApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApplyActionPerformed(evt);
            }
        });

        jButtonRead.setText("Read");
        jButtonRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonRead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonApply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButtonApply)
                .addGap(46, 46, 46)
                .addComponent(jButtonRead)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApplyActionPerformed
        // TODO add your handling code here:
        JobPortal_Student_Apply jpsa = new JobPortal_Student_Apply(controlArea, workArea, student_id);
        workArea.add("JobPortal_Student_Apply", jpsa);
        CardLayout layout2 = (CardLayout) workArea.getLayout();
        layout2.next(workArea);
    }//GEN-LAST:event_jButtonApplyActionPerformed

    private void jButtonReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReadActionPerformed
        // TODO add your handling code here:
        JobPortal_Student_Read jpsa = new JobPortal_Student_Read(controlArea, workArea, student_id);
        workArea.add("JobPortal_Student_Read", jpsa);
        CardLayout layout2 = (CardLayout) workArea.getLayout();
        layout2.next(workArea);
    }//GEN-LAST:event_jButtonReadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApply;
    private javax.swing.JButton jButtonRead;
    // End of variables declaration//GEN-END:variables
}
