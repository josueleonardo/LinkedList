import sample.LinkedList;
import sample.ReverseIterador;
import sample.Iterador;

public class Main{
    public static void main(String[] args){
        LinkedList lista1 = new LinkedList();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);


        Iterador it = lista1.getIterator();

        while (it.hasNext()){
            Iterador backupIt = new Iterador(it);
            int element = it.next();

            if (element == 3){
                lista1.insert(10, LinkedList.BEFORE, backupIt);
            }
            if (element == 7){
                lista1.insert(15, LinkedList.AFTER, backupIt);
            }
        }

        lista1.delete(3);
        System.out.println("----------------------");
        System.out.println("El tamaño es " + lista1.getSize());
        System.out.println("----------------------");
        it = lista1.getIterator();

        while (it.hasNext()){
            int element = it.next();
            System.out.println("El dato es "+ element);
        }

        System.out.println("----------------------");

        lista1.delete(0);
        it = lista1.getIterator();
        while (it.hasNext()){
            int element = it.next();
            System.out.println("El dato es "+ element);
        }
        System.out.println("\n El tamaño ahora es de: " + lista1.getSize());
        System.out.println("----------------------");

        lista1.insert(8,0, lista1.getIterator());
        it = lista1.getIterator();
        while (it.hasNext()){
            int element = it.next();
            System.out.println("El dato es "+ element);
        }
        System.out.println("\n El tamaño ahora es de: " + lista1.getSize());
        System.out.println("----------------------");


        ReverseIterador reverseIterador = lista1.getReversIterador();

        while (reverseIterador.hasNext()){
            int element = reverseIterador.next();

            System.out.println("Dato " + element);
        }
    }

}
