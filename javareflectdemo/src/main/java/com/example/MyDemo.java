package com.example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MyDemo {

    public static void main(String[] args) {

        annotation();
//        try {
//            Class<?> aClass = Class.forName("com.example.Student");
//            Object student = aClass.newInstance();
//
//            Field[] fields = aClass.getFields();
//            Method[] methods = aClass.getMethods();
//
//            for (int i = 0; i < fields.length; i++) {
//                System.out.println("--->" + fields[i].getName());
//            }
//
//            for (int i = 0; i < methods.length; i++) {
//                System.out.println("====>" + methods[i].getName());
//            }
//
//            Field name = aClass.getField("name");
//            name.set(student, "zhangsan");
//
//            System.out.println("student name=" + name.get(student));
//
//            Field[] declaredFields = aClass.getDeclaredFields();
//            for (int i = 0; i < declaredFields.length; i++) {
//                System.out.println(declaredFields[i].getName());
//            }
//
//
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (NoSuchFieldException e) {
//            e.printStackTrace();
//        }
    }


    private static void annotation() {

        try {
            Class<?> aClass = Class.forName("com.example.Student");
            Field field = aClass.getField("name");
            System.out.println("----"+field.getName());
            Bind annotation = field.getAnnotation(Bind.class);
            System.out.println("----"+annotation);
            if (annotation != null) {
                String value = annotation.value();

                Object student = aClass.newInstance();
                field.set(student,value);

                System.out.println("-----" + field.get(student));
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
