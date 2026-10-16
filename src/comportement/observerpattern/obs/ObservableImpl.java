package comportement.observerpattern.obs;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;

public class ObservableImpl implements Observable {

    // CopyOnWriteArrayList garantit la sécurité multi-thread et évite ConcurrentModificationException
    private final List<Observer> observers = new CopyOnWriteArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer observer) {
        Objects.requireNonNull(observer, "L'observateur ne doit pas être null");
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(state);
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }

    public int getState() {
        return state;
    }
}
