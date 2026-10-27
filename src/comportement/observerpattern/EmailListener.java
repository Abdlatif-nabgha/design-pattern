package comportement.observerpattern;

public class EmailListener implements Listener {

    @Override
    public void onEvent(String event) {
        System.out.println("Email sent: " + event);
    }
}
