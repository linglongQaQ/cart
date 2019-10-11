package com.zelin.servlet;

import com.zelin.pojo.Cart;
import com.zelin.pojo.CartItem;
import com.zelin.service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
@WebServlet("/remove")       //查看购物车
public class RemoveServlet extends HttpServlet {

    private PhoneService phoneService = new PhoneService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        /*获取购物车中要移出的商品id*/
        int pid = Integer.parseInt(req.getParameter("pid"));
        /*从session中获取cart对象*/
        HttpSession session = req.getSession();
        Cart cart = (Cart) session.getAttribute("cart");
        Map<Integer, CartItem> map = cart.getMap();
        if (map.containsKey(pid)){
            map.remove(pid);
        }
        /*将cart更新*/
        cart.setMap(map);
        session.setAttribute("cart",cart);
        req.getRequestDispatcher("/view.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
