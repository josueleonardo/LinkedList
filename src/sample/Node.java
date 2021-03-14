package sample;

public class Node<T> {
    public final T data;
    public Node<T> previous;
    public Node<T> next;

    Node(T data) {
        this.data = data;
    }


}