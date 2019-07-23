package factoryMethod;

import factoryMethod.framework.Factory;
import factoryMethod.framework.Product;
import factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product product1 = factory.create("小王");
        Product product2 = factory.create("小杨");
        Product product3 = factory.create("小李");

        product1.use();
        product2.use();
        product3.use();
    }
}
