package main.java.com.semicolon.africa.model;
import java.io.*;

public class ApiPractice {
    public static void main(String[] args) {
        try{
        BufferedWriter bw = new BufferedWriter(

                new FileWriter("C:\\Users\\DELL\\Desktop\\text\\output.txt"));
                bw.write("Hello World");
                bw.newLine();
                bw.write("I Love Java");
                bw.newLine();
                bw.write("Java Programming ");
                bw.newLine();
                bw.close();

        }catch (Exception ex){
                    return;
        }
    }
}
