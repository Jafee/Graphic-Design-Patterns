package adapter.baseInterface;

public class Banner {
    private String banner;

    public Banner(String banner) {
        this.banner = banner;
    }

    public void showWithParen() {
        System.out.println("(" + banner + ")");
    }

    public void showWithAster() {
        System.out.println("*" + banner + "*");
    }
}
