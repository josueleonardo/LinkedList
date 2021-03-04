package sample;

public class ReverseIterador{

    public ReverseIterador(Node tall) {
        if(next() == 0){
            System.out.println("0");
        } else if(hasNext()){
            System.out.println("No");
        }
    }

    public boolean hasNext(){
        return false;
    }
    public int next(){
        return 0;
    }
}
