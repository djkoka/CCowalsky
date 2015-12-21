package classwork.JDBC;

/**
 * Created by CCowalsky on 21.12.2015.
 */
public class ProductDAOFactory {
    public static ProductDAO createDAO(String daoType) {
        ProductDAO productDAO;
        switch (daoType) {
            case "db" : productDAO = new ProductDbDAO();
                break;
            case "memory" : productDAO = new ProductMemoryDAO();
                break;
            case "XML" : productDAO = new ProductXMLDAO();
                break;
            default:
                System.out.println("expected: db, memory, xml; but found: "+daoType);
                productDAO = new ProductMemoryDAO();

        }
        return productDAO;
    }
}
