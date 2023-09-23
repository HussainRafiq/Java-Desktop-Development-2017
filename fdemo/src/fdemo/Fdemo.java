/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fdemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author MUHAMMAD HUSSAIN
 */
public class Fdemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream serviceAccount =
  new FileInputStream("k.json");

FirebaseOptions options = new FirebaseOptions.Builder()
  .setCredential(FirebaseCredentials.fromCertificate(serviceAccount))
  .setDatabaseUrl("https://my-project-1490971009672.firebaseio.com")
  .build();

FirebaseApp.initializeApp(options);
        // TODO code application logic here
    }
    
}
