package Main;
import Main.Model.Role;

import java.sql.SQLException;
import java.util.Scanner;

import static Main.Controller.RoleController.*;
import static Main.Controller.UserController.*;
import static Main.Test.ArrayListTest.userList;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("����� ���������� � ������� ����������� ������!!");
        String name;
        String login;
        String password;

//����� ������ ������� Role
//          printRole();

        //�������� ������ ������� Role
//        setRole();
//������� ������ ������� Role
//        updateNameRole();
//������� ������ ������� Role
//        deleteRole();

//        printAllUser();
//        System.out.println(userList()[0].getId() + userList()[0].getName() );
//        for (int i =0; i< userList().length; i++ ){
//            System.out.println(userList()[i].getId() + userList()[i].getName() );
//        }

//        addUser();

//        updateNameUser();
        deleteUser();
    }


}
