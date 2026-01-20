package academy.devdojo.maratonajava.javacore.LClassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LClassesAbstratas.Dominio.Gerente;

public class funcionarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Ana", 2000);
        System.out.println(gerente);

        Desenvolvedor desenvolvedor = new Desenvolvedor("Carlos", 2500);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
