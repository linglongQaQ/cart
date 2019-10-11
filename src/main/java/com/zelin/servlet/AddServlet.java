package com.zelin.servlet;

import com.zelin.pojo.Cart;
import com.zelin.pojo.CartItem;
import com.zelin.pojo.Phone;
import com.zelin.service.PhoneService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {

    private PhoneService phoneService = new PhoneService();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        /*根据id查询获取 对象*/
        Phone phone = new PhoneService().getById(Integer.parseInt(req.getParameter("pid")));

        /*创建购物车中每一个条目CartItem对象*/
        CartItem cartItem = new CartItem(phone.getId(),
                phone.getPname(),phone.getPtitle(),phone.getPrice(),phone.getPdesc(),phone.getImg(),
                1,phone.getPrice()*1);
        /*创建session对象*/
        HttpSession session = req.getSession();
        /*创建一个空的购物车*/
        Cart cart = new Cart();
        /*创建一个map对象，存放CartItem*/
        Map<Integer,CartItem> map = new HashMap<>();
        if (session.getAttribute("cart") == null)  {
            //第一次添加购物车
            /*将商品添加到购物车*/
            map.put(phone.getId(),cartItem);
            cart.setMap(map);
            session.setAttribute("cart",cart);
        }else {
            /*第二次或多次添加购物车*/
            /*通过session获取购物车对象*/
            cart = (Cart) session.getAttribute("cart");
            map= cart.getMap();
            if (map.containsKey(phone.getId())){
                /*重复购买同一件商品，数量加一即可*/
                CartItem item = map.get(phone.getId());
                item.setNum(item.getNum()+1);
            }else {
                /*不是重复购买同一件商品  将商品添加到购物车中*/
                map.put(phone.getId(),cartItem);
            }
            cart.setMap(map);
            session.setAttribute("cart",cart);   //更新session
        }
        /*添加完成，自动跳转到查看购物车页面*/
        resp.sendRedirect("/view");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
