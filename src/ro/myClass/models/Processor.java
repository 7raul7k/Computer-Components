package ro.myClass.models;

public class Processor extends Product {
    private String frequency;
    private String socket;
    private int cores;
    private int threads;

    private Processor(String type,int id,String brand,String model,int price,String frequency,String socket,int cores,int threads) {
        super(id,brand,model,type,price);
        this.frequency = frequency;
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
    }

    public Processor(String text) {
        super(text);
        String[] proprietes = text.split(",");
        this.frequency = proprietes[5];
        this.socket = proprietes[6];
        this.cores = Integer.parseInt(proprietes[7]);
        this.threads = Integer.parseInt(proprietes[8]);
    }
    public String descriptionCPU(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\nBrand: " + super.getBrand();
        text += "\nModel: " + super.getModel();
        text += "\nPrice: " + super.getPrice();
        text += "\nFrequency: " + frequency;
        text += "\nSocket: " + socket;
        text += "\nCores: " + cores;
        text += "\nThreads" + threads;
        text += "\n=================================================\n";
        return text;
    }
}

