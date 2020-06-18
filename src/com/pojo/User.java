package com.pojo;

import org.junit.Test;

import java.util.*;

public class User {
    private int id;
    private String Email;
    private String Name;
    private String Password;
    private int Status;
    private int Lock;


    public User(){
        
    }
    public User(String Email,String Name,String Password){
        this.Email = Email;
        this.Name = Name;
        this.Password = Password;
    }
    public User(int id,String Email,String Name,String Password,int Status,int Lock){
        this.id = id;
        this.Email = Email;
        this.Name = Name;
        this.Password = Password;
        this.Status = Status;
        this.Lock = Lock;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", Email='" + Email + '\'' +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Status=" + Status +
                ", Lock=" + Lock +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getLock() {
        return Lock;
    }

    public void setLock(int lock) {
        Lock = lock;
    }
}
