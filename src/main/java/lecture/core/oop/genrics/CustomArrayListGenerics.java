package lecture.core.oop.genrics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// docs
// wildcards what type of objects you can provide

public class CustomArrayListGenerics<T> {

    private Object[] arr;

    private static final int DEFAULT_SIZE = 5;

    private int size = 0;

    public CustomArrayListGenerics() {
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(Object num) {
        if (isFull()) {
            resize();
        }
        arr[size++] = num;
    }

    public T remove() {
        return (T) arr[size--];
    }

    public void set(int index, Object num) {
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
        Object[] temp = new Object[arr.length * 2];
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
        System.out.println();
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayListGenerics list = new CustomArrayListGenerics();
        list.add(34);
        list.add(344);
        list.add(1);
        list.add(340);
        list.print();
        list.add(00);
        list.print();
        list.add(7);
        list.add(9);
        list.add(945);
        list.print();

        ArrayList<Object> arrayList = new ArrayList<>(3);
        LinkedList<Object> linkedList = new LinkedList<>(arrayList);

    }
}
