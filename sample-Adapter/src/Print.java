/**
 * Created by ryoji on 2016/11/16.
 */
public interface Print {
    /**
     * 文字列をカッコ付きで弱く表示する
     */
    public abstract void printWeak();
    /**
     * 文字列を*ではさんで強調して表示する
     */
    public abstract void printStrong();
}
