package comportement.observerpattern.obs;

@FunctionalInterface
public interface Observer {
    void update(int newState);
}
