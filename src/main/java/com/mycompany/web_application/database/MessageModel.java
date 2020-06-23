/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web_application.database;

/**
 *
 * @author NOAH JAMES YANGA
 * 
 * the message model is base on db table "message"
 */
public class MessageModel {
    private int id;
    private String message;
    
    public MessageModel(int id, String message) {
        this.id = id;
        this.message = message;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
