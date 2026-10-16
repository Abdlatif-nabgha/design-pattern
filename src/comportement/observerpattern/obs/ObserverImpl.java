package comportement.observerpattern.obs;

public class ObserverImpl implements Observer {
    @Override
    public void update(int newState) {
        System.out.println("Observer 1 : État reçu = " + newState);
    }
}
