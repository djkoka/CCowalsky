package classwork.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        //currentUpdate(connection);
        //create(connection, new Product(1,"Table","Furniture",100));

        deleteByID(connection, 3);

        Optional<Product> possibleProduct = findById(connection, 1);

        if(possibleProduct.isPresent()){
            System.out.println("product in optional: " + possibleProduct.get());
        }

        findAll(connection);
        connection.close();

    }

    private static void deleteByID(Connection connection, int id) throws SQLException {
        String sql = "DELETE FROM Store WHERE id = ?";

        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        statement.close();
    }

    private static void create(Connection connection, Product product) throws SQLException {
        String sql = " INSERT INTO Store (id, name, category, price) VALUES (?, ?, ?, ?)";
        PreparedStatement prStatement = connection.prepareStatement(sql);

        prStatement.setInt(1, product.getId());
        prStatement.setString(2, product.getName());
        prStatement.setString(3, product.getCategory());
        prStatement.setInt(4, product.getPrice());

        prStatement.executeUpdate();
        prStatement.close();

    }

    private static void currentUpdate(Connection connection) throws SQLException {
        String sql = "UPDATE Store SET name = ? WHERE id = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, "Keyboard'--");
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

    private static List<Product> findAll(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();

        String sql = "SELECT id, name, category, price FROM Store";

        ResultSet set = statement.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        while (set.next()) {
            int id = set.getInt("id");
            String name = set.getString("name");
            String category = set.getString("category");
            int price = set.getInt("price");

            Product product = new Product(id, name, category, price);

            products.add(product);
        }
        set.close();
        return products;
    }

    private static Optional<Product> findById(Connection connection, int id) throws SQLException {

        String sql = "SELECT name, category, price FROM Store WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet set = statement.executeQuery();
        Optional<Product> product = Optional.empty();
        if (set.next()) {
            String name = set.getString("name");
            String category = set.getString("category");
            int price = set.getInt("price");

            product = Optional.of(new Product(id, name, category, price));

        }
        set.close();
        return product;
    }

}
