package com.company.srpdemo.factory;

import com.company.srpdemo.model.Db;
import com.company.srpdemo.model.IDbProduct;
import com.company.srpdemo.model.MongoDBProduct;
import com.company.srpdemo.model.MySQLProduct;

public class DbProductFactory {

    public static IDbProduct craete(Db type) {
        if (type == Db.MYSQL){
        return new MySQLProduct();
        }else {

        }
        return new MongoDBProduct();
    }
}
