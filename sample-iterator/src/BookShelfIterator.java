/**
 * Created by ryoji on 2016/11/16.
 */
public class BookShelfIterator implements Iterator {
    public BookShelf bookShelf;
    private int index;

    /**
     *
     * @param bookShelf
     * @return
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 次のbookの存在確認
     * @return boolean
     */
    @Override
    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            // 次のbookが存在するとき
            return true;
        } else {
            // 存在しないとき
            return false;
        }
    }

    /**
     * 現在のBookインスタンスを返し，次にindexを進める
     * @return book Book
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
