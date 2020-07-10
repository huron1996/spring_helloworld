package com.huron.demo.helloworld;

import java.lang.Runnable;

public class helloworld {
    private String username;


    public void setUsername(String username) {
        this.username = username;
    }

    public void printHello(){
        System.out.println("The first Spring: hello" + username);
    }
}
