package sample;

//import sample.Node;
import sample.Iterador;
import sample.ReverseIterador;

public class LinkedList<G> {

    private Node<G> head;
    private Node<G> tail;
    private int size;

    public LinkedList() {
        listsCount ++;
    }

    private static int listsCount = 0;

    public static int getListsCount(){
        return listsCount;
    }

    public void add(G data) {
        Node<G> node = new Node<>(data);

        node.previous = tail;

        if (tail != null) {
            tail.next = node;
        }

        if (head == null) {
            head = node;
        }

        tail = node;
        size++;
    }

    public G get(int index) {
        Node<G> currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index) {
            currentNode = currentNode.next;
            currentIndex++;
        }

        return currentNode.data;
    }

    public void delete(int index) {
        Node<G> currentNode = head;
        int currentIndex = 0;

        if (index < 0 || index >= size) {
            return;
        }

        size--;

        if (size == 0) {
            head = null;
            tail = null;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.previous = null;
        }

        if (index == size) {
            tail = tail.previous;
            tail.next = null;
        }

        if (index > 0 && index < size) {
            while (currentIndex < index) {
                currentNode = currentNode.next;
                currentIndex++;
            }
            currentNode.previous.next = currentNode.next;
            currentNode.next.previous = currentNode.previous;
        }


    }

    public Iterador getIterator() {
        return new Iterador();
    }

    public void insert(G data, Position position, Iterador it) {
        // ¿qué ofrece java para restringir los valores de position a solamente BEFORE y AFTER?

        Node<G> newNode = new Node<>(data);
        Node<G> currentNode = it.getCurrentNode();

        if (position == Position.AFTER) {
            newNode.next = currentNode.next;
            newNode.previous = currentNode;
            currentNode.next = newNode;
            if (newNode.next != null) {
                newNode.next.previous = newNode;
            } else {
                tail = newNode;
            }
        } else if (position == Position.BEFORE) {
            newNode.previous = currentNode.previous;
            newNode.next = currentNode;
            currentNode.previous = newNode;
            if (newNode.previous != null) {
                newNode.previous.next = newNode;
            } else {
                head = newNode;
            }
        } else {
            System.out.println("No conozco el valor de position");
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public ReverseIterador getReverseIterator() {
        return new ReverseIterador();
    }

    public class Iterador extends sample.Iterador {
        public Iterador(sample.Iterador it) {
        }

        public Iterador() {

        }
    }
}
