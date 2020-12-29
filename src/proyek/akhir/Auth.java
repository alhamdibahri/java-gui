/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir;

import proyek.akhir.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author alhamdi
 */
public class Auth {
    User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
    public Boolean login(String username , String password, ArrayList<User> user){
        if(user.size() == 0){
            this.user = new User();
        }
        for(User u : user){
            if(u.getUsername().equals(username) && u.getPassword().equals(password)){
                this.setUser(u);
                return true;
            }
        }
        return false;
    }
}
