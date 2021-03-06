/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.gray;
import static java.awt.Color.orange;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author manas singh
 */
public class StudentNotePad extends javax.swing.JFrame {
 Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form StudentNotePad
     */
    public StudentNotePad() {
        initComponents();
         showDate();
    updateCombo();
        showTime();
         this.setLocationRelativeTo(null);
           
   //     Update_material1();
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
     
     public void updateCombo(){   // its for combox to fatch number of data data from the database 
    try{
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
   String sql = " Select * from notepad";
   pst = conn.prepareStatement(sql);
   rs = pst.executeQuery();
   while(rs.next())
   {
   String name = rs.getString("s.no");
   combobox.addItem(name);
   }
    }
    catch(Exception e){}
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        save = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        stdname = new javax.swing.JLabel();
        stdRollNO = new javax.swing.JLabel();
        sno = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        material1 = new javax.swing.JTextArea();
        time = new javax.swing.JLabel();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(931, 506));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel5.setText("X");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 2, -1, 40));

        jLabel13.setFont(new java.awt.Font("Serif", 0, 36)); // NOI18N
        jLabel13.setText("Note Pad");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 180, -1));

        combobox.setBackground(new java.awt.Color(255, 102, 102));
        combobox.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "       Select ", " " }));
        combobox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboboxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboboxActionPerformed(evt);
            }
        });
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 200, 30));

        save.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        save.setText("     SAVE");
        save.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 80, 100, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\manas singh\\Desktop\\icons\\circled-user-male-skin-type-1-2.png")); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 60, 60));

        stdname.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        stdname.setForeground(new java.awt.Color(102, 102, 102));
        stdname.setText("*****\n");
        stdname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stdnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stdnameMouseExited(evt);
            }
        });
        getContentPane().add(stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 80, -1));

        stdRollNO.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        stdRollNO.setForeground(new java.awt.Color(102, 102, 102));
        stdRollNO.setText("***");
        stdRollNO.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdRollNO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stdRollNOMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stdRollNOMouseExited(evt);
            }
        });
        getContentPane().add(stdRollNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        sno.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        sno.setForeground(new java.awt.Color(102, 102, 102));
        sno.setText("S.No...");
        sno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                snoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                snoMouseEntered(evt);
            }
        });
        getContentPane().add(sno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 90, 30));

        material1.setColumns(20);
        material1.setRows(5);
        jScrollPane1.setViewportView(material1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 900, 400));

        time.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        time.setText("Time");
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, -1));

        date.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        date.setText("Date");
        getContentPane().add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stdnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdnameMouseEntered
        stdname.setForeground(orange);
    }//GEN-LAST:event_stdnameMouseEntered

    private void stdnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdnameMouseExited
        stdname.setForeground(white);
    }//GEN-LAST:event_stdnameMouseExited

    private void stdRollNOMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdRollNOMouseEntered
        stdRollNO.setForeground(orange);        // TODO add your handling code here:
    }//GEN-LAST:event_stdRollNOMouseEntered

    private void stdRollNOMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdRollNOMouseExited
        stdRollNO.setForeground(white);           // TODO add your handling code here:
    }//GEN-LAST:event_stdRollNOMouseExited

    private void snoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snoMouseClicked
        sno.setText("");

        sno.setForeground(black);
    }//GEN-LAST:event_snoMouseClicked

    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
  try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into notepad values (?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 
 pstmt.setString(1,stdname.getText());
 
 pstmt.setString(2,stdRollNO.getText());
 
 pstmt.setString(3,date.getText());

 pstmt.setString(4,material1.getText());
 
 pstmt.setString(5,sno.getText());
 
 
 
  pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
     }
     catch(Exception e){}
    updateCombo();
    }//GEN-LAST:event_saveMouseClicked

    private void snoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_snoMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_snoMouseEntered

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
save.setForeground(white);  
save.setBackground(black);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
save.setForeground(black);  
save.setBackground(gray);        // TODO add your handling code here:
    }//GEN-LAST:event_saveMouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
studentform2 open = new studentform2();
          studentform2.studentname.setText(StudentNotePad.stdname.getText());
      studentform2.stdno.setText(StudentNotePad.stdRollNO.getText());
      open.setVisible(true);
              dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboboxActionPerformed

    private void comboboxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboboxPopupMenuWillBecomeInvisible
        String temp = (String)combobox.getSelectedItem();
        String sql="Select * from   `adminlogin`.`notepad` where s.no=? ";  //in the combobox we are showing the rollno of every student
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();

            while(rs.next())
            {

                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("s.no");
                sno.setText(add1);

            }
        }
        catch(Exception e){}

    }//GEN-LAST:event_comboboxPopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(StudentNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentNotePad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentNotePad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea material1;
    private javax.swing.JLabel save;
    private javax.swing.JTextField sno;
    public static javax.swing.JLabel stdRollNO;
    public static javax.swing.JLabel stdname;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
