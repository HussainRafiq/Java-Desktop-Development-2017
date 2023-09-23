/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management;

import javax.swing.JFrame;

/**
 *
 * @author HUSSAIN
 */
public class STUDENTMANAGEMENT {
    static JFrame f=new LOGIN();
    static JFrame f1=new ADMIN();
    static JFrame f2=new STUDENT();
    static JFrame f3=new RECORD();

    static JFrame f4=new marks();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        f4.setVisible(true);
         
    }
    
}
