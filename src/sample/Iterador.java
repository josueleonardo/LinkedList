package sample;

public class Iterador<G> {
    private Node<G> currentNode;

    private Node<G> head;
    private Node<G> tail;
    private int size;

    public Iterador() {
        //this.currentNode = head;
        this.currentNode = head;
    }

    public Iterador(Iterador iterator){
        currentNode = iterator.currentNode;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public int next(){
        G data = currentNode.data;

        currentNode = currentNode.next;

        return (int) data;
    }

    Node<G> getCurrentNode() {  // modificador de acceso se llama -> package-private
        return currentNode;
    }
}
