package lecture.oop.genrics;

import java.util.Arrays;

public class CustomArrayList {
    private int[] arr;

    private static final int DEFAULT_SIZE = 5;

    private int size = 0;

    public CustomArrayList() {
        this.arr = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public int remove(int index) {
        int removed = arr[--size];
        return removed;
    }

    public int get(int index) {
        if (index > arr.length) {
            System.out.println("Array out of Bound");// or throw Exception
            return -1;
        }
        return arr[index];
    }

    public void set(int index, int num) {
        if (index > arr.length) {
            System.out.println("Array out of Bound");
            return;
        }
        arr[index] = num;
    }

    public int size() {
        return size;
    }
    private void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    private boolean isFull() {
        return size == arr.length;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        System.out.println(list.size);
        System.out.println(Arrays.toString(list.arr));
        System.out.println(list.arr); // toString method only works when printing the object.
        System.out.println(list);
        System.out.println(DEFAULT_SIZE);

        list.add(23);
        list.add(2);
        list.add(4);
        list.add(12);
        list.add(134);
        System.out.println(list);
        list.print();

        System.out.println(list.get(3));
        System.out.println(list.get(12));

        list.add(7);
        list.add(90);
        list.print();
    }
}
