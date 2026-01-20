package academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Produto;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto){
        System.out.println("Relátorio de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+produto.getNome());
        System.out.println("Preço: "+produto.getValor());
        System.out.println("Imposto a ser pago: "+imposto);
        //instanceof confirma se a variavel a ser utilizada é a Tomate
        if(produto instanceof Tomate){
        Tomate tomate = (Tomate) produto; //aqui voce especifica ao java o caminho dos documentos a serem utilizados sendo primeiro a declaração do objeto = qual objeto em especifico entre parenteses e a classe que pertence esse objeto especifico, nesse caso produto
        System.out.println("Data de validade: "+ tomate.getDataDeValidade());
        //Maneira de escrever em 1 linha:
        //System.out.println("Data de validade: "+((Tomate)produto).getDataDeValidade());

        }
    }
}
