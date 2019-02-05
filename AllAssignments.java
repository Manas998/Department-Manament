/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.Timer;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author Vs
 */
public class AllAssignments extends javax.swing.JFrame {
 Connection conn=null;            //these are local variable thus local variable are decleared there and global variables are decleared abouve i.e. import waale section me 
PreparedStatement pst=null;
ResultSet rs=null;

    /**
     * Creates new form AllAssignments
     */
    public AllAssignments() {
        initComponents();
         this.setLocationRelativeTo(null);
          Update_tables(); 
          
           showDate();
           
    }
      void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        date.setText(s.format(d));
    }
       private void Update_tables(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
         String sql = "Select username,subject from login";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             table.setModel(DbUtils.resultSetToTableModel(rs));
    
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
      
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        date = new javax.swing.JLabel();
        option1 = new javax.swing.JLabel();
        teachername1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(460, 379));
        setMinimumSize(new java.awt.Dimension(460, 379));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(460, 379));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(null);
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 90, 30));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "T.Name", "Subject"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 290));

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jLabel1.setText("Select Your Leacture ");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 170, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jButton2.setText(" NEXT ");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 90, 30));

        date.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        date.setText("DATE");
        jPanel2.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 100, -1));

        option1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        option1.setText("*****");
        jPanel2.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 140, 170, 30));

        teachername1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        teachername1.setText("teacher name");
        jPanel2.add(teachername1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 440, 310));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel6.setText("Assignment Sections");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 350, 70));

        exit.setFont(new java.awt.Font("Serif", 1, 40)); // NOI18N
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, 20, 30));

        jLabel7.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel7.setText("-");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
      dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
exit.setForeground(red);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
 exit.setForeground(black);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 
        
try{ 
    try {
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
   String sql = " Select subject from login ";
   pst = conn.prepareStatement(sql);
   rs = pst.executeQuery();   
         if(rs.next()){
            
            if(option1.getText().equals("CHOOSE"))
            {
                JOptionPane.showMessageDialog(null," invalid data "," access denaid ",JOptionPane.ERROR_MESSAGE);
            }  
            if(option1.getText().equals("subject1"))
            {
               Assignment1 sb1 = new Assignment1();
            Assignment1.teacherName.setText(AllAssignments.teachername1.getText());
            Assignment1.subname.setText(this.option1.getText().toString());
         sb1.setVisible(true); 
                this.setVisible(false);
             }  
            
             if(option1.getText().toString().equals("subject2"))
            {
              Assignment2 sp2 = new Assignment2();
              Assignment2.teacherName.setText(AllAssignments.teachername1.getText());
            Assignment2.subname.setText(this.option1.getText().toString());
          sp2.setVisible(true); 
                setVisible(false);
             }  
            
             if(option1.getText().toString().equals("subject3"))
            {
              Assignment3 sp3 = new Assignment3();
              Assignment3.teacherName.setText(AllAssignments.teachername1.getText());
            Assignment3.subname.setText(this.option1.getText().toString());
          sp3.setVisible(true); 
                setVisible(false);
             }  
             if(option1.getText().toString().equals("subject4"))
            {
               Assignment4 sp4 = new  Assignment4();
             Assignment4.teacherName.setText(AllAssignments.teachername1.getText());
            Assignment4.subname.setText(this.option1.getText().toString());
          sp4.setVisible(true); 
                setVisible(false);
             }  
             
             if(option1.getText().toString().equals("subject5"))
            {
               Assignment5 sp5 = new  Assignment5();
              Assignment5.teacherName.setText(AllAssignments.teachername1.getText());
            Assignment5.subname.setText(this.option1.getText().toString());
          sp5.setVisible(true); 
                setVisible(false);
             }  
             
             
                  
         }
         else{
             JOptionPane.showMessageDialog(null,"you are invalid user or check your details"," access denaid ",JOptionPane.ERROR_MESSAGE);
         }
     } catch (SQLException ex) {
         Logger.getLogger(AllAssignments.class.getName()).log(Level.SEVERE, null, ex);
     }
}

catch(Exception e){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        /* option*/
         int row = table.getSelectedRow();
        option1.setText(table.getModel().getValueAt(row,1).toString()); // roll.no
       teachername1.setText(table.getModel().getValueAt(row,0).toString());
    }//GEN-LAST:event_tableMouseClicked

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
    //  jPanel2.setBackground(red);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
         //  jPanel2.setBackground(blue);   // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseExited

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
            java.util.logging.Logger.getLogger(AllAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllAssignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel date;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel option1;
    private javax.swing.JTable table;
    public static javax.swing.JLabel teachername1;
    // End of variables declaration//GEN-END:variables
}
