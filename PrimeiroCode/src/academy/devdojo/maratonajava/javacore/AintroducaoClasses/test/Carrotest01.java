package academy.devdojo.maratonajava.javacore.AintroducaoClasses.test;

import academy.devdojo.maratonajava.javacore.AintroducaoClasses.dominio.Carro;

public class Carrotest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "Herby";
        carro01.modelo = "Fusca";
        carro01.ano = 1980;

        carro02.nome = "Mustang";
        carro02.modelo = "GT500";
        carro02.ano = 2008;

        System.out.println("Carro 01");
        System.out.println("Nome: "+carro01.nome);
        System.out.println("Modelo: "+carro01.modelo);
        System.out.println("Ano: "+carro01.ano);

        System.out.println("\nCarro 02");
        System.out.println("Nome: "+carro02.nome);
        System.out.println("Modelo: "+carro02.modelo);
        System.out.println("Ano: "+carro02.ano);


    }
}
