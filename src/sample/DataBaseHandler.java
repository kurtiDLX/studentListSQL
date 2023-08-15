package sample;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;

public class DataBaseHandler {
    Connection connection;
    ResultSet resultSet = null;

    public Connection getConnection() {
        String connectionString = "jdbc:mysql://StudentList:3306/student";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            connection= DriverManager.getConnection(connectionString, "root", "12345678910");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;
    }

    public ResultSet getResultSet() {
        String getUser="SELECT * FROM student";
      PreparedStatement preparedStatement= null;
        try {
            getConnection().prepareStatement(getUser);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            resultSet = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


        return resultSet;
    }
}
