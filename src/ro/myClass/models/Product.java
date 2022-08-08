package ro.myClass.models;

public class Product {
    private int id;
    private String brand;
    private String model;
    private int price;

    private String type;

    public Product(int id,String brand,String model,String type,int price){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }
    public Product (String type,int price){
        this.type = type;
        this.price = price;
    }
    public Product(String text){
        String[] proprietes = text.split(",");
        this.type = proprietes[0];
        this.id = Integer.parseInt(proprietes[1]);
        this.brand = proprietes[2];
        this.model = proprietes[3];
        this.price = Integer.parseInt(proprietes[4]);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
