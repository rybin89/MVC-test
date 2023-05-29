package Main.Test;

import Main.Model.User;

import java.util.ArrayList;

public class ArrayListTest extends User {

    public static  User[]   userList(){
        User[] userList = new User[3];
        userList[0] = new User(1,1,"wewqer","werwer","werwer");
        userList[1] = new User(2,2,"ddddd","werdddddwer","werwer");
        userList[2] = new User(3,3,"dddsdfsdfsdfdd","wersdfsfdsdddddwer","sdfs");
//    System.out.println(userList[0].getId() + userList[0].getName() );

        return userList;
    }

}
