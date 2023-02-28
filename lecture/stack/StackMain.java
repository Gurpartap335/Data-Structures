package lecture.stack;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new CustomStack();
        stack.display();

//        CustomStack stack = new DynamicStack(5);
//        // what all access      what is the type of access
//        // you can get
//        stack.push(34);
//        stack.push(33);
//        stack.push(90);
//        stack.push(99);
//        stack.push(12);
//        stack.push(45);
//
//        DynamicStack stack1 = new DynamicStack(3);
//        stack1.push(45);
//        stack1.push(56);
//        stack1.push(43);
//        stack1.push(56);



//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


//        System.out.println(stack.peek());

    }
}
/**
 * Stack: is the structure that stores all the things that happen when a program
 * is executed.
 * insertion and deletion can only happen from one end of the stack. top of the stack
 *
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
 * stack creation happens all the time -- even when just a single function is called.
 * 
 *
 */
