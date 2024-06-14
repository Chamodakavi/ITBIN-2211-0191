/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Model;

/**
 *
 * @author Ckavi
 */
public class AddStock {
    
     private int id;
     private String name;
     private String stock;
     private String category;
     private String oil;
     private String fuel;
     private String air;
     private String other;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStock() {
        return stock;
    }

    public String getCategory() {
        return category;
    }

    public void setOil(String oil) {
        this.oil = oil;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setAir(String air) {
        this.air = air;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public String getOil() {
        return oil;
    }

    public String getFuel() {
        return fuel;
    }

    public String getAir() {
        return air;
    }

    public String getOther() {
        return other;
    }
     
     
    
}
