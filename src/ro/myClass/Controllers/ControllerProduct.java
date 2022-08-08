package ro.myClass.Controllers;

import ro.myClass.models.*;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class ControllerProduct {
    ArrayList<Product> products;
    public ControllerProduct(){
        this.products = new ArrayList<>();
        this.load();
    }
    public void load() {
        try {
            File file = new File("C:\\mycode\\JavaBasics\\Mostenirea\\Computer\\src\\ro\\myClass\\resources\\product.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String text = scanner.nextLine();
                switch (text.split(",")[0]){
                    case "GPU":
                        this.products.add(new GPU(text));
                        break;
                    case "Memory":
                        this.products.add(new Memory(text));
                        break;
                    case "Processor":
                        this.products.add(new Processor(text));
                        break;
                    case "SSD":
                        this.products.add(new SSD(text));
                        break;
                }
            }
        }catch (Exception e){
            e.printStackTrace();

        }
    }
    public void showDescription(){
        for(Product m : products){
            if(m instanceof GPU){
                GPU x = (GPU) m;
                System.out.println(x.descriptionGPU());

            }else if(m instanceof Memory){
                Memory x = (Memory) m;
                System.out.println(x.descriptionMemory());
            }else
                if(m instanceof  Processor){
                Processor x= (Processor) m;
                System.out.println(x.descriptionCPU());
            }else
                if(m instanceof SSD){
                SSD x = (SSD) m;
                System.out.println(x.showSSD());
            }
        }
    }
    public int findbyID(int id ){
        for(int i = 0;i<= products.size();i++){
            if(products.get(i).getId() == id){
                return i;
            }

        }
        return -1;
    }
    public void add(Product m){
        int pos = findbyID(m.getId());
        if(pos == -1){
            this.products.add(m);
            System.out.println("Product was added");
        }
    }
    public void remove(int id){
        int pos = findbyID(id);
        if(pos == -1){
            this.products.remove(pos);

        }
    }

}
