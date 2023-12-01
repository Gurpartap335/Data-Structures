package lecture.core;

// https://medium.com/@AlexanderObregon/introduction-to-javas-memory-model-heap-stack-and-metaspace-ceaeb565921c
// https://stackoverflow.com/questions/6952581/what-is-the-difference-between-strings-allocated-using-new-operator-without-ne
public class MemoryModel {

    public static void main(String[] args) {
        // Heap
        // young generation and old generation
        String s = new String("RED");
        Integer q = 12;
        Short w = 455;


        // Stack
        int a = 34;
        int b = 22;
        int c = sum(a, b);
        System.out.println(c);

        // metaspace


    }

    public static int sum (int x, int y){
        return x + y;
    }

}
