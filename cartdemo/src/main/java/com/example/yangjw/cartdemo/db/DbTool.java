package com.example.yangjw.cartdemo.db;

import com.example.yangjw.cartdemo.CartInfo;

import org.xutils.DbManager;
import org.xutils.db.sqlite.WhereBuilder;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;

/**
 * Created by yangjw on 2016/3/24.
 */
public class DbTool {

    private static DbManager db;

    static {
        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig();
        daoConfig.setDbName("demo.db")
                .setDbVersion(1)
                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
                    @Override
                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {

                    }
                });
        db = x.getDb(daoConfig);
    }

    public static void add(long id,String name,float price,int num) {

        if (num == 0) {
            delete(id);
            return;
        }
        CartInfo cartInfo = new CartInfo(name, price, num);
        cartInfo.set_id(id);
        try {
            db.saveOrUpdate(cartInfo);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public static void delete(long id) {
        CartInfo cartInfo = new CartInfo();
        cartInfo.set_id(id);
//        WhereBuilder whereBuilder = new WhereBuilder.b("");
        try {
            db.delete(cartInfo);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    public static List<CartInfo> findAll() {
        List<CartInfo> all = null;
        try {
            all = db.selector(CartInfo.class).findAll();
        } catch (DbException e) {
            e.printStackTrace();
        }

        return all;
    }
}
