package comportement.strategypattern.isortImpl;

import comportement.strategypattern.ISort;

import java.util.Objects;

public class BubbleSort implements ISort {
    @Override
    public void sort(int[] values) {
        Objects.requireNonNull(values, "values must not be null");

        for (int end = values.length - 1; end > 0; end--) {
            boolean swapped = false;
            for (int i = 0; i < end; i++) {
                if (values[i] > values[i + 1]) {
                    int temporary = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temporary;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}
