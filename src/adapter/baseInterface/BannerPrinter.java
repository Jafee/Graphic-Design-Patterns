package adapter.baseInterface;

public class BannerPrinter extends Printer {

    private Banner banner;

    public BannerPrinter(String banner) {
        this.banner = new Banner(banner);
    }

    @Override
    public void printWeek() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
