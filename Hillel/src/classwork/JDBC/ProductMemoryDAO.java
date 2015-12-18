package classwork.JDBC;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * Created by CCowalsky on 14.12.2015.
 */
public class ProductMemoryDAO implements ProductDAO {
    List<Product> products = new ArrayList<>();

    public ProductMemoryDAO() {
        products = new ArrayList<>();
        products.add(new Product(1, "mouse", "computers", 10));
        products.add(new Product(2, "Keyboard", "computers", 15));
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
