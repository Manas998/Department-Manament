/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;
import java.awt.Color;
import static java.awt.Color.black;
import static java.awt.Color.gray;
import static java.awt.Color.orange;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import static javax.swing.text.StyleConstants.Bold;
import myapplication.userdetail;

/**
 *
 * @author Vs
 */
public class studentform2 extends javax.swing.JFrame {

  
    public studentform2() {
        initComponents();
       
         this.setLocationRelativeTo(null);  //make the frame to center
        
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
        exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        assignment = new javax.swing.JPanel();
        Assignment = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        classRoom = new javax.swing.JPanel();
        classroom = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        result = new javax.swing.JPanel();
        Result = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        attendance = new javax.swing.JPanel();
        Attendance = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        timesatble = new javax.swing.JPanel();
        time = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        studentname = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        systemname = new javax.swing.JLabel();
        setRollno = new javax.swing.JLabel();
        stdno = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setMinimumSize(new java.awt.Dimension(924, 503));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exit.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
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
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 2, -1, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel4.setText("-");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(878, -10, 20, 50));

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));

        jSeparator2.setBackground(new java.awt.Color(153, 255, 204));

        assignment.setBackground(new java.awt.Color(255, 255, 255));
        assignment.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        assignment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        assignment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                assignmentMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                assignmentMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                assignmentMouseExited(evt);
            }
        });
        assignment.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Assignment.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Assignment.setText("Assignments");
        assignment.add(Assignment, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/vecter-assignment.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
        });
        assignment.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 8, 130, 140));

        classRoom.setBackground(new java.awt.Color(255, 255, 255));
        classRoom.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        classRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        classRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                classRoomMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                classRoomMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                classRoomMouseExited(evt);
            }
        });
        classRoom.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        classroom.setFont(new java.awt.Font("Tunga", 1, 18)); // NOI18N
        classroom.setText("Class-Room");
        classRoom.add(classroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 88, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/vecter-classroom.png"))); // NOI18N
        classRoom.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, -1));

        result.setBackground(new java.awt.Color(255, 255, 255));
        result.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        result.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resultMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resultMouseExited(evt);
            }
        });
        result.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Result.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Result.setText("Result");
        result.add(Result, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/vecter-result.png"))); // NOI18N
        result.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, -1));

        attendance.setBackground(new java.awt.Color(255, 255, 255));
        attendance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                attendanceMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                attendanceMouseExited(evt);
            }
        });
        attendance.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Attendance.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        Attendance.setText("Attendance");
        Attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendanceMouseClicked(evt);
            }
        });
        attendance.add(Attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 120, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/vecter-attendance.png"))); // NOI18N
        attendance.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 140, 130));

        timesatble.setBackground(new java.awt.Color(255, 255, 255));
        timesatble.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        timesatble.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        timesatble.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                timesatbleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                timesatbleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                timesatbleMouseExited(evt);
            }
        });
        timesatble.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        time.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        time.setText("   Time-Table");
        timesatble.add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 150, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/vecter-timetable.png"))); // NOI18N
        timesatble.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 130, 130));

        label.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        label.setForeground(new java.awt.Color(51, 51, 51));
        label.setText("Note pad");
        label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(classRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(timesatble, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(32, Short.MAX_VALUE))))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(attendance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(result, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(classRoom, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignment, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(timesatble, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 780, 470));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        studentname.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        studentname.setForeground(new java.awt.Color(255, 255, 255));
        studentname.setText("******");
        studentname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                studentnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                studentnameMouseExited(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        home.setFont(new java.awt.Font("Stencil Std", 1, 28)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("HOME");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javax/if_male3_403019.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        systemname.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        systemname.setForeground(new java.awt.Color(255, 255, 255));
        systemname.setText("  Class Room Managment");
        systemname.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        systemname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                systemnameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                systemnameMouseExited(evt);
            }
        });

        setRollno.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        setRollno.setForeground(new java.awt.Color(255, 255, 255));
        setRollno.setText("RollNo :");
        setRollno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setRollno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                setRollnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setRollnoMouseExited(evt);
            }
        });

        stdno.setFont(new java.awt.Font("SimSun", 1, 18)); // NOI18N
        stdno.setForeground(new java.awt.Color(255, 255, 255));
        stdno.setText("****");
        stdno.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stdno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stdnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stdnoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("  Sign-Out");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(setRollno, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stdno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(systemname, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(systemname)
                .addGap(29, 29, 29)
                .addComponent(studentname, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(setRollno)
                    .addComponent(stdno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 510));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 780, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timesatbleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesatbleMouseEntered
        time.setForeground(white);
        timesatble.setBackground(gray);        // TODO add your handling code here:
    }//GEN-LAST:event_timesatbleMouseEntered

    private void timesatbleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesatbleMouseExited
     timesatble.setBackground(white); 
     time.setForeground(black);
    }//GEN-LAST:event_timesatbleMouseExited

    private void classRoomMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classRoomMouseEntered
     classRoom.setBackground(gray);
      classroom.setForeground(white);
    }//GEN-LAST:event_classRoomMouseEntered

    private void classRoomMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classRoomMouseExited
     classRoom.setBackground(white);
      classroom.setForeground(black);
    
    }//GEN-LAST:event_classRoomMouseExited

    private void attendanceMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseEntered
     attendance.setBackground(gray);  
     Attendance.setForeground(white);
    }//GEN-LAST:event_attendanceMouseEntered

    private void assignmentMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentMouseEntered
     assignment.setBackground(gray);
    Assignment.setForeground(white);
    }//GEN-LAST:event_assignmentMouseEntered

    private void assignmentMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentMouseExited
      assignment.setBackground(white);
      Assignment.setForeground(black);
    }//GEN-LAST:event_assignmentMouseExited

    private void resultMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseEntered
      result.setBackground(gray);
      Result.setForeground(white);
    }//GEN-LAST:event_resultMouseEntered

    private void resultMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseExited
         result.setBackground(white);
         Result.setForeground(black);
    }//GEN-LAST:event_resultMouseExited

    private void homeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseEntered
