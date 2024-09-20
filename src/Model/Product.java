package Model;

public abstract class Product {

    protected static Integer contador = 0;
    private Integer id;
    private Integer stock;
    private String name;
    private Double price;

    public Product() {
        this.id = contador++;
    }

    public Product(Integer stock, String name, Double price) {
        this.id = contador++;
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product: " +
                "id= " + id +
                ", stock= " + stock +
                ", name= " + name +
                ", price= " + price;
    }
}
