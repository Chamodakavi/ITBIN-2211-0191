
package lk.autocare.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    
    private static final String host = "jdbc:mysql://localhost:3306/autocare";
    private static final String user = "root";
    private static final String password = "";
    
    private static Connection connection;

    public DBConnection() {
    }
  
    public static Connection getConnection(){
        if(connection == null){
            try{
               connection = DriverManager.getConnection(host,user,password);
               System.out.println("CONNECTED SUCCESSFULLY");
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
        return connection;
    }
    
    public static void closeConnection(){
        if(connection != null){
            try{
               connection.close();
            }catch(SQLException e){
                e.printStackTrace();
            }
        }
    }
    
    
    
}
