package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        
        /*Binary Search realiza uma busca em uma lista informada e retorna o valor caso encontre e se não encontrar retorna a expressão:
            (-(ponto de inserção)-1)
        
        Binary utiliza uma regra que a lista precisa estar ordenada normalmente com sort(List), se não o resultado não poderá ser confirmado
        */

        Collections.sort(numeros);
        System.out.println(numeros);
        System.out.println("Posição: " + (Collections.binarySearch(numeros, 4))); //Ele só vai retornar valor positivo se tiver o item na lista 
    }
}
