package main.java.com.semicolon.africa.model;

public class DICar {
    private DIEngine engine;

    public DICar(DIEngine engine) {
        this.engine = engine;
    }
    public String start(){
       return engine.start();

    }
    public String stop(){
        return engine.stop();
    }
}
