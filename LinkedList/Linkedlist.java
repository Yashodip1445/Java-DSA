public class Linkedlist {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

//     add()
//     remove ()
//     print()
// Search()
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.head = new Node(1);
        ll.head.next = new Node(2);

        // method 


    }
}