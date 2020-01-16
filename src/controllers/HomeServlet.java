package controllers;

import dao.DBmanager;
import models.User;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/home")
public class HomeServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        String language = request.getParameter("lang");
        String kaz = request.getParameter("kaz");
        String rus = request.getParameter("rus");
        String eng = request.getParameter("eng");
        Cookie cookie = new Cookie("langID", "langid");
        cookie.setMaxAge(60*60*24*365);
        response.addCookie(cookie);
        response.sendRedirect("/");

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        ArrayList<User> users = DBmanager.getAllUsers();
        request.setAttribute("users", users);

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
