/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web_application;

import com.mycompany.web_application.database.MessageModel;
import java.util.ArrayList;

/**
 *
 * @author NOAH JAMES YANGA
 * 
 * the http response is the basic protocol response to send from the user.
 */
public class HttpResponse {
    
    //the message of the response
    private String message;
    //the type of code, OK if all are good, FAIL if something happened.
    private String code;
    //the data to be returned
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
    
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
