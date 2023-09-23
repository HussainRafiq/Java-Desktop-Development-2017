/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Locale;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.Timer;
/**
 *
 * @author HUSSAIN
 */
public class Test {

    /**
     * @param args the command line arguments
     */ static int h=0;
    public static void main(String[] args) {
        // TODO code application logic here
         JFrame frame = new JFrame();
        frame.setSize(500, 60);
       frame.setLocationRelativeTo(null);
        frame.setUndecorated(true);
        JTextField login = new JTextField();
        login.setBounds(0, 0, 120, 50);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.GREEN);
        login.setFont(new Font(null,Font.BOLD,20));
        login.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent ke) {
            login.getText();
            frame.dispose();
            JFrame  secondpage=new JFrame();
                Dimension screensize =Toolkit.getDefaultToolkit().getScreenSize();
                secondpage.setSize(screensize);
                secondpage.setUndecorated(true);
                secondpage.setLayout(null);
                JButton dispose = new JButton("Dispose");
                dispose.setBounds(480, 0, 150, 20);
               dispose.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                dispose.setBackground(Color.red);
                dispose.setForeground(Color.white);
                }

            });
               dispose.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent me) {
                dispose.setBackground(Color.red);
                }

                @Override
                public void mouseExited(MouseEvent me) {
                dispose.setBackground(Color.getColor("dispose"));
                dispose.setForeground(Color.BLACK);
                }
            });
                dispose.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    secondpage.dispose();
                }
            });
               
                JButton book=new JButton("BOOk");
                book.setBounds(630, 0, 150, 20);
                book.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                JFrame thirdpage = new JFrame();
                thirdpage.setUndecorated(true);
                Dimension screensize =Toolkit.getDefaultToolkit().getScreenSize();
                thirdpage.setSize(screensize);
                thirdpage.setLayout(null);
                JButton bdispose=new JButton("X");
                bdispose.setBounds(0, h, 60, 40);
                bdispose.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                   thirdpage.dispose();
                    }
                });
                thirdpage.add(bdispose);
                thirdpage.setVisible(true);
                }
            });
                JButton profile = new JButton("profile");
                profile.setBounds(780, 0, 150, 20);
                JLabel header=new JLabel("THE GREAT LIBERERY,karachi.pk");
                header.setBounds(10, 30, 400, 30);
                header.setFont(new Font(null,Font.BOLD,35));
                JLabel subheading = new JLabel("By Goverment Of Pakistan In 2017(C)");
                subheading.setBounds(12, 60, 1200, 30);
//                JToggleButton image = new JToggleButton();
//                 image.setBounds(410, 100, 100, 100);
               JLabel para1= new JLabel("TGL or the great liberey is the only liberery its was made by a great kings  ");
               para1.setFont(new java.awt.Font("Trajan Pro", 3, 16));
               para1.setBounds(410, 50, 770, 100);
               JLabel para2= new JLabel("(aoranzab alam gair) it is still used in the memory of that king aoranzaab");
               para2.setFont(new java.awt.Font("Trajan Pro", 3, 15));               
               para2.setBounds(410, 80, 700, 100);
                
                secondpage.add(para2);
                secondpage.add(para1);
                secondpage.add(subheading);
                secondpage.add(header);
                secondpage.add(profile);
                secondpage.add(book);
                secondpage.add(dispose);
                secondpage.setVisible(true);
            }

        });
//        JLabel label = new JLabel("welcome");
//        label.setBounds(0, -30, 120, 60);
//        frame.add(label);
       frame.add(login);
        frame.setVisible(true);
    }
    
}
