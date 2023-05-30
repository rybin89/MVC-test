package Main.Controller;

import Main.Model.User;

import java.sql.SQLException;
import java.util.Scanner;

public class UserController extends User {
    static private User user = new User();


    public UserController(Integer id, Integer roleId, String name, String login, String password) {
        super(id, roleId, name, login, password);
    }

    public static void printAllUser() throws SQLException, ClassNotFoundException {
        System.out.println("������ ������������� � �������");
        System.out.println("�  | ���� | ���  | �����  | ������  |");
        System.out.println("---------------------------------");
        for (User user : getUser()) {
            System.out.print(user.getId() + "  |  " + user.getRoleId() + " | " + user.getName() +
                    " | " + user.getLogin() + " | " + user.getPassword());
            System.out.println();
        }
    }

    private static void printOne(Integer id) throws SQLException, ClassNotFoundException {
        System.out.println("�  | ���� | ���  | �����  | ");
        System.out.println(user.getOneUser(id).getId() + "| " + user.getOneUser(id).getRoleId() +
                " | " + user.getOneUser(id).getName() + "  | " + user.getOneUser(id).getLogin());
    }

    //����� ���������� �������
    public static void addUser() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� ������������");
        String login = input.nextLine();

        System.out.println("������� ��� ������������");
        String name = input.nextLine();

        System.out.println("������� ������ ������������");
        String password = input.nextLine();

        System.out.println("������� ����� ID ���� ��� ������������");
        int roleId = input.nextInt();
        user.createUser(login, name, password, roleId);
        printAllUser();
    }

    //����� ���������� �������
    public static void updateNameUser() throws SQLException, ClassNotFoundException {
        printAllUser();
        Scanner input = new Scanner(System.in);
        System.out.println("������� ����� ��� ������������");
        String name = input.nextLine();
        System.out.println("������� ����� ID  ������������");
        int id = input.nextInt();
        user.updateLogin(name, id);
        printOne(id);

    }
    //����� �������� ������
    public static void deleteUser() throws SQLException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        printAllUser();

        System.out.println("������� ����� ID  ������������");
        int id = input.nextInt();
        user.delete(id);
        printAllUser();
    }
}
