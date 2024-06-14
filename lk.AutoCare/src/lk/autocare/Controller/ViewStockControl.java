/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Controller;

import DAO.ViewStockDAO;
import javax.swing.JOptionPane;
import lk.autocare.Model.ViewStock;
import lk.autocare.View.ViewStockView;

/**
 *
 * @author Ckavi
 */
public class ViewStockControl {
    
            private final ViewStockView view;
            private  ViewStockDAO dao;
            
            public ViewStockControl(ViewStockView view) {
            this.view = view;
            this.dao = new ViewStockDAO(); 
        }
            
             public void delete(int id) {
                try {
                    dao.delete(id);
                        //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
                }
            }
             
              public void update(ViewStock user) {
     
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
