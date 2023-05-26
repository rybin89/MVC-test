package Main;
import Main.Model.Role;

import java.sql.SQLException;
import java.util.Scanner;

import static Main.Controller.RoleController.*;
import static Main.Controller.UserController.printAllUser;
import static Main.Test.ArrayListTest.userList;


public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("Добро пожаловать в систему Электронный журнал!!");
        String name;
        String login;
        String password;

//вывод данных таблицы Role
//          printRole();

        //добавить данные таблицу Role
//        setRole();
//обновит данные таблицы Role
//        updateNameRole();
//удалить данные таблицы Role
//        deleteRole();

//        printAllUser();
        System.out.println(userList()[0].getId() + userList()[0].getName() );
    }

}
