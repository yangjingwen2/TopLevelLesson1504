package com.example.yangjw.xutildbutilsdemo.bean;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by yangjw on 2016/3/24.
 *
 * tb_user:是表名，即将创建的表的名称就是tb_user.
 * 此处表示User类和数据库表tb_user关联
 */
@Table(name = "tb_user")
public class User {

    //isId表示主键 autoGen自增长
    @Column(name = "_id", isId = true, autoGen = true)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "color")
    private String color;

    public User() {
        //使用Xutil的数据库框架，一定要有一个无餐的构造方法
    }

    public User(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
