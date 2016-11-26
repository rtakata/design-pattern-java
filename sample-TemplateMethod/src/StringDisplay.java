/**
 * Created by ryoji on 2016/11/26.
 */
public class StringDisplay extends AbstractDisplay {

    private String str;

    private int strLength;

    /**
     * コンストラクタで与えられた文字chをフィールドに記憶しておく
     * @param
     */
    public StringDisplay(String str) {
        this.str = str;
        // 全角文字も考慮してbyte単位の幅を取得する
        this.strLength = str.getBytes().length;
    }

    /**
     * openの実装
     */
    public void open() {
        printLine();
    }

    /**
     * printの実装
     */
    public void print() {
        System.out.println("|" + str + "|");
    }

    /**
     * closeの実装
     */
    public void close() {
        printLine();
    }

    /**
     * openとcloseでコールされるメソッド
     */
    private void printLine() {
        // start
        System.out.print("+");

        // コンストラクタの文字列分だけ「-」を出力する
        for (int i = 0; i < strLength; i++) {
            System.out.print("-");
        }
        // end
        System.out.println("+");
    }
}
