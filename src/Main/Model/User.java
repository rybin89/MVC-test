package Main.Model;

import static Main.DataBase.Const.*;
import static Main.DataBase.DataBaseHandler.getDbConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class User {
    private int id;
    private int roleId;
    private String name;
    private String login;
    private String password;

    private String query;

    public User() {
    }


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
        String countUser = "SELECT COUNT(*) AS count FROM " + USER_TABLE;

        ResultSet resultCount = statement(countUser);

        int count = 0;
        while (resultCount.next()) {
            count = resultCount.getInt("count");
        }
        User[] arrayUser = new User[count];
        ResultSet resultSet = statement(sql);
        int i = 0;
        while (resultSet.next()) {

            arrayUser[i] = new User(resultSet.getInt("id"),
                    resultSet.getInt("role_id"),
                    resultSet.getString("name"),
                    resultSet.getString("login"),
                    resultSet.getString("password")
            );
            i++;

        }
        ////јссоциативный массив из таблицы
        return arrayUser;

    }

    //¬ывод однго пользовател€
    public User getOneUser(Integer id) throws SQLException, ClassNotFoundException {
        User user = new User();
        query = "SELECT * FROM " + USER_TABLE + " WHERE " + USER_TABLE_ID + " = " + id;

        Statement statement = getDbConnection().createStatement();
        System.out.println(query);
        ResultSet resultSet = statement.executeQuery(query);

        while (resultSet.next()) {
            user = new User(resultSet.getInt("id"), resultSet.getInt("role_id"),
                    resultSet.getString("name"), resultSet.getString("login"),
                    resultSet.getString("password"));
        }
        return user;
    }

    //метод добавлени€ данных в таблицу
    public void createUser(String name,
                           String login,
                           String password,
                           int roleId) throws SQLException, ClassNotFoundException {
        query = "INSERT INTO Users (" + USER_TABLE_LOGIN + ","
                + USER_TABLE_NAME + ","
                + USER_TABLE_PASSWORD + ","
                + USER_TABLE_ROLE_ID + ") " +
                "VALUES ('" + login + "','" + name + "', '" + password + " ', " + roleId + ")";
        Statement statement = getDbConnection().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    //метод обновлени€ данных в таблицу
    public void updateLogin(String login, Integer id) throws SQLException, ClassNotFoundException {

        query = "UPDATE " + USER_TABLE + " set " + USER_TABLE_LOGIN + " = '" + login + "' where " + USER_TABLE_ID + " = " + id;
        Statement statement = getDbConnection().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);

    }

    //метод удалени€ данных в таблицу
    public void delete(Integer id) throws SQLException, ClassNotFoundException {
        query = "DELETE FROM " +USER_TABLE + " WHERE " + USER_TABLE_ID + " = "+id;
        Statement statement = getDbConnection().createStatement();
        System.out.println(query);
        statement.executeUpdate(query);
    }

    //геттеры

    public int getId() {
        return id;
    }

    public int getRoleId() {
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
}
