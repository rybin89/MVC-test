package Main.Model;

import Main.DataBase.DataBaseHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import static Main.DataBase.DataBaseHandler.getDbConnection;


public class Role {
    static DataBaseHandler  queryGet;
    Integer id;
    String nameRole;
    public static final String ROLE_TABLE = "Roles";
    public static final String ROLE_TABLE_ID = "id";
    public static final String ROLE_TABLE_NAME = "name";

    //����� ������ ������ ������� Role
    public static void  getRole() throws SQLException, ClassNotFoundException {

        //���������� � ������� �������
        String query = "SELECT * FROM " + ROLE_TABLE;
        //
        Statement statment = getDbConnection().createStatement();
        ResultSet resultSet = statment.executeQuery(query);
        //������������� ������ �� ������� Role
        HashMap<Integer, String> arrayRole = new HashMap<>();
        while (resultSet.next()){
            arrayRole.put(resultSet.getInt(1),resultSet.getString(2));
        }
        arrayRole.forEach((Integer id, String name)->{
            System.out.println(id +": " + name);
        });


    }
}
