/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;

import static java.awt.Color.black;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import javax.swing.JFrame;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class Assignment1 extends javax.swing.JFrame {
 Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
    /**
     * Creates new form Assignment1
     */
    public Assignment1() {
        initComponents();
        showDate();
        showTime();
        setExtendedState(JFrame.MAXIMIZED_HORIZ);
        setVisible(true);
        setResizable(false);
        Update_material1(); 
        Update_material2(); 
        Update_material3(); 
        Update_material4(); 
        Update_material5(); 
        
    }
        private void Update_material1(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
         String sql = "Select material from assignment1allsub";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
            pst = conn.prepareStatement(sql);
             rs = pst.executeQuery();
            //material1.setModel(DbUtils.resultSetToModel(rs));
           while(rs.next())              //1
           {                                //2
            material1.setText(rs.getString(1)); //3   // these all 4 are use to fatch data from databse and get it into the TextArea
            
           }                                      // 4
         
     }
     catch (SQLException e) {
        JOptionPane.showMessageDialog(null,e);
     } 
 }
         private void Update_material2(){
     try {
         conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root");
         String sql = "Select material from assignment2allsub";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
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
         String sql = "Select material from assignment3allsub";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
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
         String sql = "Select material from assignment4allsub";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
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
         String sql = "Select material from assignment5allsub";       // Select rollno , "stdname" from studentdetails  if we use these invented comosc then values inside these comoas are shown 
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

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        mainpanel = new javax.swing.JPanel();
        assignment1panel1 = new javax.swing.JPanel();
        assignment1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        material1 = new javax.swing.JTextArea();
        submisssiondate = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        submisssionmonth = new javax.swing.JComboBox<>();
        snd41st = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        givendate = new javax.swing.JLabel();
        assignment2panel1 = new javax.swing.JPanel();
        assignment2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        material2 = new javax.swing.JTextArea();
        sent42nd = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        submisssionmonth1 = new javax.swing.JComboBox<>();
        submisssiondate1 = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        givendate1 = new javax.swing.JLabel();
        assignment3panel1 = new javax.swing.JPanel();
        assignment3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        material3 = new javax.swing.JTextArea();
        snd43rd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        submisssionmonth2 = new javax.swing.JComboBox<>();
        submisssiondate2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        givendate2 = new javax.swing.JLabel();
        assignment4panel1 = new javax.swing.JPanel();
        assignment4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        material4 = new javax.swing.JTextArea();
        snd44th = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        submisssionmonth3 = new javax.swing.JComboBox<>();
        submisssiondate3 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        givendate3 = new javax.swing.JLabel();
        assignment5panel1 = new javax.swing.JPanel();
        assignment5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        material5 = new javax.swing.JTextArea();
        snd45th = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        submisssionmonth4 = new javax.swing.JComboBox<>();
        submisssiondate4 = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        givendate4 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        teacherName = new javax.swing.JLabel();
        subname = new javax.swing.JLabel();
        menupanel = new javax.swing.JPanel();
        btnassignment4 = new javax.swing.JButton();
        btnassignment5 = new javax.swing.JButton();
        btnassignment11 = new javax.swing.JButton();
        btnassignment12 = new javax.swing.JButton();
        btnassignment13 = new javax.swing.JButton();
        date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("dymanic Panel");
        setMinimumSize(new java.awt.Dimension(864, 550));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mainpanel.setBackground(new java.awt.Color(204, 204, 255));
        mainpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        mainpanel.setLayout(new java.awt.CardLayout());

        assignment1panel1.setBackground(new java.awt.Color(153, 204, 255));
        assignment1panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment1panel1MouseEntered(evt);
            }
        });

        assignment1.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment1.setForeground(new java.awt.Color(255, 255, 255));
        assignment1.setText("Assignment 1");
        assignment1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment1MouseEntered(evt);
            }
        });

        material1.setColumns(20);
        material1.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        material1.setRows(5);
        material1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        material1.setCaretColor(new java.awt.Color(153, 204, 255));
        material1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                material1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        material1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                material1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                material1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(material1);

        submisssiondate.setMaximumRowCount(40);
        submisssiondate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        jLabel6.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel6.setText("Submission Date");

        submisssionmonth.setMaximumRowCount(13);
        submisssionmonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        submisssionmonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submisssionmonthActionPerformed(evt);
            }
        });

        snd41st.setBackground(new java.awt.Color(255, 255, 255));
        snd41st.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        snd41st.setText("SENT");
        snd41st.setBorder(null);
        snd41st.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snd41st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snd41stActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel14.setText("Given Date");

        givendate.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        givendate.setText("****");

        javax.swing.GroupLayout assignment1panel1Layout = new javax.swing.GroupLayout(assignment1panel1);
        assignment1panel1.setLayout(assignment1panel1Layout);
        assignment1panel1Layout.setHorizontalGroup(
            assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignment1panel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givendate, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(assignment1panel1Layout.createSequentialGroup()
                        .addComponent(submisssiondate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submisssionmonth, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(snd41st, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(assignment1panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment1panel1Layout.createSequentialGroup()
                        .addComponent(assignment1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        assignment1panel1Layout.setVerticalGroup(
            assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment1panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignment1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignment1panel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(24, 24, 24)
                            .addGroup(assignment1panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submisssiondate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submisssionmonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(snd41st, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignment1panel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(givendate)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        mainpanel.add(assignment1panel1, "card2");

        assignment2panel1.setBackground(new java.awt.Color(153, 204, 255));
        assignment2panel1.setPreferredSize(new java.awt.Dimension(655, 496));
        assignment2panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment2panel1MouseEntered(evt);
            }
        });

        assignment2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment2.setForeground(new java.awt.Color(255, 255, 255));
        assignment2.setText("Assignment 2");
        assignment2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignment2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment2MouseEntered(evt);
            }
        });

        material2.setColumns(20);
        material2.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        material2.setRows(5);
        material2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        material2.setCaretColor(new java.awt.Color(153, 204, 255));
        material2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                material2MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(material2);

        sent42nd.setBackground(new java.awt.Color(255, 255, 255));
        sent42nd.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        sent42nd.setText("SENT");
        sent42nd.setBorder(null);
        sent42nd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sent42nd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sent42ndActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel12.setText("Submission Date");

        submisssionmonth1.setMaximumRowCount(13);
        submisssionmonth1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        submisssionmonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submisssionmonth1ActionPerformed(evt);
            }
        });

        submisssiondate1.setMaximumRowCount(40);
        submisssiondate1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        jLabel15.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel15.setText("Given Date");

        givendate1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        givendate1.setText("****");

        javax.swing.GroupLayout assignment2panel1Layout = new javax.swing.GroupLayout(assignment2panel1);
        assignment2panel1.setLayout(assignment2panel1Layout);
        assignment2panel1Layout.setHorizontalGroup(
            assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment2panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment2panel1Layout.createSequentialGroup()
                        .addComponent(assignment2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignment2panel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givendate1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(assignment2panel1Layout.createSequentialGroup()
                        .addComponent(submisssiondate1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submisssionmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(sent42nd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        assignment2panel1Layout.setVerticalGroup(
            assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment2panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignment2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignment2panel1Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(24, 24, 24)
                            .addGroup(assignment2panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submisssiondate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submisssionmonth1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(sent42nd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignment2panel1Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(givendate1)))
                .addContainerGap())
        );

        mainpanel.add(assignment2panel1, "card3");

        assignment3panel1.setBackground(new java.awt.Color(153, 204, 255));
        assignment3panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment3panel1MouseEntered(evt);
            }
        });

        assignment3.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment3.setForeground(new java.awt.Color(255, 255, 255));
        assignment3.setText("Assignment 3");

        material3.setColumns(20);
        material3.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        material3.setRows(5);
        material3.setText("\n");
        material3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        material3.setCaretColor(new java.awt.Color(153, 204, 255));
        material3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                material3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(material3);

        snd43rd.setBackground(new java.awt.Color(255, 255, 255));
        snd43rd.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        snd43rd.setText("SENT");
        snd43rd.setBorder(null);
        snd43rd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snd43rd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snd43rdActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel11.setText("Submission Date");

        submisssionmonth2.setMaximumRowCount(13);
        submisssionmonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        submisssionmonth2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submisssionmonth2ActionPerformed(evt);
            }
        });

        submisssiondate2.setMaximumRowCount(40);
        submisssiondate2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        jLabel16.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel16.setText("Given Date");

        givendate2.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        givendate2.setText("****");

        javax.swing.GroupLayout assignment3panel1Layout = new javax.swing.GroupLayout(assignment3panel1);
        assignment3panel1.setLayout(assignment3panel1Layout);
        assignment3panel1Layout.setHorizontalGroup(
            assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment3panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment3panel1Layout.createSequentialGroup()
                        .addComponent(assignment3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignment3panel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givendate2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(assignment3panel1Layout.createSequentialGroup()
                        .addComponent(submisssiondate2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submisssionmonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(snd43rd, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        assignment3panel1Layout.setVerticalGroup(
            assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment3panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignment3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignment3panel1Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(24, 24, 24)
                            .addGroup(assignment3panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submisssiondate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submisssionmonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(snd43rd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignment3panel1Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(givendate2)))
                .addContainerGap())
        );

        mainpanel.add(assignment3panel1, "card4");

        assignment4panel1.setBackground(new java.awt.Color(153, 204, 255));
        assignment4panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment4panel1MouseEntered(evt);
            }
        });

        assignment4.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment4.setForeground(new java.awt.Color(255, 255, 255));
        assignment4.setText("Assignment 4");

        material4.setColumns(20);
        material4.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        material4.setRows(5);
        material4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        material4.setCaretColor(new java.awt.Color(153, 204, 255));
        material4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                material4MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(material4);

        snd44th.setBackground(new java.awt.Color(255, 255, 255));
        snd44th.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        snd44th.setText("SENT");
        snd44th.setBorder(null);
        snd44th.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snd44th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snd44thActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel10.setText("Submission Date");

        submisssionmonth3.setMaximumRowCount(13);
        submisssionmonth3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        submisssionmonth3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submisssionmonth3ActionPerformed(evt);
            }
        });

        submisssiondate3.setMaximumRowCount(40);
        submisssiondate3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        jLabel17.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel17.setText("Given Date");

        givendate3.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        givendate3.setText("****");

        javax.swing.GroupLayout assignment4panel1Layout = new javax.swing.GroupLayout(assignment4panel1);
        assignment4panel1.setLayout(assignment4panel1Layout);
        assignment4panel1Layout.setHorizontalGroup(
            assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment4panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment4panel1Layout.createSequentialGroup()
                        .addComponent(assignment4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignment4panel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givendate3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(assignment4panel1Layout.createSequentialGroup()
                        .addComponent(submisssiondate3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submisssionmonth3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(snd44th, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        assignment4panel1Layout.setVerticalGroup(
            assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment4panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignment4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignment4panel1Layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(24, 24, 24)
                            .addGroup(assignment4panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submisssiondate3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submisssionmonth3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(snd44th, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignment4panel1Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addComponent(givendate3)))
                .addContainerGap())
        );

        mainpanel.add(assignment4panel1, "card5");

        assignment5panel1.setBackground(new java.awt.Color(153, 204, 255));
        assignment5panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignment5panel1MouseEntered(evt);
            }
        });

        assignment5.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        assignment5.setForeground(new java.awt.Color(255, 255, 255));
        assignment5.setText("Assignment 5");

        material5.setColumns(20);
        material5.setFont(new java.awt.Font("Myriad Pro Light", 1, 18)); // NOI18N
        material5.setRows(5);
        material5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        material5.setCaretColor(new java.awt.Color(153, 204, 255));
        material5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                material5MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(material5);

        snd45th.setBackground(new java.awt.Color(255, 255, 255));
        snd45th.setFont(new java.awt.Font("SimSun", 1, 16)); // NOI18N
        snd45th.setText("SENT");
        snd45th.setBorder(null);
        snd45th.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        snd45th.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                snd45thActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel9.setText("Submission Date");

        submisssionmonth4.setMaximumRowCount(13);
        submisssionmonth4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  MM", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        submisssionmonth4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submisssionmonth4ActionPerformed(evt);
            }
        });

        submisssiondate4.setMaximumRowCount(40);
        submisssiondate4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " DD", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "30", "31" }));

        jLabel18.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        jLabel18.setText("Given Date");

        givendate4.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        givendate4.setText("****");

        javax.swing.GroupLayout assignment5panel1Layout = new javax.swing.GroupLayout(assignment5panel1);
        assignment5panel1.setLayout(assignment5panel1Layout);
        assignment5panel1Layout.setHorizontalGroup(
            assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment5panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment5panel1Layout.createSequentialGroup()
                        .addComponent(assignment5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, assignment5panel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(givendate4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(assignment5panel1Layout.createSequentialGroup()
                        .addComponent(submisssiondate4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(submisssionmonth4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(snd45th, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );
        assignment5panel1Layout.setVerticalGroup(
            assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(assignment5panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(assignment5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(assignment5panel1Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addGap(24, 24, 24)
                            .addGroup(assignment5panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(submisssiondate4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(submisssionmonth4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(snd45th, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(assignment5panel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(givendate4)))
                .addContainerGap())
        );

        mainpanel.add(assignment5panel1, "card6");

        jPanel3.add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 730, 500));

        time.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        time.setText("Time");
        jPanel3.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 90, -1));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
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
        jPanel3.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, -10, 30, -1));

        mini.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        mini.setText("-");
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        jPanel3.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(805, -10, 30, -1));

        jLabel8.setFont(new java.awt.Font("SimSun", 1, 36)); // NOI18N
        jLabel8.setText(" Subject1 Assignment ");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, -1, -1));

        teacherName.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        teacherName.setText("Teacher Name");
        teacherName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacherNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacherNameMouseExited(evt);
            }
        });
        jPanel3.add(teacherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 30));

        subname.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        subname.setText("Subject");
        subname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                subnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subnameMouseExited(evt);
            }
        });
        jPanel3.add(subname, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 80, 20));

        menupanel.setBackground(new java.awt.Color(204, 204, 255));
        menupanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, new java.awt.Color(255, 255, 255), java.awt.Color.white, java.awt.Color.white));

        btnassignment4.setBackground(new java.awt.Color(255, 255, 255));
        btnassignment4.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnassignment4.setText("Assignment4");
        btnassignment4.setBorder(null);
        btnassignment4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignment4ActionPerformed(evt);
            }
        });

        btnassignment5.setBackground(new java.awt.Color(255, 255, 255));
        btnassignment5.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnassignment5.setText("Assignment5");
        btnassignment5.setBorder(null);
        btnassignment5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignment5ActionPerformed(evt);
            }
        });

        btnassignment11.setBackground(new java.awt.Color(255, 255, 255));
        btnassignment11.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnassignment11.setText("Assignment1");
        btnassignment11.setBorder(null);
        btnassignment11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignment11ActionPerformed(evt);
            }
        });

        btnassignment12.setBackground(new java.awt.Color(255, 255, 255));
        btnassignment12.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnassignment12.setText("Assignment2");
        btnassignment12.setBorder(null);
        btnassignment12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignment12ActionPerformed(evt);
            }
        });

        btnassignment13.setBackground(new java.awt.Color(255, 255, 255));
        btnassignment13.setFont(new java.awt.Font("Serif", 1, 11)); // NOI18N
        btnassignment13.setText("Asignment3");
        btnassignment13.setBorder(null);
        btnassignment13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnassignment13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnassignment4, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                        .addComponent(btnassignment5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnassignment11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnassignment12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnassignment13, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnassignment11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnassignment12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnassignment13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnassignment4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnassignment5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(menupanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 410));

        date.setFont(new java.awt.Font("SimSun", 1, 12)); // NOI18N
        date.setText("Date");
        jPanel3.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, 80, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
       AllAssignments back = new AllAssignments();
      back.setVisible(true);
        dispose();
      this.setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    private void teacherNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherNameMouseEntered
      teacherName.setForeground(blue);
    }//GEN-LAST:event_teacherNameMouseEntered

    private void teacherNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacherNameMouseExited
     teacherName.setForeground(black);   // TODO add your handling code here:
    }//GEN-LAST:event_teacherNameMouseExited

    private void subnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subnameMouseEntered
       subname.setForeground(blue); // TODO add your handling code here:
    }//GEN-LAST:event_subnameMouseEntered

    private void subnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subnameMouseExited
        subname.setForeground(black);        // TODO add your handling code here:
    }//GEN-LAST:event_subnameMouseExited

    private void btnassignment13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignment13ActionPerformed

  // remove panel
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(assignment3panel1);
        mainpanel.repaint();
        mainpanel.revalidate();
        
        
        String temp = (String)assignment3.getText();
      String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
      pst.setString(1,temp);      
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material3.setText(add0);
          
          String add1 = rs.getString("date");
         givendate2.setText(add1);
          
         
          String add2 = rs.getString("submissiondate");
         submisssiondate2.setSelectedItem(add2);
         
          String add3 = rs.getString("submissionmonth");
        submisssionmonth2.setSelectedItem(add3);
          
          
      }
      }
      catch(Exception e){}
    }//GEN-LAST:event_btnassignment13ActionPerformed

    private void btnassignment12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignment12ActionPerformed
