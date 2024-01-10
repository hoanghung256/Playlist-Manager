package data_structure;

public class Node<T> {
    T value;
    public Node next;

    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
    public T getValue(){
        return this.value;
    }
}
