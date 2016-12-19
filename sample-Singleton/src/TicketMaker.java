/**
 * Created by ryoji on 2016/12/20.
 */
public class TicketMaker {
    private static TicketMaker ticketMaker = new TicketMaker();

    private TicketMaker() {

    }

    private int ticket = 1000;

    public static TicketMaker getInstance() {
        return ticketMaker;
    }

    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
}
