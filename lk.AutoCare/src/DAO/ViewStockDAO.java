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
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.autocare.Model.ViewStock;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class ViewStockDAO {
    
    public List<String[]> getUserDetails() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM inventory";

    try  {
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("id")); 
        user[1] = rs.getString("name");
        user[2] = rs.getString("stock");
        user[3] = rs.getString("category");
        
        userData.add(user);
       
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
    
  }
    
     public void delete(int id) throws SQLException {
        String deleteQuery = "DELETE FROM inventory WHERE id = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
         
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    }
     
       public void update(ViewStock user) throws SQLException {
        
     
        String name = user.getName();
        String q = user.getQuantity();
        int id = user.getId();
        
        String updateData = "UPDATE inventory "
                                               + "SET name = '"+name+"', stock = '"+q+ "'"
                                               + " WHERE id ='" +id+"';";
        
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
         
         
        String getData = "SELECT * FROM inventory WHERE name LIKE ?";
        
        try{
            
           Connection connection = DBConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(getData);
        pst.setString(1, "%" + keyword + "%"); // Set value for parameter 1

        ResultSet rs = pst.executeQuery();
            
              while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("id")); 
        user[1] = rs.getString("name");
        user[2] = rs.getString("stock");
        user[3] = rs.getString("category");
        
        userData.add(user);
       
      }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
         return userData;
    
    
}
       
       public  List<String[]>  category(String category){
        
         List<String[]> userData = new ArrayList<>();
         
         
        String getData = "SELECT * FROM inventory WHERE category = '"+category+"' ";
        
        try{
            
           Connection connection = DBConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(getData);

        ResultSet rs = pst.executeQuery();
            
              while (rs.next()) {
        String[] user = new String[4]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("id")); 
        user[1] = rs.getString("name");
        user[2] = rs.getString("stock");
        user[3] = rs.getString("category");
        
        userData.add(user);
       
      }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
         return userData;
    
    
}
       
}
