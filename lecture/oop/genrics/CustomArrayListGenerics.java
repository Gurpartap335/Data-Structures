package lecture.oop.genrics;

import java.util.Arrays;

public class CustomArrayListGenerics {

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
        T removed = (T)(arr[--size]);
        return removed;
    }

//    public T get(T index) {
//        return (T)arr[index];
//    }
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

    }
}
