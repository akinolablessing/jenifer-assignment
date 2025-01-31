package main.java.com.semicolon.africa.model;

public class PersonMainMenu {
    public static void main(String[] args) {
        Person one = new Person("Ayomide","Blessing",12);
        Person two = new Person("Onyinye","Gloria",54);

        System.out.println(one.getFirstName() + " " + one.getLastName()+" "+one.getAge());
        System.out.println(two.getFirstName() + " " + two.getLastName()+" "+two.getAge());

        one.setFirstName("Princess is my first name");
        two.setFirstName("Gorgeous is my first name");
        one.setLastName("I will make it");
        two.setLastName("And make mama proud");
        one.setAge(19);
        two.setAge(20);
        System.out.println("The updated one.");
        System.out.println(one.getFirstName() + " " + one.getLastName()+" "+one.getAge());
        System.out.println(two.getFirstName() + " " + two.getLastName()+" "+two.getAge());

    }
}
