
/**
 * Created by ryoji on 2016/11/16.
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Mario"));
        bookShelf.appendBook(new Book("Yoshio"));
        bookShelf.appendBook(new Book("Tarou"));
        bookShelf.appendBook(new Book("Ryoji"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
