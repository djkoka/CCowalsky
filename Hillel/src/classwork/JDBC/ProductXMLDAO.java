package classwork.JDBC;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by CCowalsky on 21.12.2015.
 */
public class ProductXMLDAO implements ProductDAO {
    public static final String PRODUCTS_XML_PATH = "d:/products.xml";
    List<Product> products = new ArrayList<>();

    public ProductXMLDAO() {
        try {
            XMLDecoder xmlDecoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(PRODUCTS_XML_PATH)));
            products = (List<Product>) xmlDecoder.readObject();
            xmlDecoder.close();

        } catch (FileNotFoundException e) {
            products = new ArrayList<>();
            products.add(new Product(1, "mouse", "computers", 10));
            products.add(new Product(2, "Keyboard", "computers", 15));
        }
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    XMLEncoder xmlEncoder = new XMLEncoder(new FileOutputStream(PRODUCTS_XML_PATH));
                    xmlEncoder.writeObject(products);
                    xmlEncoder.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }));
    }


    @Override
    public Optional<Product> findById(int id) {

/*        for (Product product : products){
            return Optional.of(product);
        }
        return Optional.empty();*/

        return products.stream()
                .filter(product -> product.getId() == id)
                .findFirst();
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void deleteById(int id) {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getId() == id) {
                iterator.remove();
                return;
            }
        }
    }

    @Override
    public void update(Product product) {
        deleteById(product.getId());
        products.add(product);
    }

    @Override
    public void create(Product product) {
        products.add(product);
    }
}
