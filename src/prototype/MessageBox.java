package prototype;

import prototype.framework.Product;

public class MessageBox implements Product {

    private char decoChar;

    public MessageBox(char decoChar) {
        this.decoChar = decoChar;
    }

    @Override
    public void use(String name) {
        int length = name.getBytes().length;

        for (int i = 0; i < length + 4; i++)
            System.out.print(decoChar);

        System.out.println();
        System.out.println(decoChar + " " + name + " " + decoChar);

        for (int i = 0; i < length + 4; i++)
            System.out.print(decoChar);

        System.out.println();
    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
