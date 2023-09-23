/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timer;
 
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import static timer.INSTALLE.bol;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */

public class TIMER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new INSTALLE().setVisible(true);
                
        
        Voice voice;
                                 VoiceManager v=VoiceManager.getInstance();
                                 voice=v.getVoice(bol);
                                 voice.allocate();
                                 //in button enter{
                                  voice.speak("lll");
                                 //}
    }
    
}
