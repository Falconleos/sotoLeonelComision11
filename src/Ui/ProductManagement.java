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
        Double priceChair = serviceProduct.offer(productList.get(0), "local",15);
        System.out.println("chair price discount " + priceChair);
        Double pricePrinter = serviceProduct.offer(productList.get(3), "local",15);
        System.out.println("Printer price discount " + pricePrinter);

        System.out.println("Precios actualizados");
        serviceProduct.upDate(productList,5,10,15,20);
        serviceProduct.showProduct(productList);
    }


}


