package sample;

import sample.Node;

public class LinkedList {

    public static final int BEFORE = 0;
    public static final int AFTER = 1;

    private Node head;
    private Node tall;
    private int size;

    public void add(int valor){
        Node node = new Node(valor);

        node.setAnterior(tall);

        if(tall != null){
            tall.setSiguiente(node);
        }
        if(head == null){
            head = node;
        }
        tall = node;
        size++;
    }

    public int get(int index){
        Node currentNode = head;
        int currentIndex = 0;

        while (currentIndex < index){
            currentNode = currentNode.getSiguiente();
            currentIndex++;
        }

        return currentNode.getValor();
    }

    public void delete(int index){
        Node currentNode = head;
        int currentIndex = 0;

        if(index <0 || index>= size){
            return;
        }

        size--;

        if(size == 0){
            head = null;
            tall = null;
            return;
        }

        if(index == 0){
            head = head.getSiguiente();
            head.setAnterior(null);
        }

        if(index == size){
            while (currentIndex < index){
                currentNode = currentNode.getSiguiente();
                currentIndex++;
            }
            currentNode.getAnterior().setSiguiente(currentNode.getSiguiente());
            currentNode.getSiguiente().setAnterior(currentNode.getAnterior());
        }
    }

    public Iterador getIterator(){
        return new Iterador(head);
    }

    public void insert(int data, int position, Iterador it){
        Node newNode = new Node(data);
        Node currentNode = it.getCurrentNode();

        if(position == AFTER) {
            newNode.setSiguiente(currentNode.getSiguiente());
            newNode.setAnterior(currentNode);
            currentNode.setSiguiente(newNode);
            if (newNode.getSiguiente() != null) {
                newNode.getSiguiente().setAnterior(newNode);
            } else {
                tall = newNode;
            }
        }else if(position == BEFORE){
            newNode.setAnterior(currentNode.getAnterior());
            newNode.setSiguiente(currentNode);
            currentNode.setAnterior(newNode);
            if(newNode.getAnterior() != null){
                newNode.getAnterior().setSiguiente(newNode);
            }else{
                head = newNode;
            }
        }else{
            System.out.println("No conoszo el valor de posicion");
        }
        size++;
    }

    public int getSize(){
        return size;
    }

    public ReverseIterador getReversIterador(){
        return new ReverseIterador(tall);
    }
}
