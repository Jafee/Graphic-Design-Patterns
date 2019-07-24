package prototype;

import prototype.framework.Product;

public class UnderlinePen implements Product {

    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String name) {
        int length = name.getBytes().length;


        System.out.println(ulchar + " " + name + " " + ulchar);

        for (int i = 0; i < length + 4; i++)
            System.out.print(ulchar);

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
