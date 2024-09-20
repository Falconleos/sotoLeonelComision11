package Service;

import Enums.FornitureType;
import Enums.InformaticCategory;
import Interfaces.ServiceProduct;
import Model.*;

import java.util.List;

public class ServiceProductImpl implements ServiceProduct {

    @Override
    public void addProduct(List<Product>productList){

        productList.add(new Chair(3, "barcelona", 2000.0, FornitureType.CHAIR, false));
        productList.add(new Desk(15, "Developer desk", 1000.0, FornitureType.DESKTABLE,52.0, 28.0));
        productList.add(new Notebook(7,"14PA", 700.0, InformaticCategory.NOTEBOOK_PRODUCT, "Asus", 500));
        productList.add(new Printer(15, "EP-200", 200.0, InformaticCategory.PRINTER_PRODUCT, "Epson", 45));

    }

    @Override
    public void showProduct(List<Product>productList){
        for(Product product1 : productList){

            System.out.println(product1.toString());

        }
    }

    @Override
    public Double offer(Product product,String client,Integer disc){
        double sellPrice= 0;

        if((product instanceof Chair) && (client.equalsIgnoreCase("local"))){

            sellPrice = product.getPrice() + (product.getPrice()*(disc/100));

        }else if((product instanceof Printer) && (client.equalsIgnoreCase("local"))){

            sellPrice = product.getPrice() + (product.getPrice()*(disc/100));

        }

       return sellPrice;
    }

    public void upDate(List<Product>productList,Integer chair,Integer desk,Integer printer,Integer notebooks){

        for(Product product : productList){

            if(product instanceof Chair){
                product.setPrice(product.getPrice()+product.getPrice()*(chair/100));
            }else if(product instanceof Desk){
                product.setPrice(product.getPrice()+product.getPrice()*(desk/100));
            }else if(product instanceof Notebook){
                product.setPrice(product.getPrice()+product.getPrice()*(notebooks/100));
            }else if(product instanceof Printer){
                product.setPrice(product.getPrice()+product.getPrice()*(printer/100));
            }


        }


    }




}
