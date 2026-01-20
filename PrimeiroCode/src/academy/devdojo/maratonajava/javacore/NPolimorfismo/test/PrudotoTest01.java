package academy.devdojo.maratonajava.javacore.NPolimorfismo.test;

import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Televisao;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Dominio.Tomate;
import academy.devdojo.maratonajava.javacore.NPolimorfismo.Servico.CalculadoraImposto;

//Polimorfismo é trocar o tipo da variavel de referencia e manter os objetos da herança

public class PrudotoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Dell inspiron", 5000);
        Tomate tomate = new Tomate("Tomate Cereja", 10);
        Televisao tv = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(tv);
        
    }
}
