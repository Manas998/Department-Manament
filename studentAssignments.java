/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import static java.awt.Color.black;
import static java.awt.Color.red;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import net.proteanit.sql.DbUtils;
import static myapplication.studentAttendance.wwww;

/**
 *
 * @author manas singh
 */
public class studentAssignments extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
    /**
     * Creates new form studentAttendance
     */
    public studentAssignments() {
        initComponents();
         this.setLocationRelativeTo(null);
        Update_material1();
        Update_material2();
        Update_material3();
        Update_material4();
        Update_material5();
    }
   private void Update_material1(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
          String temp = (String)assignment1.getText();
         String sql = "Select material from assignment1allsub ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())
           {    
            material1.setText(rs.getString(1));
           }
         
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
      private void Update_material2(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
          String temp = (String)assignment1.getText();
         String sql = "Select material from assignment2allsub ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())
           {    
            material2.setText(rs.getString(1));
           }
         
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
         private void Update_material3(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
          String temp = (String)assignment1.getText();
         String sql = "Select material from assignment3allsub ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())
           {    
            material3.setText(rs.getString(1));
           }
         
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
            private void Update_material4(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
          String temp = (String)assignment1.getText();
         String sql = "Select material from assignment4allsub ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())
           {    
            material4.setText(rs.getString(1));
           }
         
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
               private void Update_material5(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
          String temp = (String)assignment1.getText();
         String sql = "Select material from assignment5allsub ";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())
           {    
            material5.setText(rs.getString(1));
           }
         
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

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        stdname = new javax.swing.JLabel();
        stdRollNO = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        defaultPanel = new javax.swing.JPanel();
        subjectpanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        material1 = new javax.swing.JTextArea();
        Date = new javax.swing.JLabel();
        givendate1 = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        submisssiondate1 = new javax.swing.JLabel();
        submisssionmonth1 = new javax.swing.JLabel();
        subjectpanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        material2 = new javax.swing.JTextArea();
        Date2 = new javax.swing.JLabel();
        givendate2 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        Date3 = new javax.swing.JLabel();
        submisssiondate2 = new javax.swing.JLabel();
        submisssionmonth2 = new javax.swing.JLabel();
        subjectpanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        material3 = new javax.swing.JTextArea();
        Date4 = new javax.swing.JLabel();
        givendate3 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        Date5 = new javax.swing.JLabel();
        submisssiondate3 = new javax.swing.JLabel();
        submisssionmonth3 = new javax.swing.JLabel();
        subjectpanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        material4 = new javax.swing.JTextArea();
        Date6 = new javax.swing.JLabel();
        givendate4 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        Date7 = new javax.swing.JLabel();
        submisssiondate4 = new javax.swing.JLabel();
        submisssionmonth4 = new javax.swing.JLabel();
        subjectpanel5 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        material5 = new javax.swing.JTextArea();
        Date8 = new javax.swing.JLabel();
        givendate5 = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        Date9 = new javax.swing.JLabel();
        submisssiondate5 = new javax.swing.JLabel();
        submisssionmonth5 = new javax.swing.JLabel();
        get = new javax.swing.JComboBox<>();
        assignment1 = new javax.swing.JLabel();
        assignment2 = new javax.swing.JLabel();
        assignment3 = new javax.swing.JLabel();
        assignment4 = new javax.swing.JLabel();
        assignment5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/classroom.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/attnedance.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/result.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/timetable.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/assignmnets.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/notes.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 530));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Stencil Std", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Assignments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 190, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/user.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, -1));

        exit.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 0, -1, 30));

        mini.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        mini.setText("-");
        getContentPane().add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 0, -1, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stdname.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        stdname.setText("******");
        jPanel3.add(stdname, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 64, -1, -1));

        stdRollNO.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        stdRollNO.setText("******");
        jPanel3.add(stdRollNO, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 94, -1, -1));

        mainpanel.setBackground(new java.awt.Color(51, 51, 51));
        mainpanel.setLayout(new java.awt.CardLayout());

        defaultPanel.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 940, Short.MAX_VALUE)
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        mainpanel.add(defaultPanel, "card7");

        subjectpanel1.setBackground(new java.awt.Color(102, 102, 102));

        material1.setColumns(20);
        material1.setRows(5);
        jScrollPane1.setViewportView(material1);

        Date.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(255, 255, 255));
        Date.setText("Given Date :");

        givendate1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        givendate1.setForeground(new java.awt.Color(255, 255, 255));
        givendate1.setText("*****");

        Date1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date1.setForeground(new java.awt.Color(255, 255, 255));
        Date1.setText("Submission Date :");

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Assignment 1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Assignment 2");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(102, 102, 102));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Assignment 3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Assignment 4");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Assignment 5");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        submisssiondate1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssiondate1.setForeground(new java.awt.Color(255, 255, 255));
        submisssiondate1.setText("***");

        submisssionmonth1.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssionmonth1.setForeground(new java.awt.Color(255, 255, 255));
        submisssionmonth1.setText("***");

        javax.swing.GroupLayout subjectpanel1Layout = new javax.swing.GroupLayout(subjectpanel1);
        subjectpanel1.setLayout(subjectpanel1Layout);
        subjectpanel1Layout.setHorizontalGroup(
            subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel1Layout.createSequentialGroup()
                        .addComponent(Date)
                        .addGap(18, 18, 18)
                        .addComponent(givendate1)
                        .addGap(75, 75, 75)
                        .addComponent(Date1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssiondate1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssionmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        subjectpanel1Layout.setVerticalGroup(
            subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date)
                        .addComponent(givendate1))
                    .addGroup(subjectpanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date1)
                        .addComponent(submisssiondate1)
                        .addComponent(submisssionmonth1)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(subjectpanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        mainpanel.add(subjectpanel1, "card2");

        subjectpanel2.setBackground(new java.awt.Color(102, 102, 102));

        material2.setColumns(20);
        material2.setRows(5);
        jScrollPane2.setViewportView(material2);

        Date2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date2.setForeground(new java.awt.Color(255, 255, 255));
        Date2.setText("Given Date :");

        givendate2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        givendate2.setForeground(new java.awt.Color(255, 255, 255));
        givendate2.setText("*****");

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Assignment 1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(102, 102, 102));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Assignment 2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(102, 102, 102));
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("Assignment 3");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Assignment 4");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 102, 102));
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Assignment 5");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        Date3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date3.setForeground(new java.awt.Color(255, 255, 255));
        Date3.setText("Submission Date :");

        submisssiondate2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssiondate2.setForeground(new java.awt.Color(255, 255, 255));
        submisssiondate2.setText("***");

        submisssionmonth2.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssionmonth2.setForeground(new java.awt.Color(255, 255, 255));
        submisssionmonth2.setText("***");

        javax.swing.GroupLayout subjectpanel2Layout = new javax.swing.GroupLayout(subjectpanel2);
        subjectpanel2.setLayout(subjectpanel2Layout);
        subjectpanel2Layout.setHorizontalGroup(
            subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel2Layout.createSequentialGroup()
                        .addComponent(Date2)
                        .addGap(18, 18, 18)
                        .addComponent(givendate2)
                        .addGap(75, 75, 75)
                        .addComponent(Date3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssiondate2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssionmonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        subjectpanel2Layout.setVerticalGroup(
            subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date2)
                        .addComponent(givendate2))
                    .addGroup(subjectpanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date3)
                        .addComponent(submisssiondate2)
                        .addComponent(submisssionmonth2)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(subjectpanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        mainpanel.add(subjectpanel2, "card3");

        subjectpanel3.setBackground(new java.awt.Color(102, 102, 102));

        material3.setColumns(20);
        material3.setRows(5);
        jScrollPane3.setViewportView(material3);

        Date4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date4.setForeground(new java.awt.Color(255, 255, 255));
        Date4.setText("Given Date :");

        givendate3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        givendate3.setForeground(new java.awt.Color(255, 255, 255));
        givendate3.setText("*****");

        jButton11.setBackground(new java.awt.Color(102, 102, 102));
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Assignment 1");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 102, 102));
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Assignment 2");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(102, 102, 102));
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Assignment 3");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setBackground(new java.awt.Color(102, 102, 102));
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Assignment 4");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton15.setBackground(new java.awt.Color(102, 102, 102));
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Assignment 5");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        Date5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date5.setForeground(new java.awt.Color(255, 255, 255));
        Date5.setText("Submission Date :");

        submisssiondate3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssiondate3.setForeground(new java.awt.Color(255, 255, 255));
        submisssiondate3.setText("***");

        submisssionmonth3.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssionmonth3.setForeground(new java.awt.Color(255, 255, 255));
        submisssionmonth3.setText("***");

        javax.swing.GroupLayout subjectpanel3Layout = new javax.swing.GroupLayout(subjectpanel3);
        subjectpanel3.setLayout(subjectpanel3Layout);
        subjectpanel3Layout.setHorizontalGroup(
            subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel3Layout.createSequentialGroup()
                        .addComponent(Date4)
                        .addGap(18, 18, 18)
                        .addComponent(givendate3)
                        .addGap(75, 75, 75)
                        .addComponent(Date5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssiondate3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssionmonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        subjectpanel3Layout.setVerticalGroup(
            subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date4)
                        .addComponent(givendate3))
                    .addGroup(subjectpanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date5)
                        .addComponent(submisssiondate3)
                        .addComponent(submisssionmonth3)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(subjectpanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        mainpanel.add(subjectpanel3, "card4");

        subjectpanel4.setBackground(new java.awt.Color(102, 102, 102));

        material4.setColumns(20);
        material4.setRows(5);
        jScrollPane4.setViewportView(material4);

        Date6.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date6.setForeground(new java.awt.Color(255, 255, 255));
        Date6.setText("Given Date :");

        givendate4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        givendate4.setForeground(new java.awt.Color(255, 255, 255));
        givendate4.setText("*****");

        jButton16.setBackground(new java.awt.Color(102, 102, 102));
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Assignment 1");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton17.setBackground(new java.awt.Color(102, 102, 102));
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Assignment 2");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton18.setBackground(new java.awt.Color(102, 102, 102));
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Assignment 3");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setBackground(new java.awt.Color(102, 102, 102));
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Assignment 4");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setBackground(new java.awt.Color(102, 102, 102));
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Assignment 5");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        Date7.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date7.setForeground(new java.awt.Color(255, 255, 255));
        Date7.setText("Submission Date :");

        submisssiondate4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssiondate4.setForeground(new java.awt.Color(255, 255, 255));
        submisssiondate4.setText("***");

        submisssionmonth4.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssionmonth4.setForeground(new java.awt.Color(255, 255, 255));
        submisssionmonth4.setText("***");

        javax.swing.GroupLayout subjectpanel4Layout = new javax.swing.GroupLayout(subjectpanel4);
        subjectpanel4.setLayout(subjectpanel4Layout);
        subjectpanel4Layout.setHorizontalGroup(
            subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel4Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel4Layout.createSequentialGroup()
                        .addComponent(Date6)
                        .addGap(18, 18, 18)
                        .addComponent(givendate4)
                        .addGap(75, 75, 75)
                        .addComponent(Date7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssiondate4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssionmonth4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        subjectpanel4Layout.setVerticalGroup(
            subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date6)
                        .addComponent(givendate4))
                    .addGroup(subjectpanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date7)
                        .addComponent(submisssiondate4)
                        .addComponent(submisssionmonth4)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(subjectpanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        mainpanel.add(subjectpanel4, "card5");

        subjectpanel5.setBackground(new java.awt.Color(102, 102, 102));

        material5.setColumns(20);
        material5.setRows(5);
        jScrollPane5.setViewportView(material5);

        Date8.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date8.setForeground(new java.awt.Color(255, 255, 255));
        Date8.setText("Given Date :");

        givendate5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        givendate5.setForeground(new java.awt.Color(255, 255, 255));
        givendate5.setText("*****");

        jButton21.setBackground(new java.awt.Color(102, 102, 102));
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Assignment 1");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setBackground(new java.awt.Color(102, 102, 102));
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Assignment 2");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jButton23.setBackground(new java.awt.Color(102, 102, 102));
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Assignment 3");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jButton24.setBackground(new java.awt.Color(102, 102, 102));
        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setText("Assignment 4");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(102, 102, 102));
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Assignment 5");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        Date9.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Date9.setForeground(new java.awt.Color(255, 255, 255));
        Date9.setText("Submission Date :");

        submisssiondate5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssiondate5.setForeground(new java.awt.Color(255, 255, 255));
        submisssiondate5.setText("***");

        submisssionmonth5.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        submisssionmonth5.setForeground(new java.awt.Color(255, 255, 255));
        submisssionmonth5.setText("***");

        javax.swing.GroupLayout subjectpanel5Layout = new javax.swing.GroupLayout(subjectpanel5);
        subjectpanel5.setLayout(subjectpanel5Layout);
        subjectpanel5Layout.setHorizontalGroup(
            subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel5Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel5Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subjectpanel5Layout.createSequentialGroup()
                        .addComponent(Date8)
                        .addGap(18, 18, 18)
                        .addComponent(givendate5)
                        .addGap(75, 75, 75)
                        .addComponent(Date9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssiondate5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submisssionmonth5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        subjectpanel5Layout.setVerticalGroup(
            subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subjectpanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date8)
                        .addComponent(givendate5))
                    .addGroup(subjectpanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Date9)
                        .addComponent(submisssiondate5)
                        .addComponent(submisssionmonth5)))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(subjectpanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        mainpanel.add(subjectpanel5, "card6");

        jPanel3.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 940, 400));

        get.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Subject", "Subject 1", "Subject 2", "Subject 3", "Subject 4", "Subject 5" }));
        get.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getActionPerformed(evt);
            }
        });
        jPanel3.add(get, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 40, 160, 40));

        assignment1.setBackground(new java.awt.Color(0, 0, 0));
        assignment1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment1.setForeground(new java.awt.Color(255, 255, 255));
        assignment1.setText("Assignment 1");
        assignment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment1MouseEntered(evt);
            }
        });
        jPanel3.add(assignment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        assignment2.setBackground(new java.awt.Color(0, 0, 0));
        assignment2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment2.setForeground(new java.awt.Color(255, 255, 255));
        assignment2.setText("Assignment 2");
        assignment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment2MouseEntered(evt);
            }
        });
        jPanel3.add(assignment2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        assignment3.setBackground(new java.awt.Color(0, 0, 0));
        assignment3.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment3.setForeground(new java.awt.Color(255, 255, 255));
        assignment3.setText("Assignment 3");
        assignment3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment3MouseEntered(evt);
            }
        });
        jPanel3.add(assignment3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        assignment4.setBackground(new java.awt.Color(0, 0, 0));
        assignment4.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment4.setForeground(new java.awt.Color(255, 255, 255));
        assignment4.setText("Assignment 4");
        assignment4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment4MouseEntered(evt);
            }
        });
        jPanel3.add(assignment4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        assignment5.setBackground(new java.awt.Color(0, 0, 0));
        assignment5.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment5.setForeground(new java.awt.Color(255, 255, 255));
        assignment5.setText("Assignment 5");
        assignment5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment5MouseEntered(evt);
            }
        });
        jPanel3.add(assignment5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, -10, 960, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
 exit.setForeground(red);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
    
        
     
      studentform2 std = new studentform2();
      
      studentform2.studentname.setText(studentAssignments.stdname.getText());
      studentform2.stdno.setText(studentAssignments.stdRollNO.getText());
      
       std.setVisible(true);
       dispose();
      
    
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
  exit.setForeground(black);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void getActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getActionPerformed
 if(get.getSelectedItem().toString().equals("Select Subject"))
 {
     JOptionPane.showMessageDialog(null,"invalid selection ","access denied",JOptionPane.ERROR_MESSAGE);
 }
 else if(get.getSelectedItem().toString().equals("Subject 1"))
 {
   mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(subjectpanel1);
        mainpanel.repaint();
        mainpanel.revalidate();
        
 }
 else if(get.getSelectedItem().toString().equals("Subject 2"))
 {
 mainpanel.removeAll();
 mainpanel.repaint();
 mainpanel.revalidate();
 
 // add panel
 mainpanel.add(subjectpanel2);
 mainpanel.repaint();
 mainpanel.revalidate();
 }
 else  if(get.getSelectedItem().toString().equals("Subject 3"))
 {
 mainpanel.removeAll();
 mainpanel.repaint();
 mainpanel.revalidate();
 
 // add panel
 mainpanel.add(subjectpanel3);
 mainpanel.repaint();
 mainpanel.revalidate();
 }
  else  if(get.getSelectedItem().toString().equals("Subject 4"))
 {
 mainpanel.removeAll();
 mainpanel.repaint();
 mainpanel.revalidate();
 
 // add panel
 mainpanel.add(subjectpanel4);
 mainpanel.repaint();
 mainpanel.revalidate();
 }
  else  if(get.getSelectedItem().toString().equals("Subject 5"))
 {
 mainpanel.removeAll();
 mainpanel.repaint();
 mainpanel.revalidate();
 
 // add panel
 mainpanel.add(subjectpanel5);
 mainpanel.repaint();
 mainpanel.revalidate();
 }
  
    }//GEN-LAST:event_getActionPerformed

    private void assignment1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment1MouseEntered

    private void assignment2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment2MouseEntered

    private void assignment3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment3MouseEntered

    private void assignment4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment4MouseEntered

    private void assignment5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment5MouseEntered

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
            String temp = (String)assignment5.getText();
            String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("date");
                givendate1.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate1.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth1.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
            String temp = (String)assignment4.getText();
            String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("date");
                givendate1.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate1.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth1.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            String temp = (String)assignment3.getText();
            String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("date");
                givendate1.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate1.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth1.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            String temp = (String)assignment2.getText();
            String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("date");
                givendate1.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate1.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth1.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String temp = (String)assignment1.getText();
            String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

                String add1 = rs.getString("date");
                givendate1.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate1.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth1.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
 try{
            String temp = (String)assignment1.getText();
            String sql="Select * from   `adminlogin`.`assignment2allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material2.setText(add0);

                String add1 = rs.getString("date");
                givendate2.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate2.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth2.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
 try{
            String temp = (String)assignment2.getText();
            String sql="Select * from   `adminlogin`.`assignment2allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material2.setText(add0);

                String add1 = rs.getString("date");
                givendate2.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate2.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth2.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
 try{
            String temp = (String)assignment3.getText();
            String sql="Select * from   `adminlogin`.`assignment2allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material2.setText(add0);

                String add1 = rs.getString("date");
                givendate2.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate2.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth2.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
try{
            String temp = (String)assignment4.getText();
            String sql="Select * from   `adminlogin`.`assignment2allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material2.setText(add0);

                String add1 = rs.getString("date");
                givendate2.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate2.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth2.setText(add3);

            }
        }
        catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
try{
            String temp = (String)assignment5.getText();
            String sql="Select * from   `adminlogin`.`assignment2allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material2.setText(add0);

                String add1 = rs.getString("date");
                givendate2.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate2.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth2.setText(add3);

            }
        }
        catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 try{
            String temp = (String)assignment1.getText();
            String sql="Select * from   `adminlogin`.`assignment3allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material3.setText(add0);

                String add1 = rs.getString("date");
                givendate3.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate3.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth3.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
 try{
            String temp = (String)assignment2.getText();
            String sql="Select * from   `adminlogin`.`assignment3allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material3.setText(add0);

                String add1 = rs.getString("date");
                givendate3.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate3.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth3.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
 try{
            String temp = (String)assignment3.getText();
            String sql="Select * from   `adminlogin`.`assignment3allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material3.setText(add0);

                String add1 = rs.getString("date");
                givendate3.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate3.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth3.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
 try{
            String temp = (String)assignment4.getText();
            String sql="Select * from   `adminlogin`.`assignment3allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material3.setText(add0);

                String add1 = rs.getString("date");
                givendate3.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate3.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth3.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
 try{
            String temp = (String)assignment5.getText();
            String sql="Select * from   `adminlogin`.`assignment3allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material3.setText(add0);

                String add1 = rs.getString("date");
                givendate3.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate3.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth3.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
try{
            String temp = (String)assignment1.getText();
            String sql="Select * from   `adminlogin`.`assignment4allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material4.setText(add0);

                String add1 = rs.getString("date");
                givendate4.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate4.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth4.setText(add3);

            }
        }
        catch(Exception e){}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
try{
            String temp = (String)assignment2.getText();
            String sql="Select * from   `adminlogin`.`assignment4allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material4.setText(add0);

                String add1 = rs.getString("date");
                givendate4.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate4.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth4.setText(add3);

            }
        }
        catch(Exception e){}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
try{
            String temp = (String)assignment3.getText();
            String sql="Select * from   `adminlogin`.`assignment4allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material4.setText(add0);

                String add1 = rs.getString("date");
                givendate4.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate4.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth4.setText(add3);

            }
        }
        catch(Exception e){}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
try{
            String temp = (String)assignment4.getText();
            String sql="Select * from   `adminlogin`.`assignment4allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material4.setText(add0);

                String add1 = rs.getString("date");
                givendate4.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate4.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth4.setText(add3);

            }
        }
        catch(Exception e){}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
try{
            String temp = (String)assignment5.getText();
            String sql="Select * from   `adminlogin`.`assignment4allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material4.setText(add0);

                String add1 = rs.getString("date");
                givendate4.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate4.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth4.setText(add3);

            }
        }
        catch(Exception e){}           // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
try{
            String temp = (String)assignment1.getText();
            String sql="Select * from   `adminlogin`.`assignment5allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material5.setText(add0);

                String add1 = rs.getString("date");
                givendate5.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate5.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth5.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
try{
            String temp = (String)assignment2.getText();
            String sql="Select * from   `adminlogin`.`assignment5allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material5.setText(add0);

                String add1 = rs.getString("date");
                givendate5.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate5.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth5.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
try{
            String temp = (String)assignment3.getText();
            String sql="Select * from   `adminlogin`.`assignment5allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material5.setText(add0);

                String add1 = rs.getString("date");
                givendate5.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate5.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth5.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
try{
            String temp = (String)assignment4.getText();
            String sql="Select * from   `adminlogin`.`assignment5allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material5.setText(add0);

                String add1 = rs.getString("date");
                givendate5.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate5.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth5.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
try{
            String temp = (String)assignment5.getText();
            String sql="Select * from   `adminlogin`.`assignment5allsub` where AssignmentNo=? ";
            pst = conn.prepareStatement(sql);
            pst.setString(1,temp);
            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material5.setText(add0);

                String add1 = rs.getString("date");
                givendate5.setText(add1);

                String add2 = rs.getString("submissiondate");
                submisssiondate5.setText(add2);

                String add3 = rs.getString("submissionmonth");
                submisssionmonth5.setText(add3);

            }
        }
        catch(Exception e){}         // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
 studentCLassRoom open = new studentCLassRoom();
          studentCLassRoom.stdname.setText( studentAssignments.stdname.getText());
      studentCLassRoom.stdRollNO.setText(studentAssignments.stdRollNO.getText());
      open.setVisible(true);
              dispose();           // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
studentTimeTAble open = new studentTimeTAble();
          studentTimeTAble.stdname.setText( studentAssignments.stdname.getText());
      studentTimeTAble.stdRollNO.setText(studentAssignments.stdRollNO.getText());
      open.setVisible(true);
              dispose();              // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
   studentAttendance open = new studentAttendance();
          studentAttendance.stdname.setText( studentAssignments.stdname.getText());
      studentAttendance.wwww.setText(studentAssignments.stdRollNO.getText());
      open.setVisible(true);
              dispose();  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
studentResult open = new studentResult();
        studentResult.stdname.setText( studentAssignments.stdname.getText());
  studentResult.stdRollNO.setText(studentAssignments.stdRollNO.getText());
      open.setVisible(true);
              dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
studentNotes open = new studentNotes();
        studentNotes.stdname.setText( studentAssignments.stdname.getText());
  studentNotes.stdRollNO.setText(studentAssignments.stdRollNO.getText());
      open.setVisible(true);
              dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(studentAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentAssignments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentAssignments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Date1;
    private javax.swing.JLabel Date2;
    private javax.swing.JLabel Date3;
    private javax.swing.JLabel Date4;
    private javax.swing.JLabel Date5;
    private javax.swing.JLabel Date6;
    private javax.swing.JLabel Date7;
    private javax.swing.JLabel Date8;
    private javax.swing.JLabel Date9;
    private javax.swing.JLabel assignment1;
    private javax.swing.JLabel assignment2;
    private javax.swing.JLabel assignment3;
    private javax.swing.JLabel assignment4;
    private javax.swing.JLabel assignment5;
    private javax.swing.JPanel defaultPanel;
    public static javax.swing.JLabel exit;
    private javax.swing.JComboBox<String> get;
    private javax.swing.JLabel givendate1;
    private javax.swing.JLabel givendate2;
    private javax.swing.JLabel givendate3;
    private javax.swing.JLabel givendate4;
    private javax.swing.JLabel givendate5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextArea material1;
    private javax.swing.JTextArea material2;
    private javax.swing.JTextArea material3;
    private javax.swing.JTextArea material4;
    private javax.swing.JTextArea material5;
    public static javax.swing.JLabel mini;
    public static javax.swing.JLabel stdRollNO;
    public static javax.swing.JLabel stdname;
    private javax.swing.JPanel subjectpanel1;
    private javax.swing.JPanel subjectpanel2;
    private javax.swing.JPanel subjectpanel3;
    private javax.swing.JPanel subjectpanel4;
    private javax.swing.JPanel subjectpanel5;
    private javax.swing.JLabel submisssiondate1;
    private javax.swing.JLabel submisssiondate2;
    private javax.swing.JLabel submisssiondate3;
    private javax.swing.JLabel submisssiondate4;
    private javax.swing.JLabel submisssiondate5;
    private javax.swing.JLabel submisssionmonth1;
    private javax.swing.JLabel submisssionmonth2;
    private javax.swing.JLabel submisssionmonth3;
    private javax.swing.JLabel submisssionmonth4;
    private javax.swing.JLabel submisssionmonth5;
    // End of variables declaration//GEN-END:variables
}
