package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
       Calculadora calculadora = new Calculadora();
       calculadora.somaDoisNumeros();
       System.out.println("Finalizando Adição");
       calculadora.subtraiDoisNumeros();
       System.out.println("Finalizada a Subtração");
    }
}
