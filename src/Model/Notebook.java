package Model;

import Enums.InformaticCategory;

public class Notebook extends InformaticProduct{

    private Integer storage;

    public Notebook() {
    }

    public Notebook(Integer stock, String name, Double price, InformaticCategory informaticCategory, String builderName, Integer storage) {
        super(stock, name, price, informaticCategory, builderName);
        this.storage = storage;
    }

    public Integer getStorage() {
        return storage;
    }

    public void setStorage(Integer storage) {
        this.storage = storage;
    }


    @Override
    public String toString() {
        return  super.toString() +
                "Informatic product category Notebook - " +
                "storage= " + storage;
    }
}
