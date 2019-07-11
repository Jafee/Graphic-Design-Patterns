package adapter.baseInterface;

import adapter.baseClass.BannerPrinter;
import adapter.baseClass.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new BannerPrinter("Hello");
        printer.printStrong();
        printer.printWeek();
    }
}
