package com.company.srpdemo.payment;

import com.company.srpdemo.factory.DbProductFactory;
import com.company.srpdemo.model.Db;
import com.company.srpdemo.model.IDbProduct;
import com.company.srpdemo.model.MySQLProduct;

public class Payment {

    public void pay(String productID) {
       // MySQLProduct dbProduct = new MySQLProduct();
        IDbProduct dbProduct = DbProductFactory.craete(Db.MONGODB); // factory sendo chamada
        String product = dbProduct.getProductById(productID);
        System.out.println(product);
    }
}
