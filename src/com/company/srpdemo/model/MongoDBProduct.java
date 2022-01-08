package com.company.srpdemo.model;

public class MongoDBProduct implements IDbProduct {

    public String getProductById(String productID){
        return "MongoDB:Exibindo dados do Produtos "+ productID;
    }
}
