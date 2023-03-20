package lecture.queue;

import java.util.*;

/**
 * Unlike stack, a queue is open at both its ends.One end is always used to insert
 * data (enqueue) and other is used to remove data.(dequeue)
 * enqueue(add): adds an element to the end of the queue
 * dequeue(remove): removes the first element at the front of the queue.
 *
 * deque(double-ended queue) : insertion and deletion can happen at the both end.
 * queue: insertion happens at the end of the queue and deletion
 * of element form the front.
 * 
 * we can implement stack and queue with array and linked list.
 */
public class Main {
    public static void main(String[] args) throws Exception {
//        CustomQueue queue = new CustomQueue(5);
//        System.out.println(queue.isFull());
//        System.out.println(queue.isEmpty());
//        queue.insert(34);
//        queue.insert(22);
//        queue.insert(44);
//        queue.insert(1);
//        queue.insert(2);
//        queue.display();
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

        CircularQueue queue = new CircularQueue(5);

        queue.insert(3);
        queue.insert(4);
        queue.insert(31);
        queue.insert(90);
        queue.insert(23);

        queue.display();
        System.out.println(Arrays.toString(queue.data));

//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

//        System.out.println(queue.front());
//        queue.remove();
//        System.out.println(queue.front());

        queue.display();



    }
}
