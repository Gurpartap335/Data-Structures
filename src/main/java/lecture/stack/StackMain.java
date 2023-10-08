package lecture.stack;

public class StackMain {
    public static void main(String[] args) throws StackException{

//        DynamicStack stack1 = new DynamicStack(5);
//        stack1.push(34);
//        stack1.display();
//        stack1.push(12);
//        stack1.push(3444);
//        stack1.push(22);
//        stack1.push(233);
//        stack1.display();
//        stack1.push(4555);
//        stack1.display();


//        CustomStack stack = new CustomStack(3);
//        stack.display();
//        stack.push(34);
//        stack.push(12);
//        stack.push(1111);
//        stack.display();
//        stack.push(344);

        CustomStack stack = new DynamicStack(2);
        stack.push(4);
        stack.push(2);
        stack.push(22);
        stack.push(1);
        stack.push(7);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(55);
    }
}
/**
 * Stack: is the structure that stores all the things that happen when a program
 * is executed.
 * insertion and deletion can only happen from one end of the stack. top of the stack
 *
 * You can implement stack using array and linked list.
 * Implementing a stack as an array can result in stack overflow if the elements
 * exceed the arrays size capacity.
 *
 * Implementing a stack as a linked list(linked stack) rarely causes a stack overflow
 * since linked lists can grow infinitely.
 *
 * These two reasons - a constant space-time complexity and the ability to grow
 * easily in size -- are why so many stacks are actually just implementations of
 * linked lists under the hood.
 *
 * Real life overflows::-
 * undo/redo
 * browser history
 * call stack
 *
 * stack creation happens all the time -- even when just a single function is called.
 *
 * Stack inherits from java.util.Vector and therefore implements numerous interfaces
 * of the java collections framework. List, Collection, Iterable
 *
 * Stack throws EmptyStackException
 *
 * Just like Vector, Stack is thread-safe:all methods are synchronized.
 *
 * Stack methods
 * pop()
 * push()
 * search()
 * peek()
 * empty()
 *
 * Why You should not use Stack(anymore)
 * A more complete and consistent set of LIFO operations is provided by the Deque
 * interface and its implementations, which should be used in preference to this class.
 * Deque throw NoSuchElementException.
 */
