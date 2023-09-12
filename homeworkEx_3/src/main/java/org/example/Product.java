package org.example;

public class Product {
    private String name;
    private int availableQuantity;
    private double price;

    public Product(String name, int availableQuantity, double price) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) throws NotEnoughQuantityException {
        if(availableQuantity < 0){
            throw new NotEnoughQuantityException("Недостаточно товара!");
        }
        this.availableQuantity = availableQuantity;
    }

    public double getPrice() {
        return price;
    }
}
