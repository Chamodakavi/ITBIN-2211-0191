/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Controller;

import DAO.ViewVehicleDAO;
import javax.swing.JOptionPane;
import lk.autocare.Model.ViewVehicle;
import lk.autocare.View.ViewVehicleView;

/**
 *
 * @author Ckavi
 */
public class ViewVehicleControl {
    
        private final ViewVehicleView view;
        private  ViewVehicleDAO dao;
        
        
        public ViewVehicleControl(ViewVehicleView view) {
        this.view = view;
        this.dao = new ViewVehicleDAO(); 
        }
    
        
 public void delete(int id) {
        try {
            dao.delete(id);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
 
 public void update(ViewVehicle user) {
     
        try {
            
            dao.update(user);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }

    public void search(String keyword) {
        
    try {
      
            dao.search(keyword);
            //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
        } catch (Exception e) {
            JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
        }
    }
        
}