// remove panel
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(assignment2panel1);
        mainpanel.repaint();
        mainpanel.revalidate();
        
        String temp = (String)assignment2.getText();
      String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
      pst.setString(1,temp);      
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material2.setText(add0);
          
          String add1 = rs.getString("date");
         givendate1.setText(add1);
          
         
          String add2 = rs.getString("submissiondate");
         submisssiondate1.setSelectedItem(add2);
         
          String add3 = rs.getString("submissionmonth");
        submisssionmonth1.setSelectedItem(add3);
          
          
      }
      }
      catch(Exception e){}      
    }//GEN-LAST:event_btnassignment12ActionPerformed

    private void btnassignment11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignment11ActionPerformed
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(assignment1panel1);
        mainpanel.repaint();
        mainpanel.revalidate();
       
        String temp = (String)assignment1.getText();
      String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
      pst.setString(1,temp);      
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material1.setText(add0);
          
          String add1 = rs.getString("date");
         givendate.setText(add1);
          
         
          String add2 = rs.getString("submissiondate");
         submisssiondate.setSelectedItem(add2);
         
          String add3 = rs.getString("submissionmonth");
        submisssionmonth.setSelectedItem(add3);
          
          
      }
      }
      catch(Exception e){} 

    }//GEN-LAST:event_btnassignment11ActionPerformed

    private void btnassignment5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignment5ActionPerformed
 // remove panel
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(assignment5panel1);
        mainpanel.repaint();
        mainpanel.revalidate();
        
        
        String temp = (String)assignment5.getText();
      String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";  //in the combobox we are showing the rollno of every student
        try{
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
         submisssiondate4.setSelectedItem(add2);
         
          String add3 = rs.getString("submissionmonth");
        submisssionmonth4.setSelectedItem(add3);
          
          
      }
      }
      catch(Exception e){}   
    }//GEN-LAST:event_btnassignment5ActionPerformed

    private void btnassignment4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnassignment4ActionPerformed
     // remove panel
        mainpanel.removeAll();
        mainpanel.repaint();
        mainpanel.revalidate();

        // add panel
        mainpanel.add(assignment4panel1);
        mainpanel.repaint();
        mainpanel.revalidate();
        
        
        String temp = (String)assignment4.getText();
      String sql="Select * from   `adminlogin`.`assignment1allsub` where AssignmentNo=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
      pst.setString(1,temp);      
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material4.setText(add0);
          
          String add1 = rs.getString("date");
         givendate3.setText(add1);
          
         
          String add2 = rs.getString("submissiondate");
         submisssiondate3.setSelectedItem(add2);
         
          String add3 = rs.getString("submissionmonth");
        submisssionmonth3.setSelectedItem(add3);
          
          
      }
      }
      catch(Exception e){}
    }//GEN-LAST:event_btnassignment4ActionPerformed

    private void submisssionmonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submisssionmonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submisssionmonthActionPerformed

    private void submisssionmonth4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submisssionmonth4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submisssionmonth4ActionPerformed

    private void submisssionmonth3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submisssionmonth3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submisssionmonth3ActionPerformed

    private void submisssionmonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submisssionmonth1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submisssionmonth1ActionPerformed

    private void snd41stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snd41stActionPerformed
   
     try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into assignment1allsub values (?,?,?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 //pstmt.setInt(1,Integer.parseInt(rollno.getText()));  // when we use integer type them it,is wrong use INTEGERPARSE  to use that type of problem 
 
 pstmt.setString(1,subname.getText());
 
 pstmt.setString(2,teacherName.getText());
 pstmt.setString(3,assignment1.getText());
 pstmt.setString(4,date.getText());
 pstmt.setString(5,material1.getText());
 pstmt.setString(6,submisssiondate.getSelectedItem().toString());
 pstmt.setString(7,submisssionmonth.getSelectedItem().toString());
 
 
 
  pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
     }
     catch(Exception e){}
    }//GEN-LAST:event_snd41stActionPerformed

    private void snd45thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snd45thActionPerformed
    
     try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into assignment1allsub values (?,?,?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 //pstmt.setInt(1,Integer.parseInt(rollno.getText()));  // when we use integer type them it,is wrong use INTEGERPARSE  to use that type of problem 
 
 pstmt.setString(1,subname.getText());
 
 pstmt.setString(2,teacherName.getText());
 pstmt.setString(3,assignment5.getText());
 pstmt.setString(4,date.getText());
 pstmt.setString(5,material5.getText());
 pstmt.setString(6,submisssiondate4.getSelectedItem().toString());
 pstmt.setString(7,submisssionmonth4.getSelectedItem().toString());
 
 
 
  pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
     }
     catch(Exception e){}
                               // TODO add your handling code here:
    }//GEN-LAST:event_snd45thActionPerformed

    private void sent42ndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sent42ndActionPerformed
       
     try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into assignment1allsub values (?,?,?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 //pstmt.setInt(1,Integer.parseInt(rollno.getText()));  // when we use integer type them it,is wrong use INTEGERPARSE  to use that type of problem 
 
 pstmt.setString(1,subname.getText());
 
 pstmt.setString(2,teacherName.getText());
 pstmt.setString(3,assignment2.getText());
 pstmt.setString(4,date.getText());
 pstmt.setString(5,material2.getText());
 pstmt.setString(6,submisssiondate1.getSelectedItem().toString());
 pstmt.setString(7,submisssionmonth1.getSelectedItem().toString());
 
 
 
  pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
     }
     catch(Exception e){}
                          // TODO add your handling code here:
    }//GEN-LAST:event_sent42ndActionPerformed

    private void snd44thActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snd44thActionPerformed
   
     try{
 Class.forName("com.mysql.jdbc.Driver");
 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
 String sql= "insert into assignment1allsub values (?,?,?,?,?,?,?)"; // table name
 PreparedStatement pstmt = conn.prepareStatement(sql);
 
 //pstmt.setInt(1,Integer.parseInt(rollno.getText()));  // when we use integer type them it,is wrong use INTEGERPARSE  to use that type of problem 
 
 pstmt.setString(1,subname.getText());
 
 pstmt.setString(2,teacherName.getText());
 pstmt.setString(3,assignment4.getText());
 pstmt.setString(4,date.getText());
 pstmt.setString(5,material4.getText());
 pstmt.setString(6,submisssiondate3.getSelectedItem().toString());
 pstmt.setString(7,submisssionmonth3.getSelectedItem().toString());
 
 
 
  pstmt.executeUpdate();
 JOptionPane.showMessageDialog(null," insertion successfull");
 conn.close();
     }
     catch(Exception e){}
              // TODO add your handling code here:
    }//GEN-LAST:event_snd44thActionPerformed

    private void material1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_material1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_material1AncestorAdded

    private void material1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material1MouseClicked
      
    }//GEN-LAST:event_material1MouseClicked

    private void material2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material2MouseClicked
