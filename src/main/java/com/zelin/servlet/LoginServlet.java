package com.zelin.servlet;

import com.zelin.pojo.User;
import com.zelin.service.PhoneService;
import com.zelin.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
@WebServlet("/check")       //查看购物车
public class LoginServlet extends HttpServlet {

    private PhoneService phoneService = new PhoneService();
    private UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/plain;charset=utf-8");
        req.setCharacterEncoding("utf-8");

        String msg = "";
        String uname = req.getParameter("uname");
        User user = userService.CheckUser(uname);
        if (user !=null){
            msg = "用户名已存在。。。";
        }else{
            msg = "用户名不存在，继续下一步操作！";
        }
        PrintWriter out = resp.getWriter();
        out.write(msg);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uname = req.getParameter("uname");
        String upwd = req.getParameter("upwd");

        User user = userService.findByNameAndPwd(uname, upwd);
        if (user != null){
            HttpSession session = req.getSession();
            session.setAttribute("user",user);
            resp.sendRedirect("/phone");
        }
    }
}
