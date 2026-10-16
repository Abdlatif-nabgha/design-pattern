package comportement.observerpattern.client;

import comportement.observerpattern.obs.ObservableImpl;
import comportement.observerpattern.obs.Observer;
import comportement.observerpattern.obs.ObserverImpl;
import comportement.observerpattern.obs.ObserverImpl2;

public class Main {

    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();

        Observer o1 = new ObserverImpl();
        Observer o2 = new ObserverImpl2();

        System.out.println("=== 1. Inscription des observateurs ===");
        observable.subscribe(o1);
        observable.subscribe(o2);

        // Démonstration Java moderne : observateur via une lambda expression
        observable.subscribe(state -> System.out.println("Observer 3 (Lambda) : Reçu l'alerte pour " + state));

        System.out.println("\n=== 2. Changement d'état à 10 ===");
        observable.setState(10);

        System.out.println("\n=== 3. Changement d'état à 25 ===");
        observable.setState(25);

        System.out.println("\n=== 4. Désabonnement de Observer 1 ===");
        observable.unsubscribe(o1);

        System.out.println("\n=== 5. Changement d'état à 40 (sans Observer 1) ===");
        observable.setState(40);
    }
}
