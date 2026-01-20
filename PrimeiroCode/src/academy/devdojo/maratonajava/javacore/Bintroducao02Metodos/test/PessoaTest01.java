package academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducao02Metodos.Dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //pessoa.nome = "James"
        //Acima da erro por conta de estar privado, assim não adquire as variaveis da memoria "Pessoa"

        pessoa.setNome("James"); //Aloca a memoria no SetNome para acessar a memoria "Pessoa"
        pessoa.setIdade(-26);
//        pessoa.imprime();

        //Pega os valores da variavel na Classe Pessoa
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
