import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryoji on 2016/11/27.
 */
public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    /**
     * Productのownerをownersに登録
     * @param product
     */
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }

    /**
     * ownersを返却
     * @return List
     */
    protected List getOwners() {
        return owners;
    }
}
