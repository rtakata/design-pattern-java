/**
 * Created by ryoji on 2016/11/26.
 */
public class Main {
    public static void main(String[] args) {
        // 'H'を持ったCharDisplayのメソッド
        AbstractDisplay charDisplay = new CharDisplay('H');
        // "Hello, world."を持ったStringDisplayのメソッド
        AbstractDisplay stringDisplay1 = new StringDisplay("Hello, world.");
        // "こんにちは。"を持ったStringDisplayのメソッド
        AbstractDisplay stringDisplay2 = new StringDisplay("こんにちは。");

        charDisplay.display();
        stringDisplay1.display();
        stringDisplay2.display();
    }
}
