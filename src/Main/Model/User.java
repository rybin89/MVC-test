package Main.Model;

import static Main.DataBase.Const.*;
import static Main.DataBase.DataBaseHandler.getDbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class User {
    private int id;
    private int roleId;
    private String name;
    private String login;
    private String password;

    public User() {
    }

    ;

    public User(int id,
                int roleId,
                String name,
                String login,
                String password) {
        this.id = id;
        this.roleId = roleId;
        this.name = name;
        this.login = login;
        this.password = password;
    }

    private static ResultSet statement(String query) throws SQLException, ClassNotFoundException {
        Statement statment = getDbConnection().createStatement();
        ResultSet resultSet = statment.executeQuery(query);
        return resultSet;

    }

    //метод вывода данных таблицы
    public static User[] getUser() throws SQLException, ClassNotFoundException {

        String sql = "SELECT * FROM " + USER_TABLE;
        String countUser = "SELECT COUNT(*) FROM " + USER_TABLE;
        ResultSet resultSet = statement(sql);
        ResultSet count = statement(countUser);
        ////Ассоциативный массив из таблицы
        User[] arrayList = new User[count.getInt(1)];
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = new User(
                    resultSet.getInt(1),
                    resultSet.getInt(2),
                    resultSet.getString(3),
                    resultSet.getString(4),
                    resultSet.getString(5));
            System.out.println(arrayList[i]);
        }

        return arrayList;

    }
    public void getArrayList() throws SQLException, ClassNotFoundException {

        for (int i = 0; i < getUser().length; i++) {

            System.out.println(getUser()[i]);

        }

    }

    public Integer getId() {
        return id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    //метод добавления данных в таблицу

    //метод обновления данных в таблицу

    //метод удаления данных в таблицу

}
