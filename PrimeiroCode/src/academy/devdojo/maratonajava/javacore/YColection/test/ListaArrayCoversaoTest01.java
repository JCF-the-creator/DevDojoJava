package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayCoversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        // Integer[] ListToArray =  numeros.toArray(new Integer[numeros.size]); funciona da mesma forma, colocando o 0 ele já seta o tamanho da lista automaticamente e tem melhor perfomace 
        Integer[] ListToArray =  numeros.toArray(new Integer[0]);
        
        System.out.println(Arrays.toString(ListToArray));
        System.out.println("----------------------------------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;


        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12); //no asList ele faz referencia direta ao array, se mudar o valor ele muda a lista tambem, ele tambem obriga a referencia do Index por conta da Referencia

        System.out.println(arrayToList);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println("----------------------------------------");

        List<Integer> numeroList = new ArrayList<>(Arrays.asList(numerosArray)); // aqui ele cria uma nova Lista, quebrando assim a referencia direta do Arrays.asList
        numeroList.add(15);
        System.out.println(numeroList);
        System.out.println("----------------------------------------");

        List<String> listaDeTexto = List.of("1","Texto"); // List.of cria uma lista a partir de determinados itens 
        System.out.println(listaDeTexto);
    }
}
