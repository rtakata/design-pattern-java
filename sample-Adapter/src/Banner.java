/**
 * Created by ryoji on 2016/11/16.
 */
public class Banner {

    private String string;

    public Banner(String string) {
        this.string = string;
    }

    /**
     * 標準出力にstringを()で囲って出力
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * 標準出力にstringを*で囲って出力
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }
}
