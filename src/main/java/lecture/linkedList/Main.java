package lecture.linkedList;


public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(12);
        list.insertFirst(34);
        list.insertFirst(23);
        list.insertLast2(233);
        list.insertLast2(22);

        list.display();

    }
}

/*
 * Visualize what to do
 */


/*
 * In linked list elements are not stored at a contiguous location;
 * the elements are linked using pointers.
 * They include a series of connected nodes.
 * Here, each node stores the data and the address of the next node.
 *
 * what allows a linked list to have its memory scattered everywhere?
 *
 * Head and Tail pointer
 * The Head pointer keeps track of the starting node of the linked list.
 * Tail pointer point to the end of the linked list.
 *
 * A real-world example of uses of linked list to design a song playlist.
 *
 * The pointer that will point to the first node and last node is there in the stack
 * memory.
 */