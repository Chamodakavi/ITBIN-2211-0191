/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.autocare.Model;

import java.util.ArrayList;
import java.util.List;
import lk.autocare.Controller.ViewUserControl;

/**
 *
 * @author Ckavi
 */
public class ViewUser {
    
        private String UserName;
        private String Password;
        private int id;
        private String keyword;
        
        List<ViewUser> user = new ArrayList<>();
    
    public ViewUser(){ 
    }
    
    public void setUser(List<ViewUser> user) {
        this.user = user;
    }

    public List<ViewUser> getUser() {
        return user;
    }
    
     public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
    //
    public void setid(int id) {
        this.id = id;
    }
//
    public int getid() {
        return id;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }
    
 
}
