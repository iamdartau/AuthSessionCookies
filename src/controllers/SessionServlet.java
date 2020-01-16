package controllers;

import models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/session")
public class SessionServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String fullNmae = request.getParameter("fullName");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        int languageId = Integer.parseInt(request.getParameter("languageId"));

        User user = new User(fullNmae, login, password, languageId);

        HttpSession session = request.getSession();
        session.setAttribute("USER_DATA",user);

        response.sendRedirect("/");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
