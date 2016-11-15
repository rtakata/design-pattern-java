/**
 * Created by ryoji on 2016/11/16.
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    private int last = 0;

    /**
     * maxsizeで指定されたBookShelfインスタンスを作成する
     * @param maxsize
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * indexで指定した番号のBookオブジェクトを返す
     * @param index
     * @return book(indexで指定されたBook)
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * Bookオブジェクトを最後尾に追加する
     * @param book
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last++;
    }

    /**
     * Bookshelfインスタンスの長さを返す
     * @return last(int)
     */
    public int getLength() {
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
