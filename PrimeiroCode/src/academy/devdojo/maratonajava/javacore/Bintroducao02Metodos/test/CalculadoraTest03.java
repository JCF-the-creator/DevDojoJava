package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(22, 3); //declare uma variavel para realizar o calculo nesse espaço de memoria
        System.out.println(result);
        System.out.println("\n"+calculadora.divideDoisNumeros(8, 0));

        System.out.println("------------------------------------------");

        // System.out.println(calculadora.imprimeDivisaoDeDoisNumeros(20, 2));
       // assim ele dá erro por conta do ImprimeDivisao já ser void e ter o print nele 
        calculadora.imprimeDivisaoDeDoisNumeros(67, 8);

    }
}
