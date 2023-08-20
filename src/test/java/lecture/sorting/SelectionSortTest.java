package lecture.sorting;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SelectionSortTest {

    @Test
    @DisplayName("Integer array Test")
    public void sortArray() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {3, 1, 2, 4, 5, 0};
        sort.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{0, 1, 2, 3, 4, 5}, arr);
    }


    @Test
    @DisplayName("Empty Array Test")
    public void emptyArrayTest() {
        SelectionSort sort = new SelectionSort();
        int[] arr = {};
        sort.selectionSort(arr);
        Assertions.assertArrayEquals(new int[]{}, arr);
    }



}
