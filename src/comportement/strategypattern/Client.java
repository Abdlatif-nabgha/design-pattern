package comportement.strategypattern;

import comportement.strategypattern.isortImpl.BubbleSort;
import comportement.strategypattern.isortImpl.InsertionSort;
import comportement.strategypattern.isortImpl.SelectionSort;

import java.util.Arrays;

public class Client {
    static void main(String[] args) {
        int[] input = { 8, 3, 5, 1, 9, 2, 3 };
        Context context = new Context();

        context.setSort(new BubbleSort());
        printSorted("Bubble sort", context, input);

        context.setSort(new SelectionSort());
        printSorted("Selection sort", context, input);

        context.setSort(new InsertionSort());
        printSorted("Insertion sort", context, input);
    }

    private static void printSorted(String name, Context context, int[] input) {
        int[] values = input.clone();
        context.performSort(values);
        System.out.println(name + ": " + Arrays.toString(values));
    }
}
