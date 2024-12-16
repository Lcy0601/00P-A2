import java.util.Queue;

public interface RideInterface {
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();
    void runOneCycle();
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}

//interface RideInterface {
//    void addVisitorToQueue(Visitor visitor);
//    void removeVisitorFromQueue();
//    void printQueue();
//    void runOneCycle();
//    void addVisitorToHistory(Visitor visitor);
//    boolean checkVisitorFromHistory(Visitor visitor);
//    int numberOfVisitors();
//    void printRideHistory();
//}