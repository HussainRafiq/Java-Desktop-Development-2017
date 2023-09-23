/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicSplitPaneUI;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */
public class myframe extends JFrame {

    public myframe() {
        this.setSize(700,340);
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.repaint();
        JPanel p1=new JPanel();
      JPanel p2=new JPanel();
      JPanel p3=new JPanel();
       p1.setLayout(new FlowLayout());
        p1.setBackground(Color.red);
p1.setBounds(0, 0,700, 100);
 JLabel j1=new JLabel("Id");
       p1.add(j1);
        JTextField t1=new JTextField(10);
       p1.add(t1);
        
 JLabel j2=new JLabel("Name");
       p1.add(j2);
       
        JTextField t2=new JTextField(10);
       p1.add(t2);
 JLabel j3=new JLabel("Email");
       p1.add(j3);
       
        JTextField t3=new JTextField(10);
       p1.add(t3);
 JLabel j4=new JLabel("Action");
       p1.add(j4);
       
       String a[]={"","SAVE","DELETE","SHOW"}; 
               JComboBox combo=new JComboBox(a);
               combo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                    p2.add(new save((String) combo.getSelectedItem()));
                    combo.removeItem((String) combo.getSelectedItem());
                    p2.repaint();
                 }
               
            

            });
                    this.repaint();               

               this.repaint();               

                  p2.setLayout(new FlowLayout());
        p2.setBackground(Color.blue);
       
p2.setBounds(0, 100,700, 100);
p2.repaint();
p3.setLayout(new FlowLayout());
        p3.setBackground(Color.DARK_GRAY);
        JButton btn=new JButton("SUBMIT");
        p3.add(btn);
p3.setBounds(0, 200,700, 100);
p3.repaint();

       p1.add(combo);
      p1.repaint();
      this.add(p3);
       this.add(p2);
  this.add(p1);
     this.repaint();
        
        }
    }
   
