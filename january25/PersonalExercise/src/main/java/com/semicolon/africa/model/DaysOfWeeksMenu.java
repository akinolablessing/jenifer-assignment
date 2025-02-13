package main.java.com.semicolon.africa.model;

public class DaysOfWeeksMenu {

        public static void main(String[] args){
            DaysOfWeeks days =  DaysOfWeeks.MONDAY;
            if(days == DaysOfWeeks.MONDAY){
                System.out.println("yehh its monday");
            }
           for(DaysOfWeeks day: DaysOfWeeks.values()){
           System.out.println(day);
           }
        }
    }


