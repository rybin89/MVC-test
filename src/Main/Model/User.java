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
        while (resultCount.next()){
            count = resultCount.getInt("count");
        }
        User[] arrayUser = new User[count];
        ResultSet resultSet = statement(sql);
        int i = 0;
        while (resultSet.next()){

            arrayUser[i] = new User(resultSet.getInt("id"),
                    resultSet.getInt("role_id"),
                    resultSet.getString("name"),
                    resultSet.getString("login"),
                    resultSet.getString("password")
                    );
            i++;

        }
        ////Ассоциативный массив из таблицы
        return arrayUser;

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
