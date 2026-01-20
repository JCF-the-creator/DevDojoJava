package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.CalculadoraImposto;

public class ProdutoTest03 {

    //Aqui não é possivel chamar a data de validade em produto2 por não ter a variavel declarada em Produto
    public static void main(String[] args) {

    Produto produto = new Computador("Ryzen 9", 5000);

    Tomate tomate = new Tomate("Padrão", 8);
    tomate.setDataDeValidade("21/12/2025");

    CalculadoraImposto.calcularImposto(tomate);
    CalculadoraImposto.calcularImposto(produto);


    }
}
