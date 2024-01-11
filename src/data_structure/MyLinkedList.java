package data_structure;

import models.Song;

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

    // Remove by name
    public boolean remove(String x) {
        Node current = head;

        // Handle case that find song is head
        Song s = (Song) current.getValue();
        if (head != null && s.getSongName().equalsIgnoreCase(x)) {
            head = head.next;
            return true;
        }

        while (current.next != null) {
            s = (Song) current.next.getValue();

            if (s.getSongName().equalsIgnoreCase(x)) {
                current.next = current.next.next;
                return true;
            } else {
                current = current.next;
            }
        }

        return false;
    }

    public Node<T> getNextSong(Node<T> current) {
        if (current != null && current.next != null) {
            return current.next;
        } 
        // else {
            // System.out.println("No song available");
            return null;
        // }
    }

    public Node<T> getPreviousSong(Node<T> current) {
        if (current != null && current != head) {
            Node<T> previous = head;

            while (previous.next != null && previous.next != current) {
                previous = previous.next;
            }
            return previous;
        } 
        // else {
        //     System.out.println("No song available");
        // }
        return null;

    }

    public void showList() {
        for (Node<T> traverse = this.head; traverse != null; traverse = traverse.next) {
            System.out.println(traverse.value.toString());
        }
    }

    public Node<T> getFirst() {
        return this.head;
    }

    public Node<T> getlast() {
        return this.tail;
    }

}
