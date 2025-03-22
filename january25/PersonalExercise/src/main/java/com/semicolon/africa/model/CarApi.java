package main.java.com.semicolon.africa.model;

public class CarApi {
    private String model;
    private String color;
    private String make;
    private int year;

    public CarApi withModel(String model){
        this.model = model;
        return this;
    }
    public CarApi colorMethod(String color){
        this.color = color;
        return this;
    }
    public CarApi makeMethod(String make){
        this.make = make;
        return this;
    }
    public CarApi yearMethod(int year){
        this.year = year;
        return this;
    }

    @Override
    public String toString() {
        return "CarApi{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", make='" + make + '\'' +
                ", year=" + year +
                '}';
    }
    CarApi carApi = new CarApi();

}


