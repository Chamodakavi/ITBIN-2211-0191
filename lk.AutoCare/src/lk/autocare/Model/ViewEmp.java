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
public class ViewEmp {
    
        private int id;
        private String fname;
        private String lname;
        private String gender;
        private String address;
        private String tp;
        private String email;
        private String male;
        private String female;

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public String getTp() {
        return tp;
    }

    public String getEmail() {
        return email;
    }

    public void setMale(String male) {
        this.male = male;
    }

    public void setFemale(String female) {
        this.female = female;
    }

    public String getMale() {
        return male;
    }

    public String getFemale() {
        return female;
    }
        
        
}
