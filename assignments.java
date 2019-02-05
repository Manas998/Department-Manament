/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myapplication;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;



/**
 *
 * @author DELL
 */
public class assignments extends javax.swing.JFrame {

    /**
     * Creates new form assignments
     */
    public assignments() {
       initComponents();
        this.setLocationRelativeTo(null);
        showDate();
        showTime();
    }
   void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                time.setText(s.format(d));
            }

        }).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButtonassignment1 = new javax.swing.JButton();
        jButtonassignment2 = new javax.swing.JButton();
        jButtonassignment3 = new javax.swing.JButton();
        jButtonassignment4 = new javax.swing.JButton();
        jButtonassignmrnt5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAssignment = new javax.swing.JTextArea();
        jButton6 = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        time = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1043, 575));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("-");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("RDBMS Assignment");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("< back");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(174, 174, 174)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 1050, 72));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jButtonassignment1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonassignment1.setText("Assignment 1");
        jButtonassignment1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonassignment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonassignment1ActionPerformed(evt);
            }
        });

        jButtonassignment2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonassignment2.setText("Assignment 2");
        jButtonassignment2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonassignment2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonassignment2ActionPerformed(evt);
            }
        });

        jButtonassignment3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonassignment3.setText("Assignment 3");
        jButtonassignment3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonassignment3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonassignment3ActionPerformed(evt);
            }
        });

        jButtonassignment4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonassignment4.setText("Assignment 4");
        jButtonassignment4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonassignment4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonassignment4ActionPerformed(evt);
            }
        });

        jButtonassignmrnt5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonassignmrnt5.setText("Assignment 5");
        jButtonassignmrnt5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonassignmrnt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonassignmrnt5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonassignmrnt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonassignment4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonassignment3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonassignment2))
                    .addComponent(jButtonassignment1))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButtonassignment1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonassignment2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonassignment3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jButtonassignment4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jButtonassignmrnt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 119, -1, -1));

        jTextAssignment.setColumns(20);
        jTextAssignment.setRows(5);
        jScrollPane1.setViewportView(jTextAssignment);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 119, 485, 440));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton6.setText("SENT");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 400, 110, 50));

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButtonReset.setText("Clear");
        jButtonReset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 480, 110, 49));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("      Submission Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 260, 130, -1));

        date.setBackground(new java.awt.Color(204, 204, 204));
        date.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        date.setText("   Today Date");
        date.setBorder(null);
        date.setDoubleBuffered(true);
        date.setDragEnabled(true);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 166, 93, -1));

        jComboBox3.setEditable(true);
        jComboBox3.setMaximumRowCount(40);
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "    DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 290, 55, -1));

        jComboBox4.setEditable(true);
        jComboBox4.setMaximumRowCount(13);
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 290, 74, -1));

        time.setBackground(new java.awt.Color(204, 204, 204));
        time.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        time.setText("       Time");
        time.setBorder(null);
        time.setSelectionColor(new java.awt.Color(204, 204, 204));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(917, 138, 93, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
   AllAssignments all= new AllAssignments();
   all.setVisible(true);
dispose(); 
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
      AllAssignments Info = new AllAssignments ();
       Info.setVisible(true);              
       dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
       jTextAssignment.setText(null);
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonassignment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonassignment1ActionPerformed
      jTextAssignment.append("                              Assignment NO_1    \n" 
              +"================================================================\n"
      +"                Quection NO-1\n" 
       +"WHAT IS THE DIFFERENCE BETWEEN ANALOGE AND DIGITAL SIGNAL?\n\n"
      +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
              
      );
    }//GEN-LAST:event_jButtonassignment1ActionPerformed

    private void jButtonassignment2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonassignment2ActionPerformed
      jTextAssignment.append("                              Assignment NO_2    \n" 
              +"================================================================\n"
      +"                Quection NO-1\n" 
       +"WHAT IS THE DIFFERENCE BETWEEN ANALOGE AND DIGITAL SIGNAL?\n\n"
      +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
              );       
    }//GEN-LAST:event_jButtonassignment2ActionPerformed

    private void jButtonassignment3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonassignment3ActionPerformed
jTextAssignment.append("                              Assignment NO_3    \n" 
              +"================================================================\n"
      +"                Quection NO-1\n" 
       +"WHAT IS THE DIFFERENCE BETWEEN ANALOGE AND DIGITAL SIGNAL?\n\n"
      +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
              );               // TODO add your handling code here:
    }//GEN-LAST:event_jButtonassignment3ActionPerformed

    private void jButtonassignment4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonassignment4ActionPerformed
jTextAssignment.append("                              Assignment NO_4    \n" 
              +"================================================================\n"
      +"                Quection NO-1\n" 
       +"WHAT IS THE DIFFERENCE BETWEEN ANALOGE AND DIGITAL SIGNAL?\n\n"
      +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
              );               // TODO add your handling code here:
    }//GEN-LAST:event_jButtonassignment4ActionPerformed

    private void jButtonassignmrnt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonassignmrnt5ActionPerformed
jTextAssignment.append("                              Assignment NO_5    \n" 
              +"================================================================\n"
      +"                Quection NO-1\n" 
       +"WHAT IS THE DIFFERENCE BETWEEN ANALOGE AND DIGITAL SIGNAL?\n\n"
      +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
               +"Quection NO-2\n"
      +"DRAW THE AYMBOL AND TRUTH TABLE OF ALL THE GATES?\n\n"
              );               // TODO add your handling code here:
    }//GEN-LAST:event_jButtonassignmrnt5ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

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
            java.util.logging.Logger.getLogger(assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(assignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new assignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonassignment1;
    private javax.swing.JButton jButtonassignment2;
    private javax.swing.JButton jButtonassignment3;
    private javax.swing.JButton jButtonassignment4;
    private javax.swing.JButton jButtonassignmrnt5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAssignment;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables

   
}
