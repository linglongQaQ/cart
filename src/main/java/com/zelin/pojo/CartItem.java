package com.zelin.pojo;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
public class CartItem extends Phone {

    private int num =1;             //购买数量
    private float sum = 0 ;          //小计

    public CartItem() {
    }


    public CartItem(int id, String pname, String ptitle, float price, String pdesc, String img, int num, float sum) {
        super(id, pname, ptitle, price, pdesc, img);
        this.num = num;
        this.sum = sum;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getSum() {
        sum = this.getNum()*this.getPrice();
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "num=" + num +
                ", sum=" + sum +
                '}';
    }
}
