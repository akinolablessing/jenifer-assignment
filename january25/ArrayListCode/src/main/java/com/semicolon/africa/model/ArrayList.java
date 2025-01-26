package main.java.com.semicolon.africa.model;


public class ArrayList {
 private Object [] elements;
 private int size ;

 public ArrayList(int capacity){

     elements = new String[capacity];
     size = 0;
 }
 public ArrayList(){

 }
 public Object[] getElements(){
     return elements;
 }

 public void setElement(String[] elements){
     this.elements = elements;

 }
 public int getSize(){

     return size;
 }
 public void setSize(int size){
    this.size = size;
 }
 public boolean isEmpty(){
     size = 0;

     return true;
 }
 public boolean add(String name) {
   for(int count =0; count <= name.length(); count++){

   }
 }
}
