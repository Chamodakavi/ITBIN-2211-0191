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
import lk.autocare.Model.ViewEmp;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class ViewEmpDAO {
    
      public List<String[]> getUserDetails() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM employeedetails";

    try  {
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[7]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("empid")); 
        user[1] = rs.getString("fname");
        user[2] = rs.getString("lname");
        user[3] = rs.getString("gender");
        user[4] = rs.getString("address");
        user[5] = rs.getString("telephone");
        user[6] = rs.getString("email");
        
        userData.add(user);       
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
    
    public void delete(int id) throws SQLException {
        String deleteQuery = "DELETE FROM employeedetails WHERE empid = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
         
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    }
    
    public void update(ViewEmp user,String gender1) throws SQLException {
        
//        System.out.println(user.getPassword());
//        System.out.println(user.getUserName());
//        System.out.println(user.getid());
        int id = user.getId();
        String fname = user.getFname();
        String lname = user.getLname();
        String gender = gender1;
        String address = user.getAddress();
        String tp = user.getTp();
        String email = user.getEmail();
        
        
        String updateData = "UPDATE employeedetails "
                                               + "SET fname = '"+fname+"',lname = '"+lname+"',gender = '"+gender1+"',"
                        + "address = '"+address+"',telephone = '"+tp+"', email = '"+email+ "'"
                                               + " WHERE empid ='" +id+"';";
        
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
         
         
        String getData = "SELECT * FROM employeedetails WHERE fname LIKE ?";
        
        try{
            
           Connection connection = DBConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(getData);
        pst.setString(1, "%" + keyword + "%"); // Set value for parameter 1

        ResultSet rs = pst.executeQuery();
            
              while (rs.next()) {
        String[] user = new String[7]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("empid")); 
        user[1] = rs.getString("fname");
        user[2] = rs.getString("lname");
        user[3] = rs.getString("gender");
        user[4] = rs.getString("address");
        user[5] = rs.getString("telephone");
        user[6] = rs.getString("email");
        
        userData.add(user);
       
      }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
         return userData;
    
    
}
    
}
