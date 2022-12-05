/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Ngo;

import DataConnection.db;
import Users.Users;
import java.awt.CardLayout;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pikku
 */
public class ManageDepartmentUpdateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDepartmentUpdateJPanel
     */
    Users user;
    int id;
    JPanel controlArea;
    JPanel workArea;
    public ManageDepartmentUpdateJPanel(JPanel controlArea, JPanel workArea) {
        initComponents();
        this.user = new Users();
        this.id = id;
        populateTable(1);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDepartment = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextFieldEmailID = new javax.swing.JTextField();
        jLabelDepartment = new javax.swing.JLabel();
        jComboBoxDepartment = new javax.swing.JComboBox<>();
        jButtonAdd = new javax.swing.JButton();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelEmailID = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        tblDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Firstname", "Lastname", "Email", "Organization", "Username"
            }
        ));
        jScrollPane1.setViewportView(tblDepartment);

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelDepartment.setText("Department:");

        jComboBoxDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Homeless Department", "College Department" }));

        jButtonAdd.setText("Save");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jLabelName.setText("First name:");

        jTextFieldName.setToolTipText("");

        jLabelLastName.setText("Last name:");

        jTextFieldLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastNameActionPerformed(evt);
            }
        });

        jLabelEmailID.setText("Email ID:");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelName, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabelEmailID))
                            .addComponent(jLabelLastName))
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8))
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelDepartment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton1)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(jLabelDepartment)
                    .addComponent(jComboBoxDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonAdd)
                .addGap(76, 76, 76))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        int selectedRowIndex = tblDepartment.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblDepartment.getModel();

         id = Integer.parseInt(model.getValueAt(selectedRowIndex, 0).toString());
        jTextFieldName.setText(model.getValueAt(selectedRowIndex, 1).toString());
        jTextFieldLastName.setText(model.getValueAt(selectedRowIndex, 2).toString());
        jTextFieldEmailID.setText(model.getValueAt(selectedRowIndex, 3).toString());
        jComboBoxDepartment.setSelectedItem(model.getValueAt(selectedRowIndex, 4).toString());


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        String first_name, last_name, emailId, department, username, password;
        int department_id = 1;

        first_name = jTextFieldName.getText();
        last_name = jTextFieldLastName.getText();
        emailId = jTextFieldEmailID.getText();
        department = jComboBoxDepartment.getSelectedItem().toString();
        if (first_name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "First name cannot be null.");
        } else if (last_name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Last name cannot be null.");
        } else if (!getEmail(emailId)) {
            JOptionPane.showMessageDialog(this, "Invalid Email address");
        } else if (department.isEmpty()) {
            JOptionPane.showMessageDialog(this, "department cannot be null.");
        } else {
            username = last_name + "." + first_name;
            password = last_name + "." + first_name;
            try {
                PreparedStatement ps = db.getPreStatement("update user set department_id = ?, firstname = ?, lastname = ?, emailid = ?, organization = ?, username = ?, password = ? where id = ?");
                ps.setInt(1, department_id);
                ps.setString(2, first_name);
                ps.setString(3, last_name);
                ps.setString(4, emailId);
                ps.setString(5, department);
                ps.setString(6, username);
                ps.setString(7, password);
                ps.setInt(8, id);

                jTextFieldName.setText("");
                jTextFieldLastName.setText("");
                jTextFieldEmailID.setText("");
                jComboBoxDepartment.setSelectedIndex(0);

                ps.execute();
                populateTable(1);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        }

    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jTextFieldLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastNameActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         workArea.removeAll();
       NgoContolAreaJPanel ngap = new NgoContolAreaJPanel(controlArea, workArea);
        controlArea.add("NgoContolAreaJPanel", ngap);
        CardLayout layout = (CardLayout) controlArea.getLayout();
        layout.next(controlArea);

       
    }//GEN-LAST:event_btnBackActionPerformed

    public boolean getEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JComboBox<String> jComboBoxDepartment;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelEmailID;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldEmailID;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTable tblDepartment;
    // End of variables declaration//GEN-END:variables

    private void populateTable(int id) {
        try {
            DefaultTableModel model = (DefaultTableModel) tblDepartment.getModel();
            model.setRowCount(0);

            ResultSet resultset = user.getAllDepartmentUser(id);
            System.out.println(resultset);
            while (resultset.next()) {
                Object[] row = new Object[6];

                row[0] = resultset.getInt(1);
                row[1] = resultset.getString(3);
                row[2] = resultset.getString(4);
                row[3] = resultset.getString(5);
                row[4] = resultset.getString(6);
                row[5] = resultset.getString(7);
                model.addRow(row);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
}