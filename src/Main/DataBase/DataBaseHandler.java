package Main.DataBase;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//подключение к БД
public class DataBaseHandler extends Config {
    static Connection dbConnection;
    public static Connection getDbConnection()
            throws ClassNotFoundException, SQLException{
        String connectonString = "jdbc:mysql://31.31.196.54/u1895386_default";

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectonString, login, password);
        return dbConnection;
    }
//    public void signUpUser(String name, String login, String password){
//
//        String insert = "INSERT INTO "+ Const.USER_TABLE +" ("+ Const.USER_TABLE_NAME + ", " +
//                Const.USER_TABLE_LOGIN +
//                "," + Const.USER_TABLE_PASSWORD +
//                ") VALUES (?, ?, ?)";
//
//        try {
//            PreparedStatement prSt = getDbConnection().prepareStatement(insert);
//            prSt.setString(1, name);
//            prSt.setString(2, login);
//            prSt.setString(3, password);
//            prSt.executeUpdate();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//    }
}
