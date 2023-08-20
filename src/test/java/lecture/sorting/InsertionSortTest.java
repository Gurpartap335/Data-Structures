package lecture.sorting;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class InsertionSortTest {

    private InsertionSort sort = new InsertionSort();

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        sort.insertionSort(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void singleIntegerArray() {
        int[] arr = {5};
        sort.insertionSort(arr);
        Assertions.assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    public void integerArray() {
        int[] arr = {5, 3, 2, 1, 0, -1, 4};
        sort.insertionSort(arr);
        Assertions.assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4, 5}, arr);
    }



}
