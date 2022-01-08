package com.company.srpdemo.model;

public class MySQLProduct implements IDbProduct {

    public String getProductById(String productID){
        return "Mysql:Exibindo dados do Produtos "+ productID;
    }
}
