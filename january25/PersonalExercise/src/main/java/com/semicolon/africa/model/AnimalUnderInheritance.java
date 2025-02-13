package main.java.com.semicolon.africa.model;

public class AnimalUnderInheritance {
  private String type;
  private String size;
  private double weight;

  public AnimalUnderInheritance(){

  }
    public AnimalUnderInheritance(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
    public  void move(String speed){
       System.out.println(type+ " moves " + speed);
    }
    public void makeNoise(){
        System.out.println(type + " makes some kind of noise");
    }
}
    