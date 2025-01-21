package main.java.com.semicolon.africa.model;

public class AirConditioner {
    private boolean isOn = false;
    private int temperature = 30;

    public boolean getIsOn(){
        return isOn;
    }
    public boolean setIsOn(){
      if(!this.isOn){
          this.isOn = true;
          return this.isOn;
      }
      return false;
  }
  public int getIncreaseTemperature(){

        return temperature;
  }
  public void setIncreaseTemperature(){

          this.temperature ++;
          if(this.temperature == 30 ){
            this.temperature = 30;
          }

  }
public void setDecreaseTemperature(){
        this.temperature--;
        if(this.temperature <= 30){


        }
}
public int getDecreaseTemperature(){

        return this.temperature;
}

}
