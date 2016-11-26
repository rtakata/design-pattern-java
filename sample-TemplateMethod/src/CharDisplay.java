/**
 * Created by ryoji on 2016/11/26.
 */
public class CharDisplay extends AbstractDisplay {

    private char ch;

    /**
     * コンストラクタで与えられた文字chをフィールドに記憶しておく
     * @param ch
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * openの実装
     */
    public void open() {
        System.out.print("<<");
    }

    /**
     * printの実装
     */
    public void print() {
        System.out.print(ch);
    }

    /**
     * closeの実装
     */
    public void close() {
        System.out.println(">>");
    }
}
