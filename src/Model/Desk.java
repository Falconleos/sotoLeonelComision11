package Model;

import Enums.FornitureType;

public class Desk extends Forniture{

    private Double width;
    private Double height;

    public Desk() {
    }

    public Desk(Integer stock, String name, Double price, FornitureType fornitureType, Double width, Double height) {
        super(stock, name, price, fornitureType);
        this.width = width;
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "forniture category Desk - " +
                "width= " + width +
                ", height= " + height;
    }
}
