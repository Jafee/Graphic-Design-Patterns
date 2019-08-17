package decorator;

public class Main {
    public static void main(String[] args) {
        Display sd = new StringDisplay("Hello World");
        Display sb = new SideBorder(sd, '#');
        Display fb = new FullBorder(sb);

        sd.show();
        sb.show();
        fb.show();


        Display display4 = new SideBorder(
                new FullBorder(
                        new FullBorder(
                                new SideBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello World")
                                        ), '*')
                        )
                ), '/');

        display4.show();
    }
}
