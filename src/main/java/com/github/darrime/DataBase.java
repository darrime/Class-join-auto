package com.github.darrime;

import java.sql.*;

public class DataBase {
    public static String init() {
        String sub = null;
        String url = "jdbc:mysql://localhost:3306";
        String userName = "darrime";
        String password = Sec.password;
        ResultSet rs = null;
        int i = 4;


        try {
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();



            rs = statement.executeQuery("USE autoclassjoin;");

            rs = statement.executeQuery("SELECT 과목 FROM 수요일 WHERE 교시=" + i);

            while (rs.next()) {
                sub = rs.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return sub;
    }
}
