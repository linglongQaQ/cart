package com.zelin.pojo;

/**
 * @author: wangyilong
 * @Date: 2019/10/10 0010
 * @Description:
 */
public class Phone {

    private int id;
    private String pname;
    private String ptitle;
    private float price;
    private String pdesc;
    private String img;


    public Phone() {
    }

    public Phone(int id, String pname, String ptitle, float price, String pdesc, String img) {
        this.id = id;
        this.pname = pname;
        this.ptitle = ptitle;
        this.price = price;
        this.pdesc = pdesc;
        this.img = img;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getPdesc() {
        return pdesc;
    }

    public void setPdesc(String pdesc) {
        this.pdesc = pdesc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "id=" + id +
                ", pname='" + pname + '\'' +
                ", ptitle='" + ptitle + '\'' +
                ", price='" + price + '\'' +
                ", pdesc='" + pdesc + '\'' +
                ", img='" + img + '\'' +
                '}';
    }
}
