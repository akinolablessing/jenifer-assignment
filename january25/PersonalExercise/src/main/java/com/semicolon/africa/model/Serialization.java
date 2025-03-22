package main.java.com.semicolon.africa.model;

import java.io.*;
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        User user = null;
        FileInputStream fileIn = new FileInputStream("C:\\Users\\DELL\\Desktop\\text\\Open.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        user = (User) in.readObject();
        in.close();
        fileIn.close();
//    System.out.println(user.name);
//    System.out.println(user.password);
//    user.sayHello();
    }
}
