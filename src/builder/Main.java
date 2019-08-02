package builder;

public class Main {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director textDirector = new Director(textBuilder);
        textDirector.constructor();
        System.out.println(textBuilder.getResult());


        HtmlBuilder htmlBuilder = new HtmlBuilder();
        Director htmlDirector = new Director(htmlBuilder);
        htmlDirector.constructor();
        System.out.println(htmlBuilder.getResult());
    }
}
