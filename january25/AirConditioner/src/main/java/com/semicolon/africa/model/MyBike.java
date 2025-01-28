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


    public boolean getMyBikeIsOff(){
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

    public int getSpeed(){
        return speed;
    }

    public void acceleration() {
        this.speed++;
    }

    public void decelerate(){
        this.speed--;
    }

    public void setGear() {
        if(this.speed >= 0 & this.speed <= 20){
          this.gear = 1;
        }

        if(speed >= 21 & speed <= 30){
            this.gear = 2;
        }

        if(speed >= 31 & speed <= 40){
            this.gear = 3;
        }
    }

    public int getGear() {
      return gear;
    }
 public int setIncreaseAcceleration(){
     if(gear == 2){
        speed+=2;
     }
     return speed+=2;
 }
}
