package sample;

import sample.Node;
import sample.LinkedList;

public class ReverseIterador<G> {

    //private Node<G> currentNode;
    public Node<G> currentNode;

    private Node<G> head;
    private Node<G> tail;
    private int size;

    public ReverseIterador() {
        this.currentNode = tail;
    }


    public boolean hasNext(){
        return currentNode != null;
    }

    public G next(){
        G data = currentNode.data;

        currentNode = currentNode.previous;

        return data;
    }
}
