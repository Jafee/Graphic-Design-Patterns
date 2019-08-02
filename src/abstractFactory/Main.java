package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.Link;
import abstractFactory.factory.Page;
import abstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {

//        if (args.length < 1) {
//            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
//            System.out.println("Example 1: java Main listfactory.ListFactory");
//            System.out.println("Example 2: java Main tablefactory.TableFactory");
//            System.exit(0);
//        }

        Factory factory = Factory.getInstance("abstractFactory.listfactory.ListFactory");

        Link people = factory.createLink("Renmin", "http://renmin.com");
        Link gmw = factory.createLink("Guangmingwang", "http://www.guangming.com");
        Link yahoo = factory.createLink("Yahoo", "http://yahoo.com");
        Link google = factory.createLink("Google", "http://google.com");
        Link facebook = factory.createLink("facebook", "http://fackbook.com");
        Link twitter = factory.createLink("Twittier", "http://twitter.com");

        Tray newsTray = factory.createTray("news");
        newsTray.add(people);
        newsTray.add(gmw);

        Tray searchTray = factory.createTray("search");
        searchTray.add(yahoo);
        searchTray.add(google);

        Tray socialTray = factory.createTray("social");
        socialTray.add(facebook);
        socialTray.add(twitter);

        Page page = factory.createPage("index", "jack");
        page.add(newsTray);
        page.add(searchTray);
        page.add(socialTray);

        page.output();

    }

}
