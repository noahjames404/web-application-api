/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.web_application;

import com.google.gson.Gson;
import com.mycompany.web_application.database.CRUD;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 05
 */
@WebServlet(name = "sendMessage", urlPatterns = {"/api/v1/sendMessage"}, initParams = {
    @WebInitParam(name = "message", value = "string")})
public class sendMessage extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        
        PrintWriter out = response.getWriter();
        try {
            Gson gson = new Gson();
        
            HttpResponse http_response = new HttpResponse();
            http_response.setMessage("insert success");
            http_response.setCode("OK");
            
            String r = gson.toJson(http_response);
            out.println(r);
          
        } finally {
            out.close();
        }
        
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //do nothing
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String message = request.getParameter("message");
  
        CRUD crud = new CRUD();
        crud.insertMessage(message);
        
        processRequest(request, response);
        
    }

 
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
