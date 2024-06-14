/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.autocare.Model.ViewUser;
import lk.autocare.db.DBConnection;
/**
 *
 * @author Ckavi
 */
public class ViewUserDAO {
    
     public List<String[]> getUserDetails() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM userdetails";

    try  {
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[3]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("userid")); 
        user[1] = rs.getString("username");
        user[2] = rs.getString("password");
        
        userData.add(user);
       
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
     

    public void delete(int id) throws SQLException {
        String deleteQuery = "DELETE FROM userdetails WHERE userid = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
         
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    }
    
    public void update(ViewUser user) throws SQLException {
        
        System.out.println(user.getPassword());
        System.out.println(user.getUserName());
        System.out.println(user.getid());
        
        String username = user.getUserName();
        String password = user.getPassword();
        int id = user.getid();
        
        String updateData = "UPDATE userdetails "
                                               + "SET username = '"+username+"', password = '"+password+ "'"
                                               + " WHERE userid ='" +id+"';";
        
        try{
              Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(updateData);
          //  ResultSet rs = pst.executeQuery();
         
            pst.executeUpdate();
            
           
            
            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }
        
    }
    
    public  List<String[]>  search(String keyword){
        
         List<String[]> userData = new ArrayList<>();
         
         
        String getData = "SELECT * FROM userdetails WHERE username LIKE ?";
        
        try{
            
           Connection connection = DBConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(getData);
        pst.setString(1, "%" + keyword + "%"); // Set value for parameter 1

        ResultSet rs = pst.executeQuery();
            
              while (rs.next()) {
        String[] user = new String[3]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("userid")); 
        user[1] = rs.getString("username");
        user[2] = rs.getString("password");
        
        userData.add(user);
       
      }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
         return userData;
}
    
    
}
    
    

