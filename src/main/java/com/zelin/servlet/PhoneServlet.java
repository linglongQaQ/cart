package com.zelin.servlet;

import com.alibaba.fastjson.JSONObject;
import com.zelin.pojo.Phone;
import com.zelin.service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
@WebServlet("/phone")
public class PhoneServlet  extends HttpServlet {

    private PhoneService phoneService = new PhoneService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/json;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        /*查询全部*/
        List<Phone> list = phoneService.findAll();
        String data = JSONObject.toJSONString(list);
        PrintWriter out = resp.getWriter();
        out.write(data);
        out.flush();
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
