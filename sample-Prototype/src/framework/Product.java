package framework;

/**
 * Created by ryoji on 2016/12/29.
 */
public interface Product extends Cloneable {
    public abstract void use (String s);
    public abstract Product createClone();
}
