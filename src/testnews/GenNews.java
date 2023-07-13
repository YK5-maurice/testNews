/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testnews;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import static testnews.Connection_bdnews.connexion;

/**
 *
 * @author yk5fe
 */
public class GenNews implements Runnable{
    
    Connection conn= connexion();
    
   public void run(){
       Date date = new Date();
       
       String query = "INSERT INTO news (`id`, `date_et_heure`, `type`, `tire`) VALUES (?, ?, ?, ?)";
                    PreparedStatement statement;
        try {
            statement = conn.prepareStatement(query);
            
             statement.setString(1, null);
                    statement.setDate(2, (java.sql.Date) date);
                    statement.setString(1,type );
                    statement.setString(1,titre );
                  
        } catch (SQLException ex) {
            Logger.getLogger(GenNews.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
  
    }
   
}
