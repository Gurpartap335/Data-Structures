package lecture.stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;
    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) throws StackException{
        if (isFull()) {
            throw new StackException("Stack is already full");
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public boolean isFull() {
        return ptr == data.length - 1; // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public int pop() throws StackException{
        if (isEmpty()) {
            throw new StackException("Cannot pop form an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
//         return data[ptr--];
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot peek from an empty stack!!");
        }
        return data[ptr];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
        }
        for (int i = 0; i < ptr + 1; i++) {
            System.out.println(data[i]);
        }
    }


}
