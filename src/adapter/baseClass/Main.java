package adapter.baseClass;

public class Main {

    public static void main(String[] args) {
        Printer printer = new BannerPrinter("Hello");
        printer.printStrong();
        printer.printWeek();
    }
}
