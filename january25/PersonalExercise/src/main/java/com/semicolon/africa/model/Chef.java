package main.java.com.semicolon.africa.model;

public class Chef {
    private Food burger;
    private Food pizza;

    public Chef(){
        burger = new Burger();
        pizza = new Pizza();
    }
    public void prepareBurger(){
    burger.cook();
    burger.sell();
    }
    public void preparePizza(){
       pizza.cook();
       pizza.sell();
    }
}
