/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web_application.database;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author NOAH JAMES YANGA :3 
 * 
 * handles all create, read, update & delete actions on database
 */
public class CRUD {
    
    //database config
    protected String database_name = "web_application_api";
    protected String database_user = "root";
    protected String database_pass = "";
    
    private Connection conn; 
    public CRUD(){
        //create a connection on instance
        try {
             Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost/"+database_name+"?serverTimezone=UTC", database_user, database_pass);
        } catch(Exception ex){
             ex.printStackTrace();
        }
    }
    
    public Statement getStatement() throws SQLException {
//        create a simple statement
        return conn.createStatement();
    }
    
    /*
        get the message from the database
        @return  ArrayList<MessageModel>; return the whole message table data.      
    */
    public ArrayList<MessageModel> getMessage(){
        ArrayList list = new ArrayList();
        try{
            ResultSet rs = getStatement().executeQuery("SELECT * FROM message");
            while(rs.next()){
                list.add(new MessageModel(
                        rs.getInt("id"),
                        rs.getString("Message")
                ));
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
        return list;
    }
    
    /*
        insert a new message to table
        @param message - the message to be sent
    */
    public long insertMessage(String message){
        try {
            Statement stmt = getStatement();
            stmt.executeUpdate("INSERT INTO message (message) VALUES ('"+message+"')");
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
}
