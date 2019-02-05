/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import static java.awt.Color.black;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author manas singh
 */
public class attendence extends javax.swing.JFrame {
 Connection conn=null;            //these are local variable thus local variable are decleared there and global variables are decleared abouve i.e. import waale section me 
PreparedStatement pst=null;
ResultSet rs=null;


    public attendence() {
        initComponents();
        this.setLocationRelativeTo(null);
        showDate();
        showTime();
        updateCombo();
       
        Update_tables(); 
        Update_tables2();
        
       
    }
     private void Update_tables(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
         String sql = "Select rollno , stdname ,fathername from studentdetails";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             table.setModel(DbUtils.resultSetToTableModel(rs));
    
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
     private void Update_tables2(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
         String sql = "Select * from studentattendance ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
             table2.setModel(DbUtils.resultSetToTableModel(rs));
         }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
    
public void updateCombo(){   // its for combox to fatch number of data data from the database 
  
    try{
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
   String sql = " Select * from studentdetails ";
   pst = conn.prepareStatement(sql);
   rs = pst.executeQuery();
   while(rs.next())
   {
   String name = rs.getString("rollno");
   jComboBox1.addItem(name);
        
   }
    }
    catch(Exception e){}
    }
        
     //   below code is for combobox2 which get the values from the table ""studentattendance""  and show only those rollno which data is once add into the system
     //    but its not work accourding to my demand thatswhy my use textfield 
     //   both combobox and textField have same task but combobox have some complication i.e. combobox search operation only works when combobox have its own data 

/*
public void updateCombo2(){ // this combobox get the students roll no fron attendance database to show all the data related to that rollno
try{
    conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
   String sql = " Select * from studentattendance ";
   pst = conn.prepareStatement(sql);
   rs = pst.executeQuery();
   while(rs.next())
   {
   String name = rs.getString("rollno");
   jComboBox4.addItem(name);
   }    
}
catch(Exception e){}
}
*/
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JTextField();
        time = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton17 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextFieldsearch = new javax.swing.JTextField();
        jTextFieldsno = new javax.swing.JTextField();
        textleacture = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(1398, 561));
        setMinimumSize(new java.awt.Dimension(1398, 561));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1398, 561));
        setResizable(false);
        getContentPane().setLayout(null);

        date.setBackground(new java.awt.Color(0, 0, 0));
        date.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("   Today Date");
        date.setBorder(null);
        date.setDoubleBuffered(true);
        date.setDragEnabled(true);
        date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateActionPerformed(evt);
            }
        });
        getContentPane().add(date);
        date.setBounds(950, 30, 90, 17);

        time.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        time.setText("       Time");
        time.setBorder(null);
        time.setSelectionColor(new java.awt.Color(204, 204, 204));
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time);
        time.setBounds(850, 30, 90, 20);

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "S.No", "rollno", "date", "time", "leacture", "Attendance"
            }
        ));
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table2);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 60, 820, 320);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("ADD ATTENDANCE");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(590, 440, 180, 70);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton15.setText("Delete Recod");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton15);
        jButton15.setBounds(700, 520, 120, 30);

        exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exit.setText("X");
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
        getContentPane().add(exit);
        exit.setBounds(1360, 10, 25, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("-");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(1330, 10, 16, 44);

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 48)); // NOI18N
        jLabel5.setText("Attendence");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(310, 0, 330, 70);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "   Roll_No", "      Name", "  Father Name"
            }
        ));
        jScrollPane2.setViewportView(table);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 260, 530);

        jComboBox3.setEditable(true);
        jComboBox3.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " Attendance", "   Present", "   Absent", "     Late", "    Leave" }));
        jComboBox3.setAutoscrolls(true);
        jComboBox3.setBorder(null);
        jComboBox3.setDoubleBuffered(true);
        jComboBox3.setFocusCycleRoot(true);
        jComboBox3.setFocusTraversalPolicyProvider(true);
        jComboBox3.setInheritsPopupMenu(true);
        jComboBox3.setRequestFocusEnabled(true);
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(890, 390, 150, 40);

        jComboBox1.setEditable(true);
        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  Select Roll NO", " " }));
        jComboBox1.setAutoscrolls(true);
        jComboBox1.setBorder(null);
        jComboBox1.setDoubleBuffered(true);
        jComboBox1.setFocusCycleRoot(true);
        jComboBox1.setFocusTraversalPolicyProvider(true);
        jComboBox1.setInheritsPopupMenu(true);
        jComboBox1.setRequestFocusEnabled(true);
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(500, 390, 170, 40);

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setText("Update");
        getContentPane().add(jButton17);
        jButton17.setBounds(550, 520, 120, 30);

        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(220, 410, 30, 20);

        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setBorder(null);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(220, 440, 30, 20);

        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setBorder(null);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(220, 480, 30, 20);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Leacture", "Attendance"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(1110, 100, 270, 450);

        jTextFieldsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextFieldsearch.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldsearch.setText("Search Here..");
        jTextFieldsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldsearchMouseClicked(evt);
            }
        });
        jTextFieldsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldsearchActionPerformed(evt);
            }
        });
        jTextFieldsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldsearchKeyReleased(evt);
            }
        });
        getContentPane().add(jTextFieldsearch);
        jTextFieldsearch.setBounds(1150, 60, 200, 30);

        jTextFieldsno.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jTextFieldsno.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldsno.setText("S.No..");
        jTextFieldsno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldsnoMouseClicked(evt);
            }
        });
        getContentPane().add(jTextFieldsno);
        jTextFieldsno.setBounds(400, 390, 80, 40);

        textleacture.setEditable(false);
        textleacture.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        textleacture.setText("Select your leacture");
        textleacture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textleactureActionPerformed(evt);
            }
        });
        getContentPane().add(textleacture);
        textleacture.setBounds(700, 390, 170, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
/*text1.setText(jComboBox11.getSelectedItem().toString());
text2.setText(jComboBox12.getSelectedItem().toString());
text3.setText(jComboBox13.getSelectedItem().toString());
text4.setText(jComboBox14.getSelectedItem().toString());
text5.setText(jComboBox15.getSelectedItem().toString());
text6.setText(jComboBox16.getSelectedItem().toString());
text7.setText(jComboBox17.getSelectedItem().toString());
text8.setText(jComboBox18.getSelectedItem().toString());
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();

model.addRow(new Object[]{time.getText(),date.getText(),text1.getText(),text2.getText(),text3.getText(),text4.getText(),text5.getText(),text6.getText(),text7.getText(),text8.getText()});     
*/
try{
    try{
        if(jTextFieldsno.getText().equals("S.No.."))
        {
            
            JOptionPane.showMessageDialog(null,"invalid data For S.No","",JOptionPane.ERROR_MESSAGE);
           
        }
        else if(jTextFieldsno.getText().equals("  "))
        {  
             JOptionPane.showMessageDialog(null,"S.no is empty","",JOptionPane.ERROR_MESSAGE);
        }    
        
         else if(jComboBox1.getSelectedItem().toString().equals("  Select Roll NO"))
        {
        JOptionPane.showMessageDialog(null,"invalid data For Student Roll.NO ","",JOptionPane.ERROR_MESSAGE);
        }
        
          else if(jComboBox1.getSelectedItem().toString().equals("  "))
        {
        JOptionPane.showMessageDialog(null,"Roll.NO is empty ","",JOptionPane.ERROR_MESSAGE);
        }
          
        else if(textleacture.getText().equals("Select your leacture")){
        JOptionPane.showMessageDialog(null,"invalid data For Leacture","",JOptionPane.ERROR_MESSAGE);
        }
        
       else if(jComboBox3.getSelectedItem().toString().equals("Attendance"))
        {
          JOptionPane.showMessageDialog(null,"invalid data Fro Attendance","",JOptionPane.ERROR_MESSAGE);
        } 
       
       else if(jComboBox3.getSelectedItem().toString().equals("  "))
        {
          JOptionPane.showMessageDialog(null,"leacture is empty ","",JOptionPane.ERROR_MESSAGE);
        } 
       
      
       else{
 DefaultTableModel model = (DefaultTableModel)table2.getModel();
jTextField1.setText(jComboBox1.getSelectedItem().toString());       // this a way through which we can get comobox values into the text field and then this textfield values into the jtable
      jTextField2.setText(textleacture.getText());
      jTextField3.setText(jComboBox3.getSelectedItem().toString());
      model.addRow(new Object[]{jTextFieldsno.getText(),jTextField1.getText(),date.getText(),time.getText(), jTextField2.getText(),jTextField3.getText()});     
       }
    }
    catch(Exception e){}
    
    try{
    try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into studentattendance values (?,?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 pstmt.setString(1,jTextFieldsno.getText());

 
 String gnd;   // this is use for combpBOX  to save data into the database 
 gnd= jComboBox1.getSelectedItem().toString();
 pstmt.setString(2,gnd);
 
  pstmt.setString(3,date.getText());
  
   pstmt.setString(4,time.getText());
 
  String gnd2;   // this is use for combpBOX  to save data into the database 
 gnd2 = textleacture.getText();
 pstmt.setString(5,gnd2);
 
String mav;   // this is use for combpBOX  to save data into the database 
 mav = jComboBox3.getSelectedItem().toString();
 pstmt.setString(6,mav);
 
 pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();

 }
catch(Exception e){}}
    catch(Exception e){}
}
catch(Exception e){}
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
  DefaultTableModel model = (DefaultTableModel) table2.getModel();
       
       try
       {
          int SelectedRowIndex =table2.getSelectedRow();
          model.removeRow(SelectedRowIndex);
       }
       catch(Exception e)
       {
           JOptionPane.showMessageDialog(null,e);
       }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_timeActionPerformed

    private void dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateActionPerformed

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
  dispose();  
    }//GEN-LAST:event_exitMouseClicked

    private void jTextFieldsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldsearchKeyReleased
       
        /*  String qurey = jTextField4.getText().toLowerCase();
        
        filter(qurey);*/
        try{
            Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
            String query= "select date, leacture,Attendance from studentattendance where rollno=?";
           PreparedStatement  pst = conn.prepareStatement(query);
           pst.setString(1,jTextFieldsearch.getText());
           ResultSet rs = pst.executeQuery();
          jTable2.setModel(DbUtils.resultSetToTableModel(rs));
          
          pst.close();
          
        }
        catch(Exception e){}       
        
    }//GEN-LAST:event_jTextFieldsearchKeyReleased

    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
         int row = table2.getSelectedRow();
      
       // combobox get means comcbonox se humne vo waale value le hai..... set measn hum se combobox me vo waale value set krvaaye hai 
       jTextFieldsno.setText(table2.getModel().getValueAt(row,0).toString());
     jComboBox1.setSelectedItem(table2.getModel().getValueAt(row,1).toString()); // roll.no
      textleacture.setText(table2.getModel().getValueAt(row,4).toString());  // leacture
       jComboBox3.setSelectedItem(table2.getModel().getValueAt(row,5).toString()); // atendance
    }//GEN-LAST:event_table2MouseClicked

    private void jTextFieldsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldsearchActionPerformed

    private void jTextFieldsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldsearchMouseClicked
      jTextFieldsearch.setText("");
   
      jTextFieldsearch.setForeground(black);   
    }//GEN-LAST:event_jTextFieldsearchMouseClicked

    private void jTextFieldsnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldsnoMouseClicked
        jTextFieldsno.setText("");
   
     jTextFieldsno.setForeground(black);   
    }//GEN-LAST:event_jTextFieldsnoMouseClicked

    private void textleactureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textleactureActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textleactureActionPerformed

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setForeground(red); // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(black);
    }//GEN-LAST:event_exitMouseExited

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
int row = jTable2.getSelectedRow();
 jComboBox3.setSelectedItem(jTable2.getModel().getValueAt(row,2).toString()); //

    }//GEN-LAST:event_jTable2MouseClicked

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
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new attendence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField date;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton17;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextFieldsearch;
    private javax.swing.JTextField jTextFieldsno;
    private javax.swing.JTable table;
    private javax.swing.JTable table2;
    public static javax.swing.JTextField textleacture;
    private javax.swing.JTextField time;
    // End of variables declaration//GEN-END:variables
 
    private void updateJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void UpdateJTable() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void toLowerCase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void filter(String qurey) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

