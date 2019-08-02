package builder;

public class TextBuilder extends Builder {

    private StringBuffer sb = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        sb.append("============================\n");
        sb.append("[" + title + "]\n\n");
    }

    @Override
    public void makeString(String str) {
        sb.append("# " + str + "\n\n");
    }

    @Override
    public void makeItem(String[] items) {
        for (String item : items) {
            sb.append("    ~" + item + "\n");
        }
        sb.append("\b");
    }

    @Override
    public void close() {
        sb.append("============================\n");
    }

    public String getResult() {
        return sb.toString();
    }
}
