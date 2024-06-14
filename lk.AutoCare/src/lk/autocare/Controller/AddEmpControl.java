/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Controller;

import lk.autocare.View.AddEmpView;

/**
 *
 * @author Ckavi
 */
public class AddEmpControl {
    
    private final AddEmpView  view;
    
     public AddEmpControl(AddEmpView view) {
        this.view = view;
        initComponents();
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

    private void initComponents() {
        
        }
    
    
    

}
