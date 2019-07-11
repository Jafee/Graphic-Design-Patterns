package iterator;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(4);

        bookShelf.appendBook(new Book("Around the world in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("DesignPattern"));

        Iterator bookIterator = bookShelf.iterator();

        while (bookIterator.hasNext())
            System.out.println(((Book)bookIterator.next()).getName());

    }
}
