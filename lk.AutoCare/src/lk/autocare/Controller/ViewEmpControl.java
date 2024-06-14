/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Controller;

import DAO.ViewEmpDAO;
import DAO.ViewUserDAO;
import javax.swing.JOptionPane;
import lk.autocare.Model.ViewEmp;
import lk.autocare.View.ViewEmpView;

/**
 *
 * @author Ckavi
 */
public class ViewEmpControl {
            private final ViewEmpView view;
            private  ViewEmpDAO dao;
            
            public ViewEmpControl(ViewEmpView view) {
            this.view = view;
            this.dao = new ViewEmpDAO(); 
        }
            
             public void delete(int id) {
               try {
                    dao.delete(id);
                    //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
               } catch (Exception e) {
                    JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
                    }
               }
             
             public void update(ViewEmp emp,String gender1) {
                try {
                    dao.update(emp,gender1);
                    //view.refreshTableData(); // Optional: Update table data after successful deletion (implementation depends on your table model)
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(view, "Error deleting user: " + e.getMessage());
                }
            }
             
          public String gend(String m , String f){
                String gender = null;
                if(m=="male"){
                       gender = "male";

                   }
                   if(f=="female"){
                       gender = "female";
                   }
                   
               return gender;        
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
