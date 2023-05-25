package Main.Controller;

import Main.Model.Role;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class RoleController extends Role {
    static Role getrole = new Role();
    public static void printRole() throws SQLException, ClassNotFoundException {
        System.out.println("���� ������������� � �������");
        System.out.println("�  | ����");
        System.out.println("---------------------------------");

        getrole.getRole().forEach((Integer id,String name)->
        {
            System.out.println(id + ". | " + name);
        });


    }
    public static void setRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����");
        getrole.newRole(input.nextLine());
        printRole();

    }

    public static void updateNameRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        printRole();

        System.out.println("������� ����� ��� ����");
        String role = input.nextLine();

        System.out.println("�������� ����� ���� ������� ���� ��������");
        int number = input.nextInt();

        getrole.updateName(number, role);
        printRole();
    }

    public static void deleteRole() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        printRole();

        System.out.println("�������� ����� ���� ������� ���� �������");
        int number = input.nextInt();

        getrole.delete(number);
        printRole();
    }

}
