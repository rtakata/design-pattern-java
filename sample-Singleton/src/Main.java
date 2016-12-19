/**
 * SingletonクラスからgetInstanceした際に，同一のインスタンスが得られていることを確認する
 * Created by ryoji on 2016/12/20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1とobj2は同一インスタンスです");
        } else {
            System.out.println("obj1とobj2は同一インスタンスではありません");
        }
        System.out.println("End.");
    }
}