String sql="Select row 2 from   `adminlogin`.`assignment1allsub` where rollno=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
          
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material1.setText(add0);
          
         
      }
        }
        catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_material2MouseClicked

    private void material4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material4MouseClicked
String sql="Select row 4 from   `adminlogin`.`assignment1allsub` where rollno=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
          
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material1.setText(add0);
          
         
      }
        }
        catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_material4MouseClicked

    private void material5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material5MouseClicked
       String sql="Select row 5 from   `adminlogin`.`assignment1allsub` where rollno=? ";  //in the combobox we are showing the rollno of every student
        try{
      pst = conn.prepareStatement(sql);     
          
      rs=pst.executeQuery();
      if(rs.next())
      {
          String add0 = rs.getString("material");
          material1.setText(add0);
          
         
      }
        }
        catch(Exception e){}
    }//GEN-LAST:event_material5MouseClicked

    private void assignment1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment1MouseEntered
      // TODO add your handling code here:
    }//GEN-LAST:event_assignment1MouseEntered

    private void material1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material1MouseEntered

         // TODO add your handling code here:
    }//GEN-LAST:event_material1MouseEntered

    private void assignment2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment2MouseEntered
        
    }//GEN-LAST:event_assignment2MouseEntered

    private void assignment2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment2MouseClicked
        
    }//GEN-LAST:event_assignment2MouseClicked

    private void assignment2panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment2panel1MouseEntered

    }//GEN-LAST:event_assignment2panel1MouseEntered

    private void assignment1panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment1panel1MouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_assignment1panel1MouseEntered

    private void snd43rdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_snd43rdActionPerformed

        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/adminlogin","root","root"); // database name
            String sql= "insert into assignment1allsub values (?,?,?,?,?,?,?)"; // table name
            PreparedStatement pstmt = conn.prepareStatement(sql);

            //pstmt.setInt(1,Integer.parseInt(rollno.getText()));  // when we use integer type them it,is wrong use INTEGERPARSE  to use that type of problem

            pstmt.setString(1,subname.getText());

            pstmt.setString(2,teacherName.getText());
            pstmt.setString(3,assignment3.getText());
            pstmt.setString(4,date.getText());
            pstmt.setString(5,material3.getText());
            pstmt.setString(6,submisssiondate2.getSelectedItem().toString());
            pstmt.setString(7,submisssionmonth2.getSelectedItem().toString());

            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null," insertion successfull");
            conn.close();
        }
        catch(Exception e){}

    }//GEN-LAST:event_snd43rdActionPerformed

    private void material3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_material3MouseClicked
        String sql="Select row 3 from   `adminlogin`.`assignment1allsub` where rollno=? ";  //in the combobox we are showing the rollno of every student
        try{
            pst = conn.prepareStatement(sql);

            rs=pst.executeQuery();
            if(rs.next())
            {
                String add0 = rs.getString("material");
                material1.setText(add0);

            }
        }
        catch(Exception e){}        // TODO add your handling code here:
    }//GEN-LAST:event_material3MouseClicked

    private void submisssionmonth2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submisssionmonth2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submisssionmonth2ActionPerformed

    private void assignment3panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment3panel1MouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_assignment3panel1MouseEntered

    private void assignment4panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment4panel1MouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_assignment4panel1MouseEntered

    private void assignment5panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignment5panel1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_assignment5panel1MouseEntered

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
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Assignment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Assignment1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel assignment1;
    private javax.swing.JPanel assignment1panel1;
    private javax.swing.JLabel assignment2;
    private javax.swing.JPanel assignment2panel1;
    private javax.swing.JLabel assignment3;
    private javax.swing.JPanel assignment3panel1;
    private javax.swing.JLabel assignment4;
    private javax.swing.JPanel assignment4panel1;
    private javax.swing.JLabel assignment5;
    private javax.swing.JPanel assignment5panel1;
    private javax.swing.JButton btnassignment11;
    private javax.swing.JButton btnassignment12;
    private javax.swing.JButton btnassignment13;
    private javax.swing.JButton btnassignment4;
    private javax.swing.JButton btnassignment5;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel givendate;
    private javax.swing.JLabel givendate1;
    private javax.swing.JLabel givendate2;
    private javax.swing.JLabel givendate3;
    private javax.swing.JLabel givendate4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JPanel menupanel;
    private javax.swing.JLabel mini;
    private javax.swing.JButton sent42nd;
    private javax.swing.JButton snd41st;
    private javax.swing.JButton snd43rd;
    private javax.swing.JButton snd44th;
    private javax.swing.JButton snd45th;
    private javax.swing.JComboBox<String> submisssiondate;
    private javax.swing.JComboBox<String> submisssiondate1;
    private javax.swing.JComboBox<String> submisssiondate2;
    private javax.swing.JComboBox<String> submisssiondate3;
    private javax.swing.JComboBox<String> submisssiondate4;
    private javax.swing.JComboBox<String> submisssionmonth;
    private javax.swing.JComboBox<String> submisssionmonth1;
    private javax.swing.JComboBox<String> submisssionmonth2;
    private javax.swing.JComboBox<String> submisssionmonth3;
    private javax.swing.JComboBox<String> submisssionmonth4;
    public static javax.swing.JLabel subname;
    public static javax.swing.JLabel teacherName;
    private javax.swing.JLabel time;
    // End of variables declaration//GEN-END:variables
}
