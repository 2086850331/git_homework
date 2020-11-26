package edu.nf.git.controller;

import edu.nf.git.entity.Users;
import edu.nf.git.service.AddService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author long
 */
public class AddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取页面输入的数据
        Integer uid = Integer.parseInt(req.getParameter("uid"));
        String uname = req.getParameter("uname");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String tel = req.getParameter("tel");
        //封装成user对象
        Users user = new Users();
        user.setUid(uid);
        user.setUname(uname);
        user.setAge(age);
        user.setTel(tel);
        //创建业务层对象
        AddService service = new AddService();
        Users users = service.addUser(user);
        //将json响应客户端
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(users);
    }
}
