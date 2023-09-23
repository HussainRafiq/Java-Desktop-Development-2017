/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.library;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author HUSSAIN
 */
public class sqldb {
           
    public Statement st() throws ClassNotFoundException, SQLException, FileNotFoundException, IOException{

          String hj="";
           FileReader fr = new FileReader("sql.txt");
            BufferedReader br=new BufferedReader(fr);
           hj=br.readLine();
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://"+hj+";databaseName=booklibrary;integratedSecurity=true;";
            Connection con = DriverManager.getConnection(url);
            Statement st = con.createStatement();
    return st;
    }
}
