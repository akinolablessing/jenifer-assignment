package main.java.com.semicolon.africa.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exceptional {
    public boolean checkForTitle(String password){
        Pattern pattern = Pattern.compile("[A-Za-z]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }
    public boolean checkForYear(int year){
        String intString = Integer.toString(year);
        Pattern pattern = Pattern.compile("[0-9]");
        Matcher matcher = pattern.matcher(intString);
        return matcher.matches();
    }
    public boolean checkForRate(int rate){
        String intString = Integer.toString(rate);
        Pattern pattern = Pattern.compile("^\\d{100}$");
        Matcher matcher = pattern.matcher(intString);
        return matcher.matches();
    }
}
