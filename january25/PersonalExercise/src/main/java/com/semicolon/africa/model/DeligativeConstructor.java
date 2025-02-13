package main.java.com.semicolon.africa.model;

public class DeligativeConstructor {
    private int hour;
    private int seconds;
    private int minute;

    public DeligativeConstructor(int hour,int seconds,int minute){
        this.hour = hour;
        this.seconds = seconds;
        this.minute = minute;
    }
    public DeligativeConstructor(){

    }
    public int getHour() {
        return hour;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinute() {
        return minute;
    }
}
