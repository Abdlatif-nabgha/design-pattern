package comportement.observerpattern;

public class LogListener implements Listener {

    @Override
    public void onEvent(String event) {
        System.out.println("Logged event: " + event);
    }
}
