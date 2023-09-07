package lecture.sorting;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MergeSortTest {

    @Test
    public void simpleArrayTest1() {
        MergeSort sort = new MergeSort();
        int[] arr = {3, 4, 1, 2, 5, 9};
        sort.mergeSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 9}, arr);
    }

    @Test
    public void simpleArrayTest2() {
        MergeSort sort = new MergeSort();
        int[] arr = {-3, 5, 3, 4, 3, 7, 40, -20, 30, 0};
        sort.mergeSort(arr, 0, arr.length - 1);
        Assertions.assertArrayEquals(new int[]{-20, -3, 0, 3, 3, 4, 5, 7, 30, 40}, arr);
    }
}
