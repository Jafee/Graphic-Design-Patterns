package abstractFactory.listfactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Page;

public class ListPage extends Page {

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html><head><title>" + title + "</title></head><body>\n");
        sb.append("<h1>" + title + "</h1>\n");
        sb.append("<ul>\n");
        for (Object item : content) {
            sb.append(((Item)item).makeHtml());
        }
        sb.append("</ul>\n");
        sb.append("<address>" + author + "</address>");
        sb.append("</body></html>");

        return sb.toString();
    }
}
