package main.java.com.semicolon.africa.model;

public class MyBike {
    private boolean iHaveBike = true;
    private boolean isOn = false;
    private  boolean acceleration = true;
    private int  speed = 0;
    private int gear = 1;



    public boolean setIHaveBike(){
        if(this.iHaveBike){
            return this.iHaveBike;
        }
        return false;
    }


    public boolean getMyBikeIsON(){
        return isOn;
    }

    public boolean setMyBikeIsON(){
        if(!this.isOn){
          this.isOn = true;
          return this.isOn;
        }
        return false;
    }


    public boolean getMyBikeCanBeAccelerated() {
      return acceleration;
    }


    public void setSpeed() {
        this.speed++;
    }

    public void setGear() {
        if(speed >= 1 || speed <= 4){
          gear++;
        }

        else if(speed >= 5 || speed <= 8){
            gear++;
        }
    }

    public int getGear() {
      return gear;
    }
 public void setIncreaseAcceleration(){
     if(gear == 2){
        speed+=2;
     }
 }
}
