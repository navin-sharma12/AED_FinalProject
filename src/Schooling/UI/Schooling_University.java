/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Schooling.UI;

/**
 *
 * @author navinsharma
 */
public class Schooling_University extends javax.swing.JPanel {

    /**
     * Creates new form Schooling_University
     */
    public Schooling_University() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        controlArea = new javax.swing.JPanel();
        jButtonManageUIniversity = new javax.swing.JButton();
        jButtonManageCourses = new javax.swing.JButton();
        jButtonManageFieldOfInterest = new javax.swing.JButton();
        workArea = new javax.swing.JPanel();

        jButtonManageUIniversity.setText("Manage University");
        jButtonManageUIniversity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageUIniversityActionPerformed(evt);
            }
        });

        jButtonManageCourses.setText("Manage Courses");

        jButtonManageFieldOfInterest.setText("Manage Field Of Interest");

        javax.swing.GroupLayout controlAreaLayout = new javax.swing.GroupLayout(controlArea);
        controlArea.setLayout(controlAreaLayout);
        controlAreaLayout.setHorizontalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlAreaLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonManageUIniversity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManageCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonManageFieldOfInterest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        controlAreaLayout.setVerticalGroup(
            controlAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlAreaLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jButtonManageUIniversity)
                .addGap(47, 47, 47)
                .addComponent(jButtonManageCourses)
                .addGap(48, 48, 48)
                .addComponent(jButtonManageFieldOfInterest)
                .addContainerGap(322, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(controlArea);

        javax.swing.GroupLayout workAreaLayout = new javax.swing.GroupLayout(workArea);
        workArea.setLayout(workAreaLayout);
        workAreaLayout.setHorizontalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        workAreaLayout.setVerticalGroup(
            workAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(workArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageUIniversityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageUIniversityActionPerformed
        // TODO add your handling code here:
        University_ManageUniversity umu = new University_ManageUniversity();
        
    }//GEN-LAST:event_jButtonManageUIniversityActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlArea;
    private javax.swing.JButton jButtonManageCourses;
    private javax.swing.JButton jButtonManageFieldOfInterest;
    private javax.swing.JButton jButtonManageUIniversity;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel workArea;
    // End of variables declaration//GEN-END:variables
}