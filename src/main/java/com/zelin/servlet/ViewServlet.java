package com.zelin.servlet;

import com.zelin.pojo.Phone;
import com.zelin.service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
@WebServlet("/view")       //查看购物车
public class ViewServlet extends HttpServlet {

    private PhoneService phoneService = new PhoneService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/view.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
