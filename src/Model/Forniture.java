package Model;

import Enums.FornitureType;

public abstract class Forniture extends Product{

    private FornitureType fornitureType;

    public Forniture() {
    }

    public Forniture(Integer stock, String name, Double price, FornitureType fornitureType) {
        super(stock, name, price);
        this.fornitureType = fornitureType;
    }

    public FornitureType getFornitureType() {
        return fornitureType;
    }

    public void setFornitureType(FornitureType fornitureType) {
        this.fornitureType = fornitureType;
    }

    @Override
    public String toString() {
        return super.toString() +
                "category forniture - " +
                " Forniture Type= " + fornitureType;
    }

}
