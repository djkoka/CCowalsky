package classwork.JDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by CCowalsky on 14.12.2015.
 */
public class ProductDbDAO implements ProductDAO {
    private Connection connection;

    public ProductDbDAO() {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");
        String url = "jdbc:postgresql://127.0.0.1:5432/postgres";
        try {
            String login = "postgres";
            String password = "postgres";
            connection = DriverManager.getConnection(url, login, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //
        }
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }));
    }

    @Override
    public Optional<Product> findById(int id) {
        try {
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
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //close result set
        }
    }

    @Override
    public List<Product> findAll() {
        try {
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
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //
        }
    }

    @Override
    public void deleteById(int id) {
        try {
            String sql = "DELETE FROM Store WHERE id = ?";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            statement.executeUpdate();
            statement.close();
        } catch (SQLException e ){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Product product) {
        try {
            String sql = "UPDATE Store SET name = ?, category = ?, price = ? WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getCategory());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getId());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void create(Product product) {
        try {
            String sql = " INSERT INTO Store (id, name, category, price) VALUES (?, ?, ?, ?)";
            PreparedStatement prStatement = connection.prepareStatement(sql);

            prStatement.setInt(1, product.getId());
            prStatement.setString(2, product.getName());
            prStatement.setString(3, product.getCategory());
            prStatement.setInt(4, product.getPrice());

            prStatement.executeUpdate();
            prStatement.close();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }finally {
            //
        }
    }

/*    public void close(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void finalize() throws Throwable {
        connection.close();
    }*/
}
