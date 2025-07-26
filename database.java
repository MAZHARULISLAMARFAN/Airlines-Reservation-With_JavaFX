/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package air_ticket_management_223071141;

import java.sql.Connection;
import java.sql.DriverManager;




/**
 *
 * @author Majharul
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
  
                      
            
            
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/airdata", "root","");
        return connect;
        }catch (Exception e){e.printStackTrace();}
        
        return null;
        
        
    }
    
    
}
