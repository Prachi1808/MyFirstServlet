package com.firstservlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.HttpServletRequest;
import javax.servlet.HttpServletResponse;
import javax.io.IOException;
import javax.io.PrintWriter;

@webServlet("/Hello")//mapping it is a servlet using annotation
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
        response.setContentType("text/html");//setting content to text or html
        PrintWrite out = response.getWriter();
        out.println("<h3>Hello World Prachi FirstServlet!</h3>");
        out.close();
    }
}
