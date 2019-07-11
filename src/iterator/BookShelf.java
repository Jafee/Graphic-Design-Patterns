package iterator;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int getLength() {
        return last;
    }

    public Book appendBook(Book book) {
        books[last++] = book;
        return book;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
