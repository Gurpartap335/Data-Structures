package lecture.linkedList;


public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertFirst(12);
        list.insertFirst(34);
        list.insertFirst(23);
        list.insertLast2(233);
        list.insertLast2(22);

    }
}

/*
 * Visualize what to do
 */


/*
 * In linked list elements are not stored at a contiguous location;
 * the elements are linked using pointers.
 * Here, each node stores the data and the address of the next node.
 *
 * Array is static data structures and linked lists are dynamic data structures.
 *
 * What allows a linked list to have its memory scattered everywhere?
 * Because node has the reference or address to the next node, they do not
 * need to live right next to one another.
 *
 * A node only knows about what data it contains, and who its neighbor is.
 *
 * Head and Tail pointer
 * The Head pointer keeps track of the starting node of the linked list.
 * Tail pointer point to the end of the linked list.
 *
 * A real-world example of uses of linked list to design a song playlist.
 * Browser
 *
 * The pointer that will point to the first node and last node is there in the stack
 * memory.
 */