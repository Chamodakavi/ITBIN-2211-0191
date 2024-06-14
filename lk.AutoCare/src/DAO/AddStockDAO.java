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
import lk.autocare.Model.AddStock;
import lk.autocare.db.DBConnection;

/**
 *
 * @author Ckavi
 */
public class AddStockDAO {
    
    public void AddStock(AddStock stock,String cat){
        String sql = "INSERT INTO inventory(name,stock,category) VALUES(?,?,?)";
        try{
            Connection connection = DBConnection.getConnection();
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1,stock.getName());
            stmt.setString(2,stock.getStock());
            stmt.setString(3,cat);
            
            stmt.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(new JFrame(),"DATA Added Successfully ");

    }
    
}
