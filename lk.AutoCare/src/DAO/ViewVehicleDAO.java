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
import lk.autocare.Model.ViewVehicle;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class ViewVehicleDAO {
    
      public List<String[]> getUserDetails() {
    List<String[]> userData = new ArrayList<>();

    String getData = "SELECT * FROM vehicle";

    try  {
        Connection connection = DBConnection.getConnection();
         PreparedStatement pst = connection.prepareStatement(getData);
         ResultSet rs = pst.executeQuery();

      while (rs.next()) {
        String[] user = new String[12]; // Assuming username and password
        
        user[0] = String.valueOf(rs.getInt("id")); 
        user[1] = rs.getString("name");
        user[2] = rs.getString("vno");
        user[3] = rs.getString("address");
        user[4] = rs.getString("tp");
        user[5] = rs.getString("email");
        user[6] = rs.getString("eoil");
        user[7] = rs.getString("oilfilter");
        user[8] = rs.getString("fuelfilter");
        user[9] = rs.getString("airfilter");
        user[10] = rs.getString("goil");
        user[11] = rs.getString("difoil");

        
        userData.add(user);
       
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }

    return userData;
    
  }
    
      public void delete(int id) throws SQLException {
        String deleteQuery = "DELETE FROM vehicle WHERE id = '"+id+"'";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(deleteQuery);
         
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(new JFrame(),"DATA Deleted Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }

    }
      
        public void update(ViewVehicle user) throws SQLException {
        
            System.out.println(user.getName());
            
         int id = user.getId();
        String name = user.getName() ;
        String vno = user.getVno();
        String tp = user.getTp();
        String address = user.getAddress();
        String email = user.getEmail();
        String enoil = user.getEoil();
        String oilf = user.getOilfilter();
        String ffilter = user.getFuelfilter();
        String afilter = user.getAirfilter();
        String difoil = user.getDifoil();
        String gearoil = user.getGoil();
        
        String queryRegister = "UPDATE vehicle "
            + "SET name = '"+name+"', vno = '"+vno+"',address = '"+address+"',tp = '"+tp+"',email = '"+email+"',"
            + "eoil = '"+enoil+"',oilfilter = '"+oilf+"',fuelfilter = '"+ffilter+"',airfilter = '"+afilter+"',goil = '"+gearoil+"',difoil = '"+difoil+"'"
            + " WHERE id ='" +id+"';";

        
        try{
              Connection connection = DBConnection.getConnection();
            PreparedStatement pst = connection.prepareStatement(queryRegister);
          //  ResultSet rs = pst.executeQuery();
         
            pst.executeUpdate();
 
            JOptionPane.showMessageDialog(new JFrame(),"DATA Updated Successfully ");
        } catch (SQLException e) {
            e.printStackTrace();
    }
        
    }
        
         public  List<String[]>  search(String keyword){
        
         List<String[]> userData = new ArrayList<>();
         
         System.out.println(keyword);
        String getData = "SELECT * FROM vehicle WHERE vno LIKE ?";
        
        try{
            
           Connection connection = DBConnection.getConnection();
        PreparedStatement pst = connection.prepareStatement(getData);
        pst.setString(1, "%" + keyword + "%"); // Set value for parameter 1

        ResultSet rs = pst.executeQuery();
            
         while (rs.next()) {
         String[] user = new String[12]; // Assuming username and password
         
        user[0] = String.valueOf(rs.getInt("id")); 
        user[1] = rs.getString("name");
        user[2] = rs.getString("vno");
        user[3] = rs.getString("address");
        user[4] = rs.getString("tp");
        user[5] = rs.getString("email");
        user[6] = rs.getString("eoil");
        user[7] = rs.getString("oilfilter");
        user[8] = rs.getString("fuelfilter");
        user[9] = rs.getString("airfilter");
        user[10] = rs.getString("goil");
        user[11] = rs.getString("difoil");
        userData.add(user);
       
      }
            
        }catch (SQLException e) {
             e.printStackTrace();
        }
         return userData;
      
}
      
}
