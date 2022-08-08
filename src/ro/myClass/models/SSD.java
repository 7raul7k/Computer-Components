package ro.myClass.models;

public class SSD extends Product{
    private int capacity;
    private int size;
    private String interfaceSSD;

    public SSD(int id,String brand,String model,String type,int price,int capacity,int size,String interfaceSSD){
        super(id,brand,model,type,price);
        this.capacity = capacity;
        this.size = size ;
        this.interfaceSSD = interfaceSSD;
    }
    public SSD(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.capacity = Integer.parseInt(proprietes[5]);
        this.size = Integer.parseInt(proprietes[6]);
        this.interfaceSSD = proprietes[7];
    }
    public String showSSD(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\n Brand: " + super.getBrand();
        text += "\n Model: " + super.getModel();
        text += "\n Price: " + super.getPrice();
        text += "\n Capacity: " + capacity;
        text += "\n Size: " + size;
        text += "\nInterface: " + interfaceSSD;
        text += "\n====================================\n";
        return text;
    }


}
