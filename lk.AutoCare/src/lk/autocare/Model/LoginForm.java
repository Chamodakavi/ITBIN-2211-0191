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
public class LoginForm {
    
        private String UserName;
        private String Password;
        
        
public  LoginForm()
{

}

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }
    
}
