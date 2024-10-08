/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.universitysystem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author DCN
 */
public class LeaveRequestStu extends javax.swing.JFrame {
    /**
     * Creates new form LeaveRequestStu
     */
    int id;
    public LeaveRequestStu() {
        initComponents();
        fetchLeaveList();
    }
    
    public LeaveRequestStu(int n)
    {
        initComponents();
        id = n;
        fetchLeaveList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbReason = new javax.swing.JLabel();
        lbRollNo = new javax.swing.JLabel();
        lbNumOfDays = new javax.swing.JLabel();
        btnDisapprove = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(120, 137, 146));
        jPanel1.setMaximumSize(new java.awt.Dimension(863, 505));
        jPanel1.setPreferredSize(new java.awt.Dimension(863, 505));

        jPanel2.setBackground(new java.awt.Color(207, 207, 207));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(17, 33, 45));
        jLabel2.setText("Leave Requests(Student)");

        jPanel3.setBackground(new java.awt.Color(236, 235, 235));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(17, 33, 45));
        jLabel5.setText("Name");

        lbName.setFont(new java.awt.Font("Elephant", 0, 17)); // NOI18N
        lbName.setForeground(new java.awt.Color(41, 72, 89));
        lbName.setText(" ");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(17, 33, 45));
        jLabel6.setText("Roll Number");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(17, 33, 45));
        jLabel8.setText("Date(from-to)");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(17, 33, 45));
        jLabel9.setText("Reason for leave");

        lbReason.setFont(new java.awt.Font("Elephant", 0, 18)); // NOI18N
        lbReason.setForeground(new java.awt.Color(41, 72, 89));
        lbReason.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbReason.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lbReason.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        lbRollNo.setFont(new java.awt.Font("Elephant", 0, 17)); // NOI18N
        lbRollNo.setForeground(new java.awt.Color(41, 72, 89));
        lbRollNo.setText(" ");

        lbNumOfDays.setFont(new java.awt.Font("Elephant", 0, 17)); // NOI18N
        lbNumOfDays.setForeground(new java.awt.Color(41, 72, 89));
        lbNumOfDays.setText(" ");

        btnDisapprove.setBackground(new java.awt.Color(6, 20, 27));
        btnDisapprove.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnDisapprove.setForeground(new java.awt.Color(255, 255, 255));
        btnDisapprove.setText("Disapprove");
        btnDisapprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDisapprove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDisapprove.setMaximumSize(new java.awt.Dimension(64, 18));
        btnDisapprove.setMinimumSize(new java.awt.Dimension(64, 18));
        btnDisapprove.setPreferredSize(new java.awt.Dimension(64, 18));
        btnDisapprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisapproveActionPerformed(evt);
            }
        });

        btnApprove.setBackground(new java.awt.Color(6, 20, 27));
        btnApprove.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnApprove.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnApprove.setMaximumSize(new java.awt.Dimension(64, 18));
        btnApprove.setMinimumSize(new java.awt.Dimension(64, 18));
        btnApprove.setPreferredSize(new java.awt.Dimension(64, 18));
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Elephant", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(17, 33, 45));
        jLabel10.setText("No. of days");

        lbDate.setFont(new java.awt.Font("Elephant", 0, 17)); // NOI18N
        lbDate.setForeground(new java.awt.Color(41, 72, 89));
        lbDate.setText(" ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(113, 113, 113)
                                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbRollNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNumOfDays, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDisapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(lbReason, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 24, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRollNo)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNumOfDays)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDate))
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbReason, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDisapprove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(236, 235, 235));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(6, 20, 27)));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(17, 33, 45));
        jLabel3.setText("Leave List");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(127, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(122, 122, 122))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(169, 169, 169));
        jButton1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jButton1.setText("←");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 55, 69)));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisapproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisapproveActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE leave_request_stu SET status = ? WHERE rollno = ?";

        if(lbRollNo.getText().isEmpty() || lbName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
        else{
            Connection conn;
            try {
                conn = ConnectionUtil.getInstance();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, "Disapproved");
                pst.setString(2, lbRollNo.getText());
                pst.executeUpdate();
                int a = pst.executeUpdate();
                if(a > 0)
                {
                    JOptionPane.showMessageDialog(this, "Updated to disapproved.");
                    fetchLeaveList();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LeaveRequest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnDisapproveActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        String sql = "UPDATE leave_request_stu SET status = ? WHERE rollno = ?";

        if(lbRollNo.getText().isEmpty() || lbName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
        else{
            Connection conn;
            try {
                conn = ConnectionUtil.getInstance();
                PreparedStatement pst1 = conn.prepareStatement(sql);
                pst1.setString(1, "Approved");
                pst1.setString(2, lbRollNo.getText());
                int a = pst1.executeUpdate();
                if(a > 0)
                {
                    JOptionPane.showMessageDialog(this, "Updated to approved.");
                    fetchLeaveList();
                }
            } catch (SQLException ex) {
                Logger.getLogger(LeaveRequestStu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        String sql = "Select * from leave_request_stu where rollno = ?";

        if (selectedRow != -1) {

            String rollno = jTable1.getValueAt(selectedRow, 1).toString();
            try {
                Connection conn = ConnectionUtil.getInstance();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, rollno);
                ResultSet rs = pst.executeQuery();

                if(rs.next())
                {
                    String name = rs.getString("name");
                    String numOfDays = rs.getString("num_of_days");
//                    String rollNo= rollno;
                    String reason = rs.getString("reason");
                    String date = rs.getString("date");

                    lbName.setText(name);
                    lbRollNo.setText(rollno);
                    lbNumOfDays.setText(numOfDays);
                    lbReason.setText(reason);
                    lbDate.setText(date);
                }
            } catch (SQLException ex) {
                Logger.getLogger(LeaveRequest.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        FacultyLogin fl = new FacultyLogin(id);
        fl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeaveRequestStu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeaveRequestStu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnDisapprove;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbNumOfDays;
    private javax.swing.JLabel lbReason;
    private javax.swing.JLabel lbRollNo;
    // End of variables declaration//GEN-END:variables

    private void fetchLeaveList() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
          try {
           
            Connection conn= ConnectionUtil.getInstance();
            
            if(conn==null)
            {
                System.out.println("Connection error");
            }
            else{
                    System.out.println("Connection established"); 
            }
            Statement st = conn.createStatement();
            ResultSet rs=  st.executeQuery("select * from leave_request_stu");

          jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                  }  catch (SQLException ex) {
            Logger.getLogger(StudentsList.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
