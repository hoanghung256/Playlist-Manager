package data_structure;

public class MyLinkedList<T> {
    Node head = null;
    Node tail = null;
    int size = 0;

    public MyLinkedList() {
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int size() {
        return this.size;
    }

    public void addFirst(T x) {
        Node newHead = new Node(x, this.head);
        if (this.isEmpty()) {
            this.tail = this.head = newHead;
        } else {
            this.head = newHead;
        }
        ++this.size;
    }

    public void addLast(T x) {
        if (this.isEmpty()) {
            this.head = this.tail = new Node(x, (Node) null);
        } else {
            Node newTail = new Node(x, (Node) null);
            this.tail.next = newTail;
            this.tail = newTail;
        }
        ++this.size;
    }

    public void removeLast() {
        if (this.isEmpty()) {
            System.out.println("Is empty!");
        } else {
            Node traverse;
            for (traverse = this.head; traverse.next != this.tail; traverse = traverse.next) {
            }

            this.tail = traverse;
            this.tail.next = null;
            --this.size;
        }
    }

    public void removeFirst() {
        if (this.head == null) {
            System.out.println("Is Empty!");
        } else {
            this.head = this.head.next;
        }

        --this.size;
    }

    public void showList() {
        for (Node<T> traverse = this.head; traverse != null; traverse = traverse.next) {
            System.out.println(traverse.value.toString());
        }
    }
}
