/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.Timer;

/**
 *
 * @author HUSSAIN
 */
public class ADMIN extends JFrame {

    public ADMIN() throws HeadlessException {
    this.setSize(700,500);
     ImageIcon im3=new ImageIcon("Student-3-icon.png");
    this.setIconImage(im3.getImage());
        JMenuBar mn=new JMenuBar();
        this.setJMenuBar(mn);
        
        DateFormat df=new SimpleDateFormat("dd / MM / YYYY     hh:mm:ss");
        JMenu m5=new JMenu("");
       
        JMenu m6=new JMenu("USER");
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
    ImageIcon im10=new ImageIcon("Students-icon.png");
     ImageIcon im30=new ImageIcon("91-24.png");
 
    ImageIcon im=new ImageIcon("images (1).jpg");
        Image im1=im.getImage().getScaledInstance(this.getWidth(), this.getHeight(), 0);
    ImageIcon im2=new ImageIcon(im1);
    JLabel l1=new JLabel(im2);
    l1.setBounds(0,0, this.getWidth(), this.getHeight());
        JButton btn=new JButton(null,new ImageIcon("Windows-Turn-Off-icon.png"));
    btn.setBounds(this.getWidth()-80, 40,26, 26);
    JButton btn1=new JButton("STUDENT RECORD",im10);
 btn1.setBounds(this.getWidth()-250, this.getHeight()-170, 200, 40);
 
    JButton btn2=new JButton("STUDENT MARKSHEET",im30);
 btn2.setBounds(this.getWidth()-250, this.getHeight()-120, 200, 40);
    this.add(btn2);   
 this.add(btn);
    this.add(btn1);
    this.add(l1);
    
    }  
}
