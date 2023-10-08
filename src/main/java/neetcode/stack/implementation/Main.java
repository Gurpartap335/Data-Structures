package neetcode.stack.implementation;

public class Main {

    public static void main(String[] args) {
        runDemo(new ArrayDequeStack<>());
    }

    private static void runDemo(Stack<Integer> stack) {
        System.out.println("----" + stack.getClass().getSimpleName() + "-------");
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());
//        System.out.println(stack.pop());

        try {
            System.out.println(stack.pop());
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        System.out.println(stack.size());
    }
}
