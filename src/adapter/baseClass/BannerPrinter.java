package adapter.baseClass;

public class BannerPrinter extends Banner implements Printer {

    public BannerPrinter(String banner) {
        super(banner);
    }

    @Override
    public void printWeek() {
        this.showWithParen();
    }

    @Override
    public void printStrong() {
        this.showWithAster();
    }
}
