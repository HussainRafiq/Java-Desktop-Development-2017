/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.library;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author HUSSAIN
 */
public class magic {
    int a,l=0,k=0;
    Timer t;

    void alif(JPanel p1,JPanel p2,JPanel p3,int lis){
p1.setVisible(false);
p2.setVisible(false);
p3.setVisible(false);
        if (lis==1) {
            p1.setVisible(true);
            a=p1.getHeight();
t=new Timer(10,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       a++;
     
       p1.setSize(p1.getWidth(),a);
       
     if (a>130) {

                t.stop();
               l=1;
p1.repaint();
            }
        }
});
t.start();
        }
              if (lis==2) {
            p2.setVisible(true);
            
            a=p2.getHeight();
t=new Timer(10,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       a++;
    
       p2.setSize(p2.getWidth(),a);
       
     if (a>227) {

                t.stop();
               l=2;
p1.repaint();
            }
     
        }

                         });
        t.start();
        }
            if (lis==3) {
            p3.setVisible(true);
            a=p3.getHeight();
t=new Timer(10,new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
       a++;
    
       p3.setSize(p3.getWidth(),a);
       
     if (a>444) {

                t.stop();
               l=3;
p1.repaint();
            }
     
        }

                         });
        t.start();
        }
           
           
        }



//    l=jButton1.getY();
//a = p1.getHeight();        
//DateFormat df=new SimpleDateFormat("dd-MM-yyyy");
//t=new Timer(10,new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//       a++;
//     l++;
//       jPanel1.setSize(jPanel1.getWidth(),a);
//        jButton1.setBounds(jButton1.getX(),l,jButton1.getWidth(),jButton1.getHeight());
//     if (a==500) {
//
//                t.stop();
//jPanel1.repaint();
//            }
//     
//        }
//});
// 
//}
//





    
}
