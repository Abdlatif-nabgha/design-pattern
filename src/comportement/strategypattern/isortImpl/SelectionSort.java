package comportement.strategypattern.isortImpl;

import comportement.strategypattern.ISort;

import java.util.Objects;

public class SelectionSort implements ISort {
    @Override
    public void sort(int[] values) {
        Objects.requireNonNull(values, "values must not be null");

        for (int i = 0; i < values.length - 1; i++) {
            int smallestIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            int temporary = values[i];
            values[i] = values[smallestIndex];
            values[smallestIndex] = temporary;
        }
    }
}
