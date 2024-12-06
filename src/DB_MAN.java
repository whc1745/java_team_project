
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.Statement;
import java.io.IOException;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author antaemin
 */
public class DB_MAN {
    String strUrl = "jdbc:mysql://joon-db.crmumkueu08r.ap-northeast-2.rds.amazonaws.com:3306/java";
    String user = "java_db_user";
    String pass = "InhatcJavaProj0915";
    
    Connection DB_con;
    Statement DB_stmt;
    ResultSet DB_rs;
    
    public void dbOpen() throws IOException {
        try {
            
            DB_con = DriverManager.getConnection(strUrl, user, pass);
            DB_stmt = DB_con.createStatement();
        } catch (Exception e) {
            System.out.println("SQLExeption : " + e.getMessage());
        }
    }
    
    public void dbClose() throws IOException {
        try {
            DB_stmt.close();
            DB_con.close();
        } catch (Exception e) {
            System.out.println("SQLExeption : " + e.getMessage());
        }
    }
}
