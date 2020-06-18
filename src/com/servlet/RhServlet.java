package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.Writer;

@WebServlet("/RhServlet")
public class RhServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        String r = request.getParameter("r");
        String h = request.getParameter("h");

        double b = Math.PI*Double.parseDouble(r)*Double.parseDouble(r)*2+Math.PI*2*Double.parseDouble(h);//表面积

        double t = Math.PI*Double.parseDouble(r)*Double.parseDouble(r)*Double.parseDouble(h);//体积

        PrintWriter out = response.getWriter();

        out.println("表面积"+b);
        out.println("体积"+t);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
