package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Store> items;

    public Shop() {
        this.items = new ArrayList<>();
    }
    public void addItems(Store item){
        items.add(item);
    }
    public List<Store> viewAllItems(){
        return items;
    }
    public Store findItemByName(String itemName){
        for(Store userStore : items){
            if(userStore.getItem().equalsIgnoreCase(itemName)){
                return userStore;
            }
        }
        return null;
    }
}
