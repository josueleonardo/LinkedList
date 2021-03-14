import sample.LinkedList;
import sample.Position;
import sample.Iterador;
import sample.ReverseIterador;

import static sample.LinkedList.*;

public class Main {

    public static void main(String[] args) {

        int cuenta =  getListsCount();

        LinkedList<Integer> lista1 = new LinkedList<>();
        LinkedList<String> lista2 = new LinkedList<>();

        lista1.add(1);
        lista1.add(4);
        lista1.add(3);
        lista1.add(7);

        lista2.add("hola");
        lista2.add(" Object ");
        lista2.add(" Oriented ");
        lista2.add(" Programming ");

        Iterador it = lista1.getIterator();

        while(it.hasNext()){
            Iterador backupIt = lista1.new Iterador(it);
            int element = it.next(); //regresar el dato y avanzar el iterador

            if(element == 3){
                lista1.insert(10, Position.BEFORE, (LinkedList<Integer>.Iterador) backupIt);
            }

            if(element == 7){
                lista1.insert(15, Position.AFTER, (LinkedList<Integer>.Iterador) backupIt);
            }
        }

        lista1.delete(3);

        System.out.println("---------------------");

        System.out.println("El tamaño es:" + lista1.getSize());

        it = lista1.getIterator();

        while(it.hasNext()){
            Object element = it.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        ReverseIterador reverseIterator = lista1.getReverseIterator();

        while(reverseIterator.hasNext()){
            Object element = reverseIterator.next();

            System.out.println("Dato: " + element);
        }

        System.out.println("---------------------");

        Iterador itStrings = lista2.getIterator();

        while(itStrings.hasNext()){
            System.out.println(itStrings.next());
        }

    }
}