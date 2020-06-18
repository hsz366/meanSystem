package com.servlet;

import com.dao.impl.UserDaoImpl;
import com.pojo.User;
import com.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("username");
        String password = request.getParameter("password");
        LoginServiceImpl loginService = new LoginServiceImpl();
        User login = loginService.Login(name, password);
        if(login!=null){
            HttpSession session = request.getSession();
            session.setAttribute("user",login);
            request.getRequestDispatcher("main.jsp").forward(request,response);
        }else{
            response.sendRedirect("login.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
