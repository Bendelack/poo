import java.util.ArrayList;
import java.util.Collections;

public class Listas {
    public static void main ( String[] args ) { 
        ArrayList<Integer> numeros = new ArrayList<>();
        Collections.addAll(numeros, 1, 23, 4, 13, 22, 14, 24, 12);
        Collections.sort(numeros);
        Collections.reverse(numeros);
        int posicao = Collections.binarySearch(numeros, 13);
        System.out.println(posicao);
    }
}