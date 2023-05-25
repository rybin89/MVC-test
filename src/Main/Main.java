package Main;
import Main.Model.Role;

import java.sql.SQLException;
import java.util.Scanner;

import static Main.Controller.RoleController.*;


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
        deleteRole();
    }
}
