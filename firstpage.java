/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapplication;
import java.awt.Color;
import static java.awt.Color.gray;
import static java.awt.Color.red;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import myapplication.userdetail; //  this is a way in which we add a new jframe into a text or a button this is imort method
/**
 *
 * @author Vs
 */
public class firstpage extends javax.swing.JFrame {

    private JFrame frame;

 
    public firstpage() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        closebtn = new javax.swing.JLabel();
        jLabelmini = new javax.swing.JLabel();
        first = new javax.swing.JLabel();
        second = new javax.swing.JLabel();
        third = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(621, 356));
        setMinimumSize(new java.awt.Dimension(621, 356));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(621, 356));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Student");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 240, 50));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Administrator");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 240, 50));

        closebtn.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        closebtn.setText("X");
        closebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        closebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closebtnMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closebtnMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closebtnMouseReleased(evt);
            }
        });
        getContentPane().add(closebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 50, 70));

        jLabelmini.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelmini.setText("-");
        jLabelmini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelmini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelminiMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelmini, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, 70));

        first.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        first.setText("Class-Room ");
        first.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                firstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                firstMouseExited(evt);
            }
        });
        getContentPane().add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 170, -1));

        second.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        second.setText("Managment ");
        second.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                secondMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                secondMouseExited(evt);
            }
        });
        getContentPane().add(second, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        third.setFont(new java.awt.Font("Serif", 1, 28)); // NOI18N
        third.setText("System");
        third.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                thirdMouseEntered(evt);
            }
        });
        getContentPane().add(third, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 10, 120));

        jPanel5.setBackground(new java.awt.Color(51, 204, 255));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 140, 10, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      loginSsystem st= new loginSsystem();
        st.setVisible(true);                //2   
            dispose();    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void closebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseClicked
         frame = new JFrame("EXIT");          
      if(JOptionPane.showConfirmDialog(frame,"confirn if you want to exit","",
              JOptionPane.YES_NO_CANCEL_OPTION)==JOptionPane.YES_NO_CANCEL_OPTION){
       System.exit(1);    
      }
      System.exit(0);
    }//GEN-LAST:event_closebtnMouseClicked

    private void jLabelminiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelminiMouseClicked
       this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelminiMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      studentLogIn sqw= new studentLogIn();
        sqw .setVisible(true);                //2   
            dispose();   
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseEntered
    closebtn.setBackground(Color.white);
       closebtn.setForeground(Color.red);
     
    }//GEN-LAST:event_closebtnMouseEntered

    private void closebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseExited
       closebtn.setBackground(Color.red);
       closebtn.setForeground(Color.black);
    }//GEN-LAST:event_closebtnMouseExited

    private void closebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMousePressed
       closebtn.setForeground(Color.gray);
    }//GEN-LAST:event_closebtnMousePressed

    private void closebtnMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closebtnMouseReleased
      closebtn.setForeground(Color.black);
    }//GEN-LAST:event_closebtnMouseReleased

    private void firstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstMouseEntered
   first.setForeground(Color.gray);
    }//GEN-LAST:event_firstMouseEntered

    private void firstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstMouseExited
    first.setForeground(Color.black);
    }//GEN-LAST:event_firstMouseExited

    private void secondMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondMouseEntered
     second.setForeground(Color.MAGENTA);
     
    }//GEN-LAST:event_secondMouseEntered

    private void secondMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secondMouseExited
   second.setForeground(Color.black);
    }//GEN-LAST:event_secondMouseExited

    private void thirdMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thirdMouseEntered
       
    }//GEN-LAST:event_thirdMouseEntered

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
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(firstpage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new firstpage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closebtn;
    private javax.swing.JLabel first;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabelmini;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel second;
    private javax.swing.JLabel third;
    // End of variables declaration//GEN-END:variables
}
