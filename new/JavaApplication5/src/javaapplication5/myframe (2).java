/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author HUSSAIN
 */
public class myframe extends JFrame {
     Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    JFrame fn;
     
     JFrame fn(){
    
       fn=new JFrame();
        fn.setSize(d);
        fn.setUndecorated(true);
         JDesktopPane pane=new JDesktopPane()        ;
        pane.setBounds(0, 0,d.width, d.height);
        pane.setBackground(Color.red);
        JLabel l1=new JLabel();
        l1.setBounds(0, 0,d.width, d.height);
        Image im=Toolkit.getDefaultToolkit().createImage("backgrounds\\download (1).jpg").getScaledInstance(pane.getWidth(),pane.getWidth(), 0);
        ImageIcon imc=new ImageIcon(im);
        l1.setIcon(imc);
        pane.add(l1);
        repaint();
         JMenuItem m1=new JMenuItem("REFRESH");
        JMenuItem m2=new JMenuItem("PERSONALIZE");
        JMenuItem m3=new JMenuItem("EXIT");
        JPopupMenu pm=new JPopupMenu();
       pane.setLayout(null);
        pm.add(m1);
        pm.add(m2);
        pm.add(m3);
       
        m1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
           repaint();
            }
        });
        m2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JInternalFrame f1=new JInternalFrame("PERSONALIZE",true,true,true);
                
                JTabbedPane tb=new JTabbedPane();
                JPanel p1=new JPanel();
                JPanel p2=new JPanel();
                tb.add(p1);
                tb.add(p2);
                tb.setTitleAt(0,"BACKGROUNG PICTURE");
                
                tb.setTitleAt(1,"BACKGROUNG COLOUR");
                
                f1.add(tb);
               f1.setAlignmentX(JInternalFrame.CENTER_ALIGNMENT);
               
               f1.setAlignmentY(JInternalFrame.CENTER_ALIGNMENT);
                f1.setSize(700,500);
                f1.setVisible(true);
                pane.add(f1);
                f1.repaint();
                fn.repaint();
                pane.repaint();
                
                
                
            }
        });
        m3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
         fn.dispose();            }
        });
        pane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                 pm.show(e.getComponent(),e.getX(),e.getY());
                }
            }
        });
        
        fn.add(pane);
        
        
        fn.setVisible(true);
        
        return fn;
    }
    void la(){
     fn.dispose();
    }
}
