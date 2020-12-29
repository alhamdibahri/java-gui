/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek.akhir.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alhamdi
 */
public class User{
    
    
    private String nama;
    private String kodeUser;
    private String username;
    private String password;
    private String level;
    
    public static ArrayList<User> users = new ArrayList();

    public User(String nama, String kodeUser, String username, String password, String level) {
        this.nama = nama;
        this.kodeUser = kodeUser;
        this.username = username;
        this.password = password;
        this.level = level;
    }
    
    public User(){
        users.add(new User("Alhamdi Ferdiawan Bahri", "U001", "alhamdibahri", "password", "Admin"));
        users.add(new User("Petugas 1", "U002", "petugas1", "password", "Petugas"));
        users.add(new User("Alhamdi Ferdiawan Bahri", "U003", "alhamdibahri", "password", "Admin"));
        users.add(new User("Petugas 2", "U004", "petugas2", "password", "Petugas"));
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKodeUser() {
        return kodeUser;
    }

    public void setKodeUser(String kodeUser) {
        this.kodeUser = kodeUser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
