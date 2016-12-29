package framework;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryoji on 2016/12/29.
 */
public class Manager {
    private Map showcase = new HashMap();

    /**
     * showcaseにnameとProductインターフェースが渡されるとその組を登録する
     * @param name
     * @param proto
     */
    public void register(String name, Product proto) {
        showcase.put(name, proto);
    }

    public Product create(String protoname) {
        Product p = (Product) showcase.get(protoname);
        return p.createClone();
    }
}
