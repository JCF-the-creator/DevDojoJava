package academy.devdojo.maratonajava.javacore.YColection.test;

import java.util.ArrayList;
import java.util.List;

public class listTest01 {
    public static void main(String[] args) {

        // Listas só podem ser criadas com Objetos que possa implementar o hash, assim o int não vai funcionar por ser primitivo, para usar numeros se utiliza do objeto Integer 


        List<String> nomes = new ArrayList<>();
        nomes.add("Gabriel");
        nomes.add("Willian");

        // lista são ordernadas, assim pode-se trabalhar com for para percorrer os valores da mesma

        for(String nome:nomes){
            System.out.println("Usando for Each: "+nome);
        }

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        for(int i = 0; i< nomes.size(); i++){
            System.out.println("Usando for indexado: "+nomes.get(i));
        }

        List<String> nomes2 = new ArrayList<>();
        nomes2.add("Gabriel");
        nomes2.add("Thaís");

        nomes.addAll(nomes2); //pode-se utilizar para juntar as duas listas desde que tenha o mesmo tipo de objeto, nesse caso String

        System.out.println();
        System.out.println("lista atualizada: "+nomes);

    }
}
