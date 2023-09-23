/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.library;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author HUSSAIN
 */



public class frames {
    
    public  JFrame f(){
        
    JFrame fit=new JFrame();
    
        fit.setSize(500,255);
       
        fit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fit.setLocationRelativeTo(null);
       
       fit.setUndecorated(true);
   
     return fit;
 }





}
