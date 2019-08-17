package composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root directory...");
        Entry rootDir = new Directory("root");
        Entry binDir = new Directory("bin");
        Entry usrDir = new Directory("usr");
        Entry tmpDir = new Directory("tmp");


        try {
            rootDir.add(binDir);
            rootDir.add(usrDir);
            rootDir.add(tmpDir);

            binDir.add(new File("vi", 1000));
            binDir.add(new File("latex", 2000));
        } catch (FileTreatMentException e) {
            e.printStackTrace();
        }


        rootDir.printList();
    }
}
