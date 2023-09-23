/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package books.library;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */
public class start extends javax.swing.JPanel {
int l=0;
int e=0;
Timer t;
    /** Creates new form start */
    public start() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        setDoubleBuffered(false);
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(500, 250));
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        setLayout(null);

        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 30, true));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 250));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("CANCEL");
        jButton2.setBorderPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(240, 210, 100, 25);

        jButton1.setBackground(new java.awt.Color(0, 204, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOGIN");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(130, 210, 100, 25);

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(jPasswordField1);
        jPasswordField1.setBounds(250, 160, 160, 30);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jTextField1);
        jTextField1.setBounds(250, 120, 160, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PASSWORD");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(120, 160, 130, 29);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(120, 120, 119, 29);

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/library/book-icon.png"))); // NOI18N
        jLabel3.setText("MY LIBRARY");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 10, 500, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/library/img1.jpg"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 250);

        add(jPanel2);
        jPanel2.setBounds(0, 0, 500, 310);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 250));
        jPanel1.setLayout(null);

        jProgressBar1.setBackground(new java.awt.Color(255, 255, 255));
        jProgressBar1.setForeground(new java.awt.Color(255, 0, 51));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(0, 240, 500, 10);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/books/library/img.gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 250);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 250);
    }// </editor-fold>//GEN-END:initComponents

    
    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        l=0;
        if (e==1) {
            jPanel2.setVisible(true);
            jButton1.setVisible(true);
            jButton2.setVisible(true);
jButton1.setBackground(jButton1.getForeground());
jButton1.setForeground(Color.white);
        
        }
        else{
            jPanel2.setVisible(false);
            e=1;
        }
        t=new Timer(100,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         l++;
                jProgressBar1.setValue(l);
                if (l==100) {
                    
                   jPanel1.setVisible(false);
                   jPanel2.setVisible(true);
                }
                
            }
        });
        t.start();
    }//GEN-LAST:event_formAncestorAdded

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try {
        // TODO add your handling code here:
        Statement st=new sqldb().st();
        ResultSet rs=st.executeQuery("select * from admin");
        while (rs.next()) {
            
        
        if (jTextField1.getText().toLowerCase().equals("") || jPasswordField1.getText().toLowerCase().equals("")) {
            JOptionPane.showMessageDialog(this,"FILL THE FIELS","INVALID",JOptionPane.ERROR_MESSAGE);
        }
        else if (jTextField1.getText().toLowerCase().equals(rs.getString(2)) && jPasswordField1.getText().toLowerCase().equals(rs.getString(3))) {

            jButton1.setVisible(false);
            jButton2.setVisible(false);
            JOptionPane.showMessageDialog(this,"YOU ARE LOGIN","LOGIN",JOptionPane.INFORMATION_MESSAGE);
            
            BooksLibrary.f.dispose();
            BooksLibrary.fi.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this,"INCORRECT LOGIN USERNAME OR PASSWORD","INVALID",JOptionPane.ERROR_MESSAGE);
            
        }
        jTextField1.setText("");
        
        jPasswordField1.setText("");
        }
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(start.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
System.exit(0);       // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
jButton1.setForeground(jButton1.getBackground());
jButton1.setBackground(Color.white);



        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
jButton1.setBackground(jButton1.getForeground());
jButton1.setForeground(Color.white);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
jButton2.setBackground(jButton2.getForeground());
jButton2.setForeground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
jButton2.setForeground(jButton2.getBackground());
jButton2.setBackground(Color.white);

    }//GEN-LAST:event_jButton2MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}
