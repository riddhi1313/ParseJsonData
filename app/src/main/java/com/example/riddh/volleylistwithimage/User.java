package com.example.riddh.volleylistwithimage;

import java.util.ArrayList;

/**
 * Created by riddh on 5/6/2018.
 */

public class User {
    private String fname, avtarUrl,lname;


    public User() {
    }

    public User(String fname,String lname, String avtarUrl) {
        this.fname = fname;
        this.avtarUrl = avtarUrl;
        this.lname = lname;

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getavtarUrl() {
        return avtarUrl;
    }

    public void setavtarUrl(String avtarUrl) {
        this.avtarUrl = avtarUrl;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

}