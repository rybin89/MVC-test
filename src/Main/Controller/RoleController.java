package Main.Controller;

import Main.Model.Role;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class RoleController extends Role {
    static Role getrole = new Role();
    public static void printRole() throws SQLException, ClassNotFoundException {
        System.out.println("Роли пользователей в системе");
        System.out.println("№  | Роль");
        System.out.println("---------------------------------");

        getrole.getRole().forEach((Integer id,String name)->
        {
            System.out.println(id + ". | " + name);
        });


    }
    public static void setRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите РОЛЬ");
        getrole.newRole(input.nextLine());
        printRole();

    }

    public static void updateNameRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        printRole();

        System.out.println("Введите новое имя РОЛИ");
        String role = input.nextLine();

        System.out.println("Выбирите номер РОЛИ которую надо изменить");
        int number = input.nextInt();

        getrole.updateName(number, role);
        printRole();
    }

    public static void deleteRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        printRole();

        System.out.println("Выбирите номер РОЛИ которую надо удалить");
        int number = input.nextInt();

        getrole.delete(number);
        printRole();
    }

}
