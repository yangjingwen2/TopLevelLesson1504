package com.example.yangjw.cartdemo;

import java.util.List;

/**
 * Created by yangjw on 2016/3/24.
 */
public class ProductInfo {


    /**
     * code : 0
     * data : {"products":[{"category_id":12,"current_sku":{"discount":29,"id":10360604,"list_price":{"CNY":38600},"real_price":{"CNY":27592},"stock":93},"fav_count":3,"favorite":false,"id":10360561,"images":[{"h":320,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg","w":320}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"pola 粉色 高保濕限定套裝","product_id":10360561,"rank":0,"review_count":0,"score":8,"sku_id":10360604,"url":"https://mcn.seashellmall.com/product/pola-%E7%B2%89%E8%89%B2-%E9%AB%98%E4%BF%9D%E6%BF%95%E9%99%90%E5%AE%9A%E5%A5%97%E8%A3%9D-p-10360561.html"},{"category_id":36,"current_sku":{"discount":14,"id":10360027,"list_price":{"CNY":13579},"real_price":{"CNY":11700},"stock":200},"fav_count":3,"favorite":false,"id":10360027,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7a41ded891fa48f4ada6c71138c1d009.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7a41ded891fa48f4ada6c71138c1d009.JPG","w":5016}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"参天 BEAUTEYE 玫瑰 贵妇眼药水","product_id":10360027,"rank":0,"review_count":0,"score":8,"sku_id":10360027,"url":"https://mcn.seashellmall.com/product/%E5%8F%82%E5%A4%A9-BEAUTEYE-%E7%8E%AB%E7%91%B0-%E8%B4%B5%E5%A6%87%E7%9C%BC%E8%8D%AF%E6%B0%B4-p-10360027.html"},{"category_id":33,"current_sku":{"discount":20,"id":10360053,"list_price":{"CNY":3500},"real_price":{"CNY":2800},"stock":196},"fav_count":3,"favorite":false,"id":10360053,"images":[{"h":480,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/4b4b18523a174f80a503b85b343c52b8.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/4b4b18523a174f80a503b85b343c52b8.jpg","w":640}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Lion 酵素 牙膏","product_id":10360053,"rank":0,"review_count":0,"score":8,"sku_id":10360053,"url":"https://mcn.seashellmall.com/product/Lion-%E9%85%B5%E7%B4%A0-%E7%89%99%E8%86%8F-p-10360053.html"},{"category_id":13,"current_sku":{"discount":27,"id":10359946,"list_price":{"CNY":5180},"real_price":{"CNY":3800},"stock":7},"fav_count":4,"favorite":false,"id":10359946,"images":[{"h":800,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/4bdaaf60be734132a2cdc1755a31f0b3.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/4bdaaf60be734132a2cdc1755a31f0b3.jpg","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kose 高丝 Q10护手霜              ","product_id":10359946,"rank":0,"review_count":0,"score":8,"sku_id":10359946,"url":"https://mcn.seashellmall.com/product/Kose-%E9%AB%98%E4%B8%9D-Q10%E6%8A%A4%E6%89%8B%E9%9C%9C---------------p-10359946.html"},{"category_id":19,"current_sku":{"discount":12,"id":10360005,"list_price":{"CNY":10500},"real_price":{"CNY":9300},"stock":199},"fav_count":3,"favorite":false,"id":10360005,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/0a1b0cb76ec84a67a7e21eaa756b76f7.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/0a1b0cb76ec84a67a7e21eaa756b76f7.JPG","w":2786}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Shiseido 资生堂 131 粉底刷","product_id":10360005,"rank":0,"review_count":0,"score":8,"sku_id":10360005,"url":"https://mcn.seashellmall.com/product/Shiseido-%E8%B5%84%E7%94%9F%E5%A0%82-131-%E7%B2%89%E5%BA%95%E5%88%B7-p-10360005.html"},{"category_id":36,"current_sku":{"discount":52,"id":10360029,"list_price":{"CNY":7800},"real_price":{"CNY":3800},"stock":15},"fav_count":1,"favorite":false,"id":10360029,"images":[{"h":253,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/e5997394af91459b9ba20aff4301365a.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/e5997394af91459b9ba20aff4301365a.jpg","w":253}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"参天 FX眼药水（银色）","product_id":10360029,"rank":0,"review_count":1,"score":18,"sku_id":10360029,"url":"https://mcn.seashellmall.com/product/%E5%8F%82%E5%A4%A9-FX%E7%9C%BC%E8%8D%AF%E6%B0%B4%EF%BC%88%E9%93%B6%E8%89%B2%EF%BC%89-p-10360029.html"},{"category_id":33,"current_sku":{"discount":11,"id":10360023,"list_price":{"CNY":12740},"real_price":{"CNY":11400},"stock":199},"fav_count":4,"favorite":false,"id":10360023,"images":[{"h":383,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/964636f7b6c1495583a36dc7a2ee3ba7.png?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/964636f7b6c1495583a36dc7a2ee3ba7.png","w":295}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"狮王 Smile Cosmetique按压式美白去渍牙膏","product_id":10360023,"rank":0,"review_count":0,"score":8,"sku_id":10360023,"url":"https://mcn.seashellmall.com/product/%E7%8B%AE%E7%8E%8B-Smile-Cosmetique%E6%8C%89%E5%8E%8B%E5%BC%8F%E7%BE%8E%E7%99%BD%E5%8E%BB%E6%B8%8D%E7%89%99%E8%86%8F-p-10360023.html"},{"category_id":20,"current_sku":{"discount":18,"id":10360047,"list_price":{"CNY":4480},"real_price":{"CNY":3700},"stock":200},"fav_count":2,"favorite":false,"id":10360047,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/7fc90c218aee4b10bab916023b93eb22.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/7fc90c218aee4b10bab916023b93eb22.JPG","w":4464}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 素肌F系列无护翼敏感肌日用护翼棉柔卫生巾                       205mm 24片","product_id":10360047,"rank":0,"review_count":0,"score":8,"sku_id":10360047,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E6%97%A0%E6%8A%A4%E7%BF%BC%E6%95%8F%E6%84%9F%E8%82%8C%E6%97%A5%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------205mm-24%E7%89%87-p-10360047.html"},{"category_id":33,"current_sku":{"discount":35,"id":10360806,"list_price":{"CNY":4900},"real_price":{"CNY":3200},"stock":100},"fav_count":2,"favorite":false,"id":10360015,"images":[{"h":2208,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/a8b4699b3c594856a4e9e2ee8ab191a5.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/a8b4699b3c594856a4e9e2ee8ab191a5.jpg","w":1242}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kiss You 负离子牙刷","product_id":10360015,"rank":0,"review_count":0,"score":8,"sku_id":10360806,"url":"https://mcn.seashellmall.com/product/Kiss-You-%E8%B4%9F%E7%A6%BB%E5%AD%90%E7%89%99%E5%88%B7-p-10360015.html"},{"category_id":20,"current_sku":{"discount":18,"id":10360046,"list_price":{"CNY":4620},"real_price":{"CNY":3800},"stock":200},"fav_count":2,"favorite":false,"id":10360046,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/0bd69bf51c0f4537965e2d3b4c0acd2e.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/0bd69bf51c0f4537965e2d3b4c0acd2e.JPG","w":5184}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 Cosme NO.1 素肌F系列量多日用护翼棉柔卫生巾                       22.5cm 22片","product_id":10360046,"rank":0,"review_count":0,"score":8,"sku_id":10360046,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-Cosme-NO.1-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E9%87%8F%E5%A4%9A%E6%97%A5%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------22.5cm-22%E7%89%87-p-10360046.html"},{"category_id":37,"current_sku":{"discount":16,"id":10360704,"list_price":{"CNY":63979},"real_price":{"CNY":53800},"stock":200},"fav_count":3,"favorite":false,"id":10359958,"images":[{"h":440,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/ebf6b0bc3064483caa2458b3f7f722da.jpg","w":440}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Laduree Face Color Rose Laduree花瓣腮红（3色入）粉芯","product_id":10359958,"rank":0,"review_count":0,"score":8,"sku_id":10360704,"url":"https://mcn.seashellmall.com/product/Laduree-Face-Color-Rose-Laduree%E8%8A%B1%E7%93%A3%E8%85%AE%E7%BA%A2%EF%BC%883%E8%89%B2%E5%85%A5%EF%BC%89%E7%B2%89%E8%8A%AF-p-10359958.html"},{"category_id":20,"current_sku":{"discount":12,"id":10360049,"list_price":{"CNY":4200},"real_price":{"CNY":3700},"stock":198},"fav_count":1,"favorite":false,"id":10360049,"images":[{"h":3456,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/b01b4c34b36f48be89f59606e4c7cec2.JPG?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/b01b4c34b36f48be89f59606e4c7cec2.JPG","w":5040}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kao 乐而雅 素肌F系列无护翼敏感肌夜用护翼棉柔卫生巾                       300mm 10片","product_id":10360049,"rank":0,"review_count":0,"score":8,"sku_id":10360049,"url":"https://mcn.seashellmall.com/product/Kao-%E4%B9%90%E8%80%8C%E9%9B%85-%E7%B4%A0%E8%82%8CF%E7%B3%BB%E5%88%97%E6%97%A0%E6%8A%A4%E7%BF%BC%E6%95%8F%E6%84%9F%E8%82%8C%E5%A4%9C%E7%94%A8%E6%8A%A4%E7%BF%BC%E6%A3%89%E6%9F%94%E5%8D%AB%E7%94%9F%E5%B7%BE-----------------------300mm-10%E7%89%87-p-10360049.html"},{"category_id":32,"current_sku":{"discount":10,"id":10360054,"list_price":{"CNY":21500},"real_price":{"CNY":19350},"stock":140},"fav_count":4,"favorite":false,"id":10360054,"images":[{"h":800,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/e66d645ca5c34558a4d6cd6cef14b978.png?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/e66d645ca5c34558a4d6cd6cef14b978.png","w":800}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Thermos 膳魔师保温杯500mL JNL-500 （粉色） ","product_id":10360054,"rank":999999,"review_count":5,"score":11,"sku_id":10360054,"url":"https://mcn.seashellmall.com/product/Thermos-%E8%86%B3%E9%AD%94%E5%B8%88%E4%BF%9D%E6%B8%A9%E6%9D%AF500mL-JNL-500-%EF%BC%88%E7%B2%89%E8%89%B2%EF%BC%89--p-10360054.html"},{"category_id":44,"current_sku":{"discount":27,"id":10360031,"list_price":{"CNY":769},"real_price":{"CNY":561},"stock":200},"fav_count":1,"favorite":false,"id":10360031,"images":[{"h":2208,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/5597c03a6166414d91c3bd41e8f85923.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/5597c03a6166414d91c3bd41e8f85923.jpg","w":1242}],"like_count":0,"location":"日本","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"Kose 高丝 Je Laime 超保湿款无硅洗发水/护发素  旅行包装                          (红色-甜美蔷薇果莓香气）","product_id":10360031,"rank":2,"review_count":0,"score":8,"sku_id":10360031,"url":"https://mcn.seashellmall.com/product/Kose-%E9%AB%98%E4%B8%9D-Je-Laime-%E8%B6%85%E4%BF%9D%E6%B9%BF%E6%AC%BE%E6%97%A0%E7%A1%85%E6%B4%97%E5%8F%91%E6%B0%B4-%E6%8A%A4%E5%8F%91%E7%B4%A0--%E6%97%85%E8%A1%8C%E5%8C%85%E8%A3%85--------------------------%28%E7%BA%A2%E8%89%B2-%E7%94%9C%E7%BE%8E%E8%94%B7%E8%96%87%E6%9E%9C%E8%8E%93%E9%A6%99%E6%B0%94%EF%BC%89-p-10360031.html"},{"category_id":21,"current_sku":{"discount":21,"id":10360342,"list_price":{"CNY":19900},"real_price":{"CNY":15900},"stock":100},"fav_count":0,"favorite":false,"id":10360299,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/fd4f18885b264b5eb4a97fe26790be46.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/fd4f18885b264b5eb4a97fe26790be46.jpg","w":430}],"like_count":0,"location":"重庆保税仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【保税仓】荷兰牛栏Nutrilon奶粉 4段 800g 铁罐装","product_id":10360299,"rank":1,"review_count":0,"score":8,"sku_id":10360342,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E4%BF%9D%E7%A8%8E%E4%BB%93%E3%80%91%E8%8D%B7%E5%85%B0%E7%89%9B%E6%A0%8FNutrilon%E5%A5%B6%E7%B2%89-4%E6%AE%B5-800g-%E9%93%81%E7%BD%90%E8%A3%85-p-10360299.html"},{"category_id":21,"current_sku":{"discount":22,"id":10360345,"list_price":{"CNY":19900},"real_price":{"CNY":15600},"stock":100},"fav_count":1,"favorite":false,"id":10360302,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/9d1ddcd2c48e4516bbb9c371171bdcf8.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/9d1ddcd2c48e4516bbb9c371171bdcf8.jpg","w":430}],"like_count":0,"location":"重庆保税仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【保税仓】荷兰Nutrilon牛栏奶粉3段 800g 珍珠宝盒装","product_id":10360302,"rank":1,"review_count":0,"score":8,"sku_id":10360345,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E4%BF%9D%E7%A8%8E%E4%BB%93%E3%80%91%E8%8D%B7%E5%85%B0Nutrilon%E7%89%9B%E6%A0%8F%E5%A5%B6%E7%B2%893%E6%AE%B5-800g-%E7%8F%8D%E7%8F%A0%E5%AE%9D%E7%9B%92%E8%A3%85-p-10360302.html"},{"category_id":21,"current_sku":{"discount":15,"id":10360350,"list_price":{"CNY":19900},"real_price":{"CNY":17000},"stock":100},"fav_count":1,"favorite":false,"id":10360307,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/682ba22707e44f3b9013c7ea25a6d8a0.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/682ba22707e44f3b9013c7ea25a6d8a0.jpg","w":430}],"like_count":0,"location":"重庆保税仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【保税仓】Nutrilon荷兰本土牛栏3段","product_id":10360307,"rank":1,"review_count":0,"score":8,"sku_id":10360350,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E4%BF%9D%E7%A8%8E%E4%BB%93%E3%80%91Nutrilon%E8%8D%B7%E5%85%B0%E6%9C%AC%E5%9C%9F%E7%89%9B%E6%A0%8F3%E6%AE%B5-p-10360307.html"},{"category_id":21,"current_sku":{"discount":27,"id":10360357,"list_price":{"CNY":19900},"real_price":{"CNY":14600},"stock":100},"fav_count":1,"favorite":false,"id":10360314,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/02c8ee95fc004750a5490c97a647ce80.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/02c8ee95fc004750a5490c97a647ce80.jpg","w":430}],"like_count":0,"location":"马尾仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【保税仓】福州马尾仓 Aptamil爱他美奶粉3段","product_id":10360314,"rank":1,"review_count":0,"score":8,"sku_id":10360357,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E4%BF%9D%E7%A8%8E%E4%BB%93%E3%80%91%E7%A6%8F%E5%B7%9E%E9%A9%AC%E5%B0%BE%E4%BB%93-Aptamil%E7%88%B1%E4%BB%96%E7%BE%8E%E5%A5%B6%E7%B2%893%E6%AE%B5-p-10360314.html"},{"category_id":21,"current_sku":{"discount":11,"id":10360364,"list_price":{"CNY":45000},"real_price":{"CNY":40200},"stock":100},"fav_count":1,"favorite":false,"id":10360321,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/6930b522ea6045f98692616186561fcb.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/6930b522ea6045f98692616186561fcb.jpg","w":430}],"like_count":0,"location":"正正仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【直邮】德国直邮 原装进口Aptamil德国爱他美奶粉2段(6-10个月) 2罐装 包邮","product_id":10360321,"rank":1,"review_count":0,"score":8,"sku_id":10360364,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E7%9B%B4%E9%82%AE%E3%80%91%E5%BE%B7%E5%9B%BD%E7%9B%B4%E9%82%AE-%E5%8E%9F%E8%A3%85%E8%BF%9B%E5%8F%A3Aptamil%E5%BE%B7%E5%9B%BD%E7%88%B1%E4%BB%96%E7%BE%8E%E5%A5%B6%E7%B2%892%E6%AE%B5%286-10%E4%B8%AA%E6%9C%88%29-2%E7%BD%90%E8%A3%85-%E5%8C%85%E9%82%AE-p-10360321.html"},{"category_id":21,"current_sku":{"discount":24,"id":10360369,"list_price":{"CNY":29900},"real_price":{"CNY":22800},"stock":100},"fav_count":0,"favorite":false,"id":10360326,"images":[{"h":430,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/d1920ce39f4e40378f503d19c960e2c0.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/d1920ce39f4e40378f503d19c960e2c0.jpg","w":430}],"like_count":0,"location":"广州保税仓","merchant":{"id":84843049,"name":"海呗自营","score":8},"merchant_id":84843049,"name":"【保税仓】新西兰Aptamil 可瑞康爱他美4段婴儿奶粉 2罐起发","product_id":10360326,"rank":1,"review_count":0,"score":8,"sku_id":10360369,"url":"https://mcn.seashellmall.com/product/%E3%80%90%E4%BF%9D%E7%A8%8E%E4%BB%93%E3%80%91%E6%96%B0%E8%A5%BF%E5%85%B0Aptamil-%E5%8F%AF%E7%91%9E%E5%BA%B7%E7%88%B1%E4%BB%96%E7%BE%8E4%E6%AE%B5%E5%A9%B4%E5%84%BF%E5%A5%B6%E7%B2%89-2%E7%BD%90%E8%B5%B7%E5%8F%91-p-10360326.html"}]}
     * success : true
     */

