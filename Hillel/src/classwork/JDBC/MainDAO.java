package classwork.JDBC;

/**
 * Created by CCowalsky on 14.12.2015.
 */
public class MainDAO {
    public static void main(String[] args) {

        String daoType =  args[0];

        ProductDAO productDAO = ProductDAOFactory.createDAO(daoType);


        System.out.println(productDAO.findAll());

        productDAO.create(new Product(5, "mouse", "Computer", 50));

        System.out.println(productDAO.findById(4));

//        productDAO.deleteById(4);
    }


}
