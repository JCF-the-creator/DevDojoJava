package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;

public class ProdutoTest02 {

    //Aqui não é possivel chamar a data de validade em produto2 por não ter a variavel declarada em Produto
    public static void main(String[] args) {


        Produto produto = new Computador("Ryzen 9", 5000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println("Valor Imposto: "+produto.calcularImposto());

        System.out.println("------------------");

        Produto produto2 = new Tomate("Americano",14);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println("Valor do imposto: "+produto2.calcularImposto());

    }
}
