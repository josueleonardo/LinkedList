package sample;

class Node {
    private int valor;
    private Node Siguiente;
    private Node anterior;

    Node(int valor){
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Node getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Node siguiente) {
        Siguiente = siguiente;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
}
