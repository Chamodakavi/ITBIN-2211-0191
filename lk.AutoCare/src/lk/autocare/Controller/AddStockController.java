/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Controller;

import lk.autocare.View.AddStockView;

/**
 *
 * @author Ckavi
 */
public class AddStockController {
    
    private final AddStockView  view;
    
    public AddStockController(AddStockView view) {
        this.view = view;
        initComponents();
    }

   
    
    public String category(String oil, String fuel , String air, String other){
        
        String category="";
        
         if(oil == "Oil Filter"){
                category = "oil filter";
            }

            if(fuel == "Fuel Filter"){
                category = "fuel filter";
            }
            
            if(air== "Air Filter"){
                category = "air filter";
            }
            
            if(other == "Other"){
                category = "other";
            }
        return category;
            
        
    }
    
       private void initComponents() {
        
        }
    
}
