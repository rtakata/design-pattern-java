/**
 * Created by ryoji on 2016/11/27.
 */
public abstract class Factory {

    /**
     * プロダクトの生成
     * @param owner
     * @return
     */
    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product product);
}
