
package lk.autocare.Model;


public class AddUser {
    
    private String userName;
    private String password;
    
    
    
public  AddUser()
{

}




//public AddUser(String userName, String password) {
//        this.userName = userName;
//        this.password = password;
// 
//   }





public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
