package main.java.com.semicolon.africa.model;

public class MyBike {
    private boolean iHaveBike = true;
    private boolean isOn = false;
    private  boolean acceleration = true;
    private int  speed = 0;
    private int accelerateByGear1 = 20;
    private int accelerateByGear2 = 30;


    public boolean setIHaveBike() {
        if(this.iHaveBike){
            return this.iHaveBike;
        }
        return false;
    }


    public boolean getMyBikeIsON() {
        return isOn;
    }

    public boolean setMyBikeIsON() {
        if(!this.isOn){
          this.isOn = true;
          return this.isOn;
        }
        return false;
    }


    public boolean getMyBikeCanBeAccelerated() {
      return acceleration;
    }

    public int getIncreseGearOne() {
        return accelerateByGear1;

        }
        public void setMyBikeOnGear1() {
            this.accelerateByGear1 ++;
            if( this.accelerateByGear1 == 20){
                this.accelerateByGear1 +=speed;

        }
    }

    public int getDecreaseGearOne() {
        return accelerateByGear1;
    }

    public void setDecreaseGearOne() {
        this.accelerateByGear1 --;
        if(this.accelerateByGear1 == 20){


        }
    }

    public int getDecreaseGearTwo() {
        return accelerateByGear2;
    }

    public void setDecreaseGearTwo() {
        this.accelerateByGear2 -=2;
        if(this.accelerateByGear2 == 30){

        }
    }
}
