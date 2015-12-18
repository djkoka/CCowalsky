package classwork.JDBC;

/**
 * Created by CCowalsky on 14.12.2015.
 */
public class MainDAO {
    public static void main(String[] args) {
        ProductDAO productDAO = new ProductMemoryDAO();

        System.out.println(productDAO.findAll());

        productDAO.create(new Product(4, "pen", "Accessories", 10));

        System.out.println(productDAO.findById(4));

        productDAO.deleteById(4);
    }
}