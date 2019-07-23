package factoryMethod.idcard;

import factoryMethod.framework.Product;

public class IDCard extends Product {

    private String owner;

    IDCard(String owner) {
        System.out.println("制作IDCard，所属者：" + owner);
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println(owner + "使用IDCard");
    }

    public String getOwner() {
        return owner;
    }
}
