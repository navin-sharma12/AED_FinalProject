/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Funding;

import UI.Ngo.ManageDepartmentControlJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author richapatel
 */
public class Funding_Admin extends javax.swing.JPanel {

    /**
     * Creates new form Funding_Admin
     */
     JPanel controlArea;
    JPanel workArea;
    public Funding_Admin(JPanel controlArea, JPanel workArea) {
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

        jButtonManageInvestors = new javax.swing.JButton();
        jButtonManageInvestors1 = new javax.swing.JButton();
        jButtonManageInvestors2 = new javax.swing.JButton();
        jButtonManageInvestors3 = new javax.swing.JButton();

        setForeground(new java.awt.Color(102, 102, 102));

        jButtonManageInvestors.setForeground(new java.awt.Color(102, 102, 102));
        jButtonManageInvestors.setText("Manage Local Investors");
        jButtonManageInvestors.setToolTipText("");
        jButtonManageInvestors.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageInvestorsActionPerformed(evt);
            }
        });

        jButtonManageInvestors1.setForeground(new java.awt.Color(102, 102, 102));
        jButtonManageInvestors1.setText("Manage Department");
        jButtonManageInvestors1.setToolTipText("");
        jButtonManageInvestors1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageInvestors1ActionPerformed(evt);
            }
        });

        jButtonManageInvestors2.setForeground(new java.awt.Color(102, 102, 102));
        jButtonManageInvestors2.setText("Manage Govern Investors");
        jButtonManageInvestors2.setToolTipText("");
        jButtonManageInvestors2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageInvestors2ActionPerformed(evt);
            }
        });

        jButtonManageInvestors3.setForeground(new java.awt.Color(102, 102, 102));
        jButtonManageInvestors3.setText("Manage Assign Funds");
        jButtonManageInvestors3.setToolTipText("");
        jButtonManageInvestors3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageInvestors3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonManageInvestors1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManageInvestors, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManageInvestors2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManageInvestors3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButtonManageInvestors1)
                .addGap(39, 39, 39)
                .addComponent(jButtonManageInvestors)
                .addGap(44, 44, 44)
                .addComponent(jButtonManageInvestors2)
                .addGap(28, 28, 28)
                .addComponent(jButtonManageInvestors3)
                .addContainerGap(177, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageInvestorsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageInvestorsActionPerformed
        // TODO add your handling code here:
          Funding_AdminControlAreaPanel facap = new Funding_AdminControlAreaPanel(controlArea, workArea);
        controlArea.add("Funding_AdminControlAreaPanel", facap);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
        
    }//GEN-LAST:event_jButtonManageInvestorsActionPerformed

    private void jButtonManageInvestors1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageInvestors1ActionPerformed
        // TODO add your handling code here:
          Funding_ManageInvestors fmi = new Funding_ManageInvestors(controlArea, workArea);
        controlArea.add("Funding_ManageInvestors", fmi);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
    }//GEN-LAST:event_jButtonManageInvestors1ActionPerformed

    private void jButtonManageInvestors2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageInvestors2ActionPerformed
        // TODO add your handling code here:
         Funding_AdminGovernmentControl_JPanel fagci = new Funding_AdminGovernmentControl_JPanel(controlArea, workArea);
        controlArea.add("Funding_AdminGovernmentControl_JPanel", fagci);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);
    }//GEN-LAST:event_jButtonManageInvestors2ActionPerformed

    private void jButtonManageInvestors3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageInvestors3ActionPerformed
        // TODO add your handling code here:
         Funding_AssignFunds_JPanel fafjp = new Funding_AssignFunds_JPanel(controlArea, workArea);
        workArea.add("Funding_AssignFunds_JPanel", fafjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_jButtonManageInvestors3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonManageInvestors;
    private javax.swing.JButton jButtonManageInvestors1;
    private javax.swing.JButton jButtonManageInvestors2;
    private javax.swing.JButton jButtonManageInvestors3;
    // End of variables declaration//GEN-END:variables
}