home.setForeground(orange);
    }//GEN-LAST:event_homeMouseEntered

    private void attendanceMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseExited
    attendance.setBackground(white);
    Attendance.setForeground(black);
    }//GEN-LAST:event_attendanceMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
     System.exit(0);
     this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
 exit.setForeground(red);      
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
 exit.setForeground(black);       
    }//GEN-LAST:event_exitMouseExited

    private void homeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseExited
 home.setForeground(white);        // TODO add your handling code here:
    }//GEN-LAST:event_homeMouseExited

    private void studentnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentnameMouseEntered
       studentname.setForeground(orange);
    }//GEN-LAST:event_studentnameMouseEntered

    private void studentnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentnameMouseExited
       studentname.setForeground(white); 
    }//GEN-LAST:event_studentnameMouseExited

    private void systemnameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemnameMouseEntered
systemname.setForeground(orange);        // TODO add your handling code here:
    }//GEN-LAST:event_systemnameMouseEntered

    private void systemnameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_systemnameMouseExited
systemname.setForeground(white);        // TODO add your handling code here:
    }//GEN-LAST:event_systemnameMouseExited

    private void setRollnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setRollnoMouseEntered
 setRollno.setForeground(orange);        // TODO add your handling code here:
    }//GEN-LAST:event_setRollnoMouseEntered

    private void setRollnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setRollnoMouseExited
     setRollno.setForeground(white);     // TODO add your handling code here:
    }//GEN-LAST:event_setRollnoMouseExited

    private void stdnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdnoMouseEntered
stdno.setForeground(orange);        // TODO add your handling code here:
    }//GEN-LAST:event_stdnoMouseEntered

    private void stdnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stdnoMouseExited
