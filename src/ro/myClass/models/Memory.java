package ro.myClass.models;

public class Memory extends Product {
    private int frequency;
    private String matchedPair;
    private int capacity;

    public Memory(String type ,int id ,String brand,String model,int frequency,String matchedPair,int capacity,int price){
        super(id,brand,model,type,price);
        this.frequency = frequency;
        this.matchedPair = matchedPair;
        this.capacity = capacity;
    }
    public Memory (String text){
        super(text);
        String[] proprietes = text.split(",");
        this.frequency = Integer.parseInt(proprietes[5]);
        this.matchedPair = proprietes[6];
        this.capacity = Integer.parseInt(proprietes[7]);
    }
    public String descriptionMemory(){
        String text= "";
        text += "ID: " + super.getId();
        text += "\n Brand: " + super.getBrand();
        text += "\n Model: " + super.getPrice();
        text += "\n Frequency: " + frequency;
        text += "\n MatchedPair: " + matchedPair;
        text += "\n Capacity: " + capacity;
        text += "\n========================================================\n";
        return text;
    }
}
