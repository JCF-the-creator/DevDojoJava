package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Funcionarios;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();

        funcionario.setNome("Guilherme");
        funcionario.setIdade(26);
        funcionario.setSalarios(new double[]{1200.00, 1259.21, 1200.92});

        funcionario.imprime();
        System.out.println("Media: "+ funcionario.getMedia());
    }
}
