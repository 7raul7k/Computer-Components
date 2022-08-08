package ro.myClass.models;

public class Processor extends Product {
    private double frequency;
    private String socket;
    private int cores;
    private int threads;

    private Processor(String type,int id,String brand,String model,int price,double frequency,String socket,int cores,int threads) {
        super(id,brand,model,type,price);
        this.frequency = frequency;
        this.socket = socket;
        this.cores = cores;
        this.threads = threads;
    }

    public Processor(String text) {
        super(text);
        String[] proprietes = text.split(",");
        this.frequency = Double.parseDouble(proprietes[5]);
        this.socket = proprietes[6];


    }
    public String descriptionCPU(){
        String text = "";
        text += "ID: " + super.getId();
        text += "\nBrand: " + super.getBrand();
        text += "\nModel: " + super.getModel();
        text += "\nPrice: " + super.getPrice();
        text += "\nFrequency: " + getFrequency();
        text += "\nSocket: " + getSocket();
        text += "\nCores: " + getCores();
        text += "\nThreads" + getThreads();
        text += "\n=================================================\n";
        return text;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getSocket() {
        return socket;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }
}

