package main.java.com.semicolon.africa.model;

import java.util.Scanner;

public class ShopMain {
    static Scanner scanner = new Scanner(System.in);
    static Shop shop = new Shop();
    public static void main(String[] args){

    while (true) {
        System.out.println("""
                WELCOME TO AYO'S STORE
                1.Add items
                2.View All Items
                3.Search for Items
                4.Exist
                """);
        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                addItemsMethod();
                break;
            case 2:
                view_all_items();
                break;
            case 3:
                search_for_items();
        }
    }
    }

    private static void addItemsMethod() {
        System.out.println("Enter items you want to buy: ");
        String items = scanner.next();

        System.out.println("Enter the price:");
        int price = scanner.nextInt();
        Store store = new Store(items,price);
        shop.addItems(store);
        System.out.println("Added Successfully!!");
    }
    public static void view_all_items(){
        System.out.println("""
                List of all Items
                """);
        for(Store store:shop.viewAllItems()){
            System.out.println(store);
        }
    }
    public static void search_for_items(){
        System.out.println("Enter items name:");
        String itemNames = scanner.next();
        Store store5 = shop.findItemByName(itemNames);
        if(store5 != null){
            System.out.println("Found items:"+store5);
        }
        else {
            System.out.println("Item not found");
        }
    }
}
