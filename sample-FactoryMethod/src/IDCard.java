/**
 * Created by ryoji on 2016/11/27.
 */
public class IDCard extends Product {
    private String owner;

    /**
     * IDカードの作成
     * @param owner
     */
    IDCard(String owner) {
        System.out.println(owner + "のカードを作ります。");
        this.owner = owner;
    }

    /**
     * IDカード使用のメソッド
     */
    @Override
    public void use() {
        System.out.println(owner + "のカードを使います。");
    }

    public String getOwner() {
        return owner;
    }
}
