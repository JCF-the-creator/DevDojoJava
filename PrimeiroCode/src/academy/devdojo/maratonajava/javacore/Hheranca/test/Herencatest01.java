package academy.devdojo.maratonajava.javacore.Hheranca.test;


import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.Dominio.Pessoa;

public class Herencatest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("11531-553");

        Pessoa pessoa = new Pessoa("Roger","524162412-33");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Guto");
        
        funcionario.setCpf("1124414");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        System.out.println("-----------");
        funcionario.imprime();
    }
}
