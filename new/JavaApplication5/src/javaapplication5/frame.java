package javaapplication5;


import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.geometry.Insets;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderImage;
import javafx.scene.layout.BorderRepeat;
import javafx.scene.layout.BorderWidths;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.MatteBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HUSSAIN
 */
public class frame extends JFrame {
    Timer t=null;
JLabel label1;
    int sab=0,kab=0;
    
    
    JFrame frame(){

                  JFrame f=new JFrame();
       f.setSize(500, 300);
      JPanel p=new JPanel();
      
      f.setLocationRelativeTo(null);
 Container c=f.getContentPane();
       c.setBackground(Color.black);
     
      f.setLayout(null);
     p.setBounds(0, 0,f.getWidth(), f.getHeight());
     
     p.setOpaque(false);
       
          
              ImageIcon im=new ImageIcon("Animated-Border-GreenLineInBlack.gif");
              Image l=im.getImage().getScaledInstance(20,20 , 0);
              ImageIcon k=new ImageIcon(l);
              Image imi=Toolkit.getDefaultToolkit().createImage("Apps-nepomuk-icon.png");
              ImageIcon mc=new ImageIcon(imi);
              Image imi1=Toolkit.getDefaultToolkit().createImage("831.gif");
              ImageIcon mc1=new ImageIcon(imi1);
              
              JLabel label=new JLabel(mc);
              label.setText("CLASSICAL APPLICATIONS");
              
              label.setVerticalTextPosition((int) JLabel.BOTTOM);
              label.setHorizontalTextPosition((int) JLabel.CENTER_ALIGNMENT);
              label.setBounds(180, 20,160,160);
              label1=new JLabel(mc1);
              label.setForeground(Color.white);
              label1.setForeground(Color.white);
              
              label1.setHorizontalTextPosition((int) JLabel.RIGHT);
             label1.setVerticalTextPosition((int) CENTER_ALIGNMENT);
 
              label1.setBounds(190, 150,160,160);
              
              t=new Timer(100, new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
          sab++;
          kab++;
          String a="LOADING";
               for (int i = 1; i <=sab; i++) {
                   a+=".";
                   label1.setText(a);
               }
               if (sab==5) {
                   sab=0;
               }
           if (kab==100) {
               t.stop();
               JOptionPane.showMessageDialog(null, "hogya");
 f.dispose();
           }
           
           
           
           }
       });
              t.start();
             f.add(label1);
            f.add(p);
       
              f.add(label);
              p.setBorder(new MatteBorder(k));
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.setUndecorated(true);
       f.setVisible(true);
       f.setOpacity(0.85f);  
       return f;
   }}
