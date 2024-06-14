/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lk.autocare.Model.AddEmp;
import lk.autocare.Model.AddUser;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class AddEmpDAO {
    
    public void AddUser(AddEmp user,String gen){
        String sql = "INSERT INTO employeedetails(fname,lname,gender,address,telephone,email) VALUES(?,?,?,?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,user.getFname());
            stmt.setString(2,user.getLname());
            stmt.setString(3,gen);
            stmt.setString(4,user.getAddress());
            stmt.setString(5,user.getTp());
            stmt.setString(6,user.getEmail());
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(new JFrame(),"DATA Added Successfully ");

    }
    
}
