package main.java.com.semicolon.africa.model;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
   public List<User> getUsers(){
       List<User> users = new ArrayList<>();
       users.add(new User("John Doe", "johndoe@example.com"));
       users.add(new User("Jane Doe", "janedoe@example.com"));
       return users;

   }
}
//Here's a simple example of a layered architecture in Java, consisting of:
//
//        1. Presentation Layer (PL): Handles user input and displays output.
//        2. Business Logic Layer (BLL): Performs calculations and enforces business rules.
//        3. Data Access Layer (DAL): Interacts with the database.
//
//Example Code:
//Data Access Layer (DAL)
//
//// UserDAO.java (Data Access Object)
//public class UserDAO {
//    public List<User> getUsers() {
//        // Simulate database interaction
//        List<User> users = new ArrayList<>();
//        users.add(new User("John Doe", "johndoe@example.com"));
//        users.add(new User("Jane Doe", "janedoe@example.com"));
//        return users;
//    }
//}
//
//
//Business Logic Layer (BLL)
//
//// UserService.java
//public class UserService {
//    private UserDAO userDAO;
//
//    public UserService(UserDAO userDAO) {
//        this.userDAO = userDAO;
//    }
//
//    public List<User> getUsers() {
//        return userDAO.getUsers();
//    }
//
//    public User getUserByEmail(String email) {
//        // Simulate business logic
//        List<User> users = getUsers();
//        for (User user : users) {
//            if (user.getEmail().equals(email)) {
//                return user;
//            }
//        }
//        return null;
//    }
//}
//
//
//Presentation Layer (PL)
//
//// UserController.java
//public class UserController {
//    private UserService userService;
//
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//
//    public void displayUsers() {
//        List<User> users = userService.getUsers();
//        for (User user : users) {
//            System.out.println(user.getName() + " - " + user.getEmail());
//        }
//    }
//
//    public void displayUserByEmail(String email) {
//        User user = userService.getUserByEmail(email);
//        if (user != null) {
//            System.out.println(user.getName() + " - " + user.getEmail());
//        } else {
//            System.out.println("User not found");
//        }
//    }
//}
//
//
//Main Class
//
//// Main.java
//public class Main {
//    public static void main(String[] args) {
//        UserDAO userDAO = new UserDAO();
//        UserService userService = new UserService(userDAO);
//        UserController userController = new UserController(userService);
//
//        userController.displayUsers();
//        userController.displayUserByEmail("johndoe@example.com");
//    }
//}
//
//
//This example demonstrates a simple layered architecture with:
//
//        1. Data Access Layer (DAL): UserDAO interacts with the database.
//2. Business Logic Layer (BLL): UserService performs calculations and enforces business rules.
//3. Presentation Layer (PL): UserController handles user input and displays output.
//
//Note that this is a simplified example and real-world applications would require more complexity and nuance.