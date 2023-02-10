/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Thisara
 */
public class DBConnector {
    
public static Connection getConnection()
{
Connection con = null;
try 
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Rental_Management?serverTimezone=UTC","root","123");

} 
catch (SQLException ex) {
Logger.getLogger(DBConnector.class.getName()).log(Level.SEVERE, null, ex);
System.out.print(ex.getMessage());
JOptionPane.showMessageDialog(null, "Connection Failed Faild. Try again", "ERROR", JOptionPane.ERROR_MESSAGE);

}
return con;
}
    
}
