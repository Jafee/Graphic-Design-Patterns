package prototype.framework;

import java.util.HashMap;

public class Manager {

    private HashMap showCase = new HashMap();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String name) {
        Product product = (Product) showCase.get(name);
        return product.createClone();
    }

}
