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

    public int remove() {
        int removed = arr[--size];
        return removed;
    }

    public int get(int index) throws ArrayIndexOutOfBoundsException{
        if (index > arr.length) {
            System.out.println("Checking");
            throw new ArrayIndexOutOfBoundsException("Array out of Bound");
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

    public int getSize() {
        return size;
    }
    private void resize() {
        int[] temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp; // assigned new array
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
        list.add(34);
        list.add(12);
        list.add(13);
        list.print();
        list.get(5);
    }
}