stdno.setForeground(white);           // TODO add your handling code here:
    }//GEN-LAST:event_stdnoMouseExited

    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
    
         studentAttendance open = new studentAttendance();
           studentAttendance.stdname.setText(studentform2.studentname.getText());
      studentAttendance.wwww.setText(studentform2.stdno.getText());
      open.setVisible(true);
              dispose();     
            
    }//GEN-LAST:event_attendanceMouseClicked

    private void AttendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceMouseClicked
     studentAttendance open = new studentAttendance();
              open.setVisible(true);
              dispose();
        studentAttendance.stdname.setText(studentform2.studentname.getText());
      studentAttendance.wwww.setText(studentform2.stdno.getText());
      
    }//GEN-LAST:event_AttendanceMouseClicked

    private void assignmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_assignmentMouseClicked
     
      studentAssignments stdassign = new studentAssignments();
       studentAssignments.stdname.setText(studentform2.studentname.getText());
      studentAssignments.stdRollNO.setText(studentform2.stdno.getText());
     stdassign.setVisible(true);
     dispose();
     
    }//GEN-LAST:event_assignmentMouseClicked

    private void classRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_classRoomMouseClicked
 studentCLassRoom open = new studentCLassRoom();
          studentCLassRoom.stdname.setText(studentform2.studentname.getText());
      studentCLassRoom.stdRollNO.setText(studentform2.stdno.getText());
      open.setVisible(true);
              dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_classRoomMouseClicked

    private void timesatbleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_timesatbleMouseClicked
      studentTimeTAble open = new studentTimeTAble();
          studentTimeTAble.stdname.setText(studentform2.studentname.getText());
      studentTimeTAble.stdRollNO.setText(studentform2.stdno.getText());
      open.setVisible(true);
              dispose();     // TODO add your handling code here:
    }//GEN-LAST:event_timesatbleMouseClicked

    private void resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultMouseClicked
      studentResult open = new studentResult();
          studentResult.stdname.setText(studentform2.studentname.getText());
      studentResult.stdRollNO.setText(studentform2.stdno.getText());
      open.setVisible(true);
              dispose();    // TODO add your handling code here:
    }//GEN-LAST:event_resultMouseClicked

    private void labelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseClicked
StudentNotePad open = new StudentNotePad();
          StudentNotePad.stdname.setText(studentform2.studentname.getText());
      StudentNotePad.stdRollNO.setText(studentform2.stdno.getText());
      open.setVisible(true);
              dispose();          // TODO add your handling code here:
    }//GEN-LAST:event_labelMouseClicked

    private void labelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseEntered
 label.setBackground(white);
 label.setForeground(orange);
    }//GEN-LAST:event_labelMouseEntered

    private void labelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelMouseExited
label.setForeground(gray);
label.setBackground(white);
    }//GEN-LAST:event_labelMouseExited

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
 
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
       jLabel5.setForeground(gray);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

        studentLogIn sd = new studentLogIn();
        studentLogIn.username.setText(studentform2.studentname.getText());
      studentLogIn.rollno.setSelectedItem(studentform2.stdno.getText());

sd.setVisible(true);
dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

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
            java.util.logging.Logger.getLogger(studentform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentform2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentform2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Assignment;
    private javax.swing.JLabel Attendance;
    private javax.swing.JLabel Result;
    private javax.swing.JPanel assignment;
    private javax.swing.JPanel attendance;
    private javax.swing.JPanel classRoom;
    private javax.swing.JLabel classroom;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel label;
    private javax.swing.JPanel result;
    public static javax.swing.JLabel setRollno;
    public static javax.swing.JLabel stdno;
    public static javax.swing.JLabel studentname;
    private javax.swing.JLabel systemname;
    private javax.swing.JLabel time;
    private javax.swing.JPanel timesatble;
    // End of variables declaration//GEN-END:variables

    private void loginSsystem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
