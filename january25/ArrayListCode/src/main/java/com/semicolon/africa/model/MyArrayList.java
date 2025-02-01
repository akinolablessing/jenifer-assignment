package main.java.com.semicolon.africa.model;


public class MyArrayList {

 private int size ;
 private Object [] elements = new Object[10];

 public MyArrayList(){
     this.size = 0;
 }

 public Object[] getElements(int i){
     return elements;
 }

public boolean add(String name) {
    if(name == null || name.isEmpty()){
        return false;
    }
    if(size == elements.length){
        increaseCapacity();
    }
    elements[size] = name;
    size++;
    return true;

 }

    public boolean add(int name) {
        if(name == 0){
            return false;
        }
        if(size == elements.length){
            increaseCapacity();
        }
        elements[size] = name;
        size++;
        return true;

    }

public boolean isEmpty(){
 if(size == 0) {
     return true;
 }
 return false;
 }

public void increaseCapacity(){
    Object[] newArray = new Object[elements.length * 2];

    for(int count = 0; count < elements.length; count++) {
        newArray[count] = elements[count];
    }
    elements = newArray;
}

public int size(){
 return size;
}
public boolean removeMethod(Object value){
     if(value == null){
         return false;
     }

     if(elements.length > 0){
         for(int count =0; count < elements.length; count++){
             if(value == elements[count]) {
                 size--;
                 return true;
             }
         }
     }
        return false;
}

}
