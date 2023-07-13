/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testnews;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author yk5fe
 */
public class TestNews {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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

             fenetre PN = new fenetre();
        PN.setVisible(true);
            
            
            
            
            } catch (SQLException  ex) {
               System.out.println("connexion echouier");
            }
        catch (ClassNotFoundException ex){
            System.out.println("connexion echouier");
        }
        
    }
    
}
