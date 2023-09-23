/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import java.awt.Container;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author HUSSAIN
 */
public class LOGIN extends JFrame{

    public LOGIN() throws HeadlessException {
    this.setSize(700,550);
     ImageIcon im3=new ImageIcon("Student-3-icon.png");
    this.setIconImage(im3.getImage());
        JMenuBar mn=new JMenuBar();
        this.setJMenuBar(mn);
        
        DateFormat df=new SimpleDateFormat("dd / MM / YYYY     hh:mm:ss");
        JMenu m5=new JMenu("");
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
        ImageIcon im=new ImageIcon("download.jpg");
        Image im1=im.getImage().getScaledInstance(this.getWidth(), this.getHeight(), 0);
    ImageIcon im2=new ImageIcon(im1);
    JLabel l1=new JLabel(im2);
    l1.setBounds(0,0, this.getWidth(), this.getHeight());
    JLabel l2=new JLabel("LOGIN");
    l2.setFont(new Font("algerian",Font.BOLD,22));
    l2.setBounds(100, 300, 100, 50);
    JLabel l3=new JLabel("USER");
    l3.setFont(new Font("algerian",Font.BOLD,16));
    l3.setBounds(20, 350, 100, 20);
     JLabel l4=new JLabel("USERNAME");
    l4.setFont(new Font("algerian",Font.BOLD,16));
    l4.setBounds(20, 380, 100, 20);
     JLabel l5=new JLabel("PASSWORD");
    l5.setFont(new Font("algerian",Font.BOLD,16));
    l5.setBounds(20, 410, 100, 20);
     this.add(l5);   
        JComboBox box1=new JComboBox();
        box1.setBounds(130,350, 100, 20);
        JMenuItem m1=new JMenuItem("");
        JMenuItem m2=new JMenuItem("ADMIN");
        JMenuItem m3=new JMenuItem("STUDENT");
    box1.addItem(m1.getText());
    box1.addItem(m2.getText());
    box1.addItem(m3.getText());
    JTextField txt1=new JTextField();
    txt1.setBounds(130, 380,100, 20);
    JTextField txt2=new JTextField();
    txt2.setBounds(130, 410,100, 20);
    JButton btn=new JButton("LOGIN");
    btn.setBounds(70, 440,90 , 30);
    this.add(txt2);
    this.add(txt1);
    this.add(box1);
    this.add(btn);
        this.add(l4);   
    this.add(l3);   
    this.add(l2);   
    this.add(l1);
       
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
}
