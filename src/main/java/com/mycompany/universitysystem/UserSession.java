/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universitysystem;

/**
 *
 * @author DCN
 */
public class UserSession {
    private static UserSession instance;
    private int userId;

    private UserSession() {
        // Private constructor to prevent instantiation
    }

    public static synchronized UserSession getInstance() {
        if (instance == null) {
            instance = new UserSession();
        }
        return instance;
    }

    public int getId() {
        return userId;
    }

    public void setId(int id) {
        this.userId = id;
    }
}

