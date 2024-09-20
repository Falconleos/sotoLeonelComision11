package Interfaces;

import Model.Product;

import java.util.List;

public interface ServiceProduct {

    void addProduct(List<Product>productList);
    void showProduct(List<Product>productList);
    Double offer(Product product,String client,Integer disc);

}
