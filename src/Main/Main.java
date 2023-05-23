package Main;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

import Main.Controller.PinController;
import Main.Model.Pin;
import Main.View.PinView;
import Main.View.UserView;

import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
//        Pin pinModel = new Pin();
//        PinController pinController = new PinController(pinModel);
//        PinView userView = new PinView(pinController);
//        SwingUtilities.invokeLater(()->{
//
//            userView.init();
//        });
        System.out.println("ƒобро пожаловать в систему Ёлектронный журнал!!");
        String name;
        String login;
        String password;

        Scanner input = new Scanner(System.in);
        System.out.println("¬ведите им€ пользовател€: ");
        name = input.nextLine();
        System.out.println("¬ведите им€ пользовател€: ");
        login = input.nextLine();
        System.out.println("¬ведите им€ пользовател€: ");
        password = input.nextLine();

        DataBaseHandler newUser = new DataBaseHandler();
        newUser.signUpUser(name,login,password);

//        try {
//            String url  = "jdbc:mysql://31.31.196.54/u1895386_default";
//            String username = "u1895386_testoff";
//            String password = "!I212189";
//            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
//            try (Connection conn = DriverManager.getConnection(url, username, password)){
//
//                System.out.println("Connection to Store DB succesfull!");
//            }
//        }
//        catch(Exception ex){
//            System.out.println("Connection failed...");
//
//            System.out.println(ex);
//        }


    }
}
