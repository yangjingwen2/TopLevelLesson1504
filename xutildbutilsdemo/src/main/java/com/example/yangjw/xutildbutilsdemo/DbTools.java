package com.example.yangjw.xutildbutilsdemo;

import com.example.yangjw.xutildbutilsdemo.bean.User;

import org.xutils.DbManager;
import org.xutils.db.Selector;
import org.xutils.ex.DbException;
import org.xutils.x;

/**
 * Created by yangjw on 2016/3/24.
 */
public class DbTools {

    public static final String DB_NAME = "android1504.db";

    //数据库操作的对象
    private static DbManager dbManager;

    static {
        //创建数据库
        //daoConfig是数据库的配置类
        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
        daoConfig.setDbName(DB_NAME) //设置数据库的名称
        .setDbVersion(1) //设置数据库的版本号
        .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
            //当数据库更新的时候，会回调此方法。相当于SLiteOpenHelper的onUpgrade方法
            @Override
            public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

            }
        });

        dbManager = x.getDb(daoConfig);
    }


    //新增
    public static void add(String name, int age, String color) {


        User user = new User(name, age, color);
        try {
            dbManager.saveBindingId(user);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    //查询
    public static User seletor() {
        User user = null;
        try {
            Selector<User> userSelector = dbManager.selector(User.class);
            //查询第一条数据
            user = userSelector.findFirst();
        } catch (DbException e) {
            e.printStackTrace();
        }

        return user;
    }


}
