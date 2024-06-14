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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.autocare.db.DBConnection;
import lk.autocare.Model.AddUser;

public class AddUserDAO {
    
     public void AddUser(AddUser user){
        String sql = "INSERT INTO userdetails(username,password) VALUES(?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,user.getUserName());
            stmt.setString(2,user.getPassword());
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(new JFrame(),"DATA Added Successfully ");

    }
//    
//    public void updatePatient(Patient patient){
//        String sql = "UPDATE patienttb1 SET PatName = ?, PatGen = ?, PatDOB = ?, PatAdd = ?, PatPhone = ?, PatHIV = ?, PatAll = ? WHERE PatId = ?";
//        try{
//            Connection connection = DBConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1,patient.getPatientName());
//            stmt.setString(2,patient.getPatientGender());
//            stmt.setString(3,patient.getPatientDOB());
//            stmt.setString(4,patient.getPatientAddress());
//            stmt.setString(5,patient.getPatientPhoneNo());
//            stmt.setString(6,patient.getPatientIsHiv());
//            stmt.setString(7,patient.getPatientAllergie());
//            stmt.setInt(8,patient.getPatientId());
//            stmt.executeUpdate();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
//    
//    public void deletePatient(int id){
//        String sql = "DELETE FROM patienttb1 WHERE id = ?";
//        try{
//            Connection connection = DBConnection.getConnection();
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setInt(1, id);
//            stmt.executeUpdate();
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }

}
