package com.example;

/**
 * Created by yangjw on 2016/3/22.
 */
public class Student {

    @Bind(value = "laowang")
    public String name;
    public int age;

    private String sex;

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
}
