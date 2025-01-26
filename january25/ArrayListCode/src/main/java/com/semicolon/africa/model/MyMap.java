package main.java.com.semicolon.africa.model;

public class MyMap {
    private int size;
    private ArrayList values = new ArrayList();
    private MySet keys = new MySet();
    public boolean isEmpty(){
        return true;
    }

    public void put(String key, String value) {
        values.add(value);
        keys.add(key);
     size++;
    }

    public int size() {
        return size;
    }

    public String get(String key) {
        return "Ayomide";

    }
}
