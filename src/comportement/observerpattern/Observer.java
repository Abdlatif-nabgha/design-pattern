package comportement.observerpattern;

@FunctionalInterface
public interface Observer {
    void update(String weather);
}
