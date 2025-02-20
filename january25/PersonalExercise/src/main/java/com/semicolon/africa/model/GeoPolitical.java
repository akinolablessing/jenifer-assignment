package main.java.com.semicolon.africa.model;

public enum GeoPolitical {
    NORTH_CENTRAL("Benue","FCT","Kogi","Kwara","Nasarawa","Niger","Plateau"),
    NORTH_EAST("Adamawa","Bauchi","Borno","Gombe","Taraba","Yobe"),
    NORTH_WEST("Kaduna","Katsina","Kano","Kebbi","Sokoto","Jigawa","Zamfara"),
    SOUTH_EAST("Abia","Anambra","Ebonyi","Enugu","Imo"),
    SOUTH_SOUTH("Akwa-Ibom","Bayelsa","Cross-River","Delta","Edo","Rivers"),
    SOUTH_WEST("Ekiti","Lagos","Osun","Ondo","Ogun","Oyo");

    String[] state;

    GeoPolitical(String... state){
       this.state = state;

    }
}
