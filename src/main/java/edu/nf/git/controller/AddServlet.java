package edu.nf.git.controller;

import com.google.gson.Gson;
import edu.nf.git.entity.Users;
import edu.nf.git.service.AddService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author long
 */
@WebServlet("/add_user")
public class AddServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //获取页面输入的数据
        String uname = req.getParameter("uname");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String tel=req.getParameter("tel");
        //封装成user对象
        Users user = new Users();
        user.setName(uname);
        user.setAge(age);
        user.setTel(tel);
        //创建业务层对象
        AddService service = new AddService();
        try {
            service.AddUsers(user);
            String json = new Gson().toJson(200);
            //将json响应客户端
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().println(json);
        } catch (IOException e) {
            e.printStackTrace();
            String json = new Gson().toJson(500);
            //将json响应客户端
            resp.setContentType("application/json;charset=utf-8");
            resp.getWriter().println(json);

        }


        //将users序列化为json对象
        //
    }
}
