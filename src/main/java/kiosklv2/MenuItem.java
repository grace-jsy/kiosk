package kiosklv2;

public class MenuItem {

    String name;
    double price;
    String description;


    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return name + " | ₩ " + price + " | " + description;
    }
}

