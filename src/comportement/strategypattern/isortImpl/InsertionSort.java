package comportement.strategypattern.isortImpl;


import comportement.strategypattern.ISort;

import java.util.Objects;

public class InsertionSort implements ISort {
    @Override
    public void sort(int[] values) {
        Objects.requireNonNull(values, "values must not be null");

        for (int i = 1; i < values.length; i++) {
            int current = values[i];
            int position = i - 1;

            while (position >= 0 && values[position] > current) {
                values[position + 1] = values[position];
                position--;
            }
            values[position + 1] = current;
        }
    }
}
