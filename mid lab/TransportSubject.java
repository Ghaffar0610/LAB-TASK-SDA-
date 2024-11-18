import java.util.ArrayList;
import java.util.List;


public class TransportSubject {
    private List<TransportObserver> observers = new ArrayList<>();


    public void attach(TransportObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String message) {
        for (TransportObserver observer : observers) {
            observer.update(message);
        }
    }
}
