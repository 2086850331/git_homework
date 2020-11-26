package edu.nf.git.controller;

import edu.nf.git.entity.Users;
import edu.nf.git.service.UsersService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author long
 */
@WebServlet("/list_city")
public class UserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UsersService service = new UsersService();
        List<Users> list = service.listCity();
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(list);
    }
}
