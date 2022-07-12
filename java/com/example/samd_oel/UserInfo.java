package com.example.samd_oel;

import java.io.Serializable;

public class UserInfo implements Serializable{
    static String date = "", time ="", name ="";

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String display(){
        return "Reserved one tabel at - "+ time + " on - " + date;
    }}
