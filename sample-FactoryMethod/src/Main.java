/**
 * Created by ryoji on 2016/11/27.
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("rtakata");
        Product card2 = factory.create("a");
        Product card3 = factory.create("b");

        card1.use();
        card2.use();
        card3.use();
    }
}