    private int code;
    private DataEntity data;
    private boolean success;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataEntity getData() {
        return data;
    }

    public void setData(DataEntity data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public static class DataEntity {
        /**
         * category_id : 12
         * current_sku : {"discount":29,"id":10360604,"list_price":{"CNY":38600},"real_price":{"CNY":27592},"stock":93}
         * fav_count : 3
         * favorite : false
         * id : 10360561
         * images : [{"h":320,"t_h":256,"t_w":256,"thumb":"http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg?iopcmd=thumbnail&type=8&width=256&height=256","url":"http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg","w":320}]
         * like_count : 0
         * location : 日本
         * merchant : {"id":84843049,"name":"海呗自营","score":8}
         * merchant_id : 84843049
         * name : pola 粉色 高保濕限定套裝
         * product_id : 10360561
         * rank : 0
         * review_count : 0
         * score : 8
         * sku_id : 10360604
         * url : https://mcn.seashellmall.com/product/pola-%E7%B2%89%E8%89%B2-%E9%AB%98%E4%BF%9D%E6%BF%95%E9%99%90%E5%AE%9A%E5%A5%97%E8%A3%9D-p-10360561.html
         */

        private List<ProductsEntity> products;

        public List<ProductsEntity> getProducts() {
            return products;
        }

        public void setProducts(List<ProductsEntity> products) {
            this.products = products;
        }

        public static class ProductsEntity {
            private int category_id;
            /**
             * discount : 29
             * id : 10360604
             * list_price : {"CNY":38600}
             * real_price : {"CNY":27592}
             * stock : 93
             */

            private CurrentSkuEntity current_sku;
            private int fav_count;
            private boolean favorite;
            private int id;
            private int like_count;
            private String location;

            private int numCart;

            public int getNumCart() {
                return numCart;
            }

            public void setNumCart(int numCart) {
                this.numCart = numCart;
            }

            /**
             * id : 84843049
             * name : 海呗自营
             * score : 8
             */

            private MerchantEntity merchant;
            private int merchant_id;
            private String name;
            private int product_id;
            private int rank;
            private int review_count;
            private int score;
            private int sku_id;
            private String url;
            /**
             * h : 320
             * t_h : 256
             * t_w : 256
             * thumb : http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg?iopcmd=thumbnail&type=8&width=256&height=256
             * url : http://ec-img.ufile.ucloud.cn/4c501223acec4b29aa38dd39e6cd0300.jpg
             * w : 320
             */

            private List<ImagesEntity> images;

            public int getCategory_id() {
                return category_id;
            }

            public void setCategory_id(int category_id) {
                this.category_id = category_id;
            }

            public CurrentSkuEntity getCurrent_sku() {
                return current_sku;
            }

            public void setCurrent_sku(CurrentSkuEntity current_sku) {
                this.current_sku = current_sku;
            }

            public int getFav_count() {
                return fav_count;
            }

            public void setFav_count(int fav_count) {
                this.fav_count = fav_count;
            }

            public boolean isFavorite() {
                return favorite;
            }

            public void setFavorite(boolean favorite) {
                this.favorite = favorite;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getLike_count() {
                return like_count;
            }

            public void setLike_count(int like_count) {
                this.like_count = like_count;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public MerchantEntity getMerchant() {
                return merchant;
            }

            public void setMerchant(MerchantEntity merchant) {
                this.merchant = merchant;
            }

            public int getMerchant_id() {
                return merchant_id;
            }

            public void setMerchant_id(int merchant_id) {
                this.merchant_id = merchant_id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getProduct_id() {
                return product_id;
            }

            public void setProduct_id(int product_id) {
                this.product_id = product_id;
            }

            public int getRank() {
                return rank;
            }

            public void setRank(int rank) {
                this.rank = rank;
            }

            public int getReview_count() {
                return review_count;
            }

            public void setReview_count(int review_count) {
                this.review_count = review_count;
            }

            public int getScore() {
                return score;
            }

            public void setScore(int score) {
                this.score = score;
            }

            public int getSku_id() {
                return sku_id;
            }

            public void setSku_id(int sku_id) {
                this.sku_id = sku_id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<ImagesEntity> getImages() {
                return images;
            }

            public void setImages(List<ImagesEntity> images) {
                this.images = images;
            }

            public static class CurrentSkuEntity {
                private int discount;
                private int id;
                /**
                 * CNY : 38600
                 */

                private ListPriceEntity list_price;
                /**
                 * CNY : 27592
                 */

                private RealPriceEntity real_price;
                private int stock;

                public int getDiscount() {
                    return discount;
                }

                public void setDiscount(int discount) {
                    this.discount = discount;
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public ListPriceEntity getList_price() {
                    return list_price;
                }

                public void setList_price(ListPriceEntity list_price) {
                    this.list_price = list_price;
                }

                public RealPriceEntity getReal_price() {
                    return real_price;
                }

                public void setReal_price(RealPriceEntity real_price) {
                    this.real_price = real_price;
                }

                public int getStock() {
                    return stock;
                }

                public void setStock(int stock) {
                    this.stock = stock;
                }

                public static class ListPriceEntity {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }

                public static class RealPriceEntity {
                    private int CNY;

                    public int getCNY() {
                        return CNY;
                    }

                    public void setCNY(int CNY) {
                        this.CNY = CNY;
                    }
                }
            }

            public static class MerchantEntity {
                private int id;
                private String name;
                private int score;

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

                public int getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }
            }

            public static class ImagesEntity {
                private int h;
                private int t_h;
                private int t_w;
                private String thumb;
                private String url;
                private int w;

                public int getH() {
                    return h;
                }

                public void setH(int h) {
                    this.h = h;
                }

                public int getT_h() {
                    return t_h;
                }

                public void setT_h(int t_h) {
                    this.t_h = t_h;
                }

                public int getT_w() {
                    return t_w;
                }

                public void setT_w(int t_w) {
                    this.t_w = t_w;
                }

                public String getThumb() {
                    return thumb;
                }

                public void setThumb(String thumb) {
                    this.thumb = thumb;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public int getW() {
                    return w;
                }

                public void setW(int w) {
                    this.w = w;
                }
            }
        }
    }
}
