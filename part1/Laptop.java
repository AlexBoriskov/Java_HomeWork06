package part1;

public class Laptop {
    String ID;
    String brand;
    Integer price;
    String model;
    Integer RAM;
    Integer storage;

    public Laptop(String ID, String brand, String model, Integer RAM, Integer storage, Integer price){
        this.ID = ID;
        this.brand = brand;
        this.model = model;
        this.RAM = RAM;
        this.storage = storage;
        this.price = price;
    }

    public String toPrint(){
        return "ID: " + ID +
        " Бренд: " + brand +
        " Модель: " + model +
        " RAM: " + RAM +
        " Память: " + storage +
        " Цена: " + price;
    }

    public String toID(){
        return ID;
    }

    public String toBrand(){
        return brand;
    }

    public Integer toRAM(){
        return RAM;
    }

    public Integer toStorage(){
        return storage;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else return false;
}
}
