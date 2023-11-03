package org.example.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter country name: ");
        String name = scanner.nextLine();

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Statement statement = connection.createStatement();

            String query = "SELECT * FROM country WHERE country_name=?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, name);

            ResultSet resultSet = preparedStatement.executeQuery();

            //ResultSet resultSet = statement.executeQuery("SELECT * FROM country WHERE country_name = '"+ name +"'");
            //String select = "' UNION SELECT restaurant_id AS country_id, name AS country_name, employee_count AS language_code,  name AS n1, name AS n2, name AS n3 FROM restaurant -- ";
            List<Country> countries = new ArrayList<>();
            int column_id = resultSet.findColumn("country_id");

            while (resultSet.next()) {
                int id = resultSet.getInt(column_id);
                String country_name = resultSet.getString("country_name");
                String language_code = resultSet.getString("language_code");

                Country country = new Country(id,country_name,language_code);
                countries.add(country);
            }
            countries.forEach(System.out::println);

        } catch (SQLException e) {
            System.out.println("Error connecting to the database");
            e.printStackTrace();
        }
    }
}
