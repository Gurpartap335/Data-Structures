package lecture.stack;


import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;

public class InBuiltExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);

        Iterator<Integer> it = stack.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // break the LIFO
        System.out.println( "Last element " + stack.get(2));

        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        Iterator<Integer> iteratorDeque = deque.iterator();
        while (iteratorDeque.hasNext()) {
            System.out.println(iteratorDeque.next());
        }

        // Iterator are designed to easily change the collections that they loop through.
        it.remove();
        while (iteratorDeque.hasNext()) {
            System.out.println(iteratorDeque.next());
        }

        System.out.println();

        ArrayLifoStack<Integer> arrayLifoStack = new ArrayLifoStack();
        arrayLifoStack.push(1);
        arrayLifoStack.push(2);
        arrayLifoStack.push(3);
        arrayLifoStack.push(4);
        System.out.println(arrayLifoStack.pop());
        System.out.println(arrayLifoStack.pop());
        System.out.println(arrayLifoStack.pop());
        System.out.println(arrayLifoStack.pop());
        System.out.println(arrayLifoStack);



    }

}

// https://www.baeldung.com/java-deque-vs-stack
// https://codeinventions.blogspot.com/2014/07/can-interface-extend-multiple.html

// From the object-oriented design point of view, the deque interface brings us
// more flexibility than the stack class.

// Java doesn't support multiple inheritance for CLASSES.
// This is solved by using multiple interfaces.

/**
 * An interface can extend multiple interfaces
 * A class can implement multiple interfaces.
 * A class can only extend a single class.
 */

// Stack is thread safe and deque interface is not thread safe.

// Since both stack and deque are subtypes of java.util.Collection interface
// they are also iterable.

// Iteration order of deque is from top to bottom.
// Iterator of stack class is from Vector class
// and Deque has its own.

// Stack class allows invalid LIFO stack operations like accessing element
// by index.

// When we say multiple inheritance not supporting in Java,
// we have to clearly mention that it won't support in Classes


// Diamond problem

interface A {
    void hello();
}

interface B {
    void hello();
}

interface C extends A, B {

}

class Music implements C {


    public static void main(String[] args) {
        Music obj = new Music();
        obj.hello();

        A a = new Music();
        B b = new Music();
        C c = new Music();
        a.hello();
        b.hello();
        c.hello();

    }

    @Override
    public void hello() {
        System.out.println("Yoo piere");
    }
}