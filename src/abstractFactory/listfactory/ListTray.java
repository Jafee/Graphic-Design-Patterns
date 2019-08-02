package abstractFactory.listfactory;

import abstractFactory.factory.Item;
import abstractFactory.factory.Tray;

public class ListTray extends Tray {

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<li>\n");
        sb.append(caption);
        sb.append("<ul>\n");

        for (Object item : tray) {
            sb.append(((Item)item).makeHtml());
        }

        sb.append("</li>\n");
        sb.append("</ul>\n");

        return sb.toString();
    }
}
