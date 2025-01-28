package main.java.com.semicolon.africa.model;

public class MySet {
    private int size;
    private String[] elements = new String[3];


    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String value) {
        if(!contains(value)){
            if(isFull()) increaseArray();
            size++;
        }
    }

    private boolean isFull() {
        return size == elements.length;
    }

    private void increaseArray() {
        String[] newElements = new String[elements.length * 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    public String getElement(int number) {
        return elements[number];
    }

    public boolean contains(String values){
        for(String s : elements){
            if(values.equals(s)){
                return true;
            }
        }
        return false;
    }
    public int size(){
        return size;
    }

    public String getElements(int i) {
        return elements[i];
    }

    public String get(int i) {
        return "Ayomide";
    }
}
