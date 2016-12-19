/**
 * Created by ryoji on 2016/12/20.
 */
public class TicketMakerMain {
    public static void main(String[] args) {
        System.out.println("Start.");

        TicketMaker obj1 = TicketMaker.getInstance();
        System.out.println("obj1: " + obj1.getNextTicketNumber());

        TicketMaker obj2 = TicketMaker.getInstance();
        System.out.println("obj2: " + obj2.getNextTicketNumber());

        System.out.println("obj1: " + obj1.getNextTicketNumber());

        System.out.println("End.");
    }
}
