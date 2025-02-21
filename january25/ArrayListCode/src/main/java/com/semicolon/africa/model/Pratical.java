package main.java.com.semicolon.africa.model;

public class Pratical {
    private static boolean[] segments;


    public Pratical(){
        this.segments = new boolean[7];
    }
    public static void setDigits(int digits){
        switch (digits){
            case 1:
                setSegments(true,false,true,false,true,true,false);
                break;
            case 2:
                setSegments(false,true,true,false,false,true,false);
                break;
            case 3:
                setSegments(true,true,true,false,false,true,true);
                break;
            case 4:
                setSegments(false,false,false,true,true,false,true);
                break;
            default:
                setSegments(false,false,false,false,false,false,false);
                break;
        }
    }
    public static void setSegments(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g){
        segments[0] = a;
        segments[1] = b;
        segments[2] = c;
        segments[3] = d;
        segments[4] = e;
        segments[5] = f;
        segments[6] = g;
    }
    public void display(){
        System.out.println(" "+(segments[0]?" _ " : " "));
        System.out.println("|"+(segments[1]? " _ ": " ")+"|");
        System.out.println("|" +(segments[2]? "_" : " " +"|"));
        System.out.println(" "+(segments[3]? "_" : ""));
//        System.out.println("|"+(segments[4]? " _ ": " ")+"|");
//        System.out.println("|" +(segments[5]? "_" : " " +"|"));
//        System.out.println(" "+(segments[6]? "_" : ""));
    }
    public static void main(String[] args){
        Pratical pratical = new Pratical();
        pratical.setDigits(4);
        pratical.display();
    }
}
