package Model;

import Enums.FornitureType;

public class Chair extends Forniture{

    private Boolean hasWheels;

    public Chair() {
    }

    public Chair(Integer stock, String name, Double price, FornitureType fornitureType, Boolean hasWheels) {
        super(stock, name, price, fornitureType);
        this.hasWheels = hasWheels;
    }

    public Boolean getHasWheels() {
        return hasWheels;
    }

    public void setHasWheels(Boolean hasWheels) {
        this.hasWheels = hasWheels;
    }

    @Override
    public String toString() {
        return super.toString() +
                "forniture category Chair - " +
                "hasWheels= " + hasWheels;
    }
}
