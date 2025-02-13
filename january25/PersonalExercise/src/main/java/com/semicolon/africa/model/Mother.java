package main.java.com.semicolon.africa.model;

public class Mother {
    private  String type;
    private String behaviour;
    private int fingers;
    private String complextion;
    private String eye;
    private String academic;

    public Mother(String type,String behaviour, int fingers, String complextion, String eye, String academic){
        this.type = type;
        this.behaviour = behaviour;
       this.fingers = fingers;
       this.complextion = complextion;
       this.eye = eye;
       this.academic = academic;
    }

    @Override
    public String toString() {
        return "Family{" +
                "behaviour='" + behaviour + '\'' +
                ", fingers=" + fingers +
                ", complextion='" + complextion + '\'' +
                ", eye='" + eye + '\'' +
                ", academic='" + academic + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public void motherBehaviour(String behave){
       System.out.println("my "+type+" can "+behave+" sometimes but she loves "+behaviour);
    }
    public void howManyFingers(){
        System.out.println("She has "+fingers+" fingers");
    }
    public void setComplextion(){
        System.out.println("she is "+complextion+" and has "+eye+" eye");
    }
    public void intelligent(){
        System.out.println("my "+type+" is so "+academic+" when it comes to school");
    }
}
