package Main.Model;

import Main.DataBase.DataBaseHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

import static Main.DataBase.Const.*;
import static Main.DataBase.DataBaseHandler.getDbConnection;


public class Role {
    static DataBaseHandler  queryGet;
    Integer id;
    String nameRole;


    //����� ������ ������ ������� Role
    public HashMap<Integer, String>  getRole() throws SQLException, ClassNotFoundException {

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
        return arrayRole;
    }
    //����� ���������� ������ � ������� Role
    public void newRole(String role) throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO " + ROLE_TABLE + "(" + ROLE_TABLE_NAME + ") VALUES " +
                "('" + role + "')";

        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(query);
    }
    //����� ���������� ������ � ������� Role
    public void updateName(Integer id, String newRole) throws SQLException, ClassNotFoundException {
        //������ �� ���������� ������ �������� ������ ROLE_TABLE_NAME ����� ��� newRole ������ ��� ������������� id
//        String query = "UPDATE " + ROLE_TABLE + "SET"+ ROLE_TABLE_NAME + " = " + newRole + " WHERE " + ROLE_TABLE_ID +" = " + id;
        String query = "UPDATE Roles SET name = '"+ newRole + "' WHERE id = " + id;
        Statement statement = getDbConnection().createStatement();
        statement.executeUpdate(query);
    }

    //����� �������� ������ � ������� Role
    public void delete(Integer id) throws SQLException, ClassNotFoundException {

        String query = "DELETE FROM " + ROLE_TABLE + " WHERE " + ROLE_TABLE_ID + " = " + id ;
        if(id!=1){
            Statement statement = getDbConnection().createStatement();
            statement.executeUpdate(query);
        } else {
            System.out.println("��� ���� ������ �������!!!");
        }

    }
}
