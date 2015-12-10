package classwork.JDBC;

import java.sql.*;

/**
 * Created by CCowalsky on 10.12.2015.
 */
public class DatabaseMain {

    public static void main(String[] args) throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";

        String login = "postgres";

        String password = "postgres";

        Connection connection = DriverManager.getConnection(url, login, password);


        Statement statement = connection.createStatement();

        currentUpdate(connection);


        read(connection);
        connection.close();

    }

    private static void currentUpdate(Connection connection) throws SQLException {
        String sql = "UPDATE Store SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,"Keyboard'--");
        preparedStatement.setInt(2, 1);
        preparedStatement.executeUpdate();
        preparedStatement.close();
    }

    private static void notCorrectUpdate(Statement statement) throws SQLException {
        String newname = "Keyboard";
        int id = 1;
        String sql = "UPDATE Store SET name = '" + newname + "' WHERE id = " + id;
        int rowsUP = statement.executeUpdate(sql);
        System.out.println("Row UP:" + rowsUP);
    }

    private static void read(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT id, name, category, price FROM Store";

        ResultSet set = statement.executeQuery(sql);

        while (set.next()) {
            int id = set.getInt("id");
            String name = set.getString("name");
            String category = set.getString("category");
            int price = set.getInt("price");

            Product product = new Product(id, name, category, price);

            System.out.println(product);
        }
        set.close();
    }


}
