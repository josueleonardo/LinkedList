package sample;

public class Iterador {
    private Node currentNode;

    public Iterador(Node currentNode){
        this.currentNode = currentNode;
    }

    public  Iterador( Iterador iterador){
        currentNode = iterador.currentNode;
    }

    public boolean hasNext(){
        return currentNode != null;
    }

    public int next(){
        int data = currentNode.getValor();
        currentNode = currentNode.getSiguiente();
        return data;
    }

    Node getCurrentNode(){
        return currentNode;
    }
}
