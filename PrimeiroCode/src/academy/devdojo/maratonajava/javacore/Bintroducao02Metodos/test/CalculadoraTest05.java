package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1,2,3,4,5}; 
        calculadora.somaArray(numeros);
        System.out.println("---------");    
        calculadora.somaVarArgs(numeros);  
    }
}
