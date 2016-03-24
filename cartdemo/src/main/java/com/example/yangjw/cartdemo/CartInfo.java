package com.example.yangjw.cartdemo;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by yangjw on 2016/3/24.
 */
@Table(name = "tb_cart")
public class CartInfo {

    @Column(name = "_id", isId = true, autoGen = false)
    private long _id;

    @Column(name = "name")
    private String name;

    @Column(name = "price")
    private float price;

    @Column(name = "num")
    private int num;

    public CartInfo() {
    }

    public CartInfo( String name, float price, int num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public long get_id() {
        return _id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
