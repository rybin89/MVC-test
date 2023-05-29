package Main.Controller;

import Main.Model.User;

import java.sql.SQLException;

public class UserController extends User {
    static private User getUser = new User();
    public UserController(Integer id, Integer roleId, String name, String login, String password) {
        super(id, roleId, name, login, password);
    }

    public static void printAllUser() throws SQLException, ClassNotFoundException {
        System.out.println("Список пользователей в системе");
        System.out.println("№  | Роль | Имя  | Логин  | Пароль  |");
        System.out.println("---------------------------------");
        for (User user :getUser()) {
            System.out.print(user.getId()+"  |  "+ user.getRoleId()+ " | "+user.getName()+
                    " | "+ user.getLogin()+ " | "+user.getPassword());
            System.out.println();
        }



        }

}
