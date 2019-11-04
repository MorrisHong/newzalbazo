package kr.zalbazo.newzalbazo;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

@Slf4j
public class Sample {


    public static void main(String[] args) {
        Connection connection = null;
        try {
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:mem:test;MODE=MySQL;";
            connection = DriverManager.getConnection(url, "sa", "");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select id, username, password from member");

            while(resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");

                log.info("id : {}, username : {}, password : {}", id,username,password);
            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
