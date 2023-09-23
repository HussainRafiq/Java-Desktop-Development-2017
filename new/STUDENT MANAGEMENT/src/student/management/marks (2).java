/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import com.sun.java.swing.plaf.motif.MotifBorders;
import datechooser.beans.DateChooserCombo;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.html.CSS;

/**
 *
 * @author HUSSAIN
 */
public class marks extends JFrame {
String col[]={"ID","STUDENT NAME","LAST NAME","PHONE NUMBER","DATE OF BIRTH","ADDRESS","GENDER","EMAIL","POSTAL CODE","PASSWORD"};
String row[][]={};
String t8;
        int i=0;
    DefaultTableModel dtm=new DefaultTableModel(row,col);
public marks() throws HeadlessException {
this.addWindowListener(new WindowAdapter() {
    @Override
    public void windowOpened(WindowEvent e) {
        try {
            dtm.getDataVector().removeAllElements();
            Statement st=new sqldb().st();
            ResultSet rs=st.executeQuery("select * from Table_1");
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }

});


    this.setSize(800,600);
    
     ImageIcon im3=new ImageIcon("Student-3-icon.png");
    this.setIconImage(im3.getImage());
        JMenuBar mn=new JMenuBar();
        this.setJMenuBar(mn);
        
        DateFormat df=new SimpleDateFormat("dd / MM / YYYY     hh:mm:ss");
        JMenu m5=new JMenu("");
       
        JMenu m6=new JMenu("BACK");
        
        mn.add(m6);
 mn.add(m5);
        Timer t=new Timer(1000,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       Date d=new Date();
            m5.setText(df.format(d));
        }
    });
        t.start();
    
    
    
    this.setLayout(null);
    this.setTitle("STUDENT MANAGEMENT SYSTEM");
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1=new JPanel();
        p1.setBounds(10, 10, 500,50);
        p1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, new java.awt.Color(153, 153, 153))));
        JLabel l1=new JLabel("SEARCH");
        p1.setLayout(null);
        JTextField t1=new JTextField();
        l1.setBounds(15, 15, 50, 20);
        t1.setBounds(75, 15, 410, 20);
        p1.add(t1);
        p1.add(l1);
        JPanel p2=new JPanel();
        p2.setBounds(10, 80, 350,450);
        p2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, new java.awt.Color(153, 153, 153))));
        p2.setLayout(null);
        JLabel l2=new JLabel("ID");
        JTextField t2=new JTextField();
        l2.setBounds(15, 15, 100, 20);
        t2.setBounds(125, 15, 100, 20);
        p2.add(t2);
        p2.add(l2);
        JLabel l3=new JLabel("STUDENT NAME");
        JTextField t3=new JTextField();
        l3.setBounds(15, 40, 100, 20);
        t3.setBounds(125, 40, 100, 20);
        p2.add(t3);
        p2.add(l3);
        JLabel l4=new JLabel("LAST NAME");
        JTextField t4=new JTextField();
        l4.setBounds(15, 65, 100, 20);
        t4.setBounds(125, 65, 100, 20);
        p2.add(t4);
        p2.add(l4);
        JLabel l5=new JLabel("ADDRESS");
        JTextArea t5=new JTextArea(5, 5);
        l5.setBounds(15, 90, 100, 20);
        t5.setBounds(125, 90, 150, 75);
        p2.add(t5);
        t5.setLineWrap(true);
        t5.setEditable(false);
        t4.setEditable(false);
        t3.setEditable(false);
        t2.setEditable(false);

        
        
        
        
        
        
        p2.add(l5);
        JLabel l6=new JLabel("ENGLISH");
        JTextField t6=new JTextField();
        l6.setBounds(15, 170, 100, 20);
        t6.setBounds(125, 170, 100, 20);
        p2.add(t6);
        p2.add(l6);
        JLabel l7=new JLabel("MATH");
        JTextField t7=new JTextField();
        l7.setBounds(15, 195, 100, 20);
        t7.setBounds(125, 195, 100, 20);
        p2.add(t7);
        p2.add(l7);
        
        JLabel l8=new JLabel("URDU");
        JTextField t8=new JTextField();
        l8.setBounds(15, 220, 100, 20);
        t8.setBounds(125, 220, 100, 20);
        p2.add(t8);
        p2.add(l8);
        
        JLabel l9=new JLabel("ISLAMIAT");
        JTextField t9=new JTextField();
        l9.setBounds(15, 245, 100, 20);
        t9.setBounds(125, 245, 100, 20);
        p2.add(t9);
        p2.add(l9);
        
        JLabel l10=new JLabel("SCIENCE");
        JTextField t10=new JTextField();
        l10.setBounds(15, 270, 100, 20);
        t10.setBounds(125, 270, 100, 20);
        p2.add(t10);
        p2.add(l10);
        
        JLabel l11=new JLabel("PAKISTAN STUDIES");
        JTextField t11=new JTextField();
        l11.setBounds(15, 295, 100, 20);
        t11.setBounds(125, 295, 100, 20);
        p2.add(t11);
        p2.add(l11);
     JLabel l12=new JLabel("TOTAL");
        JTextField t12=new JTextField();
        l12.setBounds(15, 320, 100, 20);
        t12.setBounds(125, 320, 100, 20);
        t12.setEditable(false);
        p2.add(t12);
        p2.add(l12);
        JButton btn0=new JButton("TOTAL");
    btn0.setBounds(230, 320,100,20);
    p2.add(btn0);
    btn0.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
