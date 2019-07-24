package prototype;

import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        MessageBox strongBox = new MessageBox('*');
        MessageBox warningBox = new MessageBox('/');
        UnderlinePen underline = new UnderlinePen('~');
        Manager manager = new Manager();
        manager.register("strong", strongBox);
        manager.register("warn", warningBox);
        manager.register("underline", underline);

        Product strong = manager.create("strong");
        strong.use("Hello Strong!");
        Product warn = manager.create("warn");
        warn.use("Hello Warn!");
        Product under = manager.create("underline");
        under.use("Hello Underline!");

    }
}
