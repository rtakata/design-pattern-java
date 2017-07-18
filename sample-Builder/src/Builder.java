/**
 * Created by ryoji on 2016/12/30.
 */
public abstract class Builder {
    /**
     * タイトル作成
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     * 文字列作成
     * @param str
     */
    public abstract void makeString(String str);

    /**
     * 箇条書きの項目作成
     * @param items
     */
    public abstract void makeItems(String[] items);
    public abstract void close();
}
