package com.example;

import java.util.ArrayList;
import java.util.List;

public class MyClass {

    public static void main(String[] args) {
    List<String> list = new ArrayList<>();
        for (int i=0;i<20;i++) {
            list.add("item" + i);
        }


        for (int j=list.size()-1;j>=0;j--) {
            list.remove(j);

        }
        System.out.println("---------" + list.size());

    }
}
