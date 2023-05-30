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
        String connectonString = "jdbc:mysql://"+host+":"+port+"/"+name ;

        Class.forName("com.mysql.cj.jdbc.Driver");
        dbConnection = DriverManager.getConnection(connectonString, login, password);

        return dbConnection;
    }

}
