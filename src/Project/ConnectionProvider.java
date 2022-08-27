/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;

/**
 *
 * @author bappi
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
           // class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","2277");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
    
}
