package ro.myClass.models;

public class GPU extends Product {
    private int frequency;
    private int memorySize;
    private String memoryType;
    private int boostClock;

    public GPU(int id,String brand,String model,String type,int price,int frequency,int memorySize,String memoryType,int boostClock){
        super(id,brand,model,type,price);
        this.frequency = frequency;
        this.memorySize = memorySize;
        this.memoryType = memoryType;
        this.boostClock = boostClock;
    }
    public GPU(String text){
        super(text);
        String[] proprietes = text.split(",");
        this.frequency = Integer.parseInt(proprietes[5]);
        this.memorySize= Integer.parseInt(proprietes[6]);
        this.memoryType = proprietes[7];
        this.boostClock = Integer.parseInt(proprietes[8]);
    }
    public String descriptionGPU(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\n Brand: " + super.getBrand();
        text += "\n Model: " + super.getModel();
        text += "\n Price: " + super.getPrice();
        text += "\n Frequency: " + frequency;
        text += "\n Memory Size: " + memorySize;
        text += "\n Memory Type: " + memoryType;
        text += "\n Boost Clock: " + boostClock;
        text += "\n=========================================\n";
        return text;
    }
}
