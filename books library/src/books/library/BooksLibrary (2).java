/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.library;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
        
        
        
        
        

public class BooksLibrary {
   static JFrame fi=new frami().fa(); 
 static JPanel s=new sidebar();
  static JFrame l=new edit_user();
 
   static JFrame f=new frames().f();
  static JPanel jp=new jp().jp1();
  static JPanel p2=new p2();
  static   JPanel p3=new p3();
  static   JPanel p5=new p5();
static JPanel h=new header();
static JPanel p1=new p1();  

   static  JPanel p4=new p4();
    static Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
 
   public static void main(String[] args) {
       Image im=Toolkit.getDefaultToolkit().createImage("Library-icon (1).png");
       f.setIconImage(im);
       fi.setIconImage(im);
       l.setIconImage(im);
       f.setTitle("MY LIBRARY");
       fi.setTitle("MY LIBRARY");
       JMenuBar mb=new JMenuBar();
       fi.setJMenuBar(mb);
       JMenu mn=new JMenu("USER");
       mb.add(mn);
       JMenuItem mn1=new JMenuItem("CHANGE PASSWORD");
       mn.add(mn1);
       mn1.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
         
      l.setVisible(true);
       
           }
       });
       
       
f.getFocusCycleRootAncestor();
  f.setVisible(true);
fi.add(jp);
s.setVisible(true);
p1.setBounds(300, 170,d.width-310, d.height-170);
     p2.setBounds(300, 170,d.width-310, d.height-170);
     p3.setBounds(300, 170,d.width-310, d.height-170);
     p5.setBounds(300, 170,d.width-310, d.height-170);
     
     p4.setBounds(300, 170,d.width-310, d.height-170);
     h.setBounds(0,0,jp.getWidth(), 150);
BooksLibrary.p1.setVisible(true);
BooksLibrary.p5.setVisible(false);
BooksLibrary.p4.setVisible(false);
BooksLibrary.p3.setVisible(false);
BooksLibrary.p2.setVisible(false);
     jp.add(h);
  jp.add(s);
  jp.add(p1);
jp.add(p2);
  jp.add(p3);
  
  jp.add(p5);
jp.add(p4);
      f.setSize(500, 250);
f.add(new start());
    }
    
    }
