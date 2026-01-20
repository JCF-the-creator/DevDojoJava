package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.RepositorioBancoDeDados;

public class RepositorioTest01 {
    public static void main(String[] args) {
        Repositorio repositorio1 = new RepositorioArquivo();
        Repositorio repositorio2 = new RepositorioBancoDeDados();
        repositorio1.salvar();
        repositorio2.salvar();
        //Repositorio sendo uma interface geral para todas as classes, é possivel referenciiar de maneira geral com outras classes
        //Esse tipo de Polimorfismo é muito utlizado em List pelo proprio java, sendo List uma interface

        List<String> list = new ArrayList<>();
        System.out.println("Print no Arraylist");
        list.add("Goku");
        list.add("Gohan");
        list.add("Goten");
        System.out.println(list);
        //Ambos tem como referencia List, porem são metodos diferentes, que podem ser facilmente alterados por conta do polimorfismo
        System.out.println("Print no LinkedList");
        List<String> list2 = new LinkedList<>();
        list2.add("Goku");
        list2.add("Gohan");
        list2.add("Goten");
        System.out.println(list2);
    }
}
