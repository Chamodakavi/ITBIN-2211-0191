


package DAO;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.autocare.db.DBConnection;
import lk.autocare.Model.AddUser;
import lk.autocare.Model.LoginForm;
import lk.autocare.View.HomePage;


public class LoginFormDAO {
    
       public void LoginForm(LoginForm login,JFrame loginFrame){
       
  
       String queryLogin = "SELECT * from userdetails where username = '"+login.getUserName()+
               "' AND password = '"+login.getPassword()+"'";
       
       try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(queryLogin);
            
            
            pst = connection.prepareStatement(queryLogin);
            ResultSet rs = pst.executeQuery();
            
             if(!rs.next() ){
                JOptionPane.showMessageDialog(null,"INVALID Credential");
            }
            else{
                
                HomePage home = new HomePage();
                home.setVisible(true);
                home.pack();
                home.setLocationRelativeTo(null);
                loginFrame.dispose();
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
     
        
    }

 
    
}
