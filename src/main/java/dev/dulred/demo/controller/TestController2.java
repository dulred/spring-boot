package dev.dulred.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestForm")
public class TestController2 extends HttpServlet {

    
    private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           String id=  request.getParameter("loginid");
           String pwd = request.getParameter("loginpwd");
           String horns = request.getParameter("horns");
           String[] scales = request.getParameterValues("scales");
           System.out.println(id  + pwd);
           System.out.println(horns);
           for (int i = 0; i < scales.length; i++) {
                System.out.println(scales[i]);
           }
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("text");

        // name = new String(name.getBytes("ISO-8859-1"), "UTF-8");
 
        System.out.println(name);

	}
    




}
