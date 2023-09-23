/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */
public class save extends JCheckBox{

    public save(String name) {
    this.setText(name);
    this.setSelected(true);
    this.setVisible(true);
    this.repaint();
    
    }
    
    
}
