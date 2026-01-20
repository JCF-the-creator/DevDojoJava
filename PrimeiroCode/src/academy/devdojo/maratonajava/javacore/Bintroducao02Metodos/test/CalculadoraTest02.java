package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(3.4f, 6); // mudando esses valores, ele associa nas variaveis num1 e num2 do Dominio
        // 3,4f está por conta de ser um valor do tipo float, assim tendo de ser declaro
    }   
}
