package com.example.yangjw.liwushuodemo.http;

import com.example.yangjw.liwushuodemo.bean.ProductInfo;

/**
 * Created by yangjw on 2016/3/16.
 *
 */
public interface IOkCallBack<E> {

    public void onSucess(E resultInfo) ;

}
