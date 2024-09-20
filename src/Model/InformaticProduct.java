package Model;

import Enums.InformaticCategory;

public abstract class InformaticProduct extends Product {

    private InformaticProduct informaticProduct;
    private String BuilderName;

    public InformaticProduct() {
    }

    public InformaticProduct(Integer stock, String name, Double price, InformaticCategory informaticCategory, String builderName) {
        super(stock, name, price);
        this.informaticProduct = informaticProduct;
        BuilderName = builderName;
    }

    public InformaticProduct getInformaticProduct() {
        return informaticProduct;
    }

    public void setInformaticProduct(InformaticProduct informaticProduct) {
        this.informaticProduct = informaticProduct;
    }

    public String getBuilderName() {
        return BuilderName;
    }

    public void setBuilderName(String builderName) {
        BuilderName = builderName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "category Informatic Product - " +
                "informatic Product= " + informaticProduct +
                ", BuilderName= " + BuilderName;
    }
}
