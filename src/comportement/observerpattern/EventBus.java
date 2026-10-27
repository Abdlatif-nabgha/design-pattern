package comportement.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class EventBus {
    private final List<Listener> listeners = new ArrayList<>();

    public void subscribe(Listener l) {
        listeners.add(l);
    }

    public void unsubscribe(Listener l) {
        listeners.remove(l);
    }

    public void publish(String message) {
        for (Listener l : listeners) {
            l.onEvent(message);
        }
    }
    

}
