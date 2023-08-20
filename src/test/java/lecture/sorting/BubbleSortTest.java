package lecture.sorting;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BubbleSortTest {

    @Test
    public void bubbleSortEmptyArray() {
        BubbleSort sort = new BubbleSort();
        int[] arr = {};
        sort.bubbleSort(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }

    @Test
    public void bubbleSortSingleIntegerArray() {
        BubbleSort sort = new BubbleSort();
        int[] arr = {3};
        sort.bubbleSort(arr);
        Assertions.assertArrayEquals(new int[]{3}, arr);
    }

    @Test
    public void bubbleSortIntegerArray3() {
        BubbleSort sort = new BubbleSort();
        int[] arr = {3, 2, 5, 6, 1, 0, 4};
        sort.bubbleSort(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5, 6}, arr);
    }
}
