package visitor;

public class Main {
    public static void main(String[] args) {
        System.out.println("making root ...");
        Directory root = new Directory("root");
        Directory bin = new Directory("bin");
        Directory usr = new Directory("usr");
        Directory tmp = new Directory("tmp");

        root.add(bin);
        root.add(tmp);
        root.add(usr);

        bin.add(new File("vi", 1000));
        bin.add(new File("latex", 2000));
        root.accept(new ListVisitor());
    }
}
