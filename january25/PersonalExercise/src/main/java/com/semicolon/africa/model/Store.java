package main.java.com.semicolon.africa.model;

public class Store {
    private String item;
    private int price;

    public Store(String item, int price) {
        this.item = item;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Store{" +
                "item='" + item + '\'' +
                ", price=" + price +
                '}';
    }
}