i=Integer.parseInt(t6.getText())+Integer.parseInt(t7.getText())+Integer.parseInt(t8.getText())+Integer.parseInt(t9.getText())+Integer.parseInt(t10.getText())+Integer.parseInt(t11.getText());  
t12.setText(""+i);

    }
});
        JButton btn=new JButton("UPLOAD THE MARKS");
        
        JButton btn2=new JButton("DELETE THE RECORD");
        JButton btn3=new JButton("CLEAR");
        btn.setBounds(15,345,150,20);
        btn2.setBounds(170,345,170,20);
        btn3.setBounds(190,370,150,20);
        p2.add(btn);
        p2.add(btn3);
        p2.add(btn2);
        JPanel p3=new JPanel();
        p3.setBounds(370, 80,400,400);
        t2.setEditable(false);
        p3.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true), javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 51, 51), null, new java.awt.Color(153, 153, 153))));
         JTable tb=new JTable(dtm);
         p3.setLayout(null);
         
         JScrollPane sc=new JScrollPane(tb);
         sc.setBounds(10,10, 380, 380);
  btn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            Statement st=new sqldb().st();
            st.executeUpdate("insert into table_2 valueS ("+t2.getText()+",'"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+t8.getText()+"','"+t9.getText()+"','"+t10.getText()+"','"+t11.getText()+"','"+t12.getText()+"')");
           
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dtm.getDataVector().removeAllElements();
            Statement st=new sqldb().st();
            ResultSet rs=st.executeQuery("select * from Table_1");
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }
        });
       p3.add(sc);
        this.add(p3);
        this.add(p2);
        this.add(p1);
tb.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseClicked(MouseEvent e) {
    int a=tb.getSelectedRow();
    String j[]=dtm.getDataVector().get(a).toString().substring(1).split(",");
    String lot=j[0];
    
        try {
            Statement st=new sqldb().st();
            ResultSet rs=st.executeQuery("select * from Table_1 where id ="+lot);
            while (rs.next()) {                
    t2.setText(""+rs.getInt(1));
    t3.setText(rs.getString(2));
    t4.setText(rs.getString(3));
    t5.setText(rs.getString(6));
     
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    
    
    
    }
        });
btn2.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            Statement st=new sqldb().st();
            st.execute("delete from table_1 where id ="+t2.getText());
         
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            dtm.getDataVector().removeAllElements();
            Statement st=new sqldb().st();
            ResultSet rs=st.executeQuery("select * from Table_1");
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
        });
btn3.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
    t2.setText("");
    t3.setText("");
    t4.setText("");
    t5.setText("");
    t6.setText("");
    t7.setText("");
    t9.setText("");
    }});
t1.addKeyListener(new KeyAdapter() {

    @Override
    public void keyReleased(KeyEvent e) {
        
       try {
            dtm.getDataVector().removeAllElements();
            Statement st=new sqldb().st();
            String i=t1.getText();
            if (i.equals("")) {
               i=""+0;
               
        try {
            dtm.getDataVector().removeAllElements();
         
            ResultSet rs=st.executeQuery("select * from Table_1");
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
           }
            
            ResultSet rs=st.executeQuery("select * from Table_1 where id ="+i+"");
            while (rs.next()) {                
                dtm.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9),rs.getString(10)});
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(marks.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    
});
}
    
    
}
