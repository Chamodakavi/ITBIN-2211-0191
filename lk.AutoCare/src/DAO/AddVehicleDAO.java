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
import lk.autocare.Model.AddUser;
import lk.autocare.Model.AddVehicle;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class AddVehicleDAO {
    
       public void AddUser(AddVehicle user){
        String sql = "INSERT INTO vehicle(name,vno,address,tp,email,eoil,oilfilter,fuelfilter,airfilter,goil,difoil) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,user.getName());
            stmt.setString(2,user.getVno());
            stmt.setString(3,user.getAddress());
            stmt.setString(4,user.getTp());
            stmt.setString(5,user.getEmail());
            stmt.setString(6,user.getEoil());
            stmt.setString(7,user.getOilfilter());
            stmt.setString(8,user.getFuelfilter());
            stmt.setString(9,user.getAirfilter());
            stmt.setString(10,user.getGoil());
            stmt.setString(11,user.getDifoil());
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(new JFrame(),"DATA Added Successfully ");

    }
    
}
