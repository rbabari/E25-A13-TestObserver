import java.util.ArrayList;
import java.util.List;

public class MessagePublisher4 implements Observable {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Message m) {
        for (Observer o : observers) {
            o.update(m);
        }
    }
}
