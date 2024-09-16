/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion.ecole;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Yolie Eloria Renard
 */
public class MyConnection {
    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecolegestiondb", "root", "Renard04@");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        return con;
    }
    
}
