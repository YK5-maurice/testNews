/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package testnews;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

/**
 *
 * @author yk5fe
 */
public class Connection_bdnews {

    public static Connection connexion(){
        try {
            // chargement des ^pilotes jdbc
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("chargement des pilotes reuissi");
            
            // creation d'une connexion a la bd cafty
            String url="jdbc:mysql://localhost:3306/bdnews?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user="root";
            String password="";
            Connection conn = (Connection) DriverManager.getConnection(url,user,password);
            System.out.println("connection a la bd etabli");
            return conn;
            } catch (SQLException  ex) {
               System.out.println("connexion echouier");
            }
        catch (ClassNotFoundException ex){
            System.out.println("connexion echouier");
        }
        
        return null;
    }
    
}
