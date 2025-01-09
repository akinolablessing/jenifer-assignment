package main.java.com.semicolon.africa.model;

import java.util.ArrayList;

public class Journal {
   private int password;
   private boolean isLocked;
   private String name;

 ArrayList<Entry> arrayList = new ArrayList<Entry>();



   public String getName(){
     return name;
   }
   public boolean getLocked(){
       return isLocked;
   }
   public void setPassword(int password){
     this.password = password;
   }
   public void setIsLocked(boolean locked){
     this.isLocked = locked;
   }
   public void setName(String name){
       this.name = name;

   }
   public  boolean unlock(int confirmPassword){
      if(password == confirmPassword){
          setIsLocked(false);
         return true;

      }
      return false;
   }

   public void lock(){
      setIsLocked(true);

   }

}

