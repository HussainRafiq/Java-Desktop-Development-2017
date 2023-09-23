/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.library;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */
public class frami{
    
    public JFrame fa() {
 JFrame fit=new JFrame();
  fit.setLayout(null);
    
Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
    fit.setSize(d.width,d.height);
       
        fit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       fit.setLocationRelativeTo(null);
       
    
    
    
    
    return fit;
    }
    
}
