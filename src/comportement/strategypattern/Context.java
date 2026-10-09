package comportement.strategypattern;

import java.util.Objects;

public class Context {
    private ISort sort;

    public void setSort(ISort sort) {
        this.sort = Objects.requireNonNull(sort, "sort strategy must not be null");
    }

    public void performSort(int[] values) {
        if (sort == null) {
            throw new IllegalStateException("Set a sort strategy before sorting");
        }
        sort.sort(values);
    }
}
