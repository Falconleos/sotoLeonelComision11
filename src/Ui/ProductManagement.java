package Ui;

import Model.Product;
import Service.ServiceProductImpl;

import java.util.ArrayList;
import java.util.List;

public class ProductManagement {

    ServiceProductImpl serviceProduct = new ServiceProductImpl();
    List<Product> productList = new  ArrayList<>();
    public void startMenu(){

        serviceProduct.addProduct(productList);
        serviceProduct.showProduct(productList);
        serviceProduct.offer(productList[1]);

    }

}
