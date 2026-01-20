package academy.devdojo.maratonajava.javacore.JModificadorfinal.test;

import academy.devdojo.maratonajava.javacore.JModificadorfinal.Dominio.Carro;
import academy.devdojo.maratonajava.javacore.JModificadorfinal.Dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Ferrari ferrari = new Ferrari();
        
        

        System.out.println(carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Karol");
        System.out.println(carro.COMPRADOR);
        ferrari.setNome("Testarossa");
        ferrari.imprime();
        
    }
}
