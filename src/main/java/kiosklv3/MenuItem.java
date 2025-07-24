package kiosklv3;

public class MenuItem {
    String name;
    double price;
    String description;

    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String toString()  {
        return name + " | ₩ " + price + " | " + description;
    }
}
