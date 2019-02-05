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
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author Vs
 */
public class userdetail extends javax.swing.JFrame {
 Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form userdetail
     */
    public userdetail() {
        initComponents();
        updateCombo();
        this.setLocationRelativeTo(null);  //make the frame to center
    }
    public void updateCombo(){   // its for combox to fatch number of data data from the database 
    try{
   conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
   String sql = " Select * from userdatail";
   pst = conn.prepareStatement(sql);
   rs = pst.executeQuery();
   while(rs.next())
   {
   String name = rs.getString("ADMINNAME");
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        icon = new javax.swing.JLabel();
        panle2 = new javax.swing.JPanel();
        attendancePageOpens = new javax.swing.JLabel();
        panle1 = new javax.swing.JPanel();
        lable1 = new javax.swing.JLabel();
        panle3 = new javax.swing.JPanel();
        lable2 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        lable4image = new javax.swing.JLabel();
        path = new javax.swing.JTextField();
        UPLOAD = new javax.swing.JLabel();
        SAVE = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(897, 506));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        icon.setIcon(new javax.swing.ImageIcon("C:\\Users\\manas singh\\Desktop\\avatar-user-teacher-312a499a08079a12-512x512.png")); // NOI18N

        name1.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        name1.setText("ADMIN LOGIN");
        name1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        panle2.setBackground(new java.awt.Color(153, 153, 255));
        panle2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panle2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panle2MouseExited(evt);
            }
        });

        attendancePageOpens.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        attendancePageOpens.setText("     ATTENDANCE");
        attendancePageOpens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendancePageOpensMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendancePageOpensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendancePageOpensMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panle2Layout = new javax.swing.GroupLayout(panle2);
        panle2.setLayout(panle2Layout);
        panle2Layout.setHorizontalGroup(
            panle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panle2Layout.createSequentialGroup()
                .addComponent(attendancePageOpens, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        panle2Layout.setVerticalGroup(
            panle2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panle2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(attendancePageOpens, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panle1.setBackground(new java.awt.Color(153, 153, 255));
        panle1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panle1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panle1MouseExited(evt);
            }
        });

        lable1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        lable1.setText("     ADD STUDENT ");
        lable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panle1Layout = new javax.swing.GroupLayout(panle1);
        panle1.setLayout(panle1Layout);
        panle1Layout.setHorizontalGroup(
            panle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lable1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panle1Layout.setVerticalGroup(
            panle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panle1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lable1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        panle3.setBackground(new java.awt.Color(153, 153, 255));
        panle3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panle3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panle3MouseExited(evt);
            }
        });

        lable2.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        lable2.setText("     ASSIGNMENTS");
        lable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lable2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lable2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panle3Layout = new javax.swing.GroupLayout(panle3);
        panle3.setLayout(panle3Layout);
        panle3Layout.setHorizontalGroup(
            panle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panle3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panle3Layout.setVerticalGroup(
            panle3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panle3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lable2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(panle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(icon)
                    .addComponent(name1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(icon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addGap(38, 38, 38)
                .addComponent(panle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(panle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(panle3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 150, 510));

        exit.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, -1, -1));

        mini.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        mini.setText("-");
        mini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, 30));

        name2.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        name2.setText("ADMIN LOGIN");
        name2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(name2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 100, 20));

        jDesktopPane1.setBackground(new java.awt.Color(204, 255, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(700, 400));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(700, 400));
        jDesktopPane1.setLayout(new java.awt.CardLayout());

        lable4image.setForeground(new java.awt.Color(255, 255, 255));
        jDesktopPane1.add(lable4image, "card2");

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 700, 400));

        path.setEditable(false);
        path.setFont(new java.awt.Font("Serif", 0, 11)); // NOI18N
        getContentPane().add(path, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 390, 30));

        UPLOAD.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        UPLOAD.setText(" UPLOAD NEW SCHEDULE ");
        UPLOAD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        UPLOAD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UPLOAD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPLOADMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UPLOADMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UPLOADMouseExited(evt);
            }
        });
        getContentPane().add(UPLOAD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        SAVE.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        SAVE.setText("  SAVE / EDIT ");
        SAVE.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        SAVE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SAVE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SAVEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SAVEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SAVEMouseExited(evt);
            }
        });
        getContentPane().add(SAVE, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        leacture.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        leacture.setText("   Subject Names");
        leacture.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        leacture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                leactureMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                leactureMouseExited(evt);
            }
        });
        getContentPane().add(leacture, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 110, 20));

        combobox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                comboboxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        getContentPane().add(combobox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, 160, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       JFrame frame = new JFrame("EXIT");          
      if(JOptionPane.showConfirmDialog(frame,"confirn if you want to sing-out","",
              JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_CANCEL_OPTION)
      {
       System.exit(0);    
        new loginSsystem.setVisible(true);
      }
      System.exit(1);
       
    }//GEN-LAST:event_exitMouseClicked

    private void SAVEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAVEMouseClicked
       try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into userdatail values (?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 

 
 pstmt.setString(3,name1.getText());
 
  pstmt.setBytes(2,photo);
 
 pstmt.setString(1,leacture.getText());
 



 pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
 
 }
 catch(Exception e){
 JOptionPane.showMessageDialog(null,e);
 }
    }//GEN-LAST:event_SAVEMouseClicked

    private void UPLOADMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPLOADMouseClicked
 JFileChooser chooser= new JFileChooser();
   chooser.showOpenDialog(null);
   File f = chooser.getSelectedFile();
  lable4image.setIcon(new ImageIcon(f.toString()));
  filename = f.getAbsolutePath();
  path.setText(filename);
  
  try{
  File image = new File(filename);
  FileInputStream fis = new FileInputStream(image);
  ByteArrayOutputStream bos = new ByteArrayOutputStream();
  byte[] buf = new byte[(0x11aa6)];   // INCREASE THIS BYTES 1024 TO SOMETHIN GTHAT WHICH CAN STORE APPROX 2-10 mbs file or photo
   for(int readNum; (readNum=fis.read(buf))!=-1;)
   {
       bos.write(buf,0,readNum);
       
   }
   photo=bos.toByteArray();
  }
  catch(Exception e){
  JOptionPane.showMessageDialog(null,e);
  }        // TODO add your handling code here:
    }//GEN-LAST:event_UPLOADMouseClicked

    private void UPLOADMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPLOADMouseEntered
     UPLOAD.setForeground(white);
     UPLOAD.setBackground(black);     
    }//GEN-LAST:event_UPLOADMouseEntered

    private void UPLOADMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPLOADMouseExited
       UPLOAD.setForeground(black);
     UPLOAD.setBackground(white);  
    }//GEN-LAST:event_UPLOADMouseExited

    private void SAVEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAVEMouseEntered
     SAVE.setForeground(white);
     SAVE.setBackground(black);  
    }//GEN-LAST:event_SAVEMouseEntered

    private void SAVEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SAVEMouseExited
       SAVE.setForeground(black);
     SAVE.setBackground(white);
    }//GEN-LAST:event_SAVEMouseExited

    private void panle2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle2MouseEntered
    panle2.setBackground(gray);
    }//GEN-LAST:event_panle2MouseEntered

    private void lable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable1MouseEntered
    lable1.setForeground(white);      
    }//GEN-LAST:event_lable1MouseEntered

    private void lable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable2MouseEntered
    lable2.setForeground(white); 
    }//GEN-LAST:event_lable2MouseEntered

    private void attendancePageOpensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancePageOpensMouseEntered
     attendancePageOpens.setForeground(white); 
    }//GEN-LAST:event_attendancePageOpensMouseEntered

    private void lable1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable1MouseExited
       lable1.setForeground(black); 
    }//GEN-LAST:event_lable1MouseExited

    private void lable2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable2MouseExited
        lable2.setForeground(black); 
    }//GEN-LAST:event_lable2MouseExited

    private void attendancePageOpensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancePageOpensMouseExited
        attendancePageOpens.setForeground(black); 
    }//GEN-LAST:event_attendancePageOpensMouseExited

    private void panle1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle1MouseEntered
     panle1.setBackground(gray);
    }//GEN-LAST:event_panle1MouseEntered

    private void panle1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle1MouseExited
        panle1.setBackground(blue);
    }//GEN-LAST:event_panle1MouseExited

    private void panle2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle2MouseExited
        panle2.setBackground(blue);
    }//GEN-LAST:event_panle2MouseExited

    private void panle3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle3MouseEntered
      panle3.setBackground(gray);
    }//GEN-LAST:event_panle3MouseEntered

    private void panle3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panle3MouseExited
       panle3.setBackground(blue);
    }//GEN-LAST:event_panle3MouseExited

    private void lable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable1MouseClicked
      addstudent st= new addstudent();
        st.setVisible(true);                //2   
            dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_lable1MouseClicked

    private void lable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lable2MouseClicked
          AllAssignments usr = new AllAssignments();
            AllAssignments.teachername1.setText(this.name1.getText());
            AllAssignments.option1.setText(userdetail.leacture.getText());
           
         //  teachername1.setSelectedItem(table.getModel().getValueAt(row,1).toString()); // roll.no
          // use this way to set a value to combobox 
           
          usr.setVisible(true); 
    }//GEN-LAST:event_lable2MouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
      exit.setForeground(red);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(black);
    }//GEN-LAST:event_exitMouseExited

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
       mini.setForeground(blue);
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setForeground(black);
    }//GEN-LAST:event_miniMouseExited

    private void attendancePageOpensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendancePageOpensMouseClicked
       attendence usr = new attendence();
           attendence.textleacture.setText(this.leacture.getText());
          
            usr.setVisible(true); 
    }//GEN-LAST:event_attendancePageOpensMouseClicked

    private void leactureMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leactureMouseEntered
    leacture.setForeground(blue);
    
    
    }//GEN-LAST:event_leactureMouseEntered

    private void leactureMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_leactureMouseExited
      leacture.setForeground(black); 
      
    }//GEN-LAST:event_leactureMouseExited

    private void comboboxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_comboboxPopupMenuWillBecomeInvisible
     String temp = (String)combobox.getSelectedItem();
      String sql="Select * from   `adminlogin`.`userdatail` where ADMINNAME=? ";  //in the combobox we are showing the rollno of every student
        try{
            byte[] imageBytes;
            Image image;
      pst = conn.prepareStatement(sql);     
      pst.setString(1,temp);      
      rs=pst.executeQuery();
      
     while(rs.next())
      {
          
        String add0 = rs.getString("photo");
         lable4image.setText(add0);  
          
          
       String add1 = rs.getString("photo");
       imageBytes = rs.getBytes(8);
       image=getToolkit().createImage(imageBytes);
       ImageIcon icon= new ImageIcon(image);
         lable4image.setIcon(icon);
    
      }
      }
      catch(Exception e){}// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(userdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userdetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userdetail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SAVE;
    private javax.swing.JLabel UPLOAD;
    private javax.swing.JLabel attendancePageOpens;
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel icon;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lable1;
    private javax.swing.JLabel lable2;
    private javax.swing.JLabel lable4image;
    public static final javax.swing.JLabel leacture = new javax.swing.JLabel();
    private javax.swing.JLabel mini;
    public static final javax.swing.JLabel name1 = new javax.swing.JLabel();
    public static final javax.swing.JLabel name2 = new javax.swing.JLabel();
    private javax.swing.JPanel panle1;
    private javax.swing.JPanel panle2;
    private javax.swing.JPanel panle3;
    private javax.swing.JTextField path;
    // End of variables declaration//GEN-END:variables
byte[] photo=null;
String filename=null;

    private void While(boolean next) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
