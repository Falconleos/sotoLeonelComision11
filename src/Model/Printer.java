package Model;

import Enums.InformaticCategory;

public class Printer extends InformaticProduct{

    private Integer printsPerMinute;

    public Printer() {
    }

    public Printer(Integer stock, String name, Double price, InformaticCategory informaticCategory, String builderName, Integer printsPerMinute) {
        super(stock, name, price, informaticCategory, builderName);
        this.printsPerMinute = printsPerMinute;
    }

    public Integer getPrintsPerMinute() {
        return printsPerMinute;
    }

    public void setPrintsPerMinute(Integer printsPerMinute) {
        this.printsPerMinute = printsPerMinute;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Informatic product category Printer - " +
                "printsPerMinute= " + printsPerMinute;
    }
}
