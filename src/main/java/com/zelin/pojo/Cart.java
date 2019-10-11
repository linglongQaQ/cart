package com.zelin.pojo;

import java.util.Iterator;
import java.util.Map;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
public class Cart {

    private int totalCount;        //总数量
    private float totalAmt;        //总金额
    private Map<Integer,CartItem> map;

    public Cart() {
    }

    public Cart(int totalCount, float totalAmt, Map<Integer, CartItem> map) {
        this.totalCount = totalCount;
        this.totalAmt = totalAmt;
        this.map = map;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public float getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(float totalAmt) {
        this.totalAmt = totalAmt;
    }

    public Map<Integer, CartItem> getMap() {
        return map;
    }

    public void setMap(Map<Integer, CartItem> map) {
        /*遍历map进行取值*/
        int n = 0;         //单件小计的数量
        float m = 0.0f;          //单件的小计金额
        /*遍历map的value值 得到Cartitem对象*/
        Iterator<CartItem> iterator = map.values().iterator();
        while (iterator.hasNext()){
            CartItem cartItem = iterator.next();
            n += cartItem.getNum();
            m +=cartItem.getSum();
        }

        this.totalCount = n;
        this.totalAmt = m;
        this.map = map;
    }
}
