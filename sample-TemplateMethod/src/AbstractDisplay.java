/**
 * Created by ryoji on 2016/11/26.
 */
// 抽象クラス AbstractDisplay
public abstract class AbstractDisplay {
    /**
     * サブクラスに実装を任せる抽象メソッド open
     */
    public abstract void open();

    /**
     * サブクラスに実装を任せる抽象メソッド print
     */
    public abstract void print();

    /**
     * サブクラスに実装を任せる抽象メソッド close
     */
    public abstract void close();

    /**
     * displayのみ抽象クラスで実装を持つ
     */
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
