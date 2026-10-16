package comportement.observerpattern.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private final List<Integer> history = new ArrayList<>();

    @Override
    public void update(int newState) {
        history.add(newState);
        double sum = 0;
        for (int value : history) {
            sum += value;
        }
        double average = sum / history.size();
        System.out.printf("Observer 2 : Dernier état = %d | Somme cumulée = %.1f | Moyenne = %.2f%n",
                newState, sum, average);
    }
}
