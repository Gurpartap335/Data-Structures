package lecture.stack;

public class StackMain {
    public static void main(String[] args) throws StackException{
        CustomStack stack = new DynamicStack(5);
        // what all access      what is the type of access
        // you can get
        stack.push(34);
        stack.push(33);
        stack.push(90);
        stack.push(99);
        stack.push(12);
        stack.push(45);

        DynamicStack stack1 = new DynamicStack(3);
        stack1.push(45);
        stack1.push(56);
        stack1.push(43);
        stack1.push(56);




//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());


        System.out.println(stack.peek());

    }
}
